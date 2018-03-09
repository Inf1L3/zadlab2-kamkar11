package pl.edu.ur.main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        
        Scanner input = new Scanner(System.in);

        MojeZadania z1 = new MojeZadania();

        int a = 0;

        while (a == 0) {

            System.out.println("Podaj nr zadania: (od 1 do 7)(0 aby wyjść)");
            int n = input.nextInt();

            if (n == 1) {
                z1.zadanie1();
            } else if (n == 2) {
                z1.zadanie2();
            } else if (n == 3) {
                z1.zadanie3();
            } else if (n == 4) {
                z1.zadanie4();
            } else if (n == 5) {
                z1.zadanie5();
            } else if (n == 6) {
                z1.zadanie6();
            } else if (n == 7) {
                z1.zadanie7();
            } else if (n == 0) {
                a = 1;
            } else {
                System.out.println("Zły wybór !!!");
            }
        }
    }
    
}
