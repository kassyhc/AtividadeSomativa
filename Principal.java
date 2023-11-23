package AtividadeSomativa;

public class Principal {
    public static void main(String[] args) {
       
        Pedido pedido1 = new Pedido();
        System.out.println("Pedido 1 - Construtor sem argumentos:");
        System.out.println("ID: " + pedido1.getId());
        System.out.println("Produto: " + pedido1.getProduto());
        System.out.println("Quantidade: " + pedido1.getQuantidade());
        System.out.println();

        Pedido pedido2 = new Pedido(1, "ProdutoA", 10);
        System.out.println("Pedido 2 - Construtor com todos os argumentos:");
        System.out.println("ID: " + pedido2.getId());
        System.out.println("Produto: " + pedido2.getProduto());
        System.out.println("Quantidade: " + pedido2.getQuantidade());
    }
}
