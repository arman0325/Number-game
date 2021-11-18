/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinese.game;

import java.util.Scanner;

/**
 *
 * @author arman
 */
public class demo3 {
    public static void main(String args[]){
        int [][] arrayCard1 ={  {24, 2, 8, 1, 25},
                                {12, 16, 7, 17, 15},
                                {5, 6, 20, 19, 13},
                                {14, 23, 22, 4, 3},
                                {10, 18, 11, 21, 9}};
    
    
        int [][] arrayCard2 ={  {24, 21, 17, 15, 6},
                                {10, 3, 8, 18, 20},
                                {14, 7, 16, 12, 5},
                                {25, 23, 13, 19, 11},
                                {22, 4, 9, 1, 2}};
        
        printPlayCard(arrayCard1, 99); // 99 will not change the number
        System.out.println();
        printPlayCard(arrayCard2, 99); // 99 will not change the number
        
        loopInput(arrayCard1,arrayCard2);
        
    }
    
    //function of loop to input
    public static void loopInput(int[][] arrayCard1,int[][] arrayCard2){
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Game Host call (0 to exit): ");
            int num = input.nextInt();
            //call change and print function
            System.out.println("Player1's Card:");
            printPlayCard(arrayCard1, num);
            System.out.println("Player2's Card:");
            printPlayCard(arrayCard2, num);
            //end of print function
        } while(Checking(arrayCard1,arrayCard2) == false); // check the game is end
    }
    
    // print the card pattern
    public static void printPlayCard(int[][] arraylist, int num){
        for (int i = 0; i < arraylist.length; i++){
            for (int j = 0; j < arraylist[i].length; j++){
                if (arraylist[i][j]==num){
                    arraylist[i][j] = 0;
                }
                if (arraylist[i][j]==0){
                    System.out.printf("XX\t"); //print the XX in number of 0
                }else{
                    System.out.printf("%s\t", arraylist[i][j]); //print the number
                }
            }
            System.out.println();
	}
    }
    
    // For checking the game is finish
    public static boolean Checking(int[][] arraylist1, int[][] arraylist2){
        boolean endGame = false; // the game is finish
        boolean player1Win = false; // player 1 win
        boolean player2Win =false;  // player 2 win
        for (int i = 0; i < 5;i++){ //loop for each line
            if (condition(arraylist1, i)){//Slash line
                endGame = true;
                System.out.println("Player1 Bingo!");//print message of win
            }
            if (condition(arraylist2, i)){
                endGame = true;
                System.out.println("Player2 Bingo!");//print message of win
            }
        }
        
        return endGame;
    }
    
    public static boolean condition(int[][] arraylist,int i){
        if ((arraylist[i][0] == 0 && arraylist[i][1] == 0 && arraylist[i][2] == 0 && arraylist[i][3] == 0 && arraylist[i][4] == 0) //Horizontal line
                    || (arraylist[0][i] == 0 && arraylist[1][i] == 0 && arraylist[2][i] == 0 && arraylist[3][i] == 0 && arraylist[4][i] == 0) //Vertical line
                    || (arraylist[0][0] == 0 && arraylist[1][1] == 0 && arraylist[2][2] == 0 && arraylist[3][3] == 0 && arraylist[4][4] == 0)  //Slash line
                    || (arraylist[0][4] == 0 && arraylist[1][3] == 0 && arraylist[2][2] == 0 && arraylist[3][1] == 0 && arraylist[4][0] == 0) ){//Slash line
            return true;
        }else{
            return false;
        }
    }
    
}
