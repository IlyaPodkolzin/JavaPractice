package java13.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String string = "shirts[0] = \"S001,Black Polo Shirt,Black,XL\";" +
                "shirts[1] = \"S002,Black Polo Shirt,Black,L\"; shirts[2] = \"S003,Blue Polo" +
                "Shirt,Blue,XL\"; shirts[3] = \"S004,Blue Polo Shirt,Blue,M\"; shirts[4] = \"S005,Tan" +
                "Polo Shirt,Tan,XL\"; shirts[5] = \"S006,Black T-Shirt,Black,XL\"; shirts[6] =" +
                "\"S007,White T-Shirt,White,XL\"; shirts[7] = \"S008,White T-Shirt,White,L\"; shirts[8]" +
                "= \"S009,Green T-Shirt,Green,S\"; shirts[9] = \"S010,Orange T-Shirt,Orange,S\";" +
                "shirts[10] = \"S011,Maroon Polo Shirt,Maroon,S\"";

        ArrayList<Shirt> shirts = new ArrayList<>();

        for (String s : string.split(";"))
            shirts.add(
                    Integer.parseInt(s.substring(s.indexOf("[") + 1, s.indexOf("]"))),
                    new Shirt(s.substring(s.indexOf("\"") + 1, s.length() - 1))
            );

        for (int i = 0; i < shirts.size(); i++)
            System.out.println(i + ":\n" + shirts.get(i));
    }
}
