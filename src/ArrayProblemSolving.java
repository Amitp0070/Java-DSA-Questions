import java.lang.String;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayProblemSolving {

    /// Sort an Array of 0s and 1s
    static int[] sort0$1(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }


    /// Find Missing Number
    static int findMissingNumber(int arr[]) {
        int xorSum = arr.length;
        for (int i = 0; i < arr.length; i++) {
            xorSum = xorSum ^ arr[i] ^ i;
//            System.out.println(xorSum);
        }
        return xorSum;
    }


    /// Sort an array of 0, 1 and 2
    static int[] sortArray012(int arr[]) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] != 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i = 0;
        j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
            }
        }

        return arr;
    }


    /// Two sum
    static int[] twoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return arr;
    }

    /// Three Sum and give array list
    static List<List<Integer>> threeSum(int arr[], int target) {
        List<List<Integer>> output = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        output.add(temp);
                    }
                }
            }
        }

        return output;
    }


    /// Remove the Dulplicate from sorted array
    static int duplicateArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i + 1;
//        System.out.println(arr[i]);
    }


    /// First repeating element   ####Brute force method
    static int repeatingElement(int arr[]) {
        int n = arr.length;
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }


    /// using HashMap
    static int repeatingNum(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }


    /// Find Pivot Index
    static int pivotIndex(int arr[]) {
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }
        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
//                return arr[i];
                return i;
            }
        }
        return -1;
    }

    /// Find missing element from an arrays with duplicate
    static List<Integer> findDisappearnumbers(int arr[]) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            int val = Math.abs(arr[index]);
            int position = val - 1;
            if(arr[position] > 0){
                arr[position] = -arr[position];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,5,5};
        System.out.println(findDisappearnumbers(arr));
//        int results = findDisappearnumbers(arr);
//        System.out.println(results);
//        int pivotInd = pivotIndex(arr);
//        System.out.println(pivotInd);
//        int repeNum = repeatingNum(arr);
//        System.out.println(repeNum);
//        int uniqueCount = duplicateArray(arr);
//        System.out.println("Returned Value (Total Unique Elements): " + uniqueCount);


//        int target  = 10;
//        System.out.println((threeSum(arr, target)));
//        System.out.println(Arrays.toString(twoSum(arr, target)));

//        sortArray012(arr);
//        for(int val: arr){
//            System.out.println(val);
//        }
//        System.out.println(findMissingNumber(arr));
//        int arr[] = {0,0,1,1,0,1,0,1,1};
//        sort0$1(arr);
//        for(int val: arr){
//            System.out.println(val);
//        }
    }
}
