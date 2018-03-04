/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Clothing;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClothingEnterprise.AdminRole.ClothingAdminWorkAreaJPanel;

/**
 *
 * @author abhin/luvesh
 */
public class ClothingAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ClothingAdminWorkAreaJPanel(userProcessContainer, organization, enterprise, business);
    }
    
    @Override
    public String toString(){
        return "Clothing Admin Role";
    }
    
}
