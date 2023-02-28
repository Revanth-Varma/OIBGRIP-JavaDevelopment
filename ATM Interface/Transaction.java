import java.util.*;

class Transaction {
    static void withdrawl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("...................");
        System.out.println("Enter amount to withdraw :");
        int wcash = sc.nextInt();
        if (wcash <= ATM.balance) {
            ATM.balance = ATM.balance - wcash;
            ATM.history.add(Integer.toString(wcash));
            ATM.history.add("Withdraw");
            System.out.println("Amount Rs" + wcash + "/-withdraw successfully");
            System.out.println(".............................");
        } else {
            System.out.println("insufficient balance to withdraw the cash");
            System.out.println(".................................");
        }
        ATM.prompt();
        sc.close();
    }

    static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println(".............................");
        System.out.print("Enter amount to deposit :");
        int dcash = sc.nextInt();
        ATM.updatebalance(dcash);
        ATM.history.add(Integer.toString(dcash));
        ATM.history.add("Deposit");
        System.out.println("Amount Rs." + dcash + "/- deposit successful!");
        System.out.println("................................");
        ATM.prompt();
        sc.close();
    }

    static void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the receiving body:");
        String rName = sc.nextLine();
        System.out.println("Enter the account number of the receiving body");
        int rAcc = sc.nextInt();
        System.out.println("Enter the amount to be transferred :");
        int tcash = sc.nextInt();
        if (tcash <= ATM.balance) {
            ATM.balance = ATM.balance - tcash;
            ATM.history.add(Integer.toString(tcash));
            ATM.history.add("transferred to the Account Number - " + rAcc);
            System.out.println("Amount Rs." + tcash + "/- transferred to " + rName + " successfully");
            System.out.println("................................");
        } else {
            System.out.println("insufficient balance to transfer the cash");
            System.out.println("...................................");
        }
        ATM.prompt();
        sc.close();
    }
}