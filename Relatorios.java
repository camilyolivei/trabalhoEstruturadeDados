public class Relatorios {

    public String fazerRelatoriosOrdenado(int QUANTIDADE_EXECUCAO) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoOrdenado = 0;

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(100);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo em nanosegundos para inserção de 100 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;
        //1000 ELEMENTOS

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(1000);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 1000 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;

        //10 mil elementos

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(10000);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo em nanosegundos para inserção de 10000 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;

        return str.toString();
    }

    public String fazerRelatoriosAleatorios(int QUANTIDADE_EXECUCAO) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoAleatorio = 0;

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(100);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / QUANTIDADE_EXECUCAO;
        str.append(
            "Tempo para inserção de 100 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );

        tempoAleatorio = 0;
        // 1000 ELEMENTOS

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(1000);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 1000 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );

        tempoAleatorio = 0;  

        //10 MIL ELEMENTOS

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(10000);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 10000 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );
        
        tempoAleatorio = 0;

        return str.toString();
    }
    public String fazerRelatoriosInvertidos(int QUANTIDADE_EXECUCAO) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoInvertido = 0;

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(100);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 100 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        //MIL ELEMENTOS

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(1000);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 1000 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        //10 MIL ELEMENTOS

        for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(10000);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / QUANTIDADE_EXECUCAO;
        str.append(
            "\nTempo para inserção de 10000 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        return str.toString();
    }

    public String fazerRelatoriosBuscas(int QUANTIDADE_EXECUCAO) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        int[] tamanhos = {100, 1000, 10000};

        for (int tamanho : tamanhos) {
            int[] arrayTeste = rv.criarArrayOrdenado(tamanho);
            long tempoBusca = 0;

            // Buscar primeiro elemento
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaPrimeiro(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar primeiro elemento em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar último elemento
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaUltimo(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar ultimo elemento em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;
