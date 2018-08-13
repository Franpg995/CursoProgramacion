package com.petergregory.soluciones.gregory;

import com.petergregory.soluciones.IOrdenacion;

public class Ordenacion implements IOrdenacion {
    @Override
    public int[] ordenarMayorAMenor(int[] entradaAOrdenar) {



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
    }
}
