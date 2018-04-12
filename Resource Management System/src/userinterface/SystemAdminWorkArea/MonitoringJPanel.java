/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.NetworkResourcesBarChart_AWT;
import Business.PieChart_AWT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author abhin
 */
public class MonitoringJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitoringJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public MonitoringJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        createGraph();
        createResourcePieChart();
        createTaxPieChart();
    }
    
    public void createGraph(){
        NetworkResourcesBarChart_AWT chart = new NetworkResourcesBarChart_AWT("",system);
        chart.pack( );        

        JFreeChart barChart = ChartFactory.createBarChart3D("",           
        "Network List",            
        "Resource Quantity",            
        NetworkResourcesBarChart_AWT.createDataset(),          
        PlotOrientation.VERTICAL,           
        true, true, false);

        ChartPanel CP = new ChartPanel(barChart);

        graphAreaJPanel.setLayout(new BorderLayout());
        graphAreaJPanel.add(CP,BorderLayout.CENTER);
        graphAreaJPanel.validate();
    }
    
    public void createResourcePieChart(){
        PieChart_AWT chart = new PieChart_AWT("", system);
        chart.pack();
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("",
          PieChart_AWT.createDataSetForTotalResourceCalculation(),  
          true,true,false);
        
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        
        ChartPanel CP = new ChartPanel(pieChart);

        pieChartAreaJPanel.setLayout(new BorderLayout());
        pieChartAreaJPanel.add(CP,BorderLayout.CENTER);
        pieChartAreaJPanel.validate();
        
    }
    
     public void createTaxPieChart(){
        PieChart_AWT chart = new PieChart_AWT("", system);
        chart.pack();
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("",
          PieChart_AWT.createTaxDataSet(),  
          true,true,false);
        
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        
        ChartPanel CP = new ChartPanel(pieChart);

        taxPieChartAreaJPanel.setLayout(new BorderLayout());
        taxPieChartAreaJPanel.add(CP,BorderLayout.CENTER);
        taxPieChartAreaJPanel.validate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        graphAreaJPanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pieChartAreaJPanel = new javax.swing.JPanel();
        backJButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        taxPieChartAreaJPanel = new javax.swing.JPanel();
        backJButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(218, 185, 255));

        graphAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graphAreaJPanelLayout = new javax.swing.GroupLayout(graphAreaJPanel);
        graphAreaJPanel.setLayout(graphAreaJPanelLayout);
        graphAreaJPanelLayout.setHorizontalGroup(
            graphAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graphAreaJPanelLayout.setVerticalGroup(
            graphAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        backJButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backJButton)
                .addGap(0, 934, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(graphAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resource Monitoring Across Networks", jPanel1);

        jPanel2.setBackground(new java.awt.Color(218, 185, 255));

        pieChartAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pieChartAreaJPanelLayout = new javax.swing.GroupLayout(pieChartAreaJPanel);
        pieChartAreaJPanel.setLayout(pieChartAreaJPanelLayout);
        pieChartAreaJPanelLayout.setHorizontalGroup(
            pieChartAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pieChartAreaJPanelLayout.setVerticalGroup(
            pieChartAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        backJButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pieChartAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backJButton1)
                .addGap(0, 934, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pieChartAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backJButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resource Type Recycled Across Networks", jPanel2);

        jPanel3.setBackground(new java.awt.Color(218, 185, 255));

        taxPieChartAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout taxPieChartAreaJPanelLayout = new javax.swing.GroupLayout(taxPieChartAreaJPanel);
        taxPieChartAreaJPanel.setLayout(taxPieChartAreaJPanelLayout);
        taxPieChartAreaJPanelLayout.setHorizontalGroup(
            taxPieChartAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        taxPieChartAreaJPanelLayout.setVerticalGroup(
            taxPieChartAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        backJButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taxPieChartAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(backJButton2)
                .addGap(0, 934, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(taxPieChartAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backJButton2)
                .addGap(7, 7, 7))
        );

        jTabbedPane1.addTab("Tax Approval / Rejection Percentage", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton backJButton2;
    private javax.swing.JPanel graphAreaJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pieChartAreaJPanel;
    private javax.swing.JPanel taxPieChartAreaJPanel;
    // End of variables declaration//GEN-END:variables
}