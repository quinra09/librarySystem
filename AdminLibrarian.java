package advancelibrarysystem;


	public class AdminLibrarian extends javax.swing.JFrame {

	    /**
	     * Creates new form AdminLibrarian
	     */
	    public AdminLibrarian() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setText("Library Management System");

	        jButton1.setText("Admin");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("Librarian");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(121, 121, 121)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jButton1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jButton2))
	                    .addComponent(jLabel1))
	                .addContainerGap(128, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(55, 55, 55)
	                .addComponent(jLabel1)
	                .addGap(33, 33, 33)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton2))
	                .addContainerGap(62, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        AdminLogin frameAdmin = new AdminLogin();
	        frameAdmin.setVisible(true);
	        dispose();
	    }                                      

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        LibraryLogin frameLibrarian = new LibraryLogin();
	        frameLibrarian.setVisible(true);
	        dispose();
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
	            java.util.logging.Logger.getLogger(AdminLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(AdminLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(AdminLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(AdminLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new AdminLibrarian().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    // End of variables declaration                   
	}


