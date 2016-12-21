/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.ManagerRole.ManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Salunkhe
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagerWorkAreaJPanel(userProcessContainer, enterprise,business, account);
    }

    
    
}
