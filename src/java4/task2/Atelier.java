package java4.task2;

public class Atelier {
    public static void dressWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (TShirt.class.equals(clothe.getClass())) {
                ((TShirt) clothe).dressWoman();
            } else if (Pants.class.equals(clothe.getClass())) {
                ((Pants) clothe).dressWoman();
            } else if (Skirt.class.equals(clothe.getClass())) {
                ((Skirt) clothe).dressWoman();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (TShirt.class.equals(clothe.getClass())) {
                ((TShirt) clothe).dressMan();
            } else if (Pants.class.equals(clothe.getClass())) {
                ((Pants) clothe).dressMan();
            } else if (Tie.class.equals(clothe.getClass())) {
                ((Tie) clothe).dressMan();
            }
        }
    }
}
