package Business;

import Business.People.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Saurabh Salunkhe
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Person people = system.getPeopleDirectory().createPeople("RRH");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", people, new SystemAdminRole());

        return system;
    }

}
