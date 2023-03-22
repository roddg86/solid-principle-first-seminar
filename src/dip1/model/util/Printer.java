package dip1.model.util;

import dip1.model.ReportItem;

import java.util.List;

public interface Printer<T> {
    public void output(List<ReportItem> items);
}
