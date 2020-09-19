package com.Errors;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ErrorDetec {
    void  findError(List<String> lines) throws ParseException;
}
