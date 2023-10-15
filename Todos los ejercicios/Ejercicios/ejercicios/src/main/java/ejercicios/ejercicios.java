package ejercicios;

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        // Autor: Matías Cruz
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=================");
        System.out.println("Menú de opciones:");
        System.out.println("=================");
        System.out.println();
        System.out.println("<1> Ejercicio 1");
        System.out.println("<2> Ejercicio 2");
        System.out.println("<2> Ejercicio 3");
        System.out.println("<2> Ejercicio 4");
        System.out.println("<2> Ejercicio 5");
        System.out.println("<2> Ejercicio 6");
        System.out.println("<2> Ejercicio 7");
        System.out.println("<2> Ejercicio 8");
        System.out.println("<2> Ejercicio 9");
        System.out.println("<2> Ejercicio 10");
        System.out.println();
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();
        int n = 4;
        if (opcion == 1) {
            //INICIO EJERCICIO 1
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 1");
            System.out.println("===========");
            System.out.println();
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        if (i == j) {
                            System.out.print("1" + "\t") ;
                        }else {
                            System.out.print("0" + "\t");
                        }
                    }
                    System.out.println("\n");
                }
            // FIN EJERCICIO 1
            
        } else if (opcion == 2) {
            //INICIO EJERCICIO 2
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 2");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i == (n - 1 - j)) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 2

        } else if (opcion == 3) {
            //INICIO EJERCICIO 3
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 3");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }

            // FIN EJERCICIO 3

        } else if (opcion == 4) {
            //INICIO EJERCICIO 4
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 4");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i <= j) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 4

        } else if (opcion == 5) {
            //INICIO EJERCICIO 5
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 5");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i >= j) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 5

        } else if (opcion == 6) {
            //INICIO EJERCICIO 6
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 6");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 6

        } else if (opcion == 7) {
            //INICIO EJERCICIO 7
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 7");
            System.out.println("===========");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        System.out.print(j + 1 + "\t");
                    } else {
                        System.out.print(n - j + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 7

        } else if (opcion == 8) {
            //INICIO EJERCICIO 8
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 8");
            System.out.println("===========");
            System.out.println();
            int xcon=1;
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        System.out.print(xcon + "\t") ;
                        xcon++;
                    }
                    System.out.println("\n");
                }
            // FIN EJERCICIO 8

        } else if (opcion == 9) {
            //INICIO EJERCICIO 9
            System.out.println();
            System.out.println("===========");
            System.out.println("Ejercicio 9");
            System.out.println("===========");
            System.out.println();
            int k = 5;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (j <= i && j + i <= k - 1) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 9

        } else if (opcion == 10) {
            //INICIO EJERCICIO 10
            System.out.println();
            System.out.println("============");
            System.out.println("Ejercicio 10");
            System.out.println("============");
            System.out.println();
            int k = 5;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (i <= j && i + j <= k - 1) {
                        System.out.print("1" + "\t");
                    } else {
                        System.out.print("0" + "\t");
                    }
                }
                System.out.println("\n");
            }
            // FIN EJERCICIO 10

        }

        sc.close();
    }
}