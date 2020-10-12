package lesson1;

import java.io.IOException;

public interface Service {
     boolean userCheck(MainEntity mainEntity) throws IOException;

    void userInfoWriter(MainEntity mainEntity)throws IOException;
    }


