package HackerRank;

import java.util.Scanner;

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        myBook myBook = new myBook();
        myBook.setTitle(name);
        System.out.println("The title is: "+myBook.getTitle());

    }


     static abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

   private static class myBook extends Book{
        @Override
        void setTitle(String s) {
            title = s;
        }
    }

}
