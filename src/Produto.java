abstract class Produto {
    protected String nome;
    protected double preco;
    protected String tipagem;

    public Produto(String nome, double preco, String tipagem) {
        this.nome = nome;
        this.preco = preco;
        this.tipagem = tipagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipagem;
    }

    public void setTipo(String tipo) {
        this.tipagem = tipagem;
    }

    public double calcularDesconto(double porcentagem){

        preco = preco*((100 - porcentagem)/100);
        return preco;

    }
}
