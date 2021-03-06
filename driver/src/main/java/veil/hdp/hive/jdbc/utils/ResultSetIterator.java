/*
 *    Copyright 2018 Timothy J Veil
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package veil.hdp.hive.jdbc.utils;

import com.google.common.collect.AbstractIterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import veil.hdp.hive.jdbc.data.Row;

public class ResultSetIterator extends AbstractIterator<Row> {

    private static final Logger log = LogManager.getLogger(ResultSetIterator.class);

    private final FetchIterator fetchIterator;
    private final int fetchSize;

    private int index = 0;
    private FetchRowIterator fetchRowIterator;

    public ResultSetIterator(FetchIterator fetchIterator, int fetchSize) {
        this.fetchIterator = fetchIterator;
        this.fetchSize = fetchSize;
    }

    @Override
    protected Row computeNext() {

        while (true) {


            if (fetchRowIterator == null) {
                // no rows inside a page available; go get them

                if (fetchIterator.hasNext()) {
                    // there is another page available, so create the row iterator
                    fetchRowIterator = new FetchRowIterator(fetchIterator.next());
                } else {
                    // no more pages, so its the end of the line
                    return endOfData();
                }

            }

            boolean moreRowsInPage = fetchRowIterator.hasNext();

            if (moreRowsInPage) {

                // the page has more results
                index++;

                return fetchRowIterator.next();

            } else {

                if (index < fetchSize) {

                    // the page has no more results and the rowCount is < fetchSize; then i don't need
                    // to go back to the server to know if i'm done.
                    //
                    // for example rowCount = 10; fetchSize = 100; then no need to look for another page
                    //
                    return endOfData();

                } else if (index == fetchSize) {

                    // the page has no more results, but rowCount = fetchSize.  need to check server for more results
                    fetchRowIterator = null;

                    index = 0;
                }
            }
        }
    }
}
