/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilvsgood;

/**
 *
 * @author Ledyard
 */
public class EVG extends javax.swing.JFrame {

    private Game game1;
    private Scenario currentSce;
    Scenario gameOver;
 
    /**
     * Creates new form Interface
     */
    public EVG() {
        initComponents();   
        game1 = new Game ();
        gameOver = new Scenario ("Your Game is Over", "Thank You For Playing", "If your score is negative you are evil.\nIf your score is positive you are good", true);
        game1.addScenario(new Scenario ("be nice", "yes", "no", true));
        game1.addScenario(new Scenario ("be evil", "yes", "no", false));
        game1.addScenario(new Scenario ("be kind", "yes", "no", true));
        game1.addScenario(new Scenario ("help someone", "yes", "no", true));
        
        currentSce = game1.getRandomScenario();
        Display(currentSce, game1.getScore());

    }
    
    private void Display (Scenario sce, int sco){
        String Que = sce.getScenario();
        String aOne = sce.getOptionOne();
        String aTwo = sce.getOptionTwo();
        
        questionText.setText(Que);
        scoreText.setText(Integer.toString(sco));
        option1Text.setText(aOne);
        option2Text.setText(aTwo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        questionLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        option1Radio = new javax.swing.JRadioButton();
        option2Radio = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        scoreText = new javax.swing.JTextArea();
        scoreLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        option1Text = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        option2Text = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        questionText = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionLabel.setText("Question");

        submitButton.setText("Subimit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        option1Radio.setText("Option 1");
        option1Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1RadioActionPerformed(evt);
            }
        });

        option2Radio.setText("Option 2");
        option2Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2RadioActionPerformed(evt);
            }
        });

        scoreText.setColumns(20);
        scoreText.setRows(5);
        jScrollPane3.setViewportView(scoreText);

        scoreLabel.setText("Score");

        option1Text.setColumns(20);
        option1Text.setRows(5);
        jScrollPane4.setViewportView(option1Text);

        option2Text.setColumns(20);
        option2Text.setRows(5);
        jScrollPane5.setViewportView(option2Text);

        questionText.setColumns(20);
        questionText.setRows(5);
        jScrollPane6.setViewportView(questionText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(option1Radio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(option2Radio)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel)
                    .addComponent(scoreLabel))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1Radio)
                    .addComponent(option2Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if (!(currentSce.equals(gameOver))){
            
            if(currentSce.oneIsGood() == true && option1Radio.isSelected()){
                game1.addScore(1);
            }
        
            else if(currentSce.oneIsGood() == false && option2Radio.isSelected()){
                game1.addScore(1);
            }
    
            else{
                game1.addScore (-1);
            }
        }
        
        if(game1.getRemainingScenarios() > 0){
            
            option1Radio.setSelected(false);
            option2Radio.setSelected(false);
            
            currentSce = game1.getRandomScenario();
            Display(currentSce, game1.getScore());
        }
        
        else{
            currentSce = gameOver;
            Display(currentSce, game1.getScore());
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void option1RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1RadioActionPerformed
        // TODO add your handling code here:
        if (currentSce.equals(gameOver)){
            option1Radio.setSelected(false);
            option2Radio.setSelected(false);
        }
        else{
            option2Radio.setSelected(false);
        } 
    }//GEN-LAST:event_option1RadioActionPerformed

    private void option2RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2RadioActionPerformed
        // TODO add your handling code here:
        
        if (currentSce.equals(gameOver)){
            option1Radio.setSelected(false);
            option2Radio.setSelected(false);
        }
        
        else{
            option1Radio.setSelected(false);
        }
    }//GEN-LAST:event_option2RadioActionPerformed

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
            java.util.logging.Logger.getLogger(EVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EVG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton option1Radio;
    private javax.swing.JTextArea option1Text;
    private javax.swing.JRadioButton option2Radio;
    private javax.swing.JTextArea option2Text;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextArea questionText;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextArea scoreText;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}