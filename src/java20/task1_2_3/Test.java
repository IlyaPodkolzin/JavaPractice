package java20.task1_2_3;

import java6.task3.Animal;

import java.io.Serializable;

public class Test<T extends Comparable<String>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public Test(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
}
