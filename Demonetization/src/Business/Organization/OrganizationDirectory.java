/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Employee.getValue())){
            organization = new EmployeeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Federal.getValue())){
            organization = new FederalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IncomeTax.getValue())){
            organization = new IncomeTaxOrganization();
            organizationList.add(organization);
        }
        
            else if (type.getValue().equals(Type.Logistic.getValue())){
            organization = new LogisticOrganization();
            organizationList.add(organization);
        }
        
        
        
        return organization;
    }
}