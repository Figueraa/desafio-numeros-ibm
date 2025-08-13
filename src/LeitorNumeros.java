import java.util.Scanner;

public class LeitorNumeros {
    public static int[] Scanner(Scanner sc, int quantidade) {
        int[] array = new int[0];

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o " + i + "° numero: ");
            int numero = sc.nextInt();

            int[] novoArray = new int[array.length + 1];
            for (int j = 0; j < array.length; j++) {
                novoArray[j] = array[j];
            }
            novoArray[novoArray.length - 1] = numero;

            array = novoArray;
        }

        return array;
    }
}
