/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Resources.ResourceDirectory;
import Business.Role.Clothing.ClothingInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhin/luvesh
 */
public class ClothingInventoryOrg extends Organization{
    
        public ResourceDirectory clothingResourceDirectory;
        public ResourceDirectory clothingDonated;
    
    public ClothingInventoryOrg(){
        super(Organization.ClothingType.Inventory.getValue());
        clothingResourceDirectory = new ResourceDirectory();
        clothingDonated = new ResourceDirectory();
    }

    public ResourceDirectory getClothingResourceDirectory() {
        return clothingResourceDirectory;
    }

    public void setClothingResourceDirectory(ResourceDirectory clothingResourceDirectory) {
        this.clothingResourceDirectory = clothingResourceDirectory;
    }

    public ResourceDirectory getClothingDonated() {
        return clothingDonated;
    }

    public void setClothingDonated(ResourceDirectory clothingDonated) {
        this.clothingDonated = clothingDonated;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClothingInventoryRole());
        return roles;                
    }
}
