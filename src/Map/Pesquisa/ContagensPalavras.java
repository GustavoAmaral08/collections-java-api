package Map.Pesquisa;


import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class ContagensPalavras {

    private Map<String, Integer> mapPalavra;

    public ContagensPalavras() {
        this.mapPalavra = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        mapPalavra.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {

        if(!palavra.isBlank()) {
            mapPalavra.remove(palavra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int exibirContagemPalavras() {

        int contagemTotal = 0;
        for (int contagem : mapPalavra.values()) {
            contagemTotal += contagem;
        }

        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {

        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : mapPalavra.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagensPalavras contagemLinguagens = new ContagensPalavras();

        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}