package org.cgmlti.adso.ciclos;

public class OperadorTernario {

    public static void main(String[] args) {

        int cuenta = 1;
        String mensaje = "";
        mensaje = (cuenta > 10) ? "Cuenta es mayor a 10" : "Cuenta es menor a 10";
        System.out.println(mensaje);
    }

}
