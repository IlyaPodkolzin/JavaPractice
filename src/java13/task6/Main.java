package java13.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ֲגוהטעו טלÿ פאיכא: "); // D:\\Downloads\\text.txt
        String fileName = scanner.nextLine();

        String content = Files.readString(Path.of(fileName));

        System.out.println(getLine(new ArrayList<>(List.of(content.split(" ")))));
    }

    private static StringBuilder getLine(ArrayList<String> words) {

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(words);

        stringBuilder.append(list.get(0));
        list.remove(0);
        boolean good;

        while (!list.isEmpty()) {
            good = false;
            for (String s : list) {
                if (s.toLowerCase().charAt(0) == stringBuilder.toString().toLowerCase().charAt(stringBuilder.length() - 1)) {
                    stringBuilder.append(" ").append(s);
                    list.remove(s);
                    good = true;
                    break;
                }
            }
            if (!good) {
                Collections.shuffle(words);
                return getLine(words);
            }
        }
        return stringBuilder;
    }
}
