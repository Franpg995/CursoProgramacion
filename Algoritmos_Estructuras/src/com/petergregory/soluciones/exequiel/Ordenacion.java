package com.petergregory.soluciones.exequiel;

import com.petergregory.soluciones.IOrdenacion;

public class Ordenacion implements IOrdenacion {

    @Override
    public int[] ordenarMayorAMenor(int[] entradaAOrdenar) {

        return new int[0];
    }

    @Override
    public int[] ordenarMenorAMayor(int[] entradaAOrdenar) {
        /*
         *Revisar las cartas
         *Me doy si estan o no ordenadas
         * Si la de la izq es menor que la de la derecha está ok, paso a la otra
         * Si la de la izq es mayor que la de la derecha está desordenado, y las cambio
         * Si la de la izq es igual que la de la derecha está ok, paso a la otra
         */
        int[] resultado = entradaAOrdenar;


        int indexIzq = 0;
        int indexDer = 1;
        for (int i = 0; (i < entradaAOrdenar.length) && (indexIzq<entradaAOrdenar.length-1); i++) {
            /*System.out.println("index izq: "+ String.valueOf(indexIzq));
            System.out.println("index der: "+ String.valueOf(indexDer));
            System.out.println(" ----- ");*/
            int aux = 0;
            if (resultado[indexIzq]<=resultado[indexDer]){
                //Está ok
            }else{
                aux = resultado[indexIzq];
                resultado[indexIzq]=resultado[indexDer];
                resultado[indexDer]=aux;
            }
            indexIzq=indexIzq+1;
            indexDer=indexIzq+1;
        }
        return resultado;
    }
}
