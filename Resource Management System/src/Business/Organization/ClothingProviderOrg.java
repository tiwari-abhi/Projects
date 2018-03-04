/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Providers.ProviderDirectory;
import Business.Role.Clothing.ClothingProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin/luvesh
 */
public class ClothingProviderOrg extends Organization{
        
    private ProviderDirectory clothingProviderDirectory;
    
    public ClothingProviderOrg(){
        super(Organization.ClothingType.Provider.getValue());
        clothingProviderDirectory = new ProviderDirectory();
    }

    public ProviderDirectory getClothingProviderDirectory() {
        return clothingProviderDirectory;
    }

    public void setClothingProviderDirectory(ProviderDirectory clothingProviderDirectory) {
        this.clothingProviderDirectory = clothingProviderDirectory;
    }
            
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClothingProviderRole());
        return roles;
    }
}
