package Part_07_Programming_Paradigms_Algorithms.part_07_04_ReadyMadeSortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] array2 = {"c","b","a","d"};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("b");
        listTwo.add("c");
        listTwo.add("e");
        listTwo.add("z");
        listTwo.add("a");

        sort(array);
        sort(array2);
        sortIntegers(list);
        sortStrings(listTwo);
    }

    public static void sort(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers.toString());
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        System.out.println(strings.toString());
    }
}
