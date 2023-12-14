package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        String apellido = msg.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre,apellido);

        msg.saludar(p1);

    }
}
