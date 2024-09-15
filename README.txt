LINK GITHUB: https://github.com/LuizFPS04/research-tree

Divisão de Tarefas: 

==========================

Arhtur Garcia: Responsável pela criação da classe BinaryTree e Node.
Luiz Felipe: Reponsável pela criação da classe LineList, Line e ReaderFile.
Pedro Augusto : Responsável pela criação da classe ReaderFile e javaDoc.
Rafi Gabriel: Responsável pela criação da classe BinaryTree e javaDoc.
Velber: Reponsável pela criação da classe LineList e Line.

==========================

Classe App: Classe responsável por realizar a leitura do diretório que contem os arquivos para construção da árvore
Método main: Método principal que executa a aplicação.

==========================

Classe ReaderFile: Classe responsável por abrir o diretório onde contém os arquivos para serem lidos e os lê. Contém o método read que faz a leitura dos arquivos, processa seu conteúdo e insere as linhas do arquivo em uma árvore. Contém também o método openDir que é responsável por percorrer o diretório para leitura.

==========================

Classe BinaryTree: Classe responsável por implementar uma árvore binária de busca, onde cada nó armazena uma palavra e as linhas em que essa palavra aparece. A árvore organiza os nós de acordo com a ordem alfabética das palavras.

==========================

Classe Node: Classe que representa um nó de uma árvore binária de busca, onde cada nó contém um valor (normalmente uma palavra) e uma lista de linhas associadas a esse valor. Essa classe é usada em conjunto com a classe BinaryTree para construir e manipular uma árvore binária.

==========================

Classe Line: Classe Line representa uma linha de um texto associada a uma palavra em uma lista encadeada. Ela é usada em estruturas de dados como árvores binárias para rastrear em quais linhas uma determinada palavra aparece.

==========================

Classe LineList: Classe LineList representa uma lista encadeada de objetos da classe Line, cada um contendo um número de linha associado a uma palavra em um texto. A lista é usada para armazenar todas as linhas onde a palavra aparece.

==========================