/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Providers.ProviderDirectory;
import Business.Role.Book.BookProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class BookProviderOrg extends Organization{

    private ProviderDirectory bookProviderDirectory;
    
    public BookProviderOrg(){
        super(Organization.BookType.Provider.getValue());
        bookProviderDirectory = new ProviderDirectory();
    }

    public ProviderDirectory getBookProviderDirectory() {
        return bookProviderDirectory;
    }

    public void setBookProviderDirectory(ProviderDirectory bookProviderDirectory) {
        this.bookProviderDirectory = bookProviderDirectory;
    }
            
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BookProviderRole());
        return roles;
    }
    
}
