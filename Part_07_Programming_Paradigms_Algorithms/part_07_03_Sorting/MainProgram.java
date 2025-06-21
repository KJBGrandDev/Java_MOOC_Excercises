package Part_07_Programming_Paradigms_Algorithms.part_07_03_Sorting;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int currentSmallestNum = array[0];

        for(int i = 1; i < array.length;i++){
            if(array[i] < currentSmallestNum){
                currentSmallestNum = array[i];
            }
        }
        return currentSmallestNum;
    }

    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0;
        int smallestNum = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(smallestNum == array[i]){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int indexOfSmallest = startIndex;
        int smallestNum = table[startIndex];

        for(int i = startIndex + 1; i < table.length; i++){
            if(smallestNum > table[i]){
                indexOfSmallest = i;
                smallestNum = table[i];
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2){
        int first = array[index1];
        int second = array[index2];

        array[index1] = second;
        array[index2] = first;
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexOfSmallestFrom = indexOfSmallestFrom(array,i);
            swap(array,i,indexOfSmallestFrom);
            System.out.println(Arrays.toString(array));
        }
    }
}
