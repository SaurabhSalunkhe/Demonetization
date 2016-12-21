/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FedralRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FederalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BankToFederalBankWorkRequest;
import Business.WorkQueue.FederalToLogisticsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keval
 */
public class FedralBankEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FedralBankEmployeeJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private FederalOrganization federalOrganization;
    private FederalToLogisticsWorkRequest federalToLogisticsWorkRequest;
    private BankToFederalBankWorkRequest bankToFederalBankWorkRequest;
    private EcoSystem business;

    public FedralBankEmployeeJPanel(JPanel userProcessContainer, UserAccount account, FederalOrganization federalReserveOrganization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.federalOrganization = federalReserveOrganization;
        this.enterprise = enterprise;
        populateTable();
        jLabelFederal.setText(enterprise.getName());
        this.business=business;

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFederalBankManager.getModel();

        model.setRowCount(0);
             System.out.println(federalOrganization.getWorkQueue().getWorkRequestList());
        for (WorkRequest workRequest : federalOrganization.getWorkQueue().getWorkRequestList()) {
           if (!workRequest.getStatus().equalsIgnoreCase("Completed")) {


                BankToFederalBankWorkRequest bankToFederalBankWorkRequest = (BankToFederalBankWorkRequest) workRequest;
                System.err.println("The value is " + bankToFederalBankWorkRequest.getAmount()+ bankToFederalBankWorkRequest.getStatus());
                Object[] row = new Object[4];
                
                row[0] = bankToFederalBankWorkRequest;
                row[1] = bankToFederalBankWorkRequest.getAmountToPickUp();
                row[2] = bankToFederalBankWorkRequest.getAmount();
                row[3] = bankToFederalBankWorkRequest.getStatus();
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFederalBankManager = new javax.swing.JTable();
        jLabelFederal = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        tblFederalBankManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Aount to Pick up", "StatusAmount to Deliver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFederalBankManager);

        jLabelFederal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFederal.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelFederal.setText("<Fedral Network name>");

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnNext.setText("Proceed");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setText("Federal Bank :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFederal, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(406, 406, 406))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(597, 597, 597)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(470, 470, 470))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFederal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblFederalBankManager.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Plese select row", "No selection detected", JOptionPane.ERROR_MESSAGE);
        } else {
            bankToFederalBankWorkRequest = (BankToFederalBankWorkRequest) tblFederalBankManager.getValueAt(selectedRow, 0);
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestToLogisticJPanel", new RequestToLogisticJPanel(userProcessContainer, userAccount, enterprise, bankToFederalBankWorkRequest,business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFederal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFederalBankManager;
    // End of variables declaration//GEN-END:variables
}
