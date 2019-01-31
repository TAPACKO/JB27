package by.cdp.jb27_les08;

import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private Integer accountNumber;
    private LocalDate expirationDate;

    public BankAccount(String firstName, String lastName, Integer accountNumber, LocalDate expirationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                accountNumber.equals(that.accountNumber) &&
                expirationDate.equals(that.expirationDate);
    }

    @Override
    public int hashCode() {
        return (42 * accountNumber + expirationDate.getYear() + expirationDate.getMonth().getValue()
                + ((null == firstName || null == lastName) ? 0 : firstName.hashCode()*lastName.hashCode()));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
