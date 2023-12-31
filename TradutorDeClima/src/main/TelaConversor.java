/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author lara
 */
public class TelaConversor extends javax.swing.JFrame {

    /**
     * Creates new form TelaConversor
     */
    public TelaConversor() {
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

        btngrpOpcoes = new javax.swing.ButtonGroup();
        sldTemp = new javax.swing.JSlider();
        rdbtnFahrenheit = new javax.swing.JRadioButton();
        rdbtnCelcius = new javax.swing.JRadioButton();
        lblTempSelected = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblSnow = new javax.swing.JLabel();
        lblSun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(java.awt.Color.white);

        sldTemp.setMaximum(200);
        sldTemp.setPaintLabels(true);
        sldTemp.setValue(0);
        sldTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldTempStateChanged(evt);
            }
        });

        btngrpOpcoes.add(rdbtnFahrenheit);
        rdbtnFahrenheit.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnFahrenheit.setText("Fahreinheit");

        btngrpOpcoes.add(rdbtnCelcius);
        rdbtnCelcius.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnCelcius.setText("Celcius");

        lblTempSelected.setForeground(new java.awt.Color(0, 0, 0));
        lblTempSelected.setText("0");

        btnConvert.setForeground(new java.awt.Color(0, 0, 0));
        btnConvert.setText("Converter");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblResult.setForeground(new java.awt.Color(0, 0, 0));
        lblResult.setText("Resultado:");

        lblSnow.setIcon(new javax.swing.ImageIcon("/home/lara/Downloads/2995007_cloud_snow_weather_winter_icon.png")); // NOI18N

        lblSun.setIcon(new javax.swing.ImageIcon("/home/lara/Downloads/2995005_sun_sunny_yellow_weather_beach_icon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSnow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSun)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblResult)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sldTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTempSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(rdbtnFahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtnCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempSelected)
                    .addComponent(sldTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbtnCelcius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbtnFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblSnow, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSun, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldTempStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldTempStateChanged
        lblTempSelected.setText(sldTemp.getValue() + "");
    }//GEN-LAST:event_sldTempStateChanged

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
       Conversor operacao = new Conversor();
       double result;
        if(rdbtnCelcius.isSelected()){
           result = operacao.convert(2, sldTemp.getValue());
           lblResult.setText("Resultado: " + result + " Fº");
       }else
            if(rdbtnFahrenheit.isSelected()){
                result = operacao.convert(1, sldTemp.getValue());
                lblResult.setText("Resultado: " + result + " Cº");
            }
            else{
                lblResult.setText("ERRO");
            }
    }//GEN-LAST:event_btnConvertActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup btngrpOpcoes;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblSnow;
    private javax.swing.JLabel lblSun;
    private javax.swing.JLabel lblTempSelected;
    private javax.swing.JRadioButton rdbtnCelcius;
    private javax.swing.JRadioButton rdbtnFahrenheit;
    private javax.swing.JSlider sldTemp;
    // End of variables declaration//GEN-END:variables
}
