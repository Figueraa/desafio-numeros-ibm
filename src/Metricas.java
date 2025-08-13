public class Metricas {
    public static int somar(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }
        return soma;
    }

    public static int[] encontrarMaiorMenor(int[] array) {
        int maior = array[0];
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return new int[]{maior, menor};
    }
}
