package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintService<Tipo> {
    List<Tipo> list = new ArrayList<>();

    public void addvalue(Tipo number){
        list.add(number);
    }

    public Tipo first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.println(list.toString());
    }
}
