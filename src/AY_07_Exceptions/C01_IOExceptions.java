package AY_07_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
        public static void main(String[] args) throws FileNotFoundException {
        /*
          method signature'ina ekledigimiz
          throws FileNotFoundException
          sadece bilgi vermek icindir
          try-catch'deki gibi exception'i handle etmez
          Sadece Java'ya sorumluluk bizde
          sen calismana bak
          exception ile karsilasirsan exception firlat demektir.
         */
            String path= "src/AY_07_Exceptions/TextFile";
            FileInputStream fis =new FileInputStream(path);
        }
    }