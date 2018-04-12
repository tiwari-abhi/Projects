/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BookEnterprise.Provider;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BookProviderOrg;
import Business.Providers.Provider;
import Business.Resources.Resource;
import Business.Resources.Sales.Sales;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhin
 */
public class BookProviderSalesFiguresJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private BookProviderOrg organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Provider provider;
    
    public BookProviderSalesFiguresJPanel(JPanel userProcessContainer,UserAccount userAccount, 
            BookProviderOrg organization,Enterprise enterprise,EcoSystem business, Provider provider) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.provider = provider;
        popMonthComboBox();
        popResourceComboBox();
    }
    
    public void popMonthComboBox(){
        cmbMonth.removeAllItems();
        
        for (Sales.MonthType month : Sales.MonthType.values()){
            cmbMonth.addItem(month);
        }
                
    }
    
    public void popResourceComboBox(){
        cmbResource.removeAllItems();
        
        for(Resource r : provider.getResourceDirectory().getResourceList()){            
                cmbResource.addItem(r);           
        }
        
    }
    
    public void popSalesTable(Sales.MonthType month){       
        
        DefaultTableModel dtm = (DefaultTableModel) salesDirectoryJTable.getModel();
        
        dtm.setRowCount(0);
        
        for (Resource r : provider.getResourceDirectory().getResourceList()){  
                
            for (Sales s : r.getSalesRecord().getSalesRecordList()){
                if (s.getMonth().equalsIgnoreCase(month.getValue())){
                Object[] row = new Object[4];
                row[0] = r;
                row[1] = s.getResourcesManufactured();
                row[2] = s.getResourcesSold();
                row[3] = s.getExcessResource();
                dtm.addRow(row);
                }
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

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        unitsProducedTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        unitsSoldTxtField = new javax.swing.JTextField();
        cmbMonth = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        salesDirectoryJTable = new javax.swing.JTable();
        addSalesRecordJButton1 = new javax.swing.JButton();
        cmbResource = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnMonitorSalesFigures = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 223, 217));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel5.setText("Manage Book Sales Figures");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel8.setText("Units Produced:");

        unitsProducedTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsProducedTxtFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel9.setText("Units Sold:");

        unitsSoldTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsSoldTxtFieldActionPerformed(evt);
            }
        });

        cmbMonth.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel10.setText("Month:");

        salesDirectoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource Name", "Units Produced", "Units Sold", "Remaining Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(salesDirectoryJTable);
        if (salesDirectoryJTable.getColumnModel().getColumnCount() > 0) {
            salesDirectoryJTable.getColumnModel().getColumn(0).setResizable(false);
            salesDirectoryJTable.getColumnModel().getColumn(1).setResizable(false);
            salesDirectoryJTable.getColumnModel().getColumn(1).setHeaderValue("Units Produced");
            salesDirectoryJTable.getColumnModel().getColumn(2).setResizable(false);
            salesDirectoryJTable.getColumnModel().getColumn(2).setHeaderValue("Units Sold");
            salesDirectoryJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        addSalesRecordJButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        addSalesRecordJButton1.setText("Add Sales Record");
        addSalesRecordJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesRecordJButton1ActionPerformed(evt);
            }
        });

        cmbResource.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        cmbResource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbResource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResourceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel11.setText("Resource:");

        backJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnMonitorSalesFigures.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        btnMonitorSalesFigures.setText("Monitor Sales Figures >>");
        btnMonitorSalesFigures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorSalesFiguresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbResource, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitsProducedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitsSoldTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSalesRecordJButton1)
                            .addComponent(btnMonitorSalesFigures)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(451, 451, 451))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addSalesRecordJButton1, btnMonitorSalesFigures, cmbResource, unitsProducedTxtField, unitsSoldTxtField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbResource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(unitsProducedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(unitsSoldTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addSalesRecordJButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMonitorSalesFigures)
                    .addComponent(backJButton))
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unitsProducedTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsProducedTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsProducedTxtFieldActionPerformed

    private void unitsSoldTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsSoldTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsSoldTxtFieldActionPerformed

    private void cmbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthActionPerformed
        // TODO add your handling code here:
        Sales.MonthType month = (Sales.MonthType) cmbMonth.getSelectedItem();
        if (month !=null){
            popSalesTable(month);
        }
    }//GEN-LAST:event_cmbMonthActionPerformed

    private void addSalesRecordJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesRecordJButton1ActionPerformed
        // TODO add your handling code here:

        int produced;
        int sold;
        
        int totalSold=0;
        int totalProduced=0;
        
        if (!(unitsProducedTxtField.getText().isEmpty() || unitsSoldTxtField.getText().isEmpty())){
        
        try{
            produced = Integer.parseInt(unitsProducedTxtField.getText());
            sold = Integer.parseInt(unitsSoldTxtField.getText());
            
            if (produced <= 0 || sold <= 0){
                JOptionPane.showMessageDialog(null,"Quantity cannot be negative/Zero","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter numeric values only!");
            return;
        }
        
        if (sold > produced){
            JOptionPane.showMessageDialog(null,"Number of sold resources cannot be more than produced resources !");
            return;
        }
        
        Resource resource = (Resource) cmbResource.getSelectedItem();
        
        Sales s = new Sales();
        Sales.MonthType month = (Sales.MonthType) cmbMonth.getSelectedItem();
        
        if (resource.getSalesRecord().salesRecordAlreadyPresent(month.getValue())){
            JOptionPane.showMessageDialog(null,"Sales Record already present !");
            return;
        }
        
        s.setMonth(month.getValue());
        s.setResourcesManufactured(produced);
        s.setResourcesSold(sold);
        
        s.setExcessResource(produced - sold);
                
        resource.getSalesRecord().addToSalesRecordList(s);
        
        for (Resource r : provider.getResourceDirectory().getResourceList()){
            
            if (r.equals(resource)){
            
                for (Sales sa : r.getSalesRecord().getSalesRecordList()){
                    totalProduced += sa.getResourcesManufactured();
                    totalSold += sa.getResourcesSold();
                }
                
            } 
        }
        
        int totalExcess = totalProduced - totalSold;
        
        resource.setTotalManufacturedUnits(totalProduced);
        resource.setTotalSoldUnits(totalSold);
        resource.setTotalExcessUnits(totalExcess);
        
        popSalesTable(month);
        
        JOptionPane.showMessageDialog(null,"Sales Record added !");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please dont leave fields blank");
        }
    }//GEN-LAST:event_addSalesRecordJButton1ActionPerformed

    private void cmbResourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbResourceActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnMonitorSalesFiguresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorSalesFiguresActionPerformed
        // TODO add your handling code here:
        MonitorBookSalesFiguresJPanel msfjp = new MonitorBookSalesFiguresJPanel(userProcessContainer,provider);
        userProcessContainer.add("MonitorSalesFiguresJPanel",msfjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMonitorSalesFiguresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSalesRecordJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnMonitorSalesFigures;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbResource;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable salesDirectoryJTable;
    private javax.swing.JTextField unitsProducedTxtField;
    private javax.swing.JTextField unitsSoldTxtField;
    // End of variables declaration//GEN-END:variables
}