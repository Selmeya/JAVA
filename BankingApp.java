import java.util.Scanner;  
class BankDetails {  
    private String Accno;  
    private String Name;  
    private String Acc_type;  
    private long Balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        Accno = sc.next();  
        System.out.print("Enter Account type: ");  
        Acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        Name = sc.next();  
        System.out.print("Enter Balance: ");  
        Balance = sc.nextLong();  
    }  
    public void showAccount() {  
        System.out.println("Name of account holder: " + Name);  
        System.out.println("Account no.: " + Accno);  
        System.out.println("Account type: " + Acc_type);  
        System.out.println("Balance: " + Balance);  
    }    
    public void deposit() {  
        long Amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        Amt = sc.nextLong();  
        Balance = Balance + Amt;  
    }  
    public void withdrawal() {  
        long Amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        Amt = sc.nextLong();  
        if (Balance >= Amt) {  
            Balance = Balance - Amt;  
            System.out.println("Balance after withdrawal: " + Balance);  
        } else {  
            System.out.println("Your balance is less than " + Amt + "\tTransaction failed...!!" );  
        }  
    }  
    public boolean search(String ac_no) {  
        if (Accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
public class BankingApp {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }   
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  

