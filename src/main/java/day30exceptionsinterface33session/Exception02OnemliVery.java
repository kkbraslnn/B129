package day30exceptionsinterface33session;

public class Exception02OnemliVery {

    /*
        Java'da "Throwable" diye bir Class var.
        Object Class, Throwable'in parent'idir.
         "Throwable" ikiye ayrilir.
            1) "ERROR" (Geri donusu olmayan unexpected issues'dir. Error'lar "Handle "edilemezler.)
                1) OutOfMemoryError
                2) StackOverFlowError
                3) VirtualMachineError etc.
            2) "EXCEPTION"
                1) RunTimeExceptions (Unchecked Exceptions)
                     1) ArithmeticException
                     2) NullPointerException
                     3) StringOutOfBoundException
                     4) NumberFormatException
                     5) ArrayIndexOutOfBoundException
                     6) ClassCastException
                     7) IllegalArgumentException
               2) CompileTimeExceptions (Checked Exceptions)
                     1) FileNotFoundException
                     2) IOException
     */

    public static void main(String[] args) {


        int a = 12;
        int b = 2;
        int c[] = {3, 6, 9, 12};

        m(c, a, b);
    }


    public static void m(int[] c, int a, int b){
        try {
            int idx = a / b;
            int element = c[idx];

            System.out.println(element);
        } catch (Exception e){  // Parent Exception

            System.out.println(e.getMessage());
        }

    }}