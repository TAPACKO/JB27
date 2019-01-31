package by.cdp.jb27_les08;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    // paying method
    private BankAccount bankAccount;

    private List<Item> items;

    public Payment() {
        items = new ArrayList();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void pay() {
        double total = 0;

        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }

        System.out.println("Payed: " + total + "BYN, with bank account: " + getBankAccount());
    }
}
