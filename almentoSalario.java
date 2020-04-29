/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class almentoSalario {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double salario, reajuste;
        salario = input.nextDouble();
        
        if (salario >=0 && salario <= 400) {
            reajuste = salario*0.15;
            System.out.printf("Novo salario: %.2f\n",salario+reajuste );
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: 15 %%\n" );
        }
        else if (salario > 400 && salario <=800) {
            reajuste = salario*0.12;
            System.out.printf("Novo salario: %.2f\n",salario+reajuste );
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: 12 %%\n" );
        }
        else if (salario > 800 && salario <= 1200) {
            reajuste = salario*0.10;
            System.out.printf("Novo salario: %.2f\n",salario+reajuste );
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: 10 %%\n" );
        }
        else if (salario > 1200 && salario <= 2000) {
            reajuste = salario*0.07;
            System.out.printf("Novo salario: %.2f\n",salario+reajuste );
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: 7 %%\n" );
        }else{
            reajuste = salario*0.04;
            System.out.printf("Novo salario: %.2f\n",salario+reajuste );
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: 4 %%\n" );
        }
    }
}