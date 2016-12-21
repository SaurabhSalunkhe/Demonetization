/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.BankEnterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.EmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TokenTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    private BankEnterprise bankEnterprise;
    private TokenTestWorkRequest tokenTestWorkRequest;
    private SimpleDateFormat simpleDateFormat;
    private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, CustomerOrganization customerOrganization, EcoSystem business, TokenTestWorkRequest tokenTestWorkRequest, BankEnterprise bankEnterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.customerOrganization = customerOrganization;
        this.tokenTestWorkRequest = tokenTestWorkRequest;
        this.bankEnterprise = bankEnterprise;
        lblBankName.setText(bankEnterprise.toString());
        simpleDateFormat = new SimpleDateFormat("MM/DD/YY");
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int count = 0;
        Date input = jCalendarComboBox1.getDate();
        LocalDate selectedDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

//        String selectedDate   = simpleDateFormat.format(jCalendarPanel1.getDate());
//        System.out.println(selectedDate);
//        Date selectedDate=null;
//        try {
//            selectedDate = df.parse(date);
//        } catch (ParseException ex) {
//            JOptionPane.showMessageDialog(null, "Please select a Date", "No selection detected", JOptionPane.ERROR_MESSAGE);
//        }
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Please select a Date", "No selection detected", JOptionPane.ERROR_MESSAGE);
        } else {
            model.setRowCount(0);

            for (WorkRequest.TimeSlot timeslot : WorkRequest.TimeSlot.values()) {
                count = 0;
                Object[] row = new Object[2];
                row[0] = timeslot;
                for (Organization organization : bankEnterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof EmployeeOrganization) {
                        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
                            System.out.println(count + "ouside");
                            if (workRequest.getRequestDate().toString().equals(selectedDate.toString()) && workRequest.getTimeSlot().equals(timeslot)) {
                                count++;
                                System.out.println(count);
                            }
                        }
                    }
                }
                row[1] = count;
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
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jCalendarComboBox1 = new de.wannawork.jcalendar.JCalendarComboBox();
        lblBankName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Time-slots", "count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 670, 230));

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        processJButton.setText("Book Timeslot");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 190, 50));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 150, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Select Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 120, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setText("Bank Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 110, 40));

        jCalendarComboBox1.setBackground(new java.awt.Color(204, 255, 255));
        jCalendarComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 290, 40));

        lblBankName.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lblBankName.setText("<get selected bank name here>");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 460, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a timeslot", "No selection detected", JOptionPane.ERROR_MESSAGE);
        } else {
            int count = (int) workRequestJTable.getValueAt(selectedRow, 1);

            if (count < 30 && jCalendarComboBox1.getDate() != null) {
                Date date = jCalendarComboBox1.getDate();
                LocalDate selectedDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                tokenTestWorkRequest.setRequestDate(selectedDate);
                tokenTestWorkRequest.setStatus("created");
                tokenTestWorkRequest.setSender(userAccount);
                tokenTestWorkRequest.setTimeSlot((WorkRequest.TimeSlot) workRequestJTable.getValueAt(selectedRow, 0));
                ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, userAccount, customerOrganization, business, tokenTestWorkRequest, bankEnterprise);
                userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "This timeslot is full.", "Invalid Selection.", JOptionPane.ERROR_MESSAGE);
                return;

            }

        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}