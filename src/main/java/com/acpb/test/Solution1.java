package com.acpb.test;

public class Solution1 {

    public static void main(String[] args) {

    }
    public int[] mergeSortedArray(int[] a, int m, int[] b, int n) {

       int i=m-1;
       int j=n-1;
       int k=m+n-1;
       while (i>=0 && j>=0){
           if (a[i]>b[j]){
               a[k]=a[i];
               i-=1;
           }else{
               a[k]=b[i];
               i-=1;
           }
           k-=-1;
       }
       if (i<0){
           a[j+1]=b[j+1];
       }
        return  a;
    }
}
