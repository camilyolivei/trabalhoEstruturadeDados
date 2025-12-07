// Camily Guilherme de Oliveira
public class Main {

    public static void main(String args[]) {
        Relatorios rs = new Relatorios();
        int array[] = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
        }

        System.out.println(rs.fazerRelatoriosOrdenado(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatoriosInvertidos(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatoriosAleatorios(10));

        System.out.println("--------------------------------------");

        System.out.println(rs.fazerRelatorioOrdenacao(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioOrdenacaoAleatorio(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioOrdenacaoInvertido(10)); 

        System.out.println("--------------------------------------------");
        System.out.println(rs.fazerRelatorioOrdenacaoMergeOrdenado(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioOrdenacaoMergeAleatorio(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioOrdenacaoMergeInvertido(10));
    
        System.out.println("----------------------------------------------");
        System.out.println(rs.fazerRelatoriosBuscas(10));
        System.out.println("----------------------------------------------");
        System.out.println(rs.fazerRelatoriosBuscaBinaria(10));
    
        System.out.println("----------------------------------------------");

        System.out.println(rs.fazerRelatorioInsercaoAVLOrdenado(10)); 
        System.out.println("|");
        System.out.println(rs.fazerRelatorioInsercaoAVLAleatorio(10)); 
        System.out.println("|");
        System.out.println(rs.fazerRelatorioInsercaoAVLInvertido(10));
        System.out.println("|");
        
        System.out.println("----------------------------------------------");

        System.out.println(rs.fazerRelatorioBuscaAVL(10));

        System.out.println("----------------------------------------------");
        
        System.out.println(rs.fazerRelatorioInsercaoArvoreB(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioInsercaoArvoreBAleatorio(10));
        System.out.println("|");
        System.out.println(rs.fazerRelatorioInsercaoArvoreBInvertidos(10));


        System.out.println(rs.fazerRelatorioBuscaArvoreB(10));

        System.out.println("---------------------------------------------");

    }
}
