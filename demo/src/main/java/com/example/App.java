package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs (int numero){
        if(memo.containsKey(numero)){
            return memo.get(numero);
        }else{
            if(numero<=2){
                memo.put(numero, 1);
                return memo.get(numero);
            }else{
                int resultado = climbStairs(numero-1)+climbStairs(numero-2);
                memo.put(numero, resultado);
                return resultado;
            }
        }

    }
    
    public static void main( String[] args ){
        int continuar=1;
        Scanner scanner  = new Scanner(System.in);
        do{
            System.out.println("Digite o numero de degraus da escada: ");
            int degraus=Integer.parseInt(scanner.nextLine());
            System.out.println("Existem "+climbStairs(degraus)+" formas de suber uma escada com "+degraus+" degraus");
            System.out.println("Deseja continuar? digite 1 para sim e 2 para não:");
            continuar=Integer.parseInt(scanner.nextLine());
            if(continuar!=1){
                System.out.println("Finalizado pelo usuário");
            }
        }while(continuar==1);
        
        

    }
}
