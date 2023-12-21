package java6.task12;

import java.util.ArrayList;

public class MyStringBuilder {
    private StringBuilder stringBuilder;

    // предыдущие значения
    private final ArrayList<String> previous;


    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
        previous = new ArrayList<>();
    }

    // добавить в конец
    public void append(String str) {
        previous.add(stringBuilder.toString());
        stringBuilder.append(str);
    }

    // удалить
    public void delete(int start, int end) {
        previous.add(stringBuilder.toString());
        stringBuilder.delete(start, end);
    }

    // отменить действие
    public void undo() {
        if (!previous.isEmpty())
            stringBuilder = new StringBuilder(previous.remove(previous.size() - 1));
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}