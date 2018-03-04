package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.TaxBenefitClasses.BookTaxBenefit;
import Business.TaxBenefitClasses.ClothesTaxBenefit;
import java.util.ArrayList;
/**
 *
 * @author abhin
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    BookTaxBenefit btb;
    ClothesTaxBenefit ctb;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        btb = BookTaxBenefit.getInstance();
        ctb = ClothesTaxBenefit.getInstance();
    }

    public ClothesTaxBenefit getCtb() {
        return ctb;
    }

    public void setCtb(ClothesTaxBenefit ctb) {
        this.ctb = ctb;
    }
        
    public BookTaxBenefit getBtb() {
        return btb;
    }

    public void setBtb(BookTaxBenefit btb) {
        this.btb = btb;
    }
        
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
}