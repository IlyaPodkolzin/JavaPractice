package java18.task5;

public class ThrowsDemo {
    public void getDetails1(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println(key + " is good!");
    }

    public void getDetails2(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println(key + " is good!");
        } catch (NullPointerException e) {
            System.out.println("key is not good because " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        ThrowsDemo throwsDemo = new ThrowsDemo();

//      Exception in thread "main" java.lang.NullPointerException: null key in getDetails
//        throwsDemo.getDetails1(null);

        throwsDemo.getDetails2(null);
    }
}
