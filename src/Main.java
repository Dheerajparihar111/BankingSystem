import java.util.*;
class homepage{
    void homepage(){
        System.out.println("Enter Your Choice");
        System.out.println("1)Deposit  Money ");
    }
}
class Main{
    static void main(String[] args) {
        System.out.println("**********Wel-Come To Bank *************");
        Scanner input = new Scanner(System.in);
        homepage Home = new homepage();
        Home.homepage();
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter The Bank Name");
                input.nextLine();
                String bankName = input.nextLine();
                System.out.println("Enter Account Type ");
                String accountType = input.nextLine();
                System.out.println("Enter Account Number");
                long accountNumber = input.nextLong();
                System.out.println("Enter The Amount");
                int Amount = input.nextInt();
                System.out.println("Money Deposited Successfully");
                break;
        }
    }
}