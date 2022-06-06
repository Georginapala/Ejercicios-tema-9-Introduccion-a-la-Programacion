package com.Openbootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 34;
        cliente.nombre = "Carlos";
        cliente.telefono = 11256399;
        cliente.credito = 300;

        System.out.println("El cliente tiene  " + cliente.edad + " se llama " + cliente.nombre + " su telefono es " + cliente.telefono + " y su credito es " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.nombre = "Moro";
        trabajador.telefono = 1136511233;
        trabajador.salario = 1000;


        System.out.println("El trabajador tiene  " + trabajador.edad + " se llama " + trabajador.nombre + " su telefono es " + trabajador.telefono + " y su salario es " + trabajador.salario);

    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona {

    int credito;

}
class Trabajador extends Persona {

    int salario;

}

