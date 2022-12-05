import Task1_SortSliyanie.*;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;


public class ProgMerge {
    public static void main(String[] args) {
        // Integer[] arr1 = {7, 6, 3, 2, 3, 10, 15, 8};
        // Integer[] arr2 = {7, 6, 3, 2, 3, 10, 15, 8, 18, 41, 52, 1, 12, 83, 4};
        Integer[] arr1 = {1, 6, 10, 11, 25, 28, 30, 35};
        Integer[] arr2 = {4, 5, 18, 19, 21, 20, 40, 46};
        
        AddClassMerge obj1 = new AddClassMerge(arr1);
        AddClassMerge obj2 = new AddClassMerge(arr2);
        obj1.sortArray();
        obj2.sortArray();
        ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(obj2.arrInitial));
        ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(obj1.arrInitial));

        Mergeclasses objMerge = new Mergeclasses(list1, list2);
        objMerge.creatMerge();
        objMerge.printMergedArray();
    }
}
