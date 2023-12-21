package java4.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Clothes[] clothes = {new TShirt(Parlour.XXS, random.nextDouble() * 50, "Серый"),
                new Pants(Parlour.M, random.nextDouble() * 50, "Белый"),
                new Skirt(Parlour.L, random.nextDouble() * 50, "Жёлтый"),
                new Tie(Parlour.S, random.nextDouble() * 50, "Фиолетовый")};
        Atelier.dressWoman(clothes);
        System.out.println("==================================");
        Atelier.dressMan(clothes);
    }
}
