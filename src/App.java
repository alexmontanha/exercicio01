import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nota entre 0 e 10");

        Scanner sc = new Scanner(System.in);

        int nota;

        do {

            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, digite novamente");
            }
            
        } while (nota < 0 || nota > 10);

        System.out.print("Nota válida: " + nota);

        sc.close();
    }
}
