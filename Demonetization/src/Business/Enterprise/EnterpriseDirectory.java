/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        switch (type) {
            case Bank:
                enterprise = new BankEnterprise(name);
                break;
            case FederalBank:
                enterprise = new FederalBankEnterprise(name);
                break;
            case IncomeTax:
                enterprise = new IncomeTaxEnterprise(name);
                break;
            case Logistics:
                enterprise = new LogisticsEnterprise(name);
                break;
        }
        enterpriseList.add(enterprise);

        return enterprise;
    }

    public void removeEnterprise(Enterprise enterprise) {
        this.enterpriseList.remove(enterprise);
    }
}
