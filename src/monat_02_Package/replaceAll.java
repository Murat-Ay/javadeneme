package monat_02_Package;

public class replaceAll {
    public static void main(String[] args) {

    String  str= "java ogRe2@nMek3 #ne +Gu=zel";
    str=str.replaceAll("\\d", "");
    str=str.replaceAll("\\s", "3");
    System.out.println(str);

    str = str.replaceAll("\\W", "");
    str=str.replace("3", " ");

    str=str.toLowerCase();
    str=str.substring(0,1).toUpperCase() + str.substring(1)+".";

System.out.println(str);
}}
