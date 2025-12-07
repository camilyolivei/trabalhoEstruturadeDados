# Análise de Desempenho de Estruturas de Dados em Java

Este projeto tem como objetivo analisar o desempenho de diferentes estruturas de dados e algoritmos em Java, comparando tempos de execução para operações de inserção, busca e ordenação.

## Objetivo

O trabalho compara o desempenho de três estruturas de dados principais:
- **Vetores (Arrays)**: Com busca sequencial e binária, e algoritmos de ordenação (Bubble Sort e Merge Sort)
- **Árvore Binária de Busca (ABB)**: Implementação básica de árvore binária
- **Árvore AVL**: Árvore binária de busca auto-balanceada

Os testes são realizados com diferentes tamanhos de dados (100, 1.000, 10.000 elementos) e diferentes ordens de inserção (ordenada, inversa, aleatória) para avaliar o impacto desses fatores no desempenho.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

*   **Main.java**: Classe principal que executa os testes e imprime os relatórios no console.
*   **Relatorios.java**: Classe responsável por orquestrar os testes, executando-os múltiplas vezes e calculando a média dos tempos.
*   **RelatorioVetor.java**: Implementação dos testes para vetores (arrays), incluindo inserção, busca linear, busca binária e algoritmos de ordenação (Bubble Sort e Merge Sort).
*   **RelatorioAVL.java**: Implementação dos testes para Árvore AVL.
*   **RelatorioArvoreB.java**: Implementação dos testes para Árvore B.
*   **AVL.java**: Implementação da estrutura de dados Árvore AVL.
*   **ArvoreB.java**: Implementação da estrutura de dados Árvore B.
*   **No.java**: Classe auxiliar representando um nó da Árvore AVL.
*   **NoB.java**: Classe auxiliar representando um nó da Árvore B.

## Como Compilar e Executar

Para compilar e executar o projeto, certifique-se de ter o JDK (Java Development Kit) instalado e configurado no seu sistema.

### Pré-requisitos

- JDK 8 ou superior instalado
- Terminal (PowerShell, cmd, bash, etc.)

### Passos para Execução

1. **Abra o terminal na pasta do projeto**

   **Windows (PowerShell):**
   ```powershell
   cd "caminho\para\trabalho_ED-main"
   ```

   **Linux/Mac:**
   ```bash
   cd /caminho/para/trabalho_ED-main
   ```

2. **Compile todos os arquivos `.java`:**
   ```bash
   javac *.java
   ```
   
   Se a compilação for bem-sucedida, serão gerados arquivos `.class` correspondentes.

3. **Execute a classe principal:**
   ```bash
   java Main
   java TestArvoreB
   ```

### Execução Completa

O programa executa uma série completa de testes na seguinte ordem:

1. **Inserção em Vetor** (ordenado, invertido, aleatório)
2. **Ordenação com Bubble Sort** (ordenado, aleatório, invertido)
3. **Ordenação com Merge Sort** (ordenado, aleatório, invertido)
4. **Busca Sequencial em Vetor** (diferentes tamanhos)
5. **Busca Binária em Vetor** (diferentes tamanhos)
6. **Inserção em Árvore AVL** (ordenado, aleatório, invertido)
7. **Busca em Árvore AVL** (diferentes tamanhos)
8. **Inserção em Árvore B** (ordenado, aleatório, invertido)
9. **Busca em Árvore B** (diferentes tamanhos)

**⚠️ Nota Importante:** A execução completa pode levar vários minutos, especialmente os testes de Árvore B que podem demorar significativamente mais tempo.

### Redirecionando a Saída

Para salvar os resultados em um arquivo de texto:

**Windows (PowerShell):**
```powershell
java Main > resultados.txt 2>&1
```

**Linux/Mac:**
```bash
java Main > resultados.txt 2>&1
```

O arquivo `resultados.txt` conterá todos os tempos de execução em nanosegundos.

## Saída do Programa

A execução do programa gerará um relatório no console com os tempos médios (em nanosegundos) para cada operação testada. Cada teste é executado **10 vezes** e o tempo apresentado é a **média** dessas execuções.

### Formato da Saída

A saída é organizada em seções separadas por linhas de traços (`---`). Cada seção contém:

- **Inserção**: Tempos para inserir 100, 1.000 e 10.000 elementos
- **Ordenação**: Tempos para ordenar vetores de diferentes tamanhos com Bubble Sort e Merge Sort
- **Busca**: Tempos para buscar elementos em diferentes posições (primeiro, último, meio, aleatórios, inexistentes)

### Exemplo de Saída

```
Tempo em nanosegundos para inserção de 100 numeros em um vetor: 2690ns
Tempo para inserção de 1000 numeros em um vetor: 15930ns
...
--------------------------------------
Tempo para ordernar vetor de 100 elementos com Bubble Sort: 3560ns
...
```