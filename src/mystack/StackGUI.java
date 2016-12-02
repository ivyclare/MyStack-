/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivoline-Clarisse
 */
public class StackGUI extends JFrame {

     // Variables declaration 
    private JButton setSizeButton;
    private JButton pushButton;
    private JButton popButton;
    private JButton emptyButton;
    private JButton topButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    
    // End of variables 
    
     MyStack stack;
    DefaultTableModel model;
    int size=0;
    /**
     * Creates new form StackGUI
     */
    public StackGUI() {
        initComponents();
        myInitComponents();
    }

     private void myInitComponents() {
        
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        setSizeButton = new JButton();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        pushButton = new JButton();
        popButton = new JButton();
        jLabel2 = new JLabel();
        emptyButton = new JButton();
        topButton = new JButton();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        jTable1.setModel(new DefaultTableModel(
        new Object [][] {
            
        },
        new String [] {
            "Stack"
        }
        ));
        jScrollPane1.setViewportView(jTable1);
        
        setSizeButton.setText("Create");
        setSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        
        pushButton.setText("Push");
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PushButtonActionPerform(evt);
            }
        });
        
        popButton.setText("Pop");
        popButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopButtonActionPerform(evt);
            }
        });
        
              
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addContainerGap(330, Short.MAX_VALUE))
        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(popButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))               
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        .addComponent(jTextField2))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
        .addComponent(setSizeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(pushButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))     
        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addComponent(jLabel1)
        .addGap(4, 4, 4)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(setSizeButton)
        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addComponent(pushButton))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(popButton)
        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        .addGap(0, 189, Short.MAX_VALUE))
        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addContainerGap())
        );
        
        pack();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Empty");
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(63, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(67, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Top");
        jButton2.setPreferredSize(new java.awt.Dimension(67, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     //Create 
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int p=0;
        
            p = Integer.parseInt(jTextField1.getText());
            if(p!=0 && p<100){
                size=p;
                stack = MyStack.create(p);
                model = new DefaultTableModel();
                model.addColumn("Stack                    Size: " +p);
                for(int i=0;i<=p;i++){
                    model.addRow(new Object[]{ ""});
                }
                jTable1.setModel(model);
            }else{
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Please enter a valid Size");
        }
    }
    
    
           
    //Push Button Action
    private void PushButtonActionPerform(java.awt.event.ActionEvent evt) {
        if(!stack.isFull()){
            int val = Integer.parseInt(jTextField2.getText());
            System.out.println("The value is "+val);
            stack.push(val);
            jTextField2.setText("");
           // refresh(stack);  
            for(int i=stack.index, j=0;i>=0;i--,j++){            
                System.out.println("Stack Value to push is "+stack.stackArray[i]);       
                jTable1.getModel().setValueAt(stack.stackArray[i], j, 0);
            }                
            jLabel2.setText("");
        }else{
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Stack is Full, Cannot Push");  
        }
    }
    
    
    //Pop Button Action
    private void PopButtonActionPerform(java.awt.event.ActionEvent evt) {
        if(!stack.isEmpty()){
            int val = stack.pop();
            jLabel2.setText("popped :  "+val);
           // refresh(stack);      
            clearTable(jTable1);
             for(int i=stack.index, j=0;i>=0;i--,j++){            
                System.out.println("Stack Value to push is "+stack.stackArray[i]);       
                jTable1.getModel().setValueAt(stack.stackArray[i], j, 0);
        } 
        }else{
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Stack is Empty, Cannot Pop");
        }
        
    }
    
   
    
    //Emptying the array
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!stack.isEmpty()){
            stack.empty();
            clearTable(jTable1);
        }else{
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Stack is Empty");  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Getting Value at the top
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(!stack.isEmpty()){
        int val = stack.top();       
         System.out.println("The Top here is "+val);
        jLabel1.setText("The value at the top is "+val);
       }else{
           jLabel1.setForeground(Color.red);
            jLabel1.setText("Stack is Empty, Cannot value at the top");
       }
    }//GEN-LAST:event_jButton2ActionPerformed
     
     public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++)
           for(int j = 0; j < table.getColumnCount(); j++) {
               table.setValueAt("", i, j);
           }
   }
    
      
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
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
