package ejercicio9;

public class ejercicio9 {
    public static void main(String[] args) {
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
    }
}