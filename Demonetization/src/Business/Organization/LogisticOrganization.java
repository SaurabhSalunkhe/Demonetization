/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRole;
import Business.Role.LogisticRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author keval
 */
public class LogisticOrganization extends Organization{

    public LogisticOrganization() {
        super(Organization.Type.Logistic.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticRole());
        return roles; 
    }
    
}
