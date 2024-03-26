import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        // Criar um array chamado eramosSeis com o valores pré-definidos..
        int eramosSeis[] = {9, 4, 63, 999, -5, -16};
        int buscar = 999;

        int resultado = linearSearch(eramosSeis, buscar);
        // Mostra quando achou!
        if (resultado > -1){
            System.out.println("Achei o "+buscar+"! O índice é: "+resultado);
        } else {
            System.out.println("Não achei o "+buscar+"!!!");
        }

        int buscar2 = 16;
        resultado = linearSearch(eramosSeis, buscar2);
        // Mostra quando achou!
        if (resultado > -1){
            System.out.println("Achei o "+buscar2+"! O índice é: "+resultado);
        } else {
            System.out.println("Não achei o "+buscar2+"!!!");
        }

        int array25[] = { 17, 20, 26, 31, 44, 54, 55, 65, 77, 93 };
        resultado = binaryTreeSearch(array25, 5);
        //System.out.println(resultado);
        */
        int quantidade = 1000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();
        int resultado = linearSearch(vetor, 777);
        System.out.println(resultado);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Busca Linear executada em = " + (tempoFinal - tempoInicial) + " ms");

 

        int[] vetor_ordenado = bubbleSort(vetor);

        tempoInicial = System.currentTimeMillis();
        resultado = binaryTreeSearch(vetor_ordenado, 190);
        System.out.println(resultado);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Busca 'árvore binária' executada em = " + (tempoFinal - tempoInicial) + " ms");






    }

    // Função para busca linear...
    public static int linearSearch(int arr[], int x)
    {
        int n = arr.length;

        //Percorrer o array
        for(int i=0; i<n; i++){
            if (arr[i] == x){
                // Retorna o índice caso tenha achado!
                return i;
            }
        }
        // Retorna -1 quando NÃO ACHOU!
        return -1;
    }

    // Função para busca na estratégia "árvore binária"
    public static int binaryTreeSearch(int arr[], int x) {
        int n = arr.length;
        int l = 0; // esquerdo
        int r = n - 1;

        // Enquanto for possível "estreitar a árvore"
        while (l <= r) {
            int mid = (l + r) / 2;

            // Se o número procurado estiver BEM no meio, ele retornará o índice (mid)
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) { // número buscado é menor!
                r = mid - 1;
            } else { // número buscado é maior!
                l = mid + 1;
            }
        }
        return -1;
    }

    private static int[] bubbleSort(int vetor[]){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return vetor;
    }
}
