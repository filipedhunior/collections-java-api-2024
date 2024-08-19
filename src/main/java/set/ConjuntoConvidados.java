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

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadosRemovidos = null;
        if (!convidadoSet.isEmpty()){
            for (Convidado convidado : convidadoSet){
                if (convidado.getConvite() == codigoConvite){
                    convidadosRemovidos = convidado;
                    break;
                }
            }
        } convidadoSet.remove(convidadosRemovidos);

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
