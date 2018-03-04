/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public abstract class Organization {

    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private final int organizationID;
    private static int counter=0;
        
    public enum ClothingType{
        
        Admin("Admin Organization"),
        Inventory("Inventory Organization"),
        Provider("Provider");
        
        private String value;
        private ClothingType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum BookType{
        
        Admin("Admin Organization"),
        Inventory("Inventory Organization"),
        Provider("Provider");
        
        private String value;
        private BookType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
       
    public enum NGOType{
        
        Admin("Admin Organization"),
        Inventory("Inventory Organization");
        
        private String value;
        private NGOType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum GovernmentType{
        
        Admin("Admin Organization");
        
        private String value;
        private GovernmentType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        counter++;
        organizationID = counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
        
}