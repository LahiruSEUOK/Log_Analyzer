package com.Errors;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ErrorDetec {
    public void  findError(Date Timestamp, List<String> lines) throws ParseException;
}
