/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.rmi.*;
import java.rmi.server.*;
public class Compte extends UnicastRemoteObject implements MyInterface
{
 private double solde;
 public Compte(double s) throws java.rmi.RemoteException
 {
 super();
 solde=s;
 }

 public void crediter(double montant)
 throws java.rmi.RemoteException
 {
 solde=solde+montant;
 }
 public void debiter(double montant)
 throws java.rmi.RemoteException
 {
 solde=solde-montant;
 }
 public double lire_solde()
 throws java.rmi.RemoteException
 {
 return solde;
 }
} 