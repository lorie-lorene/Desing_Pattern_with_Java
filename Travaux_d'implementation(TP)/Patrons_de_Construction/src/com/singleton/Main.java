package com.singleton;

// Une classe de test

public class Main {
    public static void main(String[] args) {

        OperationMathematique instance= OperationMathematique.getParam();
        int value= instance.sum(2,4);

        System.out.printf("la somme est %d", value);
        int value2= instance.sum(2,4,9);
        
        System.out.printf("la somme2 est %d", value2);

    }
}