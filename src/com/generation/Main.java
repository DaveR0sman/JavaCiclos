package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu numero");
        int numero = sc.nextInt();
        for(int i = 0; i <=20; i++){
           System.out.println(numero + "x" + i + "=" + (numero*i));
        }*/

        //ciclo while, mientras la condicion se cumpla se va a repetir el codigo
        /*Scanner sc = new Scanner(System.in);
        System.out.println("adivina el numero secreto. ingresa tu numero");
        int numero = sc.nextInt();
        int numeroSecreto = 33;
        while(numero != numeroSecreto){
            System.out.println("erroneo, este no es el numero secreto");
            numero = sc.nextInt();


        }
        sc.close();
        System.out.println("felicidades adivinaste el numero");*/

        //ciclo do while
        /*Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;
        do{
            System.out.println("adivina el numero secreto. ingresa tu numero");
            numero = sc.nextInt();
        } while(numero != numeroSecreto);
        sc.close();
        System.out.println("felicidades adivinaste el numero");*/
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero para calcular su factorial");
        int numero = sc.nextInt();
        int n = 1;
        int i = 1;
        do{
            n=n*i;
            i++;
        } while (i <=numero);
        System.out.println("El numero factorial es: " +n);

    }
}
