package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        Tarefa descricaoEncontrada = null;

        if (!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    descricaoEncontrada = t;
                    break;
                }
            }
            tarefaSet.remove(descricaoEncontrada);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(descricaoEncontrada == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefaSet) {
            if(t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obeterTarefasPendentes() {

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void maracarTarefaConcluida(String descricao) {

        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao) {

        Tarefa tarefaPendente = null;

        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaPendente = t;
                }
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }

        if (tarefaPendente != null) {
            if(tarefaPendente.isTarefaConcluida()) {
                tarefaPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada no conjunto!");
        }
    }

    public void limparListaTarefas() {

        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();


        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");


        listaTarefas.exibirTarefas();
        System.out.println();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        System.out.println();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
        System.out.println();

        System.out.println(listaTarefas.obeterTarefasPendentes());
        System.out.println();

        listaTarefas.maracarTarefaConcluida("Ler livro");
        listaTarefas.maracarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println();

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
        System.out.println();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        System.out.println();
    }
}
