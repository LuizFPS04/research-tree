/**
 * Classe que representa uma lista encadeada de palavras.
 * 
 * Cada instância da classe WordList gerencia uma lista encadeada de palavras, 
 * permitindo inserção de palavras no final da lista e recuperação de informações sobre as palavras e suas linhas.
 * 
 */
public class WordList {

    /**
     * Referência para o primeiro elemento da lista.
     */
    private Word first;

    /**
     * Construtor da classe. Inicializa a lista como vazia.
     */
    public WordList() {
        this.first = null;
    }

    /**
     * Verifica se a lista está vazia.
     *
     * @return true se a lista não contém elementos, false caso contrário.
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * Insere uma nova palavra no final da lista.
     * 
     * Se a lista estiver vazia, a nova palavra se torna o primeiro elemento da lista.
     * Caso contrário, a nova palavra é adicionada após o último elemento existente.
     * 
     *
     * @param Word A palavra a ser inserida no final da lista.
     */
    public void insertEnd(Word Word) {
        if (isEmpty()) {
            this.first = Word;
        } else {
            if (Word != null) {
                Word auxWord = first;
    
                while (auxWord.getNext() != null) {
                    auxWord = auxWord.getNext();
                }
                auxWord.setNext(Word);
            }
        }
    }

    /**
     * Obtém a referência para a primeira palavra na lista.
     *
     * @return A primeira palavra da lista, ou null se a lista estiver vazia.
     */
    public Word getFirstWord() {
        return this.first;
    }

    /**
     * Constrói e retorna uma representação em String das palavras na lista.
     * 
     * A representação é uma lista de palavras separadas por vírgulas.
     * 
     *
     * @return Uma String contendo todas as palavras na lista, separadas por vírgulas.
     */
    public String myWords() {
        Word auxWord = first;

        String wordString = "";

        while (auxWord.getNext() != null){
            wordString += auxWord.getWord() + ", ";
            auxWord = auxWord.getNext();
        }
        if (auxWord != null) {
            wordString += auxWord.getWord();
        }
        return wordString;
    }

    /**
     * Constrói e retorna uma representação em String dos números das linhas associadas às palavras na lista.
     * 
     * A representação é uma lista de números de linha separados por vírgulas.
     * 
     *
     * @return Uma String contendo todos os números das linhas na lista, separados por vírgulas.
     */
    public String myLines() {
        Word auxWord = first;

        String lineString = "";

        while (auxWord.getNext() != null){
            lineString += auxWord.getLine() + ", ";
            auxWord = auxWord.getNext();
        }
        if (auxWord != null) {
            lineString += auxWord.getLine();
        }
        return lineString;
    }
}
