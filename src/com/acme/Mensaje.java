package com.acme;

import java.util.Scanner;

public class Mensaje {

     public String solicitaDatos(String mensaje){
         System.out.println(mensaje);
         Scanner in = new Scanner(System.in);
         return in.nextLine();

     }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, bienvenido a java \n", p);
    }
}
