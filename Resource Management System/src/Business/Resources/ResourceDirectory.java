/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resources;

import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class ResourceDirectory {
    
    private ArrayList<Resource> resourceList;

    public ResourceDirectory() {
        resourceList = new ArrayList<Resource>();
    }

    public ArrayList<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(ArrayList<Resource> resourceList) {
        this.resourceList = resourceList;
    }
    
    public Resource addResourceToList(Resource resource){
        resourceList.add(resource);
        return resource;
    }    

    public void removeResource(Resource resource) {
        resourceList.remove(resource);
    }
    
    public boolean checkIfResourceAlreadyPresent(String name){
        for(Resource r : resourceList){
            if (r.getResourceType().equals(Resource.ResourceType.Book.getValue())){
                BookResource br = (BookResource) r;
                if (br.getBookName().equalsIgnoreCase(name)){
                    return true;
                }
            }
            else if (r.getResourceType().equals(Resource.ResourceType.Clothing.getValue())){
                ClothingResource cr = (ClothingResource) r;
                if (cr.getClothingItemName().equalsIgnoreCase(name)){
                    return true;
                }
            }
        }
        return false;
    }
}
