package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array = {{34,1,6,54},{432,5,2,4554,55,4},{432,3,46,43,321}};
        System.out.println("MAX === "+ timMax(array));
    }
    static int timMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0;i < arr.length;i++){
            for (int j = 0 ; j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
