package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Resources.Resource;

/**
 *
 * @author abhin
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Employee employee = system.getEmployeeDirectory().addEmployeeToMasterList("Abhinav");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SystemAdminRole());
        
        
        
        return system;
    }
    
}
