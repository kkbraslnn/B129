package pdf;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
       // Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
       // Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
        //1.Yol:
        int[] a = new int[]{-12, 18, -5, 23, -2}; Arrays.sort(a);

        Integer minPositive = a[a.length-1]; Integer maxNegative = a[0]; for(Integer w : a){

            if(w>=0){

                minPositive = Math.min(minPositive, w);

            } if(w<0){

                maxNegative = Math.max(maxNegative, w); }
        }
        System.out.println("Minimum positive: " + minPositive); System.out.println("Maximum negative: " + maxNegative);
       // 2.Yol:
        int[] x = new int[]{-12, 18, -5, 23, -2}; Arrays.sort(x);


        Arrays.sort(x);

        for (Integer i=0;i<x.length;i++){

            if (x[i]<0 && x[i+1]>0) {

                System.out.println("Maximum negative: " + x[i]); System.out.println("Minimum positive: " + x[i+1]);
            } }
    }
}
