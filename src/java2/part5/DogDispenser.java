package java2.part5;

import java.util.Arrays;

public class DogDispenser {
    private Dog[] dogs = new Dog[0];

    public void addDog(Dog dog) {
        dogs = Arrays.copyOf(dogs, dogs.length + 1);
        dogs[dogs.length - 1] = dog;
    }
}
