package com.company;

public class Board {
    private static char in;
    private static char[] arr;

    public static char[] getArr() {
        return arr;
    }

    public static void setArr(char[] arr) {
//        System.out.println(arr);
        Board.arr = arr;
    }

    public static void print() {
        byte i=0;
        byte count=1;
        for(char ar:arr) {
            if(ar==' '){
                ar=(char)('0'+count);
            }
            System.out.print(ar+" | ");
            i++;
            if(i==3) {
                System.out.println();
                i=0;
            }
            count++;
        }
    }

    public static boolean checkBoard() {
        return checkRows() || checkColumn() || checkDiagonal();
    }

    public static boolean checkRows() {
        return  arr[0]!=' ' && arr[0]==arr[1] && arr[1]==arr[2]  ||
                arr[3]!=' ' && arr[3]==arr[5] && arr[4]==arr[3]  ||
                arr[6]!=' ' && arr[6]==arr[8] && arr[7]==arr[8];
    }
    public static boolean checkColumn() {
        return arr[0]!=' ' && arr[0]==arr[6] && arr[3]==arr[6]	||
                arr[1]!=' ' && arr[1]==arr[7] && arr[4]==arr[7]	||
                arr[2]!=' ' && arr[2]== arr[8] && arr[5]== arr[8];
    }
    public static boolean checkDiagonal() {
        return arr[0]!=' ' && arr[0]==arr[8] && arr[4]==arr[8]	||
                arr[2]!=' ' && arr[2]==arr[6] && arr[4]==arr[6];
    }

    public static boolean checkDraw() {
        String str=new String(arr);
        return !str.contains(" ");
    }
}
