package java13.task3;

public class Main {
    public static void main(String[] args) {

        Address[] addresses = {
                new Address("������, ��������������� ����������� �����, ���������, ������������, 10, 1, 122"),
                Address.getAddress("������; ��������������� ����������� �����; ���������; ����������; 5; 1; 104"),
                Address.getAddress("������, ������-�������� ����������� �����, �����������, �������, 5, 1, 199"),
                Address.getAddress("������. ������-�������� ����������� �����. �����������. �������� ����������. 8. 5. 34")
        };

        for (Address address : addresses) System.out.println(address);
    }
}
