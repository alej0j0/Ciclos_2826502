package org.cgmlti.adso.ciclos;

public class VariableAcumuladora {
    public static void main(String[] args) {
        //variable acumuladora
        //nombre significativo
        //recomendacion : 
        //valor inicial
        int contador;
        int total = 0;

        for (contador = 0 ;
            contador <= 10;
            contador ++){
                //instruccion de acumulacion
                //no se utiliza la variable de control
                total += contador;
                System.out.println(contador);
            }

            //imprimir variable acomulado
            //siempre fuera del ciclo
            System.out.println("total: " + total);

        int contador1;
        int total1 = 0;
        while (contador1 <= 10){
                System.out.println(contador1);
                total1 += contador1;
        }

        
    }
}
