import java.lang.String;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

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
        for (int i : arr) {
            sum += i;
        }
        double avg = sum / n;
        return avg;
    }

    /// Multiple each element of an Array by 10
    static void multipleArrayElementBy10(int arr[]) {
//        int size = arr.length;
        for (int i : arr) {
            int multipleElementValue = i * 10;
            System.out.println(multipleElementValue);

        }
//        for(int i=0; i<size; i++){
//            int multipleElementValue = arr[i] * 10;
//            System.out.println(multipleElementValue);
//        }
    }

    /// Search for an element in an Array {Linear Search}
    static boolean searchArrayElement(int arr[], int target) {
        int n = arr.length;
        int arrayElement = 0;
//        System.out.println(target);
        for (int i = 0; i < n; i++) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }


    /// Find the Maximum number in an Array
    static int findMaxNumber(int arr[]) {
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(arr[i], maxVal);
//            if(maxVal < arr[i]){
//                maxVal = arr[i];
//            }
        }
        return maxVal;
    }


    static int[] findSumOfPoAndNeNumber(int arr[]) {
        int sumOfPositive = 0;
        int sumOfNegetive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfPositive += arr[i];
            } else {
                sumOfNegetive += arr[i];
            }
        }
        int ans[] = {sumOfNegetive, sumOfPositive};
        return ans;
    }


    /// Count the numbers of Zeroes and Ones
    static int[] countNumberOfZeroesAndOnes(int arr[]) {
        int onesNum = 0;
        int zeroesNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                onesNum++;
            } else {
                zeroesNum++;
            }
        }
        int ans[] = {onesNum, zeroesNum};
        return ans;
    }


    /// Find the first unsorted element in  an array
    static int unsortedElement(int arr[]) {
        int unsortedElement = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                unsortedElement = arr[i + 1];
                break;
            }
//            if (arr[i] == (arr[i + 1] - 1)) {
//                unsortedElement = arr[i];
//                break;
//            }else if (arr[i] == arr[i + 1]){
//                unsortedElement = arr[i + 1  ];
//                break;
//            }
        }
        return unsortedElement;
    }


    /// Swap alternate elements in an array
    static int[] swapAlternateElement(int arr[]){

        for(int i=0; i<arr.length - 1; i++){
            arr[i] = arr[i] ^ arr[i+1];
            arr[i+1] = arr[i] ^ arr[i+1] ;
            arr[i] = arr[i] ^ arr[i+1];
            i++;
        }
        return arr;
    }


    /// Print Array Intersection element
//    static int[] intersectionElement(int arr1[], int arr2[]){
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0; i< arr1.length; i++){
//            for(int j=0; j<arr2.length; j++){
//                if(arr1[i] == arr2[j]){
//                    ans.add[arr1[i]];
//                    break;
//                }
//            }
//        }
//
//    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,6,7,8};
//        int[] arr2 = {3,4,5,6,7,8};
//        int[] ans  =  intersectionElement(arr1, arr2);
//        System.out.println("Intersection Element in an array " + Arrays.toString(ans));
//        int arr[] = {4,5,6,7,8,9};
//        int[] ans = swapAlternateElement(arr);
//        System.out.println("Swap Element in an array " + Arrays.toString(ans));
//        int arr[] = {9, 8, 7, 6, 55, 4, 3, 2, 1};
//        int ans = unsortedElement(arr);
//        System.out.println(unsortedElement(arr));

//        int arr[] = {1, 2, -3, -4, 5, 6};
//        int answer[] = countNumberOfZeroesAndOnes(arr);
//        for(int val: answer){
//            System.out.println(val);
//        }
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
