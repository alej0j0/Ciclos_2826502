package org.cgmlti.adso.ciclos;

import java.util.ArrayList;

public class PromedioEjercicio {

    public static void main(String[] args) {
    ArrayList<Integer> notas = new ArrayList<>();
        notas.add(1);
        notas.add(2);
        notas.add(3);
        notas.add(4);
        notas.add(5);
        notas.add(6);
        notas.add(7);
        notas.add(8);
        notas.add(9);
        notas.add(10);

        int suma = 0;
        for(int nota    :   notas){
            suma += nota;
        }
        double promedio = suma / 10.0;

        System.out.println("Promedio: " + promedio);        

    }
}       

