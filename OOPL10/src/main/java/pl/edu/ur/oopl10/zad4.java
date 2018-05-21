/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

 import java.util.Random;
/**
 *
 * @author Petro
 */
public class zad4 {
   
    public static void main(String[] args){
        int i = 0,dzielenie;
       do{
           Random losowe = new Random();
                int x=losowe.nextInt(10)*(-1);
                int y=losowe.nextInt(10);
                System.out.println("twoje losowe liczby to:" );
                System.out.println(x);
                System.out.println(y);
            try{
                
                dzielenie =x/y;
            }
            catch(ArithmeticException e)
                    {
                        System.out.println("Dzielenie przez 0");
                        i++;
                    }
        }while(i!= 3);
               
        
    
       }}

