package com.petergregory;

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
	// write your code here
        testSumaStrings();
        testSumaInt();
        testChar();
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