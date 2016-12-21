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
 * @author keval
 */
public class PeopleBankRelation {
    int ssn;
    ArrayList<BankEnterprise> bankList;
    

    public PeopleBankRelation(int ssn) {
        this.ssn = ssn;
        this.bankList = new ArrayList<BankEnterprise>();
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public ArrayList<BankEnterprise> getBankList() {
        return bankList;
    }

    public void addBank(BankEnterprise bankEnterprise){
        this.bankList.add(bankEnterprise);
    }
    
    public void removeBank(BankEnterprise bankEnterprise){
        this.bankList.remove(bankEnterprise);
    }
}
