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
public class Demo2{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int coin = 0;
        int num[] = {10,5,2,1};
        System.out.println("Demo2");
        System.out.print("Input an amount: ");
        int amount = input.nextInt();//input to save in amount
        
        System.out.println("The minimum numbers of coins for "+amount+ " are:");//print the msg
        
       for (int i = 0; i < num.length; i++){
            coin = amount/num[i]; //get no. of coin
            amount -= coin*num[i]; //pass to next coin if coin = 0 -> 0*5 = 0 that amount = amount - 0
            System.out.println(String.format("%s-dollar coin(s): %s",num[i],coin));
       }
        
    }
}
