package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {

        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {

        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("A lista está vazia!");
        }

        return numeroPorNome;
    }

    public void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("João Lucas", 111111);
        agendaContatos.adicionarContato("João Henrique", 654987);
        agendaContatos.adicionarContato("Luís Gustavo", 111111);
        agendaContatos.adicionarContato("João", 4444);

        agendaContatos.exibirContatos();
        System.out.println();

        agendaContatos.removerContato("Luís Gustavo");

        agendaContatos.exibirContatos();
        System.out.println();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("João Henrique"));

    }
}

