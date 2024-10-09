//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Produto abajur = new ProdutoEspecial("Abajur", 120.00, "Especial");
        Produto tapete = new ProdutoEspecial("Tapete", 90.00, "Especial");
        Produto sofa = new ProdutoEspecial("Sofa", 3000.00, "Especial");
        Produto celular = new ProdutoSemana("Celular Iphone 16", 7000.00, "Semanal");
        Produto pc = new ProdutoSemana("Computador Gamer", 9000.00, "Semanal");
        Produto monitor = new ProdutoSemana("Monitor FullHD 144hz 1ms", 1400.00, "Semanal");

        estoque.adicionarProduto(abajur);
        estoque.adicionarProduto(tapete);
        estoque.adicionarProduto(sofa);
        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(pc);
        estoque.adicionarProduto(monitor);


        System.out.println("Produtos com 15% de desconto acima de 2000.00 tem um adicional de 10% de desconto e abaixo um adicional de 5% ");
        System.out.println("Precos sem desconto:");
        estoque.exibirPrecosSemDesconto();
        System.out.println("Precos com desconto:");
        estoque.exibirPrecosComDesconto(15);

        System.out.println("Produtos da Semana estao com 20% + 100R$ de desconto");
        System.out.println("Precos sem desconto: ");
        estoque.exibirPrecosSemDesconto();
        System.out.println("Precos com desconto");
        estoque.exibirPrecosComDesconto(20);


    }
}