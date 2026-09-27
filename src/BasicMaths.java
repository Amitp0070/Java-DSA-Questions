public class BasicMaths {

    static void printDigit(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    static int countDigit(int num){
         int count = 0;
         while(num!=0){
             int digit = num % 10;
             count++;
             num  = num / 10;
         }
         return count;
    }

    static int sumDigit(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum + digit;
            num = num /10;
        }
        return sum;
    }

    static void reverseNumber(int num){
        while(num!=0){
            int number = num%10;
            System.out.print(number);
            num = num / 10;
        }
    }
    public static void main(java.lang.String[] args) {
//        int num = 543210;
//        reverseNumber(num);
//        int sum  = sumDigit(num);
//        System.out.println(sum);
//        int count = countDigit(num);
//        System.out.println(count);
//        printDigit(num);


        int arr[] = {1, 2, 3, 4, 5,6,7};
        int maxNumber = arr[0];
        for(int i=0; i < arr.length; i++) {
            if(maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);
    }
}