package com.company;

import java.util.Scanner;

class Player{
    public  char symbol;
    Player(int num){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player "+num+" symbol :");
        this.symbol = s.nextLine().charAt(0);
    }
    public void takePlayerInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player 2 symbol :");
        this.symbol = s.nextLine().charAt(0);
    }

}
