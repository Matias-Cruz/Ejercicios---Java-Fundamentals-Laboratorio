package ejercicio4;

public class ejercicio4 {
    public static void main(String[] args) {
        int n = 4;
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
    }
}