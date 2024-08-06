package main.java.list.PesqusaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList();
    }

    public int adicionarNumero(int numero) {
        numerosInteiros.add(numero);
        return numero;
    }

    public int calcularSoma() {
        // Iterar sobre cada valor e somar numa variavel temporaria e retornar o valor final
        int resultado = 0;
        int novoNumero = 0;
        for (int numeros : numerosInteiros) {
            if (novoNumero == 0 && resultado == 0) {
                resultado = novoNumero + numeros;
            } else {
                resultado = resultado + numeros;
            }
        }
        System.out.println("O valor total dos valores da lista é:");
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int numeroLista = 0;
        for (int numeros : numerosInteiros) {
            if (numeros == 0) {
                numeroLista = numeros;
            } else if (numeroLista < numeros) {
                numeroLista = numeros;
            } else if (numeroLista > numeros) {
                numeroLista = numeroLista;
            }
        }
        System.out.println("O maior valor é: ");
        return numeroLista;
    }

    public int encontrarMenorNumero() {
        int menorValor = 0;
        for (int numeroRecebido : numerosInteiros) {
            if (numeroRecebido > menorValor && menorValor != 0) {
                menorValor = numeroRecebido;
                return menorValor;
            } else if (numeroRecebido > menorValor && menorValor != 0) {
                return menorValor;
            }
        }
        System.out.println("O menor valor é: ");
        return menorValor;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);

        //System.out.println(somaNumeros.calcularSoma());;
//        System.out.println(somaNumeros.encontrarMaiorNumero());;
        System.out.println(somaNumeros.encontrarMenorNumero());;
    }
}
