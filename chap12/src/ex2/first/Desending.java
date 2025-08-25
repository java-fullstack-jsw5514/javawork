package ex2.first;

import java.util.Comparator;

public class Desending implements Comparator<Lecture> {

    @Override
    public int compare(Lecture o1, Lecture o2) {
        return o2.compareTo(o1);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
