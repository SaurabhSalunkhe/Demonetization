/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.BankEnterprise;

/**
 *
 * @author keval
 */
public class BankToFederalBankWorkRequest extends WorkRequest{
    private int amountToPickUp;
    private BankEnterprise bankEnterprise;

    public BankToFederalBankWorkRequest() {
        super();
    }

    public int getAmountToPickUp() {
        return amountToPickUp;
    }

    public void setAmountToPickUp(int amountToPickUp) {
        this.amountToPickUp = amountToPickUp;
    }

    public BankEnterprise getBankEnterprise() {
        return bankEnterprise;
    }

    public void setBankEnterprise(BankEnterprise bankEnterprise) {
        this.bankEnterprise = bankEnterprise;
    }
    
     @Override
    public String toString(){
       return bankEnterprise.getName();
   }
    
    
}
