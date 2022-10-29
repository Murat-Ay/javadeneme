package Monat_04_Package;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeZoneId {

    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        LocalTime saat=LocalTime.now();
        System.out.println(saat);
        System.out.println(tarih.getDayOfYear());

        LocalTime localSaat = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localSaat); // 19:03:27.658174
        LocalTime localSaat1=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localSaat1); // 18:06:44.835579
        LocalTime localSaat2=LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(localSaat2); // 20:07:19.380256
        LocalTime localSaat3=LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localSaat3); // 13:09:40.408075
        }
    }
