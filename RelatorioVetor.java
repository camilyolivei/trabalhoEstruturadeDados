import java.util.Random;

public class RelatorioVetor {

    public void relatorioVetorInsercaoOrdenado(int quantidadeNumeros) {
        int vetorOrdenado[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorOrdenado[indiceAtual] = indiceAtual;
        }
    }

    public void relatorioVetorInsercaoInvertido(int quantidadeNumeros) {
        int vetorInvertido[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorInvertido[indiceAtual] = quantidadeNumeros - indiceAtual;
        }
    }

    public void relatorioVetorInsercaoAleatorio(int quantidadeNumeros) {
        Random geradorAleatorio = new Random();
        int vetorAleatorio[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorAleatorio[indiceAtual] = geradorAleatorio.nextInt(quantidadeNumeros + 1);
        }
    }

    public void relatorioVetorBuscaPrimeiro(int vetor[]) {
        for (int indiceAtual = 0; indiceAtual < vetor.length; indiceAtual++) {
            if (vetor[indiceAtual] == vetor[0]) {
                break;
            }
        }
    }

    public void relatorioVetorBuscaUltimo(int vetor[]) {
        for (int indiceAtual = 0; indiceAtual < vetor.length; indiceAtual++) {
            if (vetor[indiceAtual] == vetor[vetor.length - 1]) {
                break;
            }
        }
    }

    public void relatorioVetorBuscaMeio(int vetor[]) {
        for (int indiceAtual = 0; indiceAtual < vetor.length; indiceAtual++) {
            if (vetor[indiceAtual] == vetor[vetor.length / 2]) {
                break;
            }
        }
    }

    public void relatorioVetorBuscaAleatorio(int vetor[]) {
        Random geradorAleatorio = new Random();
        int valoresAlvo[] = new int[3];

        for (int i = 0; i < 3; i++) {
            valoresAlvo[i] = vetor[geradorAleatorio.nextInt(vetor.length)];
        }

        int quantidadeEncontrada = 0;

        for (int indiceAtual = 0; indiceAtual < vetor.length && quantidadeEncontrada < 3; indiceAtual++) {
            for (int indiceAlvo = 0; indiceAlvo < 3; indiceAlvo++) {
                if (vetor[indiceAtual] == valoresAlvo[indiceAlvo]) {
                    quantidadeEncontrada++;
                    break;
                }
            }
        }
    }

    public void relatorioVetorBuscaInexistente(int vetor[]) {
        for (int indiceAtual = 0; indiceAtual < vetor.length; indiceAtual++) {
            if (vetor[indiceAtual] == 999999999) {
                break;
            }
        }
    }

    public void relatorioVetorBuscaBinariaPrimeiro(int vetor[], int valorAlvo) {
        int indiceInicio = 0;
        int indiceFim = vetor.length - 1;

        while (indiceInicio <= indiceFim) {
            int indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

            if (vetor[indiceMeio] == valorAlvo) {
                break;
            }

            if (vetor[indiceMeio] < valorAlvo) {
                indiceInicio = indiceMeio + 1;
            } else {
                indiceFim = indiceMeio - 1;
            }
        }
    }

    public void relatorioVetorBuscaBinariaUltimo(int arrayOrdenado[], int valorAlvo) {
        int indiceInicio = 0;
        int indiceFim = arrayOrdenado.length - 1;

        while (indiceInicio <= indiceFim) {
            int indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

            if (arrayOrdenado[indiceMeio] == valorAlvo) {
                break;
            }

            if (arrayOrdenado[indiceMeio] < valorAlvo) {
                indiceInicio = indiceMeio + 1;
            } else {
                indiceFim = indiceMeio - 1;
            }
        }
    }

    public void relatorioVetorBuscaBinariaMeio(int arrayOrdenado[], int valorAlvo) {
        int indiceInicio = 0;
        int indiceFim = arrayOrdenado.length - 1;

        while (indiceInicio <= indiceFim) {
            int indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

            if (arrayOrdenado[indiceMeio] == valorAlvo) {
                break;
            }

            if (arrayOrdenado[indiceMeio] < valorAlvo) {
                indiceInicio = indiceMeio + 1;
            } else {
                indiceFim = indiceMeio - 1;
            }
        }
    }

