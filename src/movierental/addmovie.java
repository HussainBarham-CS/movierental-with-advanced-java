/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hussein A Barham
 */
public class addmovie extends javax.swing.JFrame {

    /**
     * Creates new form addmovie
     */
    private Connection  con=null;
    private Statement   stat=null;
    ResultSet   rs=null;
    public String name;
    public String date;
    public String length;
    public float rate;
    public String category;
    
    
    
    
    
    
    
    public addmovie() {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
        errorname.setVisible(false);
        informationloss.setText("");
        
        
        
        
        
        
        
        
        
    }
    
    
    
    Connection getConnection() throws Exception
    {
        String  Driver="sun.jdbc.odbc.JdbcOdbcDriver";
        String URL  = "jdbc:odbc:movies";
        
        Class.forName(Driver);
        
        return  DriverManager.getConnection(URL); 
    }
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeProgram = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        moviename = new javax.swing.JTextField();
        movielength = new javax.swing.JTextField();
        moviedatereleased = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        movierated = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        addrow = new javax.swing.JButton();
        categoryname = new javax.swing.JComboBox<>();
        errorname = new javax.swing.JLabel();
        informationloss = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add Movie");

        closeProgram.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        closeProgram.setForeground(new java.awt.Color(255, 0, 0));
        closeProgram.setText("X");
        closeProgram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramMouseClicked(evt);
            }
        });

        min.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setText("~");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min)
                .addGap(18, 18, 18)
                .addComponent(closeProgram)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Movie Name");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Length");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data Released");

        moviename.setBackground(new java.awt.Color(222, 222, 222));
        moviename.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        moviename.setForeground(new java.awt.Color(18, 30, 49));
        moviename.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                movienameInputMethodTextChanged(evt);
            }
        });

        movielength.setBackground(new java.awt.Color(222, 222, 222));
        movielength.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        movielength.setForeground(new java.awt.Color(18, 30, 49));

        moviedatereleased.setBackground(new java.awt.Color(222, 222, 222));
        moviedatereleased.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        moviedatereleased.setForeground(new java.awt.Color(18, 30, 49));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Category");

        movierated.setBackground(new java.awt.Color(222, 222, 222));
        movierated.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        movierated.setForeground(new java.awt.Color(18, 30, 49));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rated");

        home.setBackground(new java.awt.Color(0, 102, 255));
        home.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(0, 0, 0));
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        addrow.setBackground(new java.awt.Color(248, 148, 6));
        addrow.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        addrow.setForeground(new java.awt.Color(0, 0, 0));
        addrow.setText("ADD");
        addrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addrowMouseClicked(evt);
            }
        });

        categoryname.setBackground(new java.awt.Color(255, 255, 255));
        categoryname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        categoryname.setForeground(new java.awt.Color(0, 0, 0));
        categoryname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL", "Action", "Family", "Drama", "Horror", "Documentary", "Si Fl", "Romance", "MyStery", "etc....." }));
        categoryname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorynameActionPerformed(evt);
            }
        });

        errorname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        errorname.setForeground(new java.awt.Color(255, 51, 51));
        errorname.setText("ERROR : NAME IS ALREDY EXIST");

        informationloss.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        informationloss.setForeground(new java.awt.Color(255, 51, 51));
        informationloss.setText("PLEASE ENTER ALL INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movierated)
                            .addComponent(movielength)
                            .addComponent(moviename)
                            .addComponent(moviedatereleased)
                            .addComponent(categoryname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addrow)
                        .addGap(45, 45, 45)
                        .addComponent(home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorname)
                            .addComponent(informationloss))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(moviedatereleased, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movielength, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movierated, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(categoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addrow)
                            .addComponent(home)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(errorname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(informationloss)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMouseClicked
        JOptionPane.showMessageDialog(null, "Thanks for using my program :)");  
        System.exit(0);
          

    }//GEN-LAST:event_closeProgramMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void categorynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorynameActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        category = (String)cb.getSelectedItem();

    }//GEN-LAST:event_categorynameActionPerformed

    private void addrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addrowMouseClicked

        try {
            int check=0;

            
            con=getConnection();
            stat=con.createStatement();
            rs=stat.executeQuery("select * from movie");
            if(moviename.getText().length()>0)
            {
                while(rs.next())
                {
                    String x=rs.getString("name");
                    String y=moviename.getText();
                   
                    if(x.equals(y))
                    {
                        check=1;
                    }
                }
                
                
            
               
            }
            
            
            
            if(check==0)
            {
                if(moviename.getText().length()>0&&moviedatereleased.getText().length()>0&&movielength.getText().length()>0&&movierated.getText().length()>0)
                {
                    
                    name=moviename.getText();
                    date=moviedatereleased.getText();
                    length=movielength.getText();
                    rate=Float.parseFloat(movierated.getText());
                    
            
                    informationloss.setText("");
            
            
                    stat.executeUpdate("INSERT INTO movie VALUES ('" + name + "','" + date + "','" + length + "',"+rate+",'"+category+"',null);");
                    moviename.setText("");
                    moviedatereleased.setText("");
                    movielength.setText("");
                    movierated.setText("");
                    
                    errorname.setVisible(false);
                    
                }
                
                else
                {
                    informationloss.setText("PLEASE ENTER ALL INFORMATION");
                }
                
            }
            
            else if(check==1)
            {
                errorname.setVisible(true);
                moviename.setText("");
                moviedatereleased.setText("");
                movielength.setText("");
                movierated.setText("");
                
                
                informationloss.setText("");
                
                
              
            }
            
            
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }//GEN-LAST:event_addrowMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            mainPage mainPage = new mainPage();
            setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_homeMouseClicked

    private void movienameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_movienameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_movienameInputMethodTextChanged

    

    
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
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addmovie().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addrow;
    private javax.swing.JComboBox<String> categoryname;
    private javax.swing.JLabel closeProgram;
    private javax.swing.JLabel errorname;
    private javax.swing.JButton home;
    private javax.swing.JLabel informationloss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel min;
    private javax.swing.JTextField moviedatereleased;
    private javax.swing.JTextField movielength;
    private javax.swing.JTextField moviename;
    private javax.swing.JTextField movierated;
    // End of variables declaration//GEN-END:variables
}
