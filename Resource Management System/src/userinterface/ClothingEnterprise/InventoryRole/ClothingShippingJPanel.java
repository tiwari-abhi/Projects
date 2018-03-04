/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClothingEnterprise.InventoryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClothingInventoryOrg;
import Business.Organization.NGOInventoryOrg;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Resources.Resource;
import Business.WorkQueue.NGOResourceWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luvesh
 */
public class ClothingShippingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineSupplyWorkArea
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDir;
    private UserAccount account;
    private NGOResourceWorkRequest request;
    private EcoSystem business;
    private ClothingInventoryOrg organization;
    private int totalResourceCount = 0;
    private ArrayList<Resource> tempList;
    private int quantity;
    
    
    public ClothingShippingJPanel(JPanel userProcessContainer,UserAccount userAccount, 
            Enterprise enterprise, ClothingInventoryOrg organization ,EcoSystem business,NGOResourceWorkRequest request) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
                
        resourceNameJTextField.setText(request.getResourceName());
        resourceQuantityJTextField.setText(String.valueOf(request.getQuantityNeeded()));
        requestedByJTextField.setText(request.getSender().getUsername());

        this.organization = organization;
        this.organizationDir = enterprise.getOrganizationDirectory();
        this.account = userAccount;        
        this.request = request;
        this.business = business;
        
        tempList = new ArrayList<>();
        populateInventoryResourceTable();
        popPledgeTable();
        backJButton.setEnabled(false);
    }

    
    
    public void popPledgeTable(){
        DefaultTableModel model = (DefaultTableModel) pledgedResourceJTable.getModel();
        model.setRowCount(0);       
            
            for (Resource r : tempList){
                Object[] row = new Object[2];
                row[0] = r;
                row[1] = r.getTotalDonatedToNGO();
                model.addRow(row);

            }

    }
    
    public void populateInventoryResourceTable(){
        
        DefaultTableModel model = (DefaultTableModel)resourceDirectoryJTable.getModel();
        
        model.setRowCount(0);
        int totRes = 0;
        for (Resource r : organization.getClothingResourceDirectory().getResourceList()){
            Object[] row = new Object[4];            
            row[0] = r;
            row[1] = r.getTempDonatedToSystem();
            model.addRow(row);
            totRes += r.getTempDonatedToSystem();
        }
       totalResourceCount = totRes;
    }
    
    public NGOInventoryOrg getSenderNGOOrg(){
        
        UserAccount senderAccount = request.getSender();
        
        for (Network n : business.getNetworkList()){
            for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization o : ent.getOrganizationDirectory().getOrganizationList()){
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
                        if (ua.equals(senderAccount)){
                            if (o instanceof NGOInventoryOrg){
                                NGOInventoryOrg org = (NGOInventoryOrg) o;
                                return org;
                            }
                        }
                    }
                }
            }
        }
        
        return null;
        
    }

    
