/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

/**
 *
 * @author Saurabh Salunkhe
 */
public class Person {
    
    private String name;
    private int id;
    private int ssn;
    private int accountNumber;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
   
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
