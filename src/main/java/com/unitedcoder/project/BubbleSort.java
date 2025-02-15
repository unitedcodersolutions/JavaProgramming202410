package com.unitedcoder.project;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray=new int[]{30,10,55,20,46};
        doSort(myArray);
    }
    public static void doSort(int[] arr)
    {
        int n=arr.length; //get total numbers to sort
        int temp=arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int number: arr)
        {
            System.out.print(number+" ");
        }
    }
}