//    public void getManufacturerOrganizations(){
//        for (Organization o : organizationDir.getOrganizationList()){
//             if (o instanceof ManufacturerOrg){
//                ManufacturerOrg org = (ManufacturerOrg) o;
//                mfgOrgList.add(org);
//             }
//        }     
//    }
//    
//    public void populateProviderResourceTable(){
//        DefaultTableModel model = (DefaultTableModel)resourceDirectoryJTable.getModel();
//        int count=0;
//        model.setRowCount(0);
////        
////      for(ManufacturerOrg mo : mfgOrgList){
////        for (Manufacturer m : mo.getManufacturerDirectory().getManufacturerDirectory()){
//            for (Resource v : clothingResourceList){
//                Object[] row = new Object[4];
////                row[0] = m;
//                row[0] = v;
//                row[1] = v.getResourceQuantity();
//                row[2] = v.getManufactureDate();
//                row[3] = v.getExpiryDate();
//                model.addRow(row);
//                count += v.getResourceQuantity();
//            }
////        }
//      
////    }
//      
//      lbltotalClothes.setText(String.valueOf(count));
//      
//    }
//    
//    public ClinicOrg getSenderClinicOrg(){
//        
//        UserAccount senderAccount = request.getSender();
//        
//        for (Network n : business.getNetworkList()){
//            for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()){
//                for (Organization o : ent.getOrganizationDirectory().getOrganizationList()){
//                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
//                        if (ua.equals(senderAccount)){
//                            if (o instanceof ClinicOrg){
//                                ClinicOrg org = (ClinicOrg) o;
//                                return org;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        
//        return null;
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modifyQuantityJButton = new javax.swing.JButton();
        resourceQuantityJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        resourceNameJTextField = new javax.swing.JTextField();
        txtModifyQty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSendDonation = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestedByJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        resourceDirectoryJTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        pledgedResourceJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 229, 150));

        modifyQuantityJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modifyQuantityJButton.setText("OK");
        modifyQuantityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityJButtonActionPerformed(evt);
            }
        });

        resourceQuantityJTextField.setEditable(false);
        resourceQuantityJTextField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resourceQuantityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceQuantityJTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setText("Modify Quantity:");

        resourceNameJTextField.setEditable(false);
        resourceNameJTextField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resourceNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Resource Name :");

        btnSendDonation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSendDonation.setText("Send Donation");
        btnSendDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDonationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Requested By:");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("NGO Request Info");

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestedByJTextField.setEditable(false);
        requestedByJTextField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        requestedByJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestedByJTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Quantity:");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Clothing Shipping Work Area");

        spinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        resourceDirectoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource Name", "Resource Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resourceDirectoryJTable);

        pledgedResourceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource Name", "Units Pledged"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(pledgedResourceJTable);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Resource Quantity :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resourceQuantityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(requestedByJTextField)
                                    .addComponent(resourceNameJTextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSendDonation))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(txtModifyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(modifyQuantityJButton)))))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(resourceNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(resourceQuantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtModifyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modifyQuantityJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(requestedByJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modifyQuantityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pledgedResourceJTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }

        Resource resource = (Resource) pledgedResourceJTable.getValueAt(selectedRow,0);
        int currentAvailableQty = resource.getTempDonatedToSystem();
        int oldQty = resource.getTotalDonatedToNGO();
        int getNewQty = Integer.parseInt(txtModifyQty.getText());

        if(getNewQty>(currentAvailableQty+oldQty)){
            JOptionPane.showMessageDialog(null, "Quantity is more than availibility");
            return;
        }
        else{
            if(getNewQty<=0){
                JOptionPane.showMessageDialog(null, "Quantity should more than 0");
                return;
            }
            else{
                resource.setTotalDonatedToNGO(getNewQty);
                resource.setTempDonatedToSystem(currentAvailableQty+(oldQty-getNewQty));
                                
                populateInventoryResourceTable();
                popPledgeTable();
            }
        }
    }//GEN-LAST:event_modifyQuantityJButtonActionPerformed

    private void resourceQuantityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceQuantityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resourceQuantityJTextFieldActionPerformed

    private void resourceNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resourceNameJTextFieldActionPerformed

    private void btnSendDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDonationActionPerformed
        // TODO add your handling code here:
        if (!tempList.isEmpty()){

            NGOInventoryOrg org = getSenderNGOOrg();
            
            if (org != null){
                for (Resource r : tempList){
                    boolean alreadyPresent = false;
                    for(Resource res : org.getResourcesReceivedDir().getResourceList()){
                        if (r.equals(res)){
                            alreadyPresent = true;
                            int ol = res.getTotalDonatedToNGO();
                            int nw = r.getTotalDonatedToNGO();
                            res.setTotalDonatedToNGO(ol + nw);
                            
                            for (Resource reso : organization.getClothingDonated().getResourceList()){
                                if (r.equals(reso)){
                                    reso.setTotalDonatedToNGO(ol + nw);
                                    populateInventoryResourceTable();
                                    break;
                                }
                            }
                            
                            break;
                        }
                    }
                    if (!alreadyPresent){
                    org.getResourcesReceivedDir().addResourceToList(r);
                    organization.getClothingDonated().addResourceToList(r);
                    }
                }
                tempList.clear();
            }
            
            popPledgeTable();
            
            request.setStatus("Processed");

            JOptionPane.showMessageDialog(null,"Books Sent to " + request.getSender().getEmployee().getName());
            
            backJButton.setEnabled(true);
                        
        }else{
            JOptionPane.showMessageDialog(null,"Please add resources to continue!");
        }
    }//GEN-LAST:event_btnSendDonationActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int fetchqty = (Integer)(spinnerQuantity.getValue());
        int selectedRow = resourceDirectoryJTable.getSelectedRow();
        quantity = fetchqty;
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }       
        
        if (fetchqty <= 0){
            JOptionPane.showMessageDialog(null,"Quantity cannot be less than 0");
            return;
        }

        if (fetchqty > totalResourceCount){
                JOptionPane.showMessageDialog(null,"Not enough excess resources to donate");
                return;
        }
            
        totalResourceCount = totalResourceCount - fetchqty;

        Resource selectedResource = (Resource) resourceDirectoryJTable.getValueAt(selectedRow,0);
        
//        BookResource resource = new BookResource();
//        
//        resource.setResourceType(selectedResource.getResourceType());
//        resource.setSalesRecord(selectedResource.getSalesRecord());
//        resource.setTotalDonatedToNGO(selectedResource.getTotalDonatedToNGO());
//        resource.setTotalDonatedToSystem(selectedResource.getTotalDonatedToSystem());
//        resource.setTotalExcessUnits(selectedResource.getTotalExcessUnits());
//        resource.setTotalManufacturedUnits(selectedResource.getTotalManufacturedUnits());
//        resource.setTotalSoldUnits(selectedResource.getTotalSoldUnits());
//        resource.setUnitPrice(selectedResource.getUnitPrice());
        
        

        if(fetchqty <= selectedResource.getTotalDonatedToSystem()){
            boolean isAlreadyPresent = false;

            for (Resource r : tempList){
                if (r == selectedResource){
                    int oldqty = r.getTotalDonatedToSystem();
                    int newqty = oldqty - fetchqty;
                    
                    r.setTempDonatedToSystem(newqty);
                    //selectedResource.setTotalDonatedToSystem(newqty);
                    
                    r.setTotalDonatedToNGO(fetchqty + r.getTempDonatedToSystem()); 
                    isAlreadyPresent = true;
                    populateInventoryResourceTable();
                    popPledgeTable();
//                    break;
                }
            }

            if (!isAlreadyPresent){
                int oldqty = selectedResource.getTotalDonatedToSystem();
                int newqty = oldqty - fetchqty;

                selectedResource.setTempDonatedToSystem(newqty);
                //selectedResource.setTotalDonatedToSystem(newqty);
                
                
                selectedResource.setTotalDonatedToNGO(fetchqty + selectedResource.getTotalDonatedToNGO());
                tempList.add(selectedResource);
                populateInventoryResourceTable();
                popPledgeTable();
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Quantity>Availibility","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestedByJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestedByJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestedByJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSendDonation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modifyQuantityJButton;
    private javax.swing.JTable pledgedResourceJTable;
    private javax.swing.JTextField requestedByJTextField;
    private javax.swing.JTable resourceDirectoryJTable;
    private javax.swing.JTextField resourceNameJTextField;
    private javax.swing.JTextField resourceQuantityJTextField;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTextField txtModifyQty;
    // End of variables declaration//GEN-END:variables
}
