/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Resources.ResourceDirectory;
import Business.Role.NGO.NGOAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class NGOAdminOrg extends Organization{
    
    public NGOAdminOrg(){
        super(Organization.NGOType.Admin.getValue());
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NGOAdminRole());
        return roles;
    }
            
}
