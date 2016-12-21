/*
 * ManagerWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.ManagerRole;

import Business.EcoSystem;
import Business.Enterprise.BankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Salunkhe
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    private UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public ManagerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.btnSendRequest.setEnabled(false);
        if(enterprise instanceof BankEnterprise){
            this.btnSendRequest.setEnabled(true);
        }
        jLabelEnterpriseName.setText(enterprise.getName());
        this.business = business;
        this.userAccount = userAccount;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        btnManagePeople = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabelEnterpriseName = new javax.swing.JLabel();
        btnSendRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("My Work Area - Manager Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        btnManageUser.setBackground(new java.awt.Color(255, 255, 255));
        btnManageUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnManageUser.setText("Manage User ");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });
        add(btnManageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 240, 40));

        btnManagePeople.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePeople.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnManagePeople.setText("Manage People");
        btnManagePeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePeopleActionPerformed(evt);
            }
        });
        add(btnManagePeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 240, 40));

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 240, 40));

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, 40));

        jLabelEnterpriseName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEnterpriseName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelEnterpriseName.setText("<value>");
        add(jLabelEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 260, 40));

        btnSendRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnSendRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSendRequest.setText("Request Federal Bank");
        btnSendRequest.setEnabled(false);
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnManagePeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePeopleActionPerformed
        ManagePeopleJPanel managePeopleJPanel = new ManagePeopleJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("managePeopleJPanel", managePeopleJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManagePeopleActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),this.enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        // TODO add your handling code here:
        RequestToFedralJPanel requestToFedralJPanel = new RequestToFedralJPanel(userProcessContainer, business, enterprise, userAccount);
        userProcessContainer.add("manageOrganizationJPanel", requestToFedralJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendRequestActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagePeople;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEnterpriseName;
    private javax.swing.JButton manageOrganizationJButton;
    // End of variables declaration//GEN-END:variables
    
}
