/*
    Relógio digital simplezão
    Vou tentar comentar ele ao maximo blz?
 */
package relógio;

import java.awt.Color; //lib para dar cor á janela

//libs de tempo
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Henrique
 */

//Classe main com extensão Jframe (janela)
public class main extends javax.swing.JFrame {
    
    //função main
    public main() {
        initComponents();
        
        //Isso serve para deixar a janela no meio
        this.setLocationRelativeTo(null);
        
        //titulo da janela
        this.setTitle("Relógio digital em java");
        
        //cor da janela
        this.getContentPane().setBackground(Color.black);
        
        //creditos
        info.setText("IFAL 912-2017");
        
        
        int delay = 1000;        // delay de 1 seg.
        int interval = 1000;     // intervalo de 1 minuto
        
        //novo Timer
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run() {
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                SimpleDateFormat dataz = new SimpleDateFormat("dd/MM/yyyy");
                
                //Exibição dos valores contidos nos timers!
                //Atualizado a cada 1 seg
                horas.setText(dateFormat.format(new Date()));
                data.setText(dataz.format(new Date()));
                
                
            }
        }, delay, interval);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horas = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        horas.setFont(new java.awt.Font("OCR A Std", 0, 48)); // NOI18N
        horas.setForeground(new java.awt.Color(51, 255, 0));
        horas.setText("loading");

        data.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        data.setForeground(new java.awt.Color(51, 255, 0));
        data.setText("loading");

        info.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(51, 255, 0));
        info.setText("IFAL 912-2017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(horas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(data))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(info)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(horas)
                .addGap(18, 18, 18)
                .addComponent(data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(info))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JLabel horas;
    private javax.swing.JLabel info;
    // End of variables declaration//GEN-END:variables
}
