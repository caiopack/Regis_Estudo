public class FilaEncadeada {
    private No frente;
    private No tras;
    private int tamanho;

    public FilaEncadeada() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(Pessoa pessoa) {
       No novoNo = new No(pessoa);
        if (tras != null) {
            tras.proximo = novoNo;
        }
        tras = novoNo;
        if (frente == null) {
            frente = tras;
        }
        tamanho++;
    }

    public Pessoa dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        Pessoa pessoa = frente.getPessoa();
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        tamanho--;
        return pessoa;
    }

    public Pessoa peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return frente.getPessoa();
    }
}