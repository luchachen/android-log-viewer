/*
 * Copyright 2011 Mikhail Lopatkin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bitbucket.mlopatkin.android.logviewer;

import javax.swing.RowFilter;

import org.bitbucket.mlopatkin.android.liblogcat.LogRecordFilter;

public class LogRecordRowFilter extends RowFilter<LogRecordTableModel, Integer> {

    private LogRecordFilter filter;

    public LogRecordRowFilter(LogRecordFilter filter) {
        this.filter = filter;
    }

    @Override
    public boolean include(Entry<? extends LogRecordTableModel, ? extends Integer> entry) {
        return filter.include(entry.getModel().getRowData(entry.getIdentifier()));
    }

    boolean include(LogRecordTableModel model, int row) {
        return filter.include(model.getRowData(row));
    }
}
