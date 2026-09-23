package Set.Pesquisa;

import java.util.Objects;

public class Contatos {

    private String nome;
    private int numero;

    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return Objects.equals(nome, contatos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "CONTATO: " +
                 nome + " - " +numero + "\n";
    }
}
