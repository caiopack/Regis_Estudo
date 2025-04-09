public class FilaArray {
    private Pessoa[] dados;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidade;

    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new Pessoa[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(Pessoa pessoa) {
        if (tamanho == capacidade) {
            throw new RuntimeException("Fila cheia!");
        }
        tras = (tras + 1) % capacidade;
        dados[tras] = pessoa;
        tamanho++;
    }

    public Pessoa dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        Pessoa pessoa = dados[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return pessoa;
    }

    public Pessoa peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return dados[frente];
    }
}