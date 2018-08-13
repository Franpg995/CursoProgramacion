package com.petergregory;


import com.petergregory.soluciones.IOrdenacion;

import java.util.Arrays;

public class Main {

    /**
     *
     * Tipos de datos Primitivos
     *
     * byte, int, long
     * float, double
     * char, boolean
     *
     * Clase Wrapper
     * String
     *
     */

    public static void main(String[] args) {
        System.out.println("");
        int[] arrayAOrdenar = new int[10];
        arrayAOrdenar[0]=9;
        arrayAOrdenar[1]=2;
        arrayAOrdenar[2]=3;
        arrayAOrdenar[3]=-33;
        arrayAOrdenar[4]=4;
        arrayAOrdenar[5]=7;
        arrayAOrdenar[6]=99;
        arrayAOrdenar[7]=-9;
        arrayAOrdenar[8]=0;
        arrayAOrdenar[9]=5;


        System.out.println("Set de datos inicial: " + Arrays.toString(arrayAOrdenar));
        System.out.println("");
        ordenarExequiel(arrayAOrdenar);
        System.out.println("");
        System.out.println("");
        ordenarGregory(arrayAOrdenar);
    }

    private static void ordenarExequiel(int[] array){
        IOrdenacion ordenacion = new com.petergregory.soluciones.exequiel.Ordenacion();
        int[] resultado = ordenacion.ordenarMenorAMayor(array);
        System.out.println("Resultado ordenamiento Exequiel *******");
        System.out.println(Arrays.toString(resultado));
    }

    private static void ordenarGregory(int[] array){
        IOrdenacion ordenacion = new com.petergregory.soluciones.gregory.Ordenacion();
        int[] resultado = ordenacion.ordenarMenorAMayor(array);
        System.out.println("Resultado ordenamiento Gregory *******");
        System.out.println(Arrays.toString(resultado));
    }

    private static void testSumaStrings(){
        System.out.println("Hola mundo, este es mi primer test");
        String a = "Julio";
        String b = new String("Julio");
        String c = a.concat(" tro string");
        System.out.println("Resultado: " + c);
        System.out.println("*************************************");

    }

    private static void testSumaInt(){
        int valor = 4;
        int resultado = valor + 90;
        System.out.println("Resultado int : "+resultado);
        System.out.println("*************************************");
    }

    private static void testChar(){
        char caracter = 'a';
        char caracterRes = 'b';
        String result = String.valueOf(caracter) + String.valueOf(caracterRes);
        System.out.println("REsultado char: "+ result);
        System.out.println("*************************************");
    }


}