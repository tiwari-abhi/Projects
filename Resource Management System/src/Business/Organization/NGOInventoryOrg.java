/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Resources.ResourceDirectory;
import Business.Role.NGO.NGOInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class NGOInventoryOrg extends Organization{

    private ResourceDirectory resourcesReceivedDir;
    
    public NGOInventoryOrg(){
        super(Organization.NGOType.Inventory.getValue());
        resourcesReceivedDir = new ResourceDirectory();
    }

    public ResourceDirectory getResourcesReceivedDir() {
        return resourcesReceivedDir;
    }

    public void setResourcesReceivedDir(ResourceDirectory resourcesReceivedDir) {
        this.resourcesReceivedDir = resourcesReceivedDir;
    }
            
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NGOInventoryRole());
        return roles;
    }
    
}
