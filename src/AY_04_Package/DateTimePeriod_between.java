package AY_04_Package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimePeriod_between {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2022-09-01T19:11:45.014862
        /* Date ve time'i DateTimeFormatter ile istedigimiz gibi manipule edebiliriz
        veya bugune kadarki bilgilerimizle bu isi cozmek istersek    */

        String tarihVeSaat=ldt.toString();  // bu tarih 2022'e mi ait ?
        System.out.println(tarihVeSaat.startsWith("2022")); // true

            // dogum tarihinizi ve bugunu local date olarak olusyurup
            // kac yasinda oldugunuzu yazdirin
            LocalDate bugun=LocalDate.now();
            LocalDate dogumTarihi=LocalDate.of(1972,01,01);
            Period yas=Period.between(dogumTarihi,bugun);
            System.out.println(yas); // P50Y8M
            System.out.println(yas.getYears()); // 50
        }
    }

