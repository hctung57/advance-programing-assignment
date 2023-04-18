import  java.util.Scanner;
public class InOut {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("What is your name? ");
        String name= input.nextLine();
        System.out.print("How old are you? ");
        int age= input.nextInt();

        System.out.printf("hello %s , you are %d year old. ", name, age);
    }
}
