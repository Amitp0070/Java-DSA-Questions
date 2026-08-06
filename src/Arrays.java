//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arrays {
    public static void main(String[] args) {
//        int arr[];
//
//        // allocation
//        arr = new int[5];
//
//        // initialization
//        int brr[] = {1,2,3,4,5};
//        System.out.println("Value at 0 index " + brr[0]);
//        System.out.println("Value at 1 index " + brr[1]);
//        System.out.println("Value at 2 index " + brr[2]);

//        int n = brr.length;
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }

//        int arr[] = {10,20,30,40,50};
//        for(int val: arr){
//            System.out.println(val);
//        }

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            System.out.println("Provide input for index: " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("You Array contains");
//        for(int val: arr){
//            System.out.println(val);
//        }
//        int arr[] = {10, 20, 30};
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            System.out.println(arr[i]);
//        }
//        for(int val: arr){
//            System.out.println(val);
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int val = arr[i];
//            sum = sum + val;
//        }
//        System.out.println(sum);

//        int arr[] = {10,20,20};
//        int multi  = 1;
//        int n = arr.length;
//        for(int i=1; i<n; i++){
//            int val = arr[i];
//            multi = multi*val;
//        }
//        System.out.println(multi);

//        int arr[] = {1,3,5,3,10,4,2,6,-3,-4,9};
//        int max = arr[0];
//        int n = arr.length;
//        for(int i=1; i<n; i++){
//            int val = arr[i];
//            if(val > max){
//                max = val;
//            }
//        }
//        System.out.println(max);

        int arr[] = {1,2,3,4,5,2,2,4,-6,-3,-7,4,5,6,1232,45};
        int n = arr.length;
        int minValue = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }
}