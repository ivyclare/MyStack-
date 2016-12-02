package mystack;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivoline-Clarisse
 */
public class MyStackTestGUI extends JFrame {
    
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
    //Creates new form Runner   
    public MyStackTestGUI() {
        initComponents();
    }
    
    /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
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
        
        setSizeButton.setText("setSize");
        setSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        pushButton.setText("Push");
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        popButton.setText("Pop");
        popButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        emptyButton.setText("Empty");
        emptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton4ActionPerformed(evt);
            }
        });
        
        topButton.setText("Top");
        topButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
    
    //Size Button Action
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int p=0;
        try {
            p = Integer.parseInt(jTextField1.getText());
            if(p!=0 && p<100){
                size=p;
                stack = new MyStack(p);
                model = new DefaultTableModel();
                model.addColumn("Stack                    Size: " +p);
                for(int i=0;i<=p;i++){
                    model.addRow(new Object[]{ ""});
                }
                jTable1.setModel(model);
            }
            } catch (NumberFormatException numberFormatException) {
            jLabel1.setText("Please enter a valid Size");
        }
    }
    
    //Pop Button Action
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        stack.pop();
        jLabel2.setText("popped :  "+stack.pop());
        refresh(stack);        
    }
    
    private void refresh(MyStack stack){
      //  stack.empty();
        int p = Integer.parseInt(jTextField1.getText());
        size=p;
        int[] q = stack.update();
        for(int i =0;i<=size;i++){
            jTable1.setValueAt(" ", i, 0);            
        }        
        for(int i =size;i<=0;i++){
            jTable1.setValueAt(q[i], i, 0);
        }
    }
    
    //Push Button Action
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int val = Integer.parseInt(jTextField2.getText());
        System.out.println("The value is "+val);
        stack.push(val);
        jTextField2.setText("");
        //refresh();
        for(int i =0;i<size;i++){
            jTable1.getModel().setValueAt(stack.stackArray[i], i, 0);
        }
                
        jLabel2.setText("");
    }
    
    //Empty Button Action
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    //Top Button Action
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("TOP BUTTON CLICKED");
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyStackTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyStackTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyStackTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyStackTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyStackTestGUI().setVisible(true);
            }
        });
    }
    
}