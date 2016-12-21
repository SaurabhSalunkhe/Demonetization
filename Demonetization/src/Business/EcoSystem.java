package Business;

import Business.GovernmentData.PeopleBankRelationDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PeopleBankRelationDirectory peopleBankRelationDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        peopleBankRelationDirectory = new PeopleBankRelationDirectory();
    }

    public PeopleBankRelationDirectory getPeopleBankRelationDirectory() {
        return peopleBankRelationDirectory;
    }

    public void setPeopleBankRelationDirectory(PeopleBankRelationDirectory peopleBankRelationDirectory) {
        this.peopleBankRelationDirectory = peopleBankRelationDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
//whyy is it written? 

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}
