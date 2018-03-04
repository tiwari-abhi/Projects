/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createGovtOrganization(Organization.GovernmentType gov){
        Organization organization = null;
        if (gov.getValue().equals(Organization.GovernmentType.Admin.getValue())){
            organization = new GovernmentAdminOrg();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public Organization createNGOOrganization(Organization.NGOType ngo){
        Organization organization = null;
        if (ngo.getValue().equals(Organization.NGOType.Inventory.getValue())){
            organization = new NGOInventoryOrg();
            organizationList.add(organization);
        }
        else if (ngo.getValue().equals(Organization.NGOType.Admin.getValue())){
            organization = new NGOAdminOrg();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createBookOrganization(Organization.BookType book){
        Organization organization = null;
        if (book.getValue().equals(Organization.BookType.Inventory.getValue())){
            organization = new BookInventoryOrg();
            organizationList.add(organization);
        }
        else if (book.getValue().equals(Organization.BookType.Provider.getValue())){
            organization = new BookProviderOrg();
            organizationList.add(organization);
        }        
        else if (book.getValue().equals(Organization.BookType.Admin.getValue())){
            organization = new BookAdminOrg();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createClothingOrganization(Organization.ClothingType clothing){
        Organization organization = null;
        if (clothing.getValue().equals(Organization.ClothingType.Inventory.getValue())){
            organization = new ClothingInventoryOrg();
            organizationList.add(organization);
        }
        else if (clothing.getValue().equals(Organization.ClothingType.Admin.getValue())){
            organization = new ClothingAdminOrg();
            organizationList.add(organization);
        }
        else if (clothing.getValue().equals(Organization.ClothingType.Provider.getValue())){
            organization = new ClothingProviderOrg();
            organizationList.add(organization);
        }
        return organization;
    }
    
}