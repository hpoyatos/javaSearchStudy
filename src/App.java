public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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

}
