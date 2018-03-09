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

        int a = 1;
        

        while (a==1) 
        {
            double liczba1;
            double liczba2;
            
            System.out.println("Podaj co liczyć: (od 1 do 7)(0 aby wyjść)");
            System.out.println("================================");
            System.out.println("1 - suma: ");
            System.out.println("2 - różnica");
            System.out.println("3 - iloczyn");
            System.out.println("4 - iloraz");
            System.out.println("5 - potęga");
            System.out.println("6 - pierwiastek");
            System.out.println("7 - funkcje trygonometryczne");
            System.out.println("================================");
            int n = input.nextInt();
            
            switch (n) 
            {
                case 1:
                {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Suma: "+(liczba1+liczba2));
                    break;
                }
                case 2:
                {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Różnica: "+(liczba1-liczba2));
                    break;
                }
                case 3:
                {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Iloczyn: "+(liczba1*liczba2));
                    break;
                }
                case 4:
                {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Iloraz: "+(liczba1/liczba2));
                    break;
                }
                case 5:
                {
                    double podstawa;
                    double wykladnik;
                    System.out.println("Podaj liczbe którą chcesz potęgować: ");
                    podstawa = input.nextDouble();
                    System.out.println("Do której potęgi: ");
                    wykladnik = input.nextDouble();
                    System.out.println("Potęga: "+Math.pow(podstawa, wykladnik));
                    break;
                    
                }
                case 6:
                {
                    double pierwiastek;
                    System.out.println("Podaj liczbe nieujemną: ");
                    pierwiastek = input.nextDouble();
                    System.out.println("Pierwiastek: "+Math.sqrt(pierwiastek));
                    break;
                }
                case 7:
                {
                    double x;
                    System.out.println("Podaj wartość: ");
                    x = input.nextDouble();
                    System.out.println("sin: "+Math.sin(x));
                    System.out.println("cos: "+Math.cos(x));
                    System.out.println("tg: "+Math.tan(x));
                    System.out.println("ctg: "+(Math.cos(x))/(Math.sin(x)));
                    break;
                }
                case 0:
                {
                    a=0;
                    break;
                }
                default:
                {
                    System.out.println("Podaj inną cyfrę !!!");
                    break;
                }

            }
        }

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
