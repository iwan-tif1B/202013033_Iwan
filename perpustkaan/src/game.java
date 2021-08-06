
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class game extends javax.swing.JFrame {

    private String StartGame="x";
    private int xCount=0;
    private int oCount=0;
   
            
    private void game_score(){
        px.setText(String.valueOf(xCount));
        po.setText(String.valueOf(oCount));
        
    }
    private void chose(){
        if(StartGame.equalsIgnoreCase("x")){
            StartGame="O";
        } 
        else {
             StartGame="x";
        }
        
    }
    private void wininggame(){
        String b1=btn1.getText();
        String b2=btn2.getText();
        String b3=btn3.getText();
        
        String b4=btn4.getText();
        String b5=btn5.getText();
        String b6=btn6.getText();
        
        String b7=btn7.getText();
        String b8=btn8.getText();
        String b9=btn9.getText();
        
        //player x coding
        if(b1==("x") && b2==("x") && b3==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
        }
        else if(b4==("x") && b5==("x") && b6==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
        }
         else if(b7==("x") && b8==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
         else if(b1==("x") && b4==("x") && b7==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn7.setBackground(Color.green);
        }
         else if(b2==("x") && b5==("x") && b8==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn2.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn8.setBackground(Color.green);
        }
         else if(b3==("x") && b6==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn3.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
          else if(b1==("x") && b5==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
         else if(b3==("x") && b5==("x") && b7==("x")){
            JOptionPane.showMessageDialog(this, "player x win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            game_score();
            btn3.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn7.setBackground(Color.green);
        }
        
        
        
       //CODING o
       
       if(b1==("O") && b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
        }
        else if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
        }
         else if(b7==("O") && b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
         else if(b1==("O") && b4==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn7.setBackground(Color.green);
        }
         else if(b2==("O") && b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn2.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn8.setBackground(Color.green);
        }
         else if(b3==("O") && b6==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn3.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
          else if(b1==("O") && b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn1.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn9.setBackground(Color.green);
        }
         else if(b3==("O") && b5==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this, "player o win","tic tac toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            game_score();
            btn3.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn7.setBackground(Color.green);
    }}
    /**
     * Creates new form game
     */
    public game() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        apa = new javax.swing.JLabel();
        api = new javax.swing.JLabel();
        po = new javax.swing.JTextField();
        px = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tic Tac Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jLabel3)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        apa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        apa.setForeground(new java.awt.Color(255, 255, 255));
        apa.setText("player x");

        api.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        api.setForeground(new java.awt.Color(255, 255, 255));
        api.setText("player o");

        po.setText("xxxxxxxxxxxxxxxx");

        px.setText("xxxxxxxxxxxxxxxx");

        btnreset.setBackground(new java.awt.Color(204, 255, 255));
        btnreset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(51, 51, 51));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(102, 255, 255));
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apa)
                    .addComponent(api))
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(px, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(btnexit)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apa)
                    .addComponent(px, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(api)
                    .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(btnexit))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setPreferredSize(new java.awt.Dimension(150, 150));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setPreferredSize(new java.awt.Dimension(150, 150));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setPreferredSize(new java.awt.Dimension(150, 150));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setPreferredSize(new java.awt.Dimension(150, 150));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setPreferredSize(new java.awt.Dimension(150, 150));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setPreferredSize(new java.awt.Dimension(150, 150));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setPreferredSize(new java.awt.Dimension(150, 150));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setPreferredSize(new java.awt.Dimension(150, 150));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setPreferredSize(new java.awt.Dimension(150, 150));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
    btn7.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn7.setForeground(Color.blue);
        }else{
             btn7.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
btn5.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn5.setForeground(Color.blue);
        }else{
             btn5.setForeground(Color.red);
        }
        chose();     
        wininggame();
// TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      btn6.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn6.setForeground(Color.blue);
        }else{
             btn6.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
btn4.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn4.setForeground(Color.blue);
        }else{
             btn4.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     btn9.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn9.setForeground(Color.blue);
        }else{
             btn9.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
btn8.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn8.setForeground(Color.blue);
        }else{
             btn8.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
JFrame frame=new JFrame("exit");
if(JOptionPane.showConfirmDialog(frame,"confirm if you want exit",
        "game",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
{
    System.exit(0);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
   btn1.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn1.setForeground(Color.blue);
        }else{
             btn1.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
btn2.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn2.setForeground(Color.blue);
        }else{
             btn2.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      btn3.setText(StartGame);
        if(StartGame.equalsIgnoreCase("x")){
            btn3.setForeground(Color.blue);
        }else{
             btn3.setForeground(Color.red);
        }
        chose();
        wininggame();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
btn1.setText(null);
btn2.setText(null);
btn3.setText(null);

btn4.setText(null);
btn5.setText(null);
btn6.setText(null);

btn7.setText(null);
btn8.setText(null);
btn9.setText(null);


btn1.setBackground(Color.LIGHT_GRAY);
btn2.setBackground(Color.LIGHT_GRAY);
btn3.setBackground(Color.LIGHT_GRAY);

btn4.setBackground(Color.LIGHT_GRAY);
btn5.setBackground(Color.LIGHT_GRAY);
btn6.setBackground(Color.LIGHT_GRAY);

btn7.setBackground(Color.LIGHT_GRAY);
btn8.setBackground(Color.LIGHT_GRAY);
btn9.setBackground(Color.LIGHT_GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
new perpus().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apa;
    private javax.swing.JLabel api;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField po;
    private javax.swing.JTextField px;
    // End of variables declaration//GEN-END:variables
}
