package com.bai.algo;



/**
 * 实现快速排序
 */
public class QuickSortTest {


    public static void quickSort(int[] data,int left,int right){
        if(left<right){
            int i=left,j =right,x =data[i];
            while (i<j){
                while (j >i && data[j] >=x){
                    j--;
                }
                if(i<j){
                    data[i++] = data[j];
                }
                while (i<j && data[i]<x){
                    i++;
                }
                if(i<j){
                    data[j--] = data[i];
                }
            }
            data[i] = x;
            quickSort(data,left,i-1);
            quickSort(data,i+1,right);
        }
    }

    public static void print(int[] data){
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] data = {3,2,5,8,4,7,6,9};
        print(data);
        quickSort(data,0,7);
        print(data);

    }

}
