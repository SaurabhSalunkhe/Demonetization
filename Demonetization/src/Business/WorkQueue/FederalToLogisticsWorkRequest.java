/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.BankEnterprise;
import Business.Enterprise.FederalBankEnterprise;

/**
 *
 * @author Saurabh Salunkhe
 */
public class FederalToLogisticsWorkRequest extends WorkRequest {

    private FederalBankEnterprise fedralBankEnterprise;
    private int amountToPickUp;
    private BankEnterprise bankEnterprise;

    public BankEnterprise getBankEnterprise() {
        return bankEnterprise;
    }

    public void setBankEnterprise(BankEnterprise bankEnterprise) {
        this.bankEnterprise = bankEnterprise;
    }
    
    

    public int getAmountToPickUp() {
        return amountToPickUp;
    }

    public void setAmountToPickUp(int amountToPickUp) {
        this.amountToPickUp = amountToPickUp;
    }

    public FederalToLogisticsWorkRequest() {
        super();
    }

    public FederalBankEnterprise getFedralBankEnterprise() {
        return fedralBankEnterprise;
    }

    public void setFedralBankEnterprise(FederalBankEnterprise fedralBankEnterprise) {
        this.fedralBankEnterprise = fedralBankEnterprise;
    }
    
    @Override
    public String toString(){
       return fedralBankEnterprise.getName();
   }

}
