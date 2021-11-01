package com.company;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class Run {
   public static int pos=1;
    public void play(Player p1,Player p2){

        Scanner sc=new Scanner(System.in);
        while(true){
            byte in;
            try {
                Board.print();
                char[] arr=Board.getArr();

                if(pos%2 ==1){
                    System.out.print("\nPlayer 1 ");
                }else{
                    System.out.print("\nPlayer 2 ");
                }
                System.out.println(" turn :");

                in=sc.nextByte();
                if(in>=1 && in<=9 && arr[in-1]==' ') {
                    if(pos%2 ==1){
                        arr[in-1]=p1.symbol;
                    }else{
                        arr[in-1]=p2.symbol;
                    }

                    Board.setArr(arr);
//                    System.out.println(Board.getArr());
//                    System.out.println(Board.checkBoard());
                    if(Board.checkBoard()){
                        System.out.print("\nHola!!... Now '");
                        if(pos%2 ==1){
                            System.out.print(" Player 1 ");
                        }else{
                            System.out.print(" Player 2 ");
                        }
                        System.out.print("' won the game! \n\n");
                        Board.print();
                        newGame();
                        return;
                    }else if( Board.checkDraw()){
                        System.out.println("\nThe match is Draw.. Start a new game..");
                        newGame();
                        return;
                    }else {
                        pos++;
                    }
                }else {
                    throw new WrongInputException();
                }
            }catch(WrongInputException wie) {
                System.out.println(wie.getMessage());

            }catch(InputMismatchException e) {
                System.out.println("\nInvalid input data.. Please enter values/number between 1-9 only\n\n");

            }catch(Exception e) {
                System.out.println("Sorry for inconvenience something went wrong..");
            }
        }



    }


    public void newGame() {
        char[] arr=new char [9];
        Arrays.fill(arr, ' ');
//        System.out.println(arr);
        Board.setArr(arr);
        pos=1;
        System.out.println("------------------------------\n");
        System.out.println("New Game :\n");
    }
}

class WrongInputException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Override
    public String getMessage() {
        return "\nNote:\nInvalid input.. Only numbers 0-9 allowed!\nAnd not allowed to use already occupied space!\n\n";
    }
}
