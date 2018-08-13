package com.petergregory.soluciones.gregory;

import com.petergregory.soluciones.IOrdenacion;

public class Ordenacion implements IOrdenacion {
    @Override
    public int[] ordenarMayorAMenor(int[] entradaAOrdenar) {
        int aux = 0;
        int[] resultado = entradaAOrdenar;
        for(int i=0; i<entradaAOrdenar.length; i++) {
            for (int j=0; j<entradaAOrdenar.length; j++){
                if(resultado[i]>resultado[j]){
                    aux=resultado[i];
                    resultado[i]=resultado[j];
                    resultado[j]=aux;
                }
            }
        }



        return new int[0];
    }

    @Override
    public int[] ordenarMenorAMayor(int[] entradaAOrdenar) {


        int aux = 0;
        int[] resultado = entradaAOrdenar;
        for(int i=0; i<entradaAOrdenar.length; i++) {
            for (int j=0; j<entradaAOrdenar.length; j++){
                if(resultado[i]<resultado[j]){
                    aux=resultado[i];
                    resultado[i]=resultado[j];
                    resultado[j]=aux;
                }
            }
        }

        return resultado;
        /*
         *Revisar las cartas
         *Me doy si estan o no ordenadas
         * Si la de la izq es menor que la de la derecha está ok, paso a la otra
         * Si la de la izq es mayor que la de la derecha está desordenado, y las cambio
         * Si la de la izq es igual que la de la derecha está ok, paso a la otra
         */



    }
}
