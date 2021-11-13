/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author arman
 */
import java.util.Scanner;
public class Demo{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int coin = 0;
        System.out.print("Input an amount: ");
        int amount = input.nextInt();//input to save in amount
        
        System.out.println("The minimum numbers of coins for "+amount+ " are:");//print the msg
        
       
        coin = amount/10; //get no. of coin
        amount -= coin*10; //pass to next coin if coin = 0 -> 0*5 = 0 that amount = amount - 0
        System.out.println("10-dollar coin(s): " + coin);
        
        coin = amount/5;
        amount -= coin*5;
        System.out.println("5-dollar coin(s): " + coin);
        
        coin = amount/2;
        amount -= coin*2;
        System.out.println("2-dollar coin(s): " + coin);
        
        coin = amount/1;
        System.out.println("1-dollar coin(s): " + coin);
        
    }
}
