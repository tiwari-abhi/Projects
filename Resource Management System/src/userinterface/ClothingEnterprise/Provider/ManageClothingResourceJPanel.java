/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClothingEnterprise.Provider;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Providers.Provider;
import Business.Resources.ClothingResource;
import Business.Resources.Resource;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhin
 */
public class ManageClothingResourceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageClothingResourceJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount; 
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    Provider provider;
    
    public ManageClothingResourceJPanel(JPanel userProcessContainer,UserAccount userAccount, 
            Organization organization,Enterprise enterprise,EcoSystem business,Provider provider) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.provider = provider;
        populateResourceTable();
    }
    
    public void populateResourceTable(){
        DefaultTableModel model = (DefaultTableModel) resourceDirectoryJTable.getModel();
        model.setRowCount(0);
        
        for (Resource r : provider.getResourceDirectory().getResourceList()){
            Object row[] = new Object[2];
            row[0] = r;
            row[1] = r.getUnitPrice();
            model.addRow(row);
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

        clothesNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resourceDirectoryJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        unitPriceTxtField = new javax.swing.JTextField();
        addResourceJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        removeClothesJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        manufacturerNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 229, 150));

        clothesNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothesNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Name :");

        resourceDirectoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource Name", "Resource Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(resourceDirectoryJTable);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Unit Price:");

        unitPriceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitPriceTxtFieldActionPerformed(evt);
            }
        });

        addResourceJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        addResourceJButton.setText("Add Clothing");
        addResourceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResourceJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel5.setText("Manage Clothing Resource");

        removeClothesJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        removeClothesJButton.setText("Remove Clothing");
        removeClothesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClothesJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        manufacturerNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Manufacturer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(unitPriceTxtField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backJButton))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addResourceJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(manufacturerNameJTextField))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(clothesNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeClothesJButton))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clothesNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeClothesJButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(unitPriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(manufacturerNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addResourceJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clothesNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothesNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothesNameJTextFieldActionPerformed

    private void unitPriceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitPriceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitPriceTxtFieldActionPerformed

    private void addResourceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResourceJButtonActionPerformed
        // TODO add your handling code here:
        
        String name = clothesNameJTextField.getText();
        String manufacturerName = manufacturerNameJTextField.getText();
                
        if (!(clothesNameJTextField.getText().isEmpty() || manufacturerNameJTextField.getText().isEmpty())){
            
            if (provider.getResourceDirectory().checkIfResourceAlreadyPresent(name)){
                JOptionPane.showMessageDialog(null,"Resource already exists in directory");
                return;
            }
            
                    
            ClothingResource r = new ClothingResource();
            r.setResourceType(Resource.ResourceType.Clothing.getValue());
            r.setClothesTaxBenefitPercent(business.getCtb().getClothesTaxBenefitPercentage());
            
        try{
            int a = Integer.parseInt(unitPriceTxtField.getText());
            if (a<=0){
                JOptionPane.showMessageDialog(null,"Quantity cannot be negative/Zero","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter numeric value only");
            return;
        }
        
        int unitPrice = Integer.parseInt(unitPriceTxtField.getText());
        
        r.setManufacturerName(manufacturerName);
        r.setClothingItemName(name);
        r.setUnitPrice(unitPrice);
        
        provider.getResourceDirectory().addResourceToList(r);
        
        populateResourceTable();
        
        JOptionPane.showMessageDialog(null,"Resource Added !");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please dont leave fields blank");
            return;
        }
    }//GEN-LAST:event_addResourceJButtonActionPerformed

    private void removeClothesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClothesJButtonActionPerformed
        // TODO add your handling code here:
        int getSelectedBook = resourceDirectoryJTable.getSelectedRow();
        
        if(getSelectedBook < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        Resource r = (Resource) resourceDirectoryJTable.getValueAt(getSelectedBook,0);
        provider.getResourceDirectory().removeResource(r);
        JOptionPane.showMessageDialog(null,"Book Removed");
        populateResourceTable();
    }//GEN-LAST:event_removeClothesJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void manufacturerNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerNameJTextFieldActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResourceJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField clothesNameJTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField manufacturerNameJTextField;
    private javax.swing.JButton removeClothesJButton;
    private javax.swing.JTable resourceDirectoryJTable;
    private javax.swing.JTextField unitPriceTxtField;
    // End of variables declaration//GEN-END:variables
}