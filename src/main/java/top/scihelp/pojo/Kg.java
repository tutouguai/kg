package top.scihelp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Kg implements Serializable {
    private List<String> head;
    private List<String> relation;
    private List<String> tail;

    public Kg() {
        head = new ArrayList<>();
        relation = new ArrayList<>();
        tail = new ArrayList<>();
    }

    public void addTriplet(String e1, String rel, String e2){
        head.add(e1);
        relation.add(rel);
        tail.add(e2);
    }

    @Override
    public String toString() {
        return "kg{" +
                "head=" + head +
                ", relation=" + relation +
                ", tail=" + tail +
                '}';
    }
}
