package com.EmailRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmailRepo {
    ArrayList getMailList() throws ClassNotFoundException, SQLException;
}
