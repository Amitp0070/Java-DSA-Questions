import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Arrays Sort
        Integer[] arr = {1,4,53,22,4,5};
        Arrays.sort(arr, new ReverseComparator());
        for(int a: arr){
            System.out.print(a + " ");
        }






//
//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student(19, "Amit", 50));
//        students.add(new Student(24, "Ayush", 40));
//        students.add(new Student(24, "Rohit", 60));
//        students.add(new Student(24, "Aman", 51));
//        students.add(new Student(30, "Javed", 40));
//
//        System.out.println(students);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.weight == o2.weight){
//                    return o1.name.compareTo(o2.name);
//                }
//                return o1.weight - o2.weight;
//            }
//        });

        // lamda expression
//        Collections.sort(students,((o1, o2) -> o1.age - o2.age));
//        System.out.println(students);

//        Collections.sort(students, new AgeComparator());
//        System.out.println(students);












//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(10);
//        list.add(18);
//        list.add(1);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
