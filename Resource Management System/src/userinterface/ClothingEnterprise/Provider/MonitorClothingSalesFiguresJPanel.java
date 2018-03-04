/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClothingEnterprise.Provider;

import Business.SalesBarChart_AWT;
import Business.Providers.Provider;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author abhin
 */
public class MonitorClothingSalesFiguresJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitorClothingSalesFiguresJPanel
     */
    JPanel userProcessContainer;
    Provider provider;
    
    public MonitorClothingSalesFiguresJPanel(JPanel userProcessContainer,Provider provider) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.provider = provider;
        createGraph();
    }
    
    public void createGraph(){
        SalesBarChart_AWT chart = new SalesBarChart_AWT("", provider);
        chart.pack( );        
        
        JFreeChart barChart = ChartFactory.createStackedBarChart3D("",           
        "Months",            
        "Resource Quantity",            
        SalesBarChart_AWT.createDatasetForResourceSales(),          
        PlotOrientation.VERTICAL,           
        true, true, false);

      ChartPanel CP = new ChartPanel(barChart);
        
      graphAreaJPanel.setLayout(new BorderLayout());
      graphAreaJPanel.add(CP,BorderLayout.CENTER);
      graphAreaJPanel.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphAreaJPanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 229, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graphAreaJPanelLayout = new javax.swing.GroupLayout(graphAreaJPanel);
        graphAreaJPanel.setLayout(graphAreaJPanelLayout);
        graphAreaJPanelLayout.setHorizontalGroup(
            graphAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        graphAreaJPanelLayout.setVerticalGroup(
            graphAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        add(graphAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 989, -1));

        backJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 608, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setText("Monthly Sales Figures :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 470, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel graphAreaJPanel;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
