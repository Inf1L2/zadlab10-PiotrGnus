/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Petro
 */
public class zad5 {
  

  public static void zapisz(){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Podaj swoje imię");
	  String imie = input.nextLine();
          try{
	  PrintWriter z = new PrintWriter("imie.txt");
	  z.print(imie);
	  z.close();
          System.out.println("wpisano");
          
}
catch(IOException e){
    System.out.println("bład IOException ");
}
  }
public static void odczytaj() {
try{
	  Scanner od = new Scanner(new File("imie.txt"));
	  System.out.println(od.nextLine());
}
          catch(FileNotFoundException e){
            System.out.println(" nie istnieje!");
        } catch(IOException e){
            System.out.println("błąd IOException");
        }
          
}
public static void main(String[] args){
              zapisz();
              odczytaj();
          }
}
