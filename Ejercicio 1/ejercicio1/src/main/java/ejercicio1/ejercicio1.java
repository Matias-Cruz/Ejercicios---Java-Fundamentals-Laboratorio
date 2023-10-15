package ejercicio1;

public class ejercicio1 {
    public static void main(String[] args) {
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
    }
}