    public void relatorioVetorBuscaBinariaAleatorio(int arrayOrdenado[]) {
        Random geradorAleatorio = new Random();

        int valoresAlvo[] = new int[3];
        for (int indice = 0; indice < 3; indice++) {
            valoresAlvo[indice] = arrayOrdenado[geradorAleatorio.nextInt(arrayOrdenado.length)];
        }

        for (int alvoIndex = 0; alvoIndex < 3; alvoIndex++) {
            int indiceInicio = 0;
            int indiceFim = arrayOrdenado.length - 1;

            while (indiceInicio <= indiceFim) {
                int indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

                if (arrayOrdenado[indiceMeio] == valoresAlvo[alvoIndex]) {
                    break;
                }

                if (arrayOrdenado[indiceMeio] < valoresAlvo[alvoIndex]) {
                    indiceInicio = indiceMeio + 1;
                } else {
                    indiceFim = indiceMeio - 1;
                }
            }
        }
    }

    public void ordenarBubble(int[] vetor) {
        int tamanhoVetor = vetor.length;
        boolean houveTroca;

        for (int i = 0; i < tamanhoVetor - 1; i++) {
            houveTroca = false;

            for (int j = 0; j < tamanhoVetor - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temporario = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temporario;

                    houveTroca = true;
                }
            }

            if (!houveTroca) {
                break;
            }
        }
    }

    public void relatorioVetorBuscaBinariaInexistente(int arrayOrdenado[], int valorAlvo) {
        int indiceInicio = 0;
        int indiceFim = arrayOrdenado.length - 1;

        while (indiceInicio <= indiceFim) {
            int indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

            if (arrayOrdenado[indiceMeio] == valorAlvo) {
                break;
            }

            if (arrayOrdenado[indiceMeio] < valorAlvo) {
                indiceInicio = indiceMeio + 1;
            } else {
                indiceFim = indiceMeio - 1;
            }
        }
    }

    public int[] criarArrayOrdenado(int quantidadeNumeros) {
        int array[] = new int[quantidadeNumeros];

        for (int indice = 0; indice < quantidadeNumeros; indice++) {
            array[indice] = indice;
        }

        return array;
    }

    public int[] criarArrayAleatorio(int quantidadeNumeros) {
        int array[] = new int[quantidadeNumeros];

        for (int indice = 0; indice < quantidadeNumeros; indice++) {
            int numeroGerado = (int) (Math.random() * (quantidadeNumeros + 1));
            array[indice] = numeroGerado;
        }

        return array;
    }

    public int[] criarArrayInvertido(int quantidadeNumeros) {
        int array[] = new int[quantidadeNumeros];

        for (int indice = 0; indice < quantidadeNumeros; indice++) {
            array[indice] = quantidadeNumeros - indice;
        }

        return array;
    }

    public int[] copiarArray(int[] arrayOriginal) {
        int[] arrayCopia = new int[arrayOriginal.length];
        for (int indice = 0; indice < arrayOriginal.length; indice++) {
            arrayCopia[indice] = arrayOriginal[indice];
        }
        return arrayCopia;
    }

    public void ordenarMerge(int[] vetor, int tamanho) {
        if (tamanho < 2) {
            return;
        }

        int meio = tamanho / 2;
        int[] ladoEsquerdo = new int[meio];
        int[] ladoDireito = new int[tamanho - meio];

        for (int i = 0; i < meio; i++) {
            ladoEsquerdo[i] = vetor[i];
        }

        for (int i = meio; i < tamanho; i++) {
            ladoDireito[i - meio] = vetor[i];
        }

        ordenarMerge(ladoEsquerdo, meio);
        ordenarMerge(ladoDireito, tamanho - meio);

        merge(vetor, ladoEsquerdo, ladoDireito, meio, tamanho - meio);
    }

    private void merge(int[] vetor, int[] ladoEsquerdo, int[] ladoDireito, int tamanhoEsq, int tamanhoDir) {
        int indiceEsq = 0, indiceDir = 0, indiceMerged = 0;

        while (indiceEsq < tamanhoEsq && indiceDir < tamanhoDir) {
            if (ladoEsquerdo[indiceEsq] <= ladoDireito[indiceDir]) {
                vetor[indiceMerged++] = ladoEsquerdo[indiceEsq++];
            } else {
                vetor[indiceMerged++] = ladoDireito[indiceDir++];
            }
        }

        while (indiceEsq < tamanhoEsq) {
            vetor[indiceMerged++] = ladoEsquerdo[indiceEsq++];
        }

        while (indiceDir < tamanhoDir) {
            vetor[indiceMerged++] = ladoDireito[indiceDir++];
        }
    }
}
