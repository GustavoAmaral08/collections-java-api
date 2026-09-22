package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
        throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosDeAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervalosDeAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervalosDeAnos.add(l);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return livrosPorIntervalosDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livroPorTitulo;
    }

    static void main() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosDeAnos( 2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
