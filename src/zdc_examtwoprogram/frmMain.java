/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdc_examtwoprogram;

/**
 *
 * @author Interact
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form ExamTwoUI
     */
    public frmMain() {
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

        mnuMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFileNew = new javax.swing.JMenuItem();
        mnuFileOpen = new javax.swing.JMenuItem();
        mnuFileClose = new javax.swing.JMenuItem();
        mnuFileSave = new javax.swing.JMenuItem();
        mnuFileSaveAs = new javax.swing.JMenuItem();
        mnuTools = new javax.swing.JMenu();
        mnuToolsSearch = new javax.swing.JMenuItem();
        mnuToolsRecursiveExample = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuFile.setText("File");

        mnuFileNew.setText("New");
        mnuFile.add(mnuFileNew);

        mnuFileOpen.setText("Open");
        mnuFile.add(mnuFileOpen);

        mnuFileClose.setText("Close");
        mnuFile.add(mnuFileClose);

        mnuFileSave.setText("Save");
        mnuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileSave);

        mnuFileSaveAs.setText("Save As");
        mnuFile.add(mnuFileSaveAs);

        mnuMain.add(mnuFile);

        mnuTools.setText("Tools");

        mnuToolsSearch.setText("Search");
        mnuTools.add(mnuToolsSearch);

        mnuToolsRecursiveExample.setText("Recursive Example");
        mnuTools.add(mnuToolsRecursiveExample);

        mnuMain.add(mnuTools);

        setJMenuBar(mnuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFileSaveActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileClose;
    private javax.swing.JMenuItem mnuFileNew;
    private javax.swing.JMenuItem mnuFileOpen;
    private javax.swing.JMenuItem mnuFileSave;
    private javax.swing.JMenuItem mnuFileSaveAs;
    private javax.swing.JMenuBar mnuMain;
    private javax.swing.JMenu mnuTools;
    private javax.swing.JMenuItem mnuToolsRecursiveExample;
    private javax.swing.JMenuItem mnuToolsSearch;
    // End of variables declaration//GEN-END:variables
}