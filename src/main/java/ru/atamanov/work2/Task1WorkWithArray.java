package ru.atamanov.work2;

import java.util.Arrays;

public class Task1WorkWithArray {
    public static void main() {
        int[] array = {-1,-3,-4,-5, 5};
        System.out.println(Arrays.toString(array));
        int result = Task1WorkWithArray.findLastPositiveElement(array);
        if(result >= 0){
            System.out.println("Last positive element: " + result);
        } else {
            System.out.println("Positive element not found");
        }
    }

    public static int findLastPositiveElement(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i]>0){
                return array[i];
            }
        }
        return -1;
    }
}
