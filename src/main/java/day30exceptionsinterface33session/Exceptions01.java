package day30exceptionsinterface33session;

public class Exceptions01 {

    /*       INTERVIEW QUESTION
       1) Exception olsa da, olmasa da calistirmaniz gereken code'lari "finally block" icine yazariz.
       2) Data Base (DB) ile baglantiyi  kesme isini yapan kod'lar gibi her halukarda calistirmalidir, bu taraz
          kod'lari finally block icne  koyariz.
       3)  "try block" yalniz kullanilamaz.
           "try block" + 1 "catch block" mumkundur.
           "try block" + 1 "catch block" + 1 "finally block" mumkundur.
           "try block"  + coklu "catch block" mumkundur.
           "try block" + coklu "catch block" + 1 "finally block" mumkundur.
           "try block" + 1 "finally block" mumkundur.
       4)   Coklu "finally block" kullanilamaz.
       (try - catch)  try tek basina kullanilamaz, devamina birsey yazmamiz lazim.
       EX: Burcu hanim cocuguna odevini yapmayi dene diyor ve catch kelimesi de yapamazsan ben yardim ederim yada
           ogretmenini arariz gibi.
       (try - finally)  odevini dene, yapamazsan kapat gitsin, bos ver, o yapsin yapmasin defteri zaten kapatacak.
     */




    public static void main(String[] args) {

        int a = 12;
        int b = 2;
        int c[] = {3, 6, 9, 12};

        m(c, a, b);

    }
    public static void m(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];

            System.out.println(element);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Cut the connection with the DB");
        }


        // BU SEKILDEDE OLUYOR.
//
//        try {
//            int idx = a / b;
//            int element = c[idx];
//            System.out.println(element);
//        }finally{
//            System.out.println("Cut the connection with the DB");
    }

}
