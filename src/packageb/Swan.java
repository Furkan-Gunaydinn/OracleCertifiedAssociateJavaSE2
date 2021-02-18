package packageb;

public class Swan {
    int numberEggs;// instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable


    }

    public class Chick {



        public Chick() {
            System.out.println("in constructor");

        }
    }

    public class Name {
        String first = "Theodore";
        String last = "Moose";
        String full = first + last;


    }


}

class Chick {
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }


    public int notValid() {
        int y = 10;
        int x = 0;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }


    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch =0;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}