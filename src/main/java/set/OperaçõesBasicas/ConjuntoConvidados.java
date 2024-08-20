package main.java.set.OperaçõesBasicas;

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

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadosRemovidos = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado convidado : convidadoSet) {
                if (convidado.getConvite() == codigoConvite) {
                    convidadosRemovidos = convidado;
                    break;
                }
            }
        }
        convidadoSet.remove("Temos " + convidadosRemovidos + " convidados");
    }

    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
//      Instanciando um novo Conjunto de Convidados
        ConjuntoConvidados convidadoUm = new ConjuntoConvidados();

        //  Adicionando Convidados usando nome e codigoConvite
        convidadoUm.adicionarConvidado("Filipe", 832004);
        convidadoUm.adicionarConvidado("Filipe", 732005);
        convidadoUm.adicionarConvidado("Samara", 21102005);

//      Contando candidatos
        convidadoUm.contarConvidados();

//      Removendo candidatos
        convidadoUm.removerConvidadoPorCodigoConvite(732005);

//      Exibindo todos os candidatos
        convidadoUm.exibirConvidados();
    }
}
