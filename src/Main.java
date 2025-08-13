import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = LeitorNumeros.Scanner(sc, 10);

        System.out.println();
        System.out.println(Arrays.toString(array));

        int soma = Metricas.somar(array);
        System.out.println("Soma: " + soma);
        System.out.println("A média dos numeros é: " + (double) soma / array.length);

        int[] maiorMenor = Metricas.encontrarMaiorMenor(array);
        int maior = maiorMenor[0];
        int menor = maiorMenor[1];

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
