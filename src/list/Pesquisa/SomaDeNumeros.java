package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {

    private List<Integer> inteiroslist;

    public SomaDeNumeros() {
        this.inteiroslist = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteiroslist.add(new Integer(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : inteiroslist) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        if (!inteiroslist.isEmpty()) {
            for (Integer numero : inteiroslist) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        } else {
        throw new RuntimeException("A lista está vazia!");
    }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!inteiroslist.isEmpty()) {
            for (Integer numero : inteiroslist) {
                if(numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        } else {
        throw new RuntimeException("A lista está vazia!");
    }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!inteiroslist.isEmpty()) {
            System.out.println(this.inteiroslist);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    static void main() {

        SomaDeNumeros somaNumeros = new SomaDeNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
