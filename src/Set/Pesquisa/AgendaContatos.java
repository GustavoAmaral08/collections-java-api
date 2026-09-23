package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome) {

        Set<Contatos> contatoPorNome = new HashSet<>();

        for(Contatos c : contatosSet) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contatos atualizarNumeroContato(String nome, int novoNumero) {

        Contatos contatoAtualizado = null;

        for(Contatos c : contatosSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Luís", 123456);
        agendaContatos.adicionarContatos("Luís", 1231203);
        agendaContatos.adicionarContatos("Luís Gustavo", 123212);
        agendaContatos.adicionarContatos("Luís Gabriel", 111111111);
        agendaContatos.adicionarContatos("José Lucas", 123212);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("José"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("José Lucas", 1234564));
        agendaContatos.exibirContatos();
    }
}
