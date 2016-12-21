/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IncomeTaxOfficerRole;
import Business.Role.ManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class IncomeTaxOrganization extends Organization{

    public IncomeTaxOrganization() {
        super(Type.IncomeTax.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IncomeTaxOfficerRole());
        return roles;
    }
}
