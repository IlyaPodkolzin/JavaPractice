package java6.task13;

import java.util.ArrayList;

public class MyStringBuilder implements Observable{
    private StringBuilder stringBuilder;

    private ArrayList<Observer> observers;


    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    // добавить
    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }

    // удалить
    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }


    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    // регистрация наблюдателя
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // удаление наблюдателя
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // уведомление
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) observer.update(toString());
    }
}