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

        while (a == 1) {
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

            switch (n) {
                case 1: {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Suma: " + (liczba1 + liczba2));
                    break;
                }
                case 2: {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Różnica: " + (liczba1 - liczba2));
                    break;
                }
                case 3: {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Iloczyn: " + (liczba1 * liczba2));
                    break;
                }
                case 4: {
                    System.out.println("Podaj pierwszą liczbe: ");
                    liczba1 = input.nextDouble();
                    System.out.println("Podaj drugą liczbe: ");
                    liczba2 = input.nextDouble();
                    System.out.println("Iloraz: " + (liczba1 / liczba2));
                    break;
                }
                case 5: {
                    double podstawa;
                    double wykladnik;
                    System.out.println("Podaj liczbe którą chcesz potęgować: ");
                    podstawa = input.nextDouble();
                    System.out.println("Do której potęgi: ");
                    wykladnik = input.nextDouble();
                    System.out.println("Potęga: " + Math.pow(podstawa, wykladnik));
                    break;

                }
                case 6: {
                    double pierwiastek;
                    System.out.println("Podaj liczbe nieujemną: ");
                    pierwiastek = input.nextDouble();
                    System.out.println("Pierwiastek: " + Math.sqrt(pierwiastek));
                    break;
                }
                case 7: {
                    double x;
                    System.out.println("Podaj wartość: ");
                    x = input.nextDouble();
                    System.out.println("sin: " + Math.sin(x));
                    System.out.println("cos: " + Math.cos(x));
                    System.out.println("tg: " + Math.tan(x));
                    System.out.println("ctg: " + (Math.cos(x)) / (Math.sin(x)));
                    break;
                }
                case 0: {
                    a = 0;
                    break;
                }
                default: {
                    System.out.println("Podaj inną cyfrę !!!");
                    break;
                }

            }
        }

    }

    public void zadanie3() {
        double[] tab = new double[10];
        int c = 0;

        do {
            System.out.println("Podaj co robić: ");
            System.out.println("==========================");
            System.out.println("1 - od pierwszego elementu");
            System.out.println("2 - od ostatniego elementu");
            System.out.println("3 - nieparzyste indeksy");
            System.out.println("4 - parzyste indeksy");
            System.out.println("0 - wyjście");
            System.out.println("===========================");
            int n = input.nextInt();

            if (n == 1) {

                double a = 0;
                for (int i = 0; i < 10; i++) {
                    a += 1;
                    tab[i] = a;
                    System.out.print("tab[" + i + "] = " + tab[i] + " ");
                    System.out.println("");
                }
            }
            if (n == 2) {
                for (int i = 9; i >= 0; i--) {

                    System.out.print("tab[" + i + "] = " + tab[i] + " ");
                    System.out.println("");
                }
            }
            if (n == 3) {
                System.out.println("NIEPARZYSTE");
                for (int i = 1; i < 10; i += 2) {

                    System.out.print("tab[" + i + "] = " + tab[i] + " ");
                    System.out.println("");
                }
            }
            if (n == 4) {
                System.out.println("PARZYSTE");
                for (int i = 0; i < 10; i += 2) {

                    System.out.print("tab[" + i + "] = " + tab[i] + " ");
                    System.out.println("");
                }
            }
            if (n == 0) {
                c = 1;
            }

        } while (c == 0);
    }

    public void zadanie4() {
        double[] tab = new double[10];

        double m = 0;
        for (int i = 0; i < 10; i++) {
            m += 1;
            tab[i] = m;

        }
        int a = 0;

        while (a == 0) {

            System.out.println("Podaj co robić: ");
            System.out.println("==========================");
            System.out.println("1 - suma elementów tablicy");
            System.out.println("2 - iloczyn elementów tablicy");
            System.out.println("3 - średnia wartość");
            System.out.println("4 - minimalna wartość ");
            System.out.println("5 - maksymalna wartość ");
            System.out.println("0 - wyjście");
            System.out.println("===========================");
            int n = input.nextInt();

            if (n == 1) {
                double suma = 0;
                for (int i = 0; i < 10; i++) {
                    suma = suma + tab[i];
                }
                System.out.println("Suma el.tablicy: " + suma);

            } else if (n == 2) {
                double iloczyn = 1;
                for (int i = 0; i < 10; i++) {
                    iloczyn = iloczyn * tab[i];
                }
                System.out.println("Iloczyn el.tablicy: " + iloczyn);

            } else if (n == 3) {
                double suma = 0;
                for (int i = 0; i < 10; i++) {
                    suma = suma + tab[i];
                }
                System.out.println("Średnia wartość: " + (suma / 10));

            } else if (n == 4) {
                double min = tab[0];

                for (int i = 0; i < 10; i++) {

                    if (tab[i] < min) {
                        min = tab[i];
                    }
                }
                System.out.println(min);

            } else if (n == 5) {
                double max = tab[0];

                for (int i = 0; i < 10; i++) {

                    if (tab[i] > max) {
                        max = tab[i];
                    }
                }
                System.out.println(max);

            } else if (n == 0) {
                a = 1;
            } else {
                System.out.println("Zły wybór !!!");
            }
        }

    }

    public void zadanie5() {
        

    }

    public void zadanie6() {

    }

    public void zadanie7() {

    }

}
