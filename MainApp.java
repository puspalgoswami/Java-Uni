interface BankService {
    void showBankName();
}

interface CustomerInfo {
    void showCustomerDetails();
}

class Account implements BankService, CustomerInfo {
    String bankName;
    String customerName;
    int accountNumber;

    Account(String bankName, String customerName, int accountNumber) {
        this.bankName = bankName;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    public void showCustomerDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class MainApp {
    public static void main(String[] args) {
            Account userAccount = new Account("SBI", "Puspal", 4145);
        userAccount.showBankName();
        userAccount.showCustomerDetails();
    }
}
