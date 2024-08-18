package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public Set<ConjuntoConvidados> removerConvidadoPorCodigoConvite(int codigoConvite){
        ConjuntoConvidados convidadosRemovidos = new ConjuntoConvidados();
        for (ConjuntoConvidados c : Convidado){
            if (c.getC)
        }

        return
    }

    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidadoUm = new ConjuntoConvidados();
        convidadoUm.adicionarConvidado("Filipe", 832004);
        convidadoUm.adicionarConvidado("Filipe", 732005);
        convidadoUm.adicionarConvidado("Samara", 21102005);

        convidadoUm.contarConvidados();

    }
}
