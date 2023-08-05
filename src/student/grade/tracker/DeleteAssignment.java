/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.grade.tracker;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane; 
import java.time.*;  
import java.util.*; 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
/**
 *
 * @author morayyajain
 */
public class DeleteAssignment extends javax.swing.JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/studentgrade";
	static final String USER = "root";
	static final String PASS = "root@123";
	/**
	 * Creates new form Assignment
	 */
	public DeleteAssignment() {
		initComponents();
		jLabel5.setVisible(false);
                jLabel11.setVisible(false);
                jLabel6.setVisible(false);
                jLabel12.setVisible(false);
                jLabel7.setVisible(false);
                jLabel13.setVisible(false);
		jButton3.setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jTextField1 = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jLabel2.setText("Subject");

                jLabel3.setText("Deadline");

                jLabel4.setText("Submitted?");

                jButton1.setText("Back");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Exit");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton4.setText("Search");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
                jButton3.setText("Delete");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel5.setText("Date Submitted");

                jLabel6.setText("Max Marks");

                jLabel7.setText("Marks Obtained");

                jLabel1.setText("Assignment Code");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 131, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel7)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(70, 70, 70)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(121, 121, 121))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(35, 35, 35)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addContainerGap(72, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel11))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(50, 50, 50))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                setVisible(false);
                new Homepage().setVisible(true);
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                String code=jTextField1.getText();
                if (code.length() <=0){
                        JOptionPane.showMessageDialog(null,"Please enter an assignment code");
                }
                else{
                        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        ) {
                                String sq = "select * from Assignment where code='"+code+"'";
                                ResultSet rs1= stm.executeQuery(sq);
                                if (!rs1.first()){
                                        JOptionPane.showMessageDialog(null,"Assignment code does not exist");
                                }
                                else{

                                        jButton3.setVisible(true);
                                        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                                Statement stmt = conn.createStatement();
                                        ) {
                                                String sql = "select code, subject, deadline, submitted, datesubmitted, maxmarks, obtained, progress from Assignment where code='"+code+"'";
                                                ResultSet rs= stmt.executeQuery(sql);
                                                while(rs.next()){

                                                        String submitted=rs.getString("submitted");
                                                        jLabel10.setText(submitted);
                                                        String ss=jLabel10.getText();

                                                        if(ss.equals("Yes")){
								
								try{
                                                                        jLabel5.setVisible(true);
                                                                        jLabel11.setVisible(true);
                                                                        jLabel6.setVisible(true);
                                                                        jLabel12.setVisible(true);
                                                                        jLabel7.setVisible(true);
                                                                        jLabel13.setVisible(true);
                                                                        String deadline=rs.getString("deadline");
                                                                        String datesubmitted=rs.getString("datesubmitted");
                                                                        jLabel9.setText(deadline);
                                                                        jLabel11.setText(datesubmitted);
                                                                        String subject=rs.getString("subject");
                                                                        String maxmarks=rs.getString("maxmarks");
                                                                        String obtained=rs.getString("obtained");
                                                                        jLabel12.setText(maxmarks);
                                                                        jLabel13.setText(obtained);
                                                                        jLabel8.setText(subject);
									
								}
								catch(Exception e){
								}

                                                        }
                                                        else{
								try{
									
								
                                                                jLabel5.setVisible(false);
                                                                jLabel11.setVisible(false);
                                                                jLabel6.setVisible(false);
                                                                jLabel12.setVisible(false);
                                                                jLabel7.setVisible(false);
								jLabel13.setVisible(false);
                                                                String subject=rs.getString("subject");
                                                                String deadline=rs.getString("deadline");
                                                                jLabel8.setText(subject);
                                                                jButton3.setVisible(true);
                                                                jLabel9.setText(deadline);
								
								}
								catch(Exception e){
								}

                                                        }

                                                }

                                        }
                                        catch (SQLException e) {
                                                e.printStackTrace();
                                        }

                                }
                        }
                        catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String code=jTextField1.getText();
                String submitted=jLabel10.getText();
                try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);                                                      
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			)    {
                                                                              
			String sq = "delete from Assignment where code='"+code+"'";
                                                                                stm.executeUpdate(sq);

                                                                                jTextField1.setText("");
                                                                                jLabel8.setText("");
                                                                                jLabel9.setText("");
                                                                                jLabel11.setText("");
                                                                                jLabel12.setText("");
                                                                                jLabel13.setText("");
                                                                                jLabel10.setText("");

                                                                                jLabel5.setVisible(false);
                                                                                jLabel11.setVisible(false);
                                                                                jLabel6.setVisible(false);
                                                                                jLabel12.setVisible(false);
                                                                                jLabel7.setVisible(false);
                                                                                jLabel13.setVisible(false);
                                                                                jButton3.setVisible(false);
                                                                                JOptionPane.showMessageDialog(null,"Successfully Deleted");

                                                                        }
                                                                        catch (SQLException e) {
                                                                                e.printStackTrace();
                                                                        }
        }//GEN-LAST:event_jButton3ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DeleteAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DeleteAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DeleteAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DeleteAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DeleteAssignment().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
