package FewBasicPractice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={17,12,4,6,1,7,3,82,374,30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        for(int i=0;i< arr.length;i++){
            int indexMin = minIndex(arr, i);
            int temp=arr[indexMin];
            arr[indexMin]=arr[i];
            arr[i]=temp;
        }
    }
    public static int minIndex(int []arr,int size){
        int min=size;
        for(int i=size;i< arr.length;i++){
           if(arr[min] >arr[i])
               min=i;
        }
        return min;
    }
}
