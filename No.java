public class No {
    No proximo;
    Pessoa pessoa;

    public No(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}