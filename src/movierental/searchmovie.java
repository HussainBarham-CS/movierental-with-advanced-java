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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class searchmovie extends javax.swing.JFrame {

    /**
     * Creates new form searchmovie
     */
    
    
    
    private Connection  con=null;
    private Statement   stat=null;
    ResultSet   rs=null;
    public String name;
    
    
    public searchmovie() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        
        
        
        
        moviecategorysearch.setText("");
        movielengthsearch.setText("");
        movienamesearch.setText("");
        movieratedsearch.setText("");
        
    }
    
    
    Connection getConnection() throws Exception
    {
        String  Driver="sun.jdbc.odbc.JdbcOdbcDriver";
        String URL  = "jdbc:odbc:movies";
        
        Class.forName(Driver);
        
        return  DriverManager.getConnection(URL); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeProgram = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        moviesearch = new javax.swing.JTextField();
        searchrow = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        movienamesearch = new javax.swing.JLabel();
        movielengthsearch = new javax.swing.JLabel();
        movieratedsearch = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        moviecategorysearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search Movie");

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
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Movie Name");

        moviesearch.setBackground(new java.awt.Color(222, 222, 222));
        moviesearch.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        moviesearch.setForeground(new java.awt.Color(18, 30, 49));
        moviesearch.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                moviesearchInputMethodTextChanged(evt);
            }
        });

        searchrow.setBackground(new java.awt.Color(248, 148, 6));
        searchrow.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        searchrow.setForeground(new java.awt.Color(0, 0, 0));
        searchrow.setText("Search");
        searchrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchrowMouseClicked(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 102, 255));
        home.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(0, 0, 0));
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Movie Name");

        movienamesearch.setForeground(new java.awt.Color(255, 0, 51));
        movienamesearch.setText("jLabel4");

        movielengthsearch.setForeground(new java.awt.Color(255, 0, 51));
        movielengthsearch.setText("jLabel4");

        movieratedsearch.setForeground(new java.awt.Color(255, 0, 51));
        movieratedsearch.setText("jLabel4");

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rated");

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Length");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Category");

        moviecategorysearch.setForeground(new java.awt.Color(255, 0, 51));
        moviecategorysearch.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(moviesearch))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(searchrow)
                            .addGap(30, 30, 30)
                            .addComponent(home))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel2))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(moviecategorysearch, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieratedsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movienamesearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movielengthsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(movienamesearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(moviesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 57, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchrow)
                            .addComponent(home))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movielengthsearch)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieratedsearch)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(moviecategorysearch))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void moviesearchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_moviesearchInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_moviesearchInputMethodTextChanged

    private void searchrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchrowMouseClicked

        try {
            int check=0;

            con=getConnection();
            stat=con.createStatement();
            rs=stat.executeQuery("select * from movie");
            if(moviesearch.getText().length()>0)
            {
                while(rs.next())
                {
                    String x=rs.getString("name");
                    String y=moviesearch.getText();

                    if(x.equals(y))
                    {
                        
                        jLabel3.setVisible(true);
                        jLabel7.setVisible(true);
                        jLabel8.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                        
                        moviecategorysearch.setText(rs.getString("category"));
                        movielengthsearch.setText(rs.getString("length"));
                        movienamesearch.setText(y);
                        movieratedsearch.setText(rs.getString("rated"));
        
        
        
                        check=1;
                    }
                }

            }
            
            else{
                movienamesearch.setText("enter name");
            }

            if(check==0)
            {
                movienamesearch.setText("ERROR:NAME IS NOT FOUND");

            }

            

        } catch (SQLException ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchrowMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            mainPage mainPage = new mainPage();
            setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(addmovie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(searchmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchmovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeProgram;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel min;
    private javax.swing.JLabel moviecategorysearch;
    private javax.swing.JLabel movielengthsearch;
    private javax.swing.JLabel movienamesearch;
    private javax.swing.JLabel movieratedsearch;
    private javax.swing.JTextField moviesearch;
    private javax.swing.JButton searchrow;
    // End of variables declaration//GEN-END:variables
}
