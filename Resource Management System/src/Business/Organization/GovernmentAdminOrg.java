/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Government.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class GovernmentAdminOrg extends Organization{
    
       
    public GovernmentAdminOrg(){
        super(Organization.GovernmentType.Admin.getValue());
    }  
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
    
}
