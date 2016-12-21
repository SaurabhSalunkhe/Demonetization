/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.EmployeeRole.EmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Salunkhe
 */
public class EmployeeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EmployeeWorkAreaJPanel(userProcessContainer, account, (EmployeeOrganization)organization, enterprise);
    }
    
    
}
