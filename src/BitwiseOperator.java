import java.lang.String;
import java.util.*;

public class BitwiseOperator {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^  b);

//        int n = 1;
//        for(int i=1; i<=2; i++){
//            n = n << 1;
//            System.out.println(n);
//        }

//        int n = 5;
//        if((n & 1) == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

//        int n = 8;
//        int count = 0;
//        for(int i=0; i<=n; i++){
//            if((i & 1) != 0){
//                count++;
//            }
//            n = n >> 1;
//        }
//        while (n != 0) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        if((n & (n -1)) == 0){
//            System.out.println("It is Power of 2");
//        }else{
//            System.out.println("Not power of 2");
//        }
//        System.out.println(count);

//        int a = 21;
//        if((a&1) ==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

//        int a = 2;
//        int b = 3;
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        int[] a = {1, 2, 3, 2, 3};
////        int n = a[0] ^ a[1] ^ a[2] ^ a[3];
////        System.out.println(n);
//        int n = a[0];
//        for (int i = 0; i < a.length; i++) {
//           for(int j=i+1; j< a.length; j++){
//               if ((a[i] ^ a[j]) == 0) {
//                   System.out.println(a[i]);
//                   break;
//               }
//           }
//        }

        int n = 10 ;
        System.out.println(n&(n-1));
        System.out.println(n&(-n));


    }

}