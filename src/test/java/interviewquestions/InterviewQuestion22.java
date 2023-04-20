package interviewquestions;

public class InterviewQuestion22 {
    public static void main(String[] args) {

        //Interview Question
        //Verilen sayi1 ve sayi2 variable larinin degerlerini degistiren(SWAP) bir program yaziniz.
        // orn : sayi1=10 ve sayi2=20; kod calistiktan sonra sayi1=20 ve sayi2=10


        int sayi1 = 10;
        int sayi2= 20;

        int temp = sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println(sayi1);
        System.out.println(sayi2);



    }
}
