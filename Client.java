
package javaapplication2;
import java.io.*;
import java.rmi.*;
import java.util.Scanner;
class Client
{
public static void main (String [] args)
{
 Scanner myObj = new Scanner(System.in);  
    System.out.println("operation et valeur:");

    String op = myObj.nextLine(); 
    String val = myObj.nextLine(); 
    int operation=Integer.parseInt(op);
    double valeur=Double.parseDouble(val);
    

 try {
    MyInterface cpt= (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server"); 

 if (operation==1) 
     cpt.crediter(valeur);
 else if (operation ==2) 
     cpt.debiter(valeur);
 else 
     System.out.println ("Votre solde = " +cpt.lire_solde());
 


 }catch (Exception e) {
    System.out.println("Erreur d'acces a un objet distant");
    System.out.println(e.toString());
 }
 }}