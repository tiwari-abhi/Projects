/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Book;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BookEnterprise.AdminRole.BookAdminWorkAreaJPanel;

/**
 *
 * @author abhin
 */
public class BookAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BookAdminWorkAreaJPanel(userProcessContainer, organization, enterprise, business);
    }
    
    @Override
    public String toString(){
        return "Book Admin";
    }
    
}
