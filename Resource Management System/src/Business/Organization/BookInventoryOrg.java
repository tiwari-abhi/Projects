/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Resources.ResourceDirectory;
import Business.Role.Book.BookInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class BookInventoryOrg extends Organization{

    public ResourceDirectory bookResourceDirectory;
    public ResourceDirectory booksDonated;
    
    public BookInventoryOrg(){
        super(Organization.BookType.Inventory.getValue());
        bookResourceDirectory = new ResourceDirectory();
        booksDonated = new ResourceDirectory();
    }
    
    public ResourceDirectory getBooksDonated() {
        return booksDonated;
    }

    public void setBooksDonated(ResourceDirectory booksDonated) {
        this.booksDonated = booksDonated;
    }
    
    public ResourceDirectory getBookResourceDirectory() {
        return bookResourceDirectory;
    }

    public void setBookResourceDirectory(ResourceDirectory bookResourceDirectory) {
        this.bookResourceDirectory = bookResourceDirectory;
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BookInventoryRole());
        return roles;                
    }
    
}
