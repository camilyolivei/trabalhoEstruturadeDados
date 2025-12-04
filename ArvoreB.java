public class ArvoreB {

    NoB raiz;

    public ArvoreB() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private NoB inserirRecursivo(NoB atual, int valor) {
        if (atual == null) {
            return new NoB(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NoB atual, int valor) {
        if (atual == null) {
            return false; 
        }

        if (valor == atual.valor) {
            return true; 
        }
        
        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        } else {
            return buscarRecursivo(atual.direita, valor);
        }
    }

    public void imprimirOrdem() {
        imprimirRecursivo(raiz);
        System.out.println();
    }

    private void imprimirRecursivo(NoB atual) {
        if (atual != null) {
            imprimirRecursivo(atual.esquerda);
            System.out.print(atual.valor + " ");
            imprimirRecursivo(atual.direita);
        }
    }
}
