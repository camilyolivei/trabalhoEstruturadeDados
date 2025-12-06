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
            // Buscar elemento do meio
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaMeio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar elemento do meio em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar 3 elementos aleatórios
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaAleatorio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar 3 elementos aleatorios em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento inexistente
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaInexistente(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar elemento inexistente em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;
        }

        return str.toString();
    }

    public String fazerRelatoriosBuscaBinaria(int QUANTIDADE_EXECUCAO){
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        int[] tamanhos = {100, 1000, 10000};

        for (int tamanho : tamanhos) {
            int[] arrayTeste = rv.criarArrayOrdenado(tamanho);
            long tempoBusca = 0;

            // Buscar primeiro elemento
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaPrimeiro(arrayTeste, arrayTeste[0]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar primeiro elemento em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar último elemento
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaUltimo(arrayTeste, arrayTeste[arrayTeste.length-1]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar ultimo elemento em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento do meio
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaMeio(arrayTeste, arrayTeste[arrayTeste.length/2]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar elemento do meio em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar 3 elementos aleatórios
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaAleatorio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar 3 elementos aleatorios em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento inexistente
            for (int i = 0; i < QUANTIDADE_EXECUCAO; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaInexistente(arrayTeste, tamanho + 1000);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / QUANTIDADE_EXECUCAO;
            str.append("\nTempo para buscar elemento inexistente em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;
        }

        return str.toString();
    }

    public String fazerRelatorioOrdenacao(int QUANTIDADE_EXECUCAO){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();

      int arrayOriginal1[] = rv.criarArrayOrdenado(100);
      int arrayOriginal2[] = rv.criarArrayOrdenado(1000);
      int arrayOriginal3[] = rv.criarArrayOrdenado(10000);

      long tempoOrdenacao = 0;

      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array1[] = rv.copiarArray(arrayOriginal1);
        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 100 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    

      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array2[] = rv.copiarArray(arrayOriginal2);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 1000 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array3[] = rv.copiarArray(arrayOriginal3);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 10000 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;



      return str.toString();    
    }

     public String fazerRelatorioOrdenacaoAleatorio(int QUANTIDADE_EXECUCAO){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();
      
      long tempoOrdenacao = 0;

      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array1[] = rv.criarArrayAleatorio(100); 
        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("Tempo para ordernar vetor de 100 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    


      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array2[] = rv.criarArrayAleatorio(1000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 1000 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

     tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      
      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array3[] = rv.criarArrayAleatorio(10000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 10000 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
      
      return str.toString();    
    }

    public String fazerRelatorioOrdenacaoInvertido(int QUANTIDADE_EXECUCAO){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();
      
      long tempoOrdenacao = 0;

      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array1[] = rv.criarArrayInvertido(100);

        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("Tempo para ordernar vetor de 100 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    


      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array2[] = rv.criarArrayInvertido(1000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 1000 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

     tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      
      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array3[] = rv.criarArrayInvertido(10000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;

      str.append("\nTempo para ordernar vetor de 10000 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
      
      return str.toString();    
  
    }
    
    public String fazerRelatorioOrdenacaoMergeOrdenado(int QUANTIDADE_EXECUCAO){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();


      int arrayOriginal1[] = rv.criarArrayOrdenado(100);
      int arrayOriginal2[] = rv.criarArrayOrdenado(1000);
      int arrayOriginal3[] = rv.criarArrayOrdenado(10000);

      long tempoOrdenacao = 0;

      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array1[] = rv.copiarArray(arrayOriginal1);
        long ini = System.nanoTime();
        rv.ordenarMerge(array1,array1.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("Tempo para ordernar vetor com 100 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      //MIL ELEMENTOS
   
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array2[] = rv.copiarArray(arrayOriginal2);
        long ini = System.nanoTime();
        rv.ordenarMerge(array2, array2.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("\nTempo para ordernar vetor com 1000 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array3[] = rv.copiarArray(arrayOriginal3);
        long ini = System.nanoTime();
        rv.ordenarMerge(array3, array3.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }

      
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("\nTempo para ordernar vetor com 10000 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
    
      return str.toString();
    }

    public String fazerRelatorioOrdenacaoMergeAleatorio(int QUANTIDADE_EXECUCAO){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();

      long tempoOrdenacao = 0;

      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array1[] = rv.criarArrayAleatorio(100);
        long ini = System.nanoTime();
        rv.ordenarMerge(array1,array1.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("Tempo para ordernar vetor com 100 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      //MIL ELEMENTOS
   
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array2[] = rv.criarArrayAleatorio(1000);
        long ini = System.nanoTime();
        rv.ordenarMerge(array2, array2.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("\nTempo para ordernar vetor com 1000 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < QUANTIDADE_EXECUCAO; i++){
        int array3[] = rv.criarArrayAleatorio(10000);
        
        long ini = System.nanoTime();
        rv.ordenarMerge(array3, array3.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }

      
      tempoOrdenacao = tempoOrdenacao / QUANTIDADE_EXECUCAO;
      
      str.append("\nTempo para ordernar vetor com 10000 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
    
      return str.toString();
    }

