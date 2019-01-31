package by.cdp.jb27_les08;

import java.time.LocalDate;

public class les08_task01 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John", "Doe", 19871345, LocalDate.of(2020, 01, 01));
        Item moloko = new Item("milk", 1.1, 2);
        Item baton = new Item("white bread", 1.5, 2);
        Item beer = new Item("", 1.5, 3);

        Payment payment = new Payment();
        payment.setBankAccount(account);
        payment.addItem(moloko);
        payment.addItem(baton);
        payment.addItem(beer);

        payment.pay();
    }
}
