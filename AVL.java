public class AVL {
    No raiz;


    int altura(No N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int getBalanceamento(No N) {
        if (N == null)
            return 0;
        return altura(N.esquerda) - altura(N.direita);
    }

    No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }


    No inserir(No no, int valor) {
        if (no == null)
            return (new No(valor));

        if (valor < no.valor)
            no.esquerda = inserir(no.esquerda, valor);
        else if (valor > no.valor)
            no.direita = inserir(no.direita, valor);
        else 
            return no;

        no.altura = 1 + max(altura(no.esquerda), altura(no.direita));

        int balance = getBalanceamento(no);


        if (balance > 1 && valor < no.esquerda.valor)
            return rotacaoDireita(no);

        if (balance < -1 && valor > no.direita.valor)
            return rotacaoEsquerda(no);

        if (balance > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balance < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void adicionar(int valor) {
        raiz = inserir(raiz, valor);
    }

    public No buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private No buscarRecursivo(No atual, int valor) {
        if (atual == null || atual.valor == valor) {
            return atual;
        }

        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        }

        return buscarRecursivo(atual.direita, valor);
    }

    
    void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }

    public void imprimir() {
        emOrdem(raiz);
        System.out.println();
    }

}
