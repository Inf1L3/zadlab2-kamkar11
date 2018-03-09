package pl.edu.ur.main;

import java.util.Scanner;

public class MojeZadania {

    public MojeZadania() {

    }

    Scanner input = new Scanner(System.in);

    public void zadanie1() {

        double a, b, c;

        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();
        System.out.print("c= ");
        c = input.nextDouble();

        double delta;
        delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Brak rozwiązań");
        } else if (delta == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Jedno rozwiązanie x = " + x);
        } else if (delta > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("x1 = ");
            System.out.println(x1);
            System.out.print("x2 = ");
            System.out.println(x2);
            System.out.println("   ");
        }
        
    }

    public void zadanie2() {

    }

    public void zadanie3() {

    }

    public void zadanie4() {

    }

    public void zadanie5() {

    }

    public void zadanie6() {

    }

    public void zadanie7() {

    }

}
