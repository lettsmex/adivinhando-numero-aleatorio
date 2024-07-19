import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;
        int numeroDigitado;
        boolean numeroCorreto = false;
        do {
            System.out.println("Digite um número de 1 a 10:");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado > numeroSorteado) {
                System.out.println("O número digitado é maior que o número correto.");
            } else if (numeroDigitado < numeroSorteado) {
                System.out.println("O número digitado é menor que o número correto.");
            } else {
                numeroCorreto = true;
                System.out.println("O número digitado está correto!");
            }
        } while (numeroCorreto == false);
        sc.close();
    }
}