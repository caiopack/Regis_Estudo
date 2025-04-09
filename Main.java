public class Main {
    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();


        System.out.println("Fila está vazia? " + fila.isEmpty());
        Pessoa pessoa;
        
        pessoa = new Pessoa("Regis", 40);
        fila.enqueue(pessoa);
        pessoa = new Pessoa("Americo", 35);
        fila.enqueue(pessoa);
        pessoa = new Pessoa("Martins", 19);
        fila.enqueue(pessoa);

        System.out.println("Elemento na frente: " + fila.peek().getNome());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo: " + fila.dequeue().getNome());
        System.out.println("Elemento na frente agora: " + fila.peek().getNome());
        

        try {
            fila.enqueue(pessoa); // Deve lançar exceção (fila cheia)
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.dequeue().getNome());
        }

        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
