package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] arr=new char [9];
        Arrays.fill(arr, ' ');
//        System.out.println(arr);
        Board.setArr(arr);
        Board.print();
        Run game=new Run();
        Player p1= new Player(1);
        Player p2= new Player(2);
//        Ensuring the duplicate symbol
        while(p1.symbol == p2.symbol){
            System.out.println("Symbol taken !! Take someother symbol");
            p2.takePlayerInput();
        }
        while(true){
            game.play(p1,p2);
        }

//
    }
}

