package java4_1.task2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79164111008", "Samsong", 200.5);
        Phone phone2 = new Phone("+78005553535", "Nokoa", 298);
        Phone phone3 = new Phone("+79114504075", "HTC", 156);

        System.out.println(phone.getNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getWeight());

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());

        phone.receiveCall("����");
        phone2.receiveCall("������");
        phone3.receiveCall("�������");

        phone.receiveCall("����", "283122");
        phone2.receiveCall("������", "556622");
        phone3.receiveCall("�������", "134413");

        phone.sendMessage();
        phone.sendMessage("283122");
        phone.sendMessage("283122", "556622", "134413");
    }
}
