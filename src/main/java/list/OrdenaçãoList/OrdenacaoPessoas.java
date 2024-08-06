package main.java.list.OrdenaçãoList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    List <Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPesso(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){}
        //
    public void ordenarPorAltura(){
        //
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPesso("Filipe Dhunior", 20, 1.60);
        System.out.println(ordenacaoPessoas);
    }
}
