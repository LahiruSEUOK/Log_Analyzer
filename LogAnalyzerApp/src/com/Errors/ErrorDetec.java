package com.Errors;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface ErrorDetec {
    void  findError(List<String> lines) throws ParseException, IOException, SQLException, ClassNotFoundException;
}
