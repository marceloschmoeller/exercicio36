
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num = 20;
        int vet[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Digite um numero: (" + i + "):");
            vet[i] = Integer.parseInt(leitor.nextLine());
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (vet[i] > vet[j]) {
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
                {

                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Vector (" + i + "):" + vet[i]);
        }
    }
}
