package com.unicecumar;

import java.util.List;

public class Auxiliar {

    List<Integer> par;
    List<Integer> impar;
    List<Integer> ambas;

    public Auxiliar(List<Integer> par, List<Integer> impar, List<Integer> ambas) {
        this.par = par;
        this.impar = impar;
        this.ambas = ambas;
    }

    public void addNumeros(int numeros){

        this.ambas.add(numeros);

        if(numeros % 2 == 0){
            par.add(numeros);
        }else{
            impar.add(numeros);
        }


    }

}
