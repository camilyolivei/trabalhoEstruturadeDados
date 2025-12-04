import java.util.Random;

public class RelatorioVetor {

    public void relatorioVetorInsercaoOrdenado(int quantidadeNumeros) {
        int vetorOrdenado[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorOrdenado[indiceAtual] = indiceAtual;
        }

        return;
    }

    public void relatorioVetorInsercaoInvertido(int quantidadeNumeros) {
        int vetorInvertido[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorInvertido[indiceAtual] = quantidadeNumeros - indiceAtual;
        }

        return;
    }

    public void relatorioVetorInsercaoAleatorio(int quantidadeNumeros) {
        Random geradorAleatorio = new Random();  
        int vetorAleatorio[] = new int[quantidadeNumeros];

        for (int indiceAtual = 0; indiceAtual < quantidadeNumeros; indiceAtual++) {
            vetorAleatorio[indiceAtual] = geradorAleatorio.nextInt(quantidadeNumeros + 1);
        }

        return;
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
        
        // Seleciona 3 valores aleatórios presentes no vetor
        for (int i = 0; i < 3; i++) {
            valoresAlvo[i] = vetor[geradorAleatorio.nextInt(vetor.length)];
        }
        
        int quantidadeEncontrada = 0;
        
        // Busca sequencial pelos 3 elementos
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
}
