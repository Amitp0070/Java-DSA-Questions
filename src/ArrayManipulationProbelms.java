import java.lang.String;
import java.util.*;
import java.util.Arrays;

public class ArrayManipulationProbelms {

    static void reversArray(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
//        while (i <= j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for (int val : arr) {
//            System.out.println(val);
//        }

        while (i <= j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        for (int val : arr) {
            System.out.print(" " + val);
        }
    }


    /// // Shift array by 1 position
    static void shiftBy1Postion(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        int size = 0;
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
//        System.out.println(temp);
        arr[0] = temp;
    }


    /// / Find two unique number ( others appears twise)
    static void twoUniqueNumber(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
//            System.out.println("bhfjhf");
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] == arr[j]) {
                    int twisenumber = arr[i];
//                    System.out.println(twisenumber);
                }
            }
        }
    }


    /// / Print Extreme Elements in an alternate manner


    /// Find the Avarage of array elements
    static double avgOfArrayElements(int arr[]) {
        int n = arr.length;
        double sum = 0;
        for(int i: arr){
            sum += i;
        }
        double avg = sum/n;
        return avg;
    }

    /// Multiple each element of an Array by 10
    static void multipleArrayElementBy10(int arr[]){
//        int size = arr.length;
        for(int i: arr){
            int multipleElementValue = i * 10;
            System.out.println(multipleElementValue);

        }
//        for(int i=0; i<size; i++){
//            int multipleElementValue = arr[i] * 10;
//            System.out.println(multipleElementValue);
//        }
    }

    /// Search for an element in an Array {Linear Search}
    static boolean searchArrayElement(int arr[], int target){
        int n = arr.length;
        int arrayElement =0;
//        System.out.println(target);
        for(int i=0; i<n; i++){
            if(i == target){
              return true;
            }
        }
        return false;
    }


    /// Find the Maximum number in an Array
    static int findMaxNumber(int arr[]){
        int maxVal = 0;
        for(int i=0; i<arr.length; i++){
            maxVal = Math.max(arr[i], maxVal);
//            if(maxVal < arr[i]){
//                maxVal = arr[i];
//            }
        }
        return maxVal;
    }


    static int[] findSumOfPoAndNeNumber(int arr[]){
        int sumOfPositive = 0;
        int sumOfNegetive = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                sumOfPositive += arr[i];
            }else{
                sumOfNegetive += arr[i];
            }
        }
        int ans[] = {sumOfNegetive, sumOfPositive};
        return ans;
    }



    /// Count the numbers of Zeroes and Ones
    static int[] countNumberOfZeroesAndOnes(int arr[]){
        int onesNum = 0;
        int zeroesNum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                onesNum++;
            }else{
                zeroesNum++ ;
            }
        }
        int ans[] = {onesNum, zeroesNum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 0};
//        int arr[] = {1, 2, -3, -4, 5, 6};
        int answer[] = countNumberOfZeroesAndOnes(arr);
        for(int val: answer){
            System.out.println(val);
        }
//        System.out.println("Count of Ones: " + answer[0]);
//        System.out.println("Count of Zeroes: " + answer[1]);
//        int[] ans = findSumOfPoAndNeNumber(arr);
//        for(int val: ans){
//            System.out.println(val);
//        }
//        System.out.println(findMaxNumber(arr));
//        int target = 7;
//        System.out.println(searchArrayElement(arr, target));
//        multipleArrayElementBy10(arr);
//        System.out.println(avgOfArrayElements(arr));
//        twoUniqueNumber(arr);
//        for (int val : arr) {
//            System.out.println(val);
//        }

//        shiftBy1Postion(arr);
//        for(int val: arr){
//            System.out.print(" " + val);
//        }


//        System.out.print(reversse1Postion(arr));
//        int[] result = reversse1Postion(arr);
//        for (int val : result) {
//            System.out.println(val + " ");
//
//        }
//        reversArray(arr);
    }
}
