public class RelatorioArvoreB {

   public void relatorioInsercaoOrdenado(int quantidadeNumero){
      ArvoreB arvore = new ArvoreB();
      
      for(int i = 0; i < quantidadeNumero; i++){
         arvore.inserir(i);
      }
   }

   public void relatorioInsercaoAleatorio(int quantidadeNumero){
      ArvoreB arvore = new ArvoreB();

      for(int i = 0; i < quantidadeNumero; i++){
         arvore.inserir((int)(Math.random() * quantidadeNumero + 1));
      }
   }

   public void relatorioInsercaoInvertido(int quantidadeNumero){
      ArvoreB arvore = new ArvoreB();

      for(int i = 0; i < quantidadeNumero; i++){
         arvore.inserir(quantidadeNumero - i);
      }
   }

}
