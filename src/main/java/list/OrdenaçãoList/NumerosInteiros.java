package main.java.list.OrdenaçãoList;

public class NumerosInteiros implements Comparable<NumerosInteiros>{

    @Override
    public int compareTo(NumerosInteiros n) {
        return NumerosInteiros.compare(n);
    }
}
}

