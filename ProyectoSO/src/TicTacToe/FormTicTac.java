package TicTacToe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FormTicTac extends javax.swing.JFrame {

    String turno = "X";
    String nextJuego = "O";
    JButton lbs[] = new JButton[9];
    int vic[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}
    };

    public FormTicTac() {
        initComponents();
        this.setLocationRelativeTo(null);

        lbs[0] = Celda1;
        lbs[1] = Celda2;
        lbs[2] = Celda3;
        lbs[3] = Celda4;
        lbs[4] = Celda5;
        lbs[5] = Celda6;
        lbs[6] = Celda7;
        lbs[7] = Celda8;
        lbs[8] = Celda9;

        turnoAc.setText(turno);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Celda1 = new javax.swing.JButton();
        Celda2 = new javax.swing.JButton();
        Celda4 = new javax.swing.JButton();
        Celda3 = new javax.swing.JButton();
        Celda5 = new javax.swing.JButton();
        Celda6 = new javax.swing.JButton();
        Celda7 = new javax.swing.JButton();
        Celda8 = new javax.swing.JButton();
        Celda9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        turnoAc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(478, 458));

        Celda1.setBackground(new java.awt.Color(255, 255, 255));
        Celda1.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda1.setForeground(new java.awt.Color(0, 0, 0));
        Celda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda1ActionPerformed(evt);
            }
        });

        Celda2.setBackground(new java.awt.Color(255, 255, 255));
        Celda2.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda2.setForeground(new java.awt.Color(0, 0, 0));
        Celda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda2ActionPerformed(evt);
            }
        });

        Celda4.setBackground(new java.awt.Color(255, 255, 255));
        Celda4.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda4.setForeground(new java.awt.Color(0, 0, 0));
        Celda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda4ActionPerformed(evt);
            }
        });

        Celda3.setBackground(new java.awt.Color(255, 255, 255));
        Celda3.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda3.setForeground(new java.awt.Color(0, 0, 0));
        Celda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda3ActionPerformed(evt);
            }
        });

        Celda5.setBackground(new java.awt.Color(255, 255, 255));
        Celda5.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda5.setForeground(new java.awt.Color(0, 0, 0));
        Celda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda5ActionPerformed(evt);
            }
        });

        Celda6.setBackground(new java.awt.Color(255, 255, 255));
        Celda6.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda6.setForeground(new java.awt.Color(0, 0, 0));
        Celda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda6ActionPerformed(evt);
            }
        });

        Celda7.setBackground(new java.awt.Color(255, 255, 255));
        Celda7.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda7.setForeground(new java.awt.Color(0, 0, 0));
        Celda7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda7ActionPerformed(evt);
            }
        });

        Celda8.setBackground(new java.awt.Color(255, 255, 255));
        Celda8.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda8.setForeground(new java.awt.Color(0, 0, 0));
        Celda8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda8ActionPerformed(evt);
            }
        });

        Celda9.setBackground(new java.awt.Color(255, 255, 255));
        Celda9.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        Celda9.setForeground(new java.awt.Color(0, 0, 0));
        Celda9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Celda9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Celda1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Celda4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Celda7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celda9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Celda1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Celda4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Celda7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celda9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Reiniciar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Turno Actual:");

        turnoAc.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        turnoAc.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(turnoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Celda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda1ActionPerformed
        precionar(1);
    }//GEN-LAST:event_Celda1ActionPerformed

    private void Celda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda2ActionPerformed
        precionar(2);
    }//GEN-LAST:event_Celda2ActionPerformed

    private void Celda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda3ActionPerformed
        precionar(3);
    }//GEN-LAST:event_Celda3ActionPerformed

    private void Celda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda4ActionPerformed
        precionar(4);
    }//GEN-LAST:event_Celda4ActionPerformed

    private void Celda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda5ActionPerformed
        precionar(5);
    }//GEN-LAST:event_Celda5ActionPerformed

    private void Celda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda6ActionPerformed
        precionar(6);
    }//GEN-LAST:event_Celda6ActionPerformed

    private void Celda7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda7ActionPerformed
        precionar(7);
    }//GEN-LAST:event_Celda7ActionPerformed

    private void Celda8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda8ActionPerformed
        precionar(8);
    }//GEN-LAST:event_Celda8ActionPerformed

    private void Celda9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Celda9ActionPerformed
        precionar(9);
    }//GEN-LAST:event_Celda9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setText("");
             lbs[i].setBackground(Color.white);
        }
        turno=nextJuego;
        turnoAc.setText(turno);
        if(nextJuego.equals("O")){
            nextJuego="X";
        }else{
            nextJuego="O";
        }
            
        
    }//GEN-LAST:event_jButton10ActionPerformed

    public void precionar(int celda) {
        if (lbs[celda - 1].getText().equals("")) {
            lbs[celda - 1].setText(turno);
            cambiarTurno();
            turnoAc.setText(turno);
            ganador();

        }
    }

    public void cambiarTurno() {

        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }

    }

    public void ganador() {
        for (int i = 0; i < vic.length; i++) {
            if (lbs[vic[i][0] - 1].getText().equals("X")
                    && (lbs[vic[i][1] - 1].getText().equals("X"))
                    && (lbs[vic[i][2] - 1].getText().equals("X"))) {
                System.out.println("gano X");
                
                lbs[vic[i][0] - 1].setBackground(Color.green);
                lbs[vic[i][1] - 1].setBackground(Color.green);
                lbs[vic[i][2] - 1].setBackground(Color.green);

            }
            if (lbs[vic[i][0] - 1].getText().equals("O")
                    && (lbs[vic[i][1] - 1].getText().equals("O"))
                    && (lbs[vic[i][2] - 1].getText().equals("O"))) {
                System.out.println("gano O");
                
                lbs[vic[i][0] - 1].setBackground(Color.green);
                lbs[vic[i][1] - 1].setBackground(Color.green);
                lbs[vic[i][2] - 1].setBackground(Color.green);

            }
        }
    }

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
            java.util.logging.Logger.getLogger(FormTicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTicTac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Celda1;
    private javax.swing.JButton Celda2;
    private javax.swing.JButton Celda3;
    private javax.swing.JButton Celda4;
    private javax.swing.JButton Celda5;
    private javax.swing.JButton Celda6;
    private javax.swing.JButton Celda7;
    private javax.swing.JButton Celda8;
    private javax.swing.JButton Celda9;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel turnoAc;
    // End of variables declaration//GEN-END:variables
}
