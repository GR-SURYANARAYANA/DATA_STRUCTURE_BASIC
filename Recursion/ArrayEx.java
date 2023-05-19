package Recursion;

import java.util.ArrayList;

public class ArrayEx {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,199,198,13};
//        System.out.println(isSorted(arr,0,arr.length-1));
//        System.out.println(isContains(arr,10,0, arr.length));
//        System.out.println( isContains(arr,3,0, arr.length));
        System.out.println(isContainsBS(arr,198, arr.length-2 ,arr.length-1));
    }
    public static  boolean isSorted(int []arr,int start,int end){
        if(start==end)
            return true;
        return arr[start]<arr[start+1] && isSorted(arr,start+1,end);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static ArrayList<Integer> isContains(int []arr, int value, int start, int end){
        if(start==end)
            return list;
        if(arr[start]==value)
            list.add(start);
        return  isContains(arr,value,start+1,end);
    }
    public static int isContainsBS(int []arr,int value,int start,int end){
        int mid=(start+end)/2;
        if(start>end)
            return -1;
        if(arr[mid]==value)
            return mid;
        return (arr[mid]>value)?isContainsBS(arr,value,start,mid-1):isContainsBS(arr,value,mid+1,end);
    }
}
