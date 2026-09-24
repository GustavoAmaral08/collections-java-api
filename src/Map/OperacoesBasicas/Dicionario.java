package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {

        if(!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {

        String definicaoPorPalavra = null;

        if(!palavrasMap.isEmpty()) {
            definicaoPorPalavra = palavrasMap.get(palavra);
        } else {
            System.out.println("A lista está vazia!");
        }

        return definicaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da palavra java: " + definicaoJava);

        String definicaoTypescript = dicionario.pesquisarPorPalavra("typescript");
        System.out.println("Definição da palavra typescript: " + definicaoTypescript);


        String definicaoKotlin = dicionario.pesquisarPorPalavra("kotlin");
        System.out.println("Definição da palavra kotlin: " + definicaoKotlin);

    }
}
