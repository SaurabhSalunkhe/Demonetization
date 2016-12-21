/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GovernmentData;

import Business.Enterprise.BankEnterprise;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class CustomerDirectory {

private int ssn;
private ArrayList<BankEnterprise> bankName;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public ArrayList<BankEnterprise> getBankName() {
        return bankName;
    }

    public void setBankName(ArrayList<BankEnterprise> bankName) {
        this.bankName = bankName;
    }

    
}
