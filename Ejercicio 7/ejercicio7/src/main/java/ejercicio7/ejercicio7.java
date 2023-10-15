package ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
        int n = 4;
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
    }
}