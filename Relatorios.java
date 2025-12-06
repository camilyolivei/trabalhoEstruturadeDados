public class Relatorios {

    public String fazerRelatoriosOrdenado(int quantidadeExecucao) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoOrdenado = 0;

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(100);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / quantidadeExecucao;
        str.append(
            "\nTempo em nanosegundos para inserção de 100 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;
        //1000 ELEMENTOS

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(1000);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 1000 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;

        //10 mil elementos

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoOrdenado(10000);

            tempoOrdenado += System.nanoTime() - ini;
        }

        tempoOrdenado = tempoOrdenado / quantidadeExecucao;
        str.append(
            "\nTempo em nanosegundos para inserção de 10000 numeros em um vetor: " +
                tempoOrdenado +
                "ns"
        );

        tempoOrdenado = 0;

        return str.toString();
    }

    public String fazerRelatoriosAleatorios(int quantidadeExecucao) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoAleatorio = 0;

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(100);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / quantidadeExecucao;
        str.append(
            "Tempo para inserção de 100 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );

        tempoAleatorio = 0;
        // 1000 ELEMENTOS

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(1000);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 1000 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );

        tempoAleatorio = 0;  

        //10 MIL ELEMENTOS

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoAleatorio(10000);

            tempoAleatorio += System.nanoTime() - ini;
        }

        tempoAleatorio = tempoAleatorio / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 10000 numeros aleatorios em um vetor: " +
                tempoAleatorio +
                "ns"
        );
        
        tempoAleatorio = 0;

        return str.toString();
    }
    public String fazerRelatoriosInvertidos(int quantidadeExecucao) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        long tempoInvertido = 0;

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(100);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 100 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        //MIL ELEMENTOS

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(1000);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 1000 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        //10 MIL ELEMENTOS

        for (int i = 0; i < quantidadeExecucao; i++) {
            long ini = System.nanoTime();
            rv.relatorioVetorInsercaoInvertido(10000);

            tempoInvertido += System.nanoTime() - ini;
        }

        tempoInvertido = tempoInvertido / quantidadeExecucao;
        str.append(
            "\nTempo para inserção de 10000 numeros invertidos em um vetor: " +
                tempoInvertido +
                "ns"
        );

        tempoInvertido = 0;

        return str.toString();
    }

    public String fazerRelatoriosBuscas(int quantidadeExecucao) {
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        int[] tamanhos = {100, 1000, 10000};

        for (int tamanho : tamanhos) {
            int[] arrayTeste = rv.criarArrayOrdenado(tamanho);
            long tempoBusca = 0;

            // Buscar primeiro elemento
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaPrimeiro(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar primeiro elemento em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar último elemento
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaUltimo(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar ultimo elemento em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;
            // Buscar elemento do meio
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaMeio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar elemento do meio em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar 3 elementos aleatórios
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaAleatorio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar 3 elementos aleatorios em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento inexistente
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaInexistente(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar elemento inexistente em vetor de " + tamanho + " elementos: " + tempoBusca + "ns");
            tempoBusca = 0;
        }

        return str.toString();
    }

    public String fazerRelatoriosBuscaBinaria(int quantidadeExecucao){
        RelatorioVetor rv = new RelatorioVetor();
        StringBuilder str = new StringBuilder();

        int[] tamanhos = {100, 1000, 10000};

        for (int tamanho : tamanhos) {
            int[] arrayTeste = rv.criarArrayOrdenado(tamanho);
            long tempoBusca = 0;

            // Buscar primeiro elemento
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaPrimeiro(arrayTeste, arrayTeste[0]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar primeiro elemento em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar último elemento
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaUltimo(arrayTeste, arrayTeste[arrayTeste.length-1]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar ultimo elemento em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento do meio
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaMeio(arrayTeste, arrayTeste[arrayTeste.length/2]);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar elemento do meio em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar 3 elementos aleatórios
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaAleatorio(arrayTeste);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar 3 elementos aleatorios em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;

            // Buscar elemento inexistente
            for (int i = 0; i < quantidadeExecucao; i++) {
                long ini = System.nanoTime();
                rv.relatorioVetorBuscaBinariaInexistente(arrayTeste, tamanho + 1000);
                tempoBusca += System.nanoTime() - ini;
            }
            tempoBusca = tempoBusca / quantidadeExecucao;
            str.append("\nTempo para buscar elemento inexistente em vetor de " + tamanho + " elementos usando busca binaria: " + tempoBusca + "ns");
            tempoBusca = 0;
        }

        return str.toString();
    }

    public String fazerRelatorioOrdenacao(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();

      int arrayOriginal1[] = rv.criarArrayOrdenado(100);
      int arrayOriginal2[] = rv.criarArrayOrdenado(1000);
      int arrayOriginal3[] = rv.criarArrayOrdenado(10000);

      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.copiarArray(arrayOriginal1);
        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 100 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    

      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.copiarArray(arrayOriginal2);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 1000 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.copiarArray(arrayOriginal3);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 10000 elementos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;



      return str.toString();    
    }

     public String fazerRelatorioOrdenacaoAleatorio(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();
      
      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.criarArrayAleatorio(100); 
        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("Tempo para ordernar vetor de 100 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    


      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.criarArrayAleatorio(1000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 1000 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

     tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.criarArrayAleatorio(10000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 10000 elementos aleatorios com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
      
      return str.toString();    
    }

    public String fazerRelatorioOrdenacaoInvertido(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();
      
      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.criarArrayInvertido(100);

        long ini = System.nanoTime();
        rv.ordenarBubble(array1);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("Tempo para ordernar vetor de 100 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // MIL ELEMENTOS
    


      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.criarArrayInvertido(1000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array2);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }

      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 1000 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

     tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.criarArrayInvertido(10000);
        long ini = System.nanoTime();
        rv.ordenarBubble(array3);
      
        tempoOrdenacao += System.nanoTime() - ini;
      }
      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;

      str.append("\nTempo para ordernar vetor de 10000 elementos invertidos com Bubble Sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
      
      return str.toString();    
  
    }
    
    public String fazerRelatorioOrdenacaoMergeOrdenado(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();


      int arrayOriginal1[] = rv.criarArrayOrdenado(100);
      int arrayOriginal2[] = rv.criarArrayOrdenado(1000);
      int arrayOriginal3[] = rv.criarArrayOrdenado(10000);

      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.copiarArray(arrayOriginal1);
        long ini = System.nanoTime();
        rv.ordenarMerge(array1,array1.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("Tempo para ordernar vetor com 100 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      //MIL ELEMENTOS
   
      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.copiarArray(arrayOriginal2);
        long ini = System.nanoTime();
        rv.ordenarMerge(array2, array2.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 1000 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.copiarArray(arrayOriginal3);
        long ini = System.nanoTime();
        rv.ordenarMerge(array3, array3.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }

      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 10000 elementos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
    
      return str.toString();
    }

    public String fazerRelatorioOrdenacaoMergeAleatorio(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();

      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.criarArrayAleatorio(100);
        long ini = System.nanoTime();
        rv.ordenarMerge(array1,array1.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("Tempo para ordernar vetor com 100 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      //MIL ELEMENTOS
   
      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.criarArrayAleatorio(1000);
        long ini = System.nanoTime();
        rv.ordenarMerge(array2, array2.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 1000 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.criarArrayAleatorio(10000);
        
        long ini = System.nanoTime();
        rv.ordenarMerge(array3, array3.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }

      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 10000 elementos aleatorios com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
    
      return str.toString();
    }

     public String fazerRelatorioOrdenacaoMergeInvertido(int quantidadeExecucao){
      RelatorioVetor rv = new RelatorioVetor();
      StringBuilder str = new StringBuilder();

      long tempoOrdenacao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        int array1[] = rv.criarArrayInvertido(100);
        long ini = System.nanoTime();
        rv.ordenarMerge(array1,array1.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("Tempo para ordernar vetor com 100 elementos invertidos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      //MIL ELEMENTOS
   
      for(int i = 0; i < quantidadeExecucao; i++){
        int array2[] = rv.criarArrayInvertido(1000);
        long ini = System.nanoTime();
        rv.ordenarMerge(array2, array2.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }


      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 1000 elementos invertidos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;

      // 10 MIL ELEMENTOS
      
      for(int i = 0; i < quantidadeExecucao; i++){
        int array3[] = rv.criarArrayInvertido(10000);
        
        long ini = System.nanoTime();
        rv.ordenarMerge(array3, array3.length);

        tempoOrdenacao += System.nanoTime() - ini;
      }

      
      tempoOrdenacao = tempoOrdenacao / quantidadeExecucao;
      
      str.append("\nTempo para ordernar vetor com 10000 elementos invertidos com merge sort: " + tempoOrdenacao + "ns");

      tempoOrdenacao = 0;
    
      return str.toString();
    }
    

    public String fazerRelatorioInsercaoAVLOrdenado(int quantidadeExecucao){
      RelatorioAVL avl = new RelatorioAVL();
      StringBuilder str = new StringBuilder();


      long tempoInsercao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoOrdenado(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 100 elementos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //MIL elementos

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoOrdenado(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //10 MIL ELEMENTOS


      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoOrdenado(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      return str.toString();

    }

    public String fazerRelatorioInsercaoAVLAleatorio(int quantidadeExecucao){
      RelatorioAVL avl = new RelatorioAVL();
      StringBuilder str = new StringBuilder();


      long tempoInsercao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoAleatorio(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("Tempo de inserção de 100 elementos aleatorios para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //MIL elementos

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoAleatorio(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos aleatorios para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //10 MIL ELEMENTOS


      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoAleatorio(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos aleatorios para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      return str.toString();

    }

    public String fazerRelatorioInsercaoAVLInvertido(int quantidadeExecucao){
      RelatorioAVL avl = new RelatorioAVL();
      StringBuilder str = new StringBuilder();


      long tempoInsercao = 0;

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoInvertido(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("Tempo de inserção de 100 elementos invertidos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //MIL elementos

      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoInvertido(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos invertidos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      //10 MIL ELEMENTOS


      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        avl.relatorioInsercaoInvertido(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos invertidos para AVL: " + tempoInsercao + "ns");

      tempoInsercao = 0;

      return str.toString();

    }
    
    public String fazerRelatorioBuscaAVL(int quantidadeExecucao){
      StringBuilder str = new StringBuilder();

      int[] tamanhos = {100, 1000, 10000};

      for (int tamanho : tamanhos) {
        AVL avl = new AVL();
        
        // Popular a árvore com elementos ordenados
        for(int i = 0; i < tamanho; i++){
          avl.adicionar(i);
        }

        long tempoBusca = 0;

        // Buscar primeiro elemento
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          avl.buscar(0);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em AVL pelo primeiro numero inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar último elemento
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          avl.buscar(tamanho - 1);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em AVL pelo ultimo numero inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar elemento do meio
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          avl.buscar(tamanho / 2);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em AVL pelo numero do meio inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar 3 elementos aleatórios que existem na árvore
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          avl.buscar((int)(Math.random() * tamanho));
          avl.buscar((int)(Math.random() * tamanho));
          avl.buscar((int)(Math.random() * tamanho));
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em AVL por 3 numero aleatorios inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar elemento inexistente
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          avl.buscar(-1);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em AVL por um numero que não existe (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;
      }

      return str.toString();

    }

    public String fazerRelatorioInsercaoArvoreB(int quantidadeExecucao){
      RelatorioArvoreB rab = new RelatorioArvoreB();
      StringBuilder str = new StringBuilder();

      long tempoInsercao = 0;
     
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoOrdenado(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 100 elementos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoOrdenado(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //10 MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoOrdenado(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
   
      return str.toString();
    }
    
  public String fazerRelatorioInsercaoArvoreBAleatorio(int quantidadeExecucao){
      RelatorioArvoreB rab = new RelatorioArvoreB();
      StringBuilder str = new StringBuilder();

      long tempoInsercao = 0;
     
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoAleatorio(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("Tempo de inserção de 100 elementos aleatorios para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoAleatorio(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos aleatorios para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //10 MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoAleatorio(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos aleatorios para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
   
      return str.toString();
    }

  public String fazerRelatorioInsercaoArvoreBInvertidos(int quantidadeExecucao){
      RelatorioArvoreB rab = new RelatorioArvoreB();
      StringBuilder str = new StringBuilder();

      long tempoInsercao = 0;
     
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoInvertido(100);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("Tempo de inserção de 100 elementos invertidos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoInvertido(1000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 1000 elementos invertidos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
      
      //10 MIL ELEMENTOS
    
      for(int i = 0; i < quantidadeExecucao; i++){
        long ini = System.nanoTime();

        rab.relatorioInsercaoInvertido(10000);

        tempoInsercao += System.nanoTime() - ini;
      }

      tempoInsercao = tempoInsercao / quantidadeExecucao;

      str.append("\nTempo de inserção de 10000 elementos invertidos para Arvore Binaria: " + tempoInsercao + "ns");

      tempoInsercao = 0;
   
      return str.toString();
    }


    public String fazerRelatorioBuscaArvoreB(int quantidadeExecucao){
      StringBuilder str = new StringBuilder();

      int[] tamanhos = {100, 1000, 10000};

      for (int tamanho : tamanhos) {
        ArvoreB ab = new ArvoreB();
        
        // Popular a árvore com elementos ordenados
        for(int i = 0; i < tamanho; i++){
          ab.inserir(i);
        }

        long tempoBusca = 0;

        // Buscar primeiro elemento
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          ab.buscar(0);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em Arvore Binaria pelo primeiro numero inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar último elemento
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          ab.buscar(tamanho - 1);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em Arvore Binaria pelo ultimo numero inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar elemento do meio
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          ab.buscar(tamanho / 2);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em Arvore Binaria pelo numero do meio inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar 3 elementos aleatórios que existem na árvore
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          ab.buscar((int)(Math.random() * tamanho));
          ab.buscar((int)(Math.random() * tamanho));
          ab.buscar((int)(Math.random() * tamanho));
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em Arvore Binaria por 3 numero aleatorios inserido (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;

        // Buscar elemento inexistente
        for(int i = 0; i < quantidadeExecucao; i++){
          long ini = System.nanoTime();
          ab.buscar(-1);
          tempoBusca += System.nanoTime() - ini;
        }
        tempoBusca = tempoBusca / quantidadeExecucao;
        str.append("\nTempo de busca em Arvore Binaria por um numero que não existe (tamanho " + tamanho + "): " + tempoBusca + "ns");
        tempoBusca = 0;
      }

      return str.toString();
    }
}
