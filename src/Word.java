/**
 * Classe que representa uma palavra associada a um número de linha em uma lista encadeada.
 * 
 * Cada instância da classe Word contém uma palavra, o número da linha onde a palavra foi encontrada
 * e uma referência para a próxima palavra na lista.
 * 
 */
public class Word {

    /**
     * Palavra armazenada nesta instância.
     */
    String word;

    /**
     * Número da linha onde a palavra foi encontrada.
     */
    int line;

    /**
     * Referência para a próxima palavra na lista encadeada.
     */
    Word next;

    /**
     * Construtor da classe. Inicializa a palavra e o número da linha.
     *
     * @param informedWord A palavra a ser associada a esta instância.
     * @param informedLine O número da linha onde a palavra foi encontrada.
     */
    public Word(String informedWord, int informedLine) {
        this.word = informedWord;
        this.line = informedLine;
    }

    /**
     * Obtém a palavra associada a esta instância.
     *
     * @return A palavra armazenada nesta instância.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Obtém o número da linha onde a palavra foi encontrada.
     *
     * @return O número da linha.
     */
    public int getLine() {
        return this.line;
    }

    /**
     * Obtém a referência para a próxima palavra na lista encadeada.
     *
     * @return A próxima palavra, ou null se não houver próxima palavra.
     */
    public Word getNext() {
        return this.next;
    }

    /**
     * Define a referência para a próxima palavra na lista encadeada.
     *
     * @param nextWord A próxima palavra a ser associada a esta instância.
     */
    public void setNext(Word nextWord) {
        this.next = nextWord;
    }
}
