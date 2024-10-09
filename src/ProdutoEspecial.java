public class ProdutoEspecial extends Produto{
    public ProdutoEspecial(String nome, double preco, String tipagem) {
        super(nome, preco, tipagem);
    }
    public double calcularDesconto(double porcentagem) {
        if(preco > 2000){
            porcentagem += 10;
            preco = preco*((100 - porcentagem)/100);

        }else{
            porcentagem += 5;
            preco = preco*((100.0 - porcentagem)/100.0);
        }
        return preco;
    }
}
