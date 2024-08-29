package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
       // Exibe a agenda de forma crescente
        // TreeMap é a implementação ideal para ordernar
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(LocalDate data){
//        Set<LocalDate> dataSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();

        LocalDate dataAtual = LocalDate.now(); // retorna a data atual
        LocalDate proximaData = null; // recebe o value do proximo evento em relação a data atual
        Evento proximoEvento = null; // recebe o evento (nome) em relação a data atual

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); //Instancia de TreeMap que recene Key e Value num unico objeto e instancia um novoTreeMap usando a lista passada como referencia
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){// entrySet = retorna um set
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento é :" + proximoEvento + " na data " + proximaData);
                break;
            } // se o o objeto instancia em TreeMap tiver uma chave iguai ao dia atual ou antes dele
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(1822,9,07), "Independencia do Brasil", "Pedro Alvares Cabral");
        agendaEventos.adicionarEvento(LocalDate.of(1822,9,07), "Independencia do Brasil", "Pedro Alvares Cabral");
        agendaEventos.exibirAgenda();
    }
}
