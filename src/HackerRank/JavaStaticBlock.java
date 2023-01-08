package HackerRank;

import java.util.Scanner;

public class JavaStaticBlock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

       try{
           if(block(a, b)){

            int area = a*b;
               System.out.println(area);

           }
       } catch (DomainException e){
           System.out.println(e.getMessage());
       }
    }
    public static boolean block(int number2, int number) throws DomainException {

        if(number <= 0 || number2 <= 0){
          throw new DomainException("java.lang.Exception: Breadth and height must be positive");
        } else{
            return true;
        }
    }

    public static class DomainException extends Exception{

        public DomainException(String msg){
            super(msg);
        }

    }

}
