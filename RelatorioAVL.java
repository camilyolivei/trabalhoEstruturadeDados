public class RelatorioAVL {

  public void relatorioInsercaoOrdenado(int quantidadeNumero){
    AVL arvore = new AVL();
    for(int i = 0; i < quantidadeNumero; i++){
      arvore.adicionar(i);
    }
  }

  public void relatorioInsercaoAleatorio(int quantidadeNumero){
    AVL arvore = new AVL();

    for(int i = 0; i < quantidadeNumero; i++){
      arvore.adicionar((int)(Math.random() * quantidadeNumero + 1));
    }
  }
  public void relatorioInsercaoInvertido(int quantidadeNumero){
    AVL arvore = new AVL();

    for(int i = 0; i < quantidadeNumero; i++){
      arvore.adicionar(quantidadeNumero - i);
    }
  }
}
