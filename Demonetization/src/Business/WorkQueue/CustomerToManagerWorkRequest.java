/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Saurabh Salunkhe
 */ 
public class CustomerToManagerWorkRequest extends WorkRequest{
                                                                                    
    private int amount;
    private boolean deposit;
    private int count;

    public boolean isDeposit() {
        return deposit;
    }

    public void setDeposit(boolean deposit) {
        this.deposit = deposit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
        
    
}
