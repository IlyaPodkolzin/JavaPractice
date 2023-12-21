package java7.task5_6;

// тестовый класс
public class ProcessStrings implements StringWork {
    // поле-строка
    private String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int size() {
        return StringWork.size(string);
    }

    public String onOddPositions() {
        return StringWork.onOddPositions(string);
    }

    public String reverse() {
        return StringWork.reverse(string);
    }
}
