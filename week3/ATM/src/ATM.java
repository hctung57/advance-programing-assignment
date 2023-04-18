import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0 ; i < 10 ; i++){
            accounts[i] = new Account(i,1000000);
        }
        int menu = 0;
        int id = -1;
        while (true){
            switch (menu){
                case 1:
                    System.out.print("The balance is "+accounts[id].getBalance());
                    System.out.print("\n\nMain menu: \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
                    menu = keyboard.nextInt();
                    continue;
                case 2:
                    System.out.print("Enter an withdraw: ");
                    accounts[id].withdraw(keyboard.nextInt());
                    System.out.print("\n\nMain menu: \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
                    menu = keyboard.nextInt();
                    continue;
                case 3:
                    System.out.print("Enter an deposit: ");
                    accounts[id].deposit(keyboard.nextInt());
                    System.out.print("\n\nMain menu: \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
                    menu = keyboard.nextInt();
                    continue;
                case 4:
                    menu = 0;
                default:
                    System.out.print("Enter an id: ");
                    id = keyboard.nextInt();
                    if (id >= 0 && id <= 10){
                        System.out.print("\n\nMain menu: \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
                        menu = keyboard.nextInt();
                    }
                    else {
                        continue;
                    }
            }
        }
    }
}
