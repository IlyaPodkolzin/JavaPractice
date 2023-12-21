package java20.task4;

import java.util.List;

public class MinMax<T extends Comparable<T>> {
    private final List<T> mass;


    public MinMax(List<T> mass) {
        this.mass = mass;
    }

    public T getMax() {
        if (mass.isEmpty()) throw new IndexOutOfBoundsException("Массив пуст");
        T max = mass.get(0);
        for (T t : mass) if (t.compareTo(max) > 0) max = t;
        return max;
    }

    public T getMin() {
        if (mass.isEmpty()) throw new IndexOutOfBoundsException("Массив пуст");
        T min = mass.get(0);
        for (T t : mass) if (t.compareTo(min) < 0) min = t;
        return min;
    }
}
