package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {

        String palavraEncontrada = null;

        for(String palavraSet : palavrasUnicas) {
            if (palavraSet.equalsIgnoreCase(palavra)) {
                palavraEncontrada = palavraSet;
                break;
            }
        }

        if(palavraEncontrada != null) {
            palavrasUnicas.remove(palavraEncontrada);
        }
    }


    public boolean verificarPalavra(String palavra) {

        for (String palavraSet : palavrasUnicas) {
            if (palavraSet.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjutoPalavras = new ConjuntoPalavrasUnicas();

        conjutoPalavras.adicionarPalavra("Olá");
        conjutoPalavras.adicionarPalavra("Hello");
        conjutoPalavras.adicionarPalavra("Tchau");

        conjutoPalavras.removerPalavra("OLÁ");

        conjutoPalavras.exibirPalavrasUnicas();
    }
}
