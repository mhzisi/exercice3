
package javaapplication2;
import java.rmi.*;
import java.rmi.server.*;
public class Server {
public static void main(String[] args)
{
 try {
 System.out.println("Serveur : Construction de l’implémentation");
 Compte cpt= new Compte(15.5);
 System.out.println("Compte enregistré");
 Naming.rebind("rmi://127.0.0.1:1250/server",cpt);

 System.out.println("Attente de clients ");
 }
 catch (Exception e) {
 System.out.println("Erreur de liaison de l'objet Compte");
 System.out.println(e.toString());
 }
} 
}