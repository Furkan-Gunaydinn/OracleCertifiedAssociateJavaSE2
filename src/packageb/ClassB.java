package packageb;

import packagea.ClassA;

import java.util.ArrayList;

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("got it");
    }

    public void method(ArrayList list) {
        if (list.isEmpty()) {
            System.out.println("e");
        } else {
            System.out.println("n");
        }

    }

    public class chick {
        public chick() {
            System.out.println("in constructor");
        }

    }

    public class Chicken {
        int numEggs = 0; //initialize on line
        String name;

        public Chicken() {
            name = "duke";

        }
    }


}