package HackerRank;

public class JavaInheritance_I {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.singing();

    }

    public static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    public static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void singing() {
            System.out.println("I am singing");
        }
    }
}
