public class ProdutoSemana extends Produto{
    public ProdutoSemana(String nome, double preco, String tipagem) {
        super(nome, preco, tipagem);
    }

    public double calcularDesconto(double porcentagem){
        preco = preco*((100 - porcentagem)/100);
        preco -= 100;
        return preco;
    }
}
