package com.unicecumar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aplication {

    public static void main(String[] args) {

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        List<Integer> ambas = new ArrayList<>();

        Auxiliar auxiliar = new Auxiliar(par, impar, ambas);

        Random random = new Random();

        Object numeros = null;

        for (int i = 0; i < 100 ; i++){
            numeros = random.nextInt(100);
            auxiliar.addNumeros((int) numeros);
        }


        System.out.println("Numeros pares");
        par.forEach(n -> System.out.println(n + ","));

        System.out.println("Numeros impars");
        impar.forEach(n -> System.out.println(n + ","));

        System.out.println("Todos os numeros");
        ambas.forEach(n -> System.out.println(n + ","));

    }
}
