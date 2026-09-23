package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public Set<Aluno> exibirPorNome() {

        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;

    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;

        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirPorNota() {

        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorAluno());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);
        System.out.println();

        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);
        System.out.println();

        System.out.println(gerenciadorAlunos.exibirPorNome());

        System.out.println(gerenciadorAlunos.exibirPorNota());
    }
}
