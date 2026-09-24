package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotal() {

        double valorTotal = 0d;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()) {
                valorTotal += p.getQuantidade()* p.getPreco();
            }

        }else {
            System.out.println("O estoque está vazio!");
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio!");
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        // estoque.exibirProduto();

        estoque.adicionarProduto(1L, "Produto 1", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto 2", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto 3", 2, 15.0);
        estoque.adicionarProduto(3L, "Produto 4", 2, 20.0);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotal());
        System.out.println("Produto mais caro: R$ " + estoque.obterProdutoMaisCaro());
    }
}
