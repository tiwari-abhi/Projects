/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentEnterprise.AdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.BookProviderOrg;
import Business.Organization.ClothingProviderOrg;
import Business.Organization.GovernmentAdminOrg;
import Business.Organization.Organization;
import Business.Providers.Provider;
import Business.Resources.BookResource;
import Business.Resources.ClothingResource;
import Business.Resources.Resource;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author abhin
 */
public class MonitorTaxBenefitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitorTaxBenefitJPanel
     */
    public JPanel userProcessContainer;
    public GovernmentEnterprise enterprise;
    public EcoSystem business;
    public UserAccount account;
    
    public MonitorTaxBenefitJPanel(JPanel userProcessContainer, UserAccount account, GovernmentAdminOrg organization, 
            GovernmentEnterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.account = account;
        popBookPercentCombo();
        popClothesPercentCombo();
        
    }
    
    public Network findNetworkFromEnterprise(){
        for (Network n : business.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                    if (ua.equals(account)){
                        return n;
                    }
                }
            }
        }
        return null;
    }
    
    public void calculateClothEffectiveness(double value){
    
        ClothingProviderOrg org=null;
        Network n = findNetworkFromEnterprise();
        
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
                if (o instanceof ClothingProviderOrg){
                    org = (ClothingProviderOrg) o;                      
                    break;
                }
            }
//                break;
        }
//            break;
        
        
        double excessBooks=0,donatedToSystem=0,cumulativePercentage=0,absolutePercentage=0;
        
        if (org != null){
            
            int numOfProviders = org.getClothingProviderDirectory().getProviderDirectory().size();
            int resourceCount=0;
            
            for (Provider providers : org.getClothingProviderDirectory().getProviderDirectory()){
                for (Resource resource : providers.getDonatedResources().getResourceList()){
                    if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Clothing.getValue())){
                        ClothingResource br = (ClothingResource) resource;
                        if (br.getClothesTaxBenefitPercent() == (value/100)){
                            resourceCount=resourceCount+1;
                            excessBooks = br.getTotalExcessUnits();
                            donatedToSystem = br.getTotalDonatedToSystem();
                            cumulativePercentage += (Double) ((donatedToSystem)/(donatedToSystem + excessBooks))*100;
                        }
                    }
                }
            }
            
            absolutePercentage = (Double) (cumulativePercentage / (numOfProviders * resourceCount));
        }
        double roundoff = (double) Math.round(absolutePercentage * 100) / 100 ;
        
        lblClothesPercentEffectiveness.setText(String.valueOf(roundoff));
    }
    
    public void calculateBookEffectiveness(double value){
        
        BookProviderOrg org=null;
        Network n = findNetworkFromEnterprise();
        
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    if (o instanceof BookProviderOrg){
                        org = (BookProviderOrg) o;                      
                        break;
                    }
                }
//                break;
            }
//            break;
        
        
        double excessBooks=0,donatedToSystem=0,cumulativePercentage=0,absolutePercentage=0;
        
        if (org != null){
            
            int numOfProviders = org.getBookProviderDirectory().getProviderDirectory().size();
            int resourceCount=0;
            
            for (Provider providers : org.getBookProviderDirectory().getProviderDirectory()){
                for (Resource resource : providers.getDonatedResources().getResourceList()){
                    if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Book.getValue())){
                        BookResource br = (BookResource) resource;
                        if (br.getBookTaxbenefitPercent() == (value/100)){
                            resourceCount=resourceCount+1;
                            excessBooks = br.getTotalExcessUnits();
                            donatedToSystem = br.getTotalDonatedToSystem();
                            cumulativePercentage += (Double) ((donatedToSystem)/(donatedToSystem + excessBooks))*100;
                        }
                    }
                }
            }
            
            absolutePercentage = (Double) (cumulativePercentage / (numOfProviders * resourceCount));
        }
        double roundoff = (double) Math.round(absolutePercentage * 100) / 100 ;
        
        lblBookPercentEffectiveness.setText(String.valueOf(roundoff));
        
    }
    
    public void popBookPercentCombo(){
        booksPercentValuesCmbBox.removeAllItems();
        
        for (Object values : enterprise.getBookTaxPercentages()){
            if (values instanceof Double){
                booksPercentValuesCmbBox.addItem(((Double) values)*100);
            }
        }
    }
    
    public void popClothesPercentCombo(){
        clothesPercentValuesCmbBox.removeAllItems();
        
        for (Object values : enterprise.getClothingTaxPercentages()){
            if (values instanceof Double){
                clothesPercentValuesCmbBox.addItem(((Double) values)*100);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        booksPercentValuesCmbBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lblBookPercentEffectiveness = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clothesPercentValuesCmbBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lblClothesPercentEffectiveness = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 218, 185));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Monitor Tax Benefit Effectiveness :");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel2.setText("Book Resource :");

        booksPercentValuesCmbBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        booksPercentValuesCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        booksPercentValuesCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksPercentValuesCmbBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Select Percent Value :");

        lblBookPercentEffectiveness.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblBookPercentEffectiveness.setText("<Value>");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Effectiveness in % : ");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel4.setText("Clothing Resource :");

        clothesPercentValuesCmbBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        clothesPercentValuesCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clothesPercentValuesCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothesPercentValuesCmbBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Select Percent Value :");

        lblClothesPercentEffectiveness.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClothesPercentEffectiveness.setText("<Value>");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Effectiveness in % : ");

        backJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(backJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clothesPercentValuesCmbBox, 0, 100, Short.MAX_VALUE)
                            .addComponent(lblBookPercentEffectiveness, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(booksPercentValuesCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClothesPercentEffectiveness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(booksPercentValuesCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookPercentEffectiveness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clothesPercentValuesCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblClothesPercentEffectiveness))
                .addGap(67, 67, 67)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void booksPercentValuesCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksPercentValuesCmbBoxActionPerformed
        // TODO add your handling code here:
        Double value = (Double) booksPercentValuesCmbBox.getSelectedItem();
        if (value != null){
            calculateBookEffectiveness(value);
        }
    }//GEN-LAST:event_booksPercentValuesCmbBoxActionPerformed

    private void clothesPercentValuesCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothesPercentValuesCmbBoxActionPerformed
        // TODO add your handling code here:
        Double value = (Double) clothesPercentValuesCmbBox.getSelectedItem();
        if (value != null){
            calculateClothEffectiveness(value);
        }
    }//GEN-LAST:event_clothesPercentValuesCmbBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox booksPercentValuesCmbBox;
    private javax.swing.JComboBox clothesPercentValuesCmbBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBookPercentEffectiveness;
    private javax.swing.JLabel lblClothesPercentEffectiveness;
    // End of variables declaration//GEN-END:variables
}