package Vista;

import java.awt.Color;
import Controlador.Controlador_Login;
import Modelo.Metodos_login;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setExtendedState(6);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_black = new javax.swing.JPanel();
        Left_Panel = new javax.swing.JPanel();
        Icon_Sena = new javax.swing.JLabel();
        Edusena = new javax.swing.JLabel();
        Input_panel = new javax.swing.JPanel();
        Lbl_Login = new javax.swing.JLabel();
        Lbl_icon_login = new javax.swing.JLabel();
        Lbl_User1 = new javax.swing.JLabel();
        Txt_username = new javax.swing.JTextField();
        Password_user = new javax.swing.JPasswordField();
        Lbl_Password = new javax.swing.JLabel();
        Btn_Login = new javax.swing.JButton();
        Icon_right = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        Background_black.setBackground(new java.awt.Color(255, 255, 255));

        Left_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Left_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Icon_Sena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sena_Colombia_logo.svg.png"))); // NOI18N

        Edusena.setBackground(new java.awt.Color(255, 103, 25));
        Edusena.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Edusena.setForeground(new java.awt.Color(0, 173, 0));
        Edusena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edusena.setText("EDUSENA");
        Edusena.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Left_PanelLayout = new javax.swing.GroupLayout(Left_Panel);
        Left_Panel.setLayout(Left_PanelLayout);
        Left_PanelLayout.setHorizontalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Icon_Sena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edusena, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        Left_PanelLayout.setVerticalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(Icon_Sena, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(Edusena, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Input_panel.setBackground(new java.awt.Color(255, 255, 255));
        Input_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 0), 1, true));

        Lbl_Login.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Lbl_Login.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Login.setText("Login");

        Lbl_icon_login.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_icon_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbl_icon_login.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_icon_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_icon_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N

        Lbl_User1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_User1.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_User1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_User1.setText("Usuario");

        Txt_username.setBackground(new java.awt.Color(235, 235, 235));
        Txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_username.setForeground(new java.awt.Color(102, 102, 102));
        Txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_usernameFocusLost(evt);
            }
        });
        Txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_usernameMousePressed(evt);
            }
        });
        Txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_usernameActionPerformed(evt);
            }
        });

        Password_user.setBackground(new java.awt.Color(235, 235, 235));
        Password_user.setForeground(new java.awt.Color(153, 153, 153));
        Password_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Password_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Password_userFocusLost(evt);
            }
        });
        Password_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Password_userMousePressed(evt);
            }
        });
        Password_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_userActionPerformed(evt);
            }
        });
        Password_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Password_userKeyPressed(evt);
            }
        });

        Lbl_Password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_Password.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Password.setText("Contraseña");

        Btn_Login.setBackground(new java.awt.Color(0, 173, 0));
        Btn_Login.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Login.setText("Ingresar");
        Btn_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Btn_Login.setBorderPainted(false);
        Btn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Btn_LoginFocusLost(evt);
            }
        });
        Btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Input_panelLayout = new javax.swing.GroupLayout(Input_panel);
        Input_panel.setLayout(Input_panelLayout);
        Input_panelLayout.setHorizontalGroup(
            Input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Input_panelLayout.createSequentialGroup()
                .addGroup(Input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Lbl_icon_login, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Lbl_User1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Input_panelLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(Btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );
        Input_panelLayout.setVerticalGroup(
            Input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Input_panelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_icon_login, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_User1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(Btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        Icon_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sena_Colombia_logo.svg - copia.png"))); // NOI18N

        javax.swing.GroupLayout Background_blackLayout = new javax.swing.GroupLayout(Background_black);
        Background_black.setLayout(Background_blackLayout);
        Background_blackLayout.setHorizontalGroup(
            Background_blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_blackLayout.createSequentialGroup()
                .addComponent(Left_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(Icon_right)
                .addGap(346, 346, 346))
        );
        Background_blackLayout.setVerticalGroup(
            Background_blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Background_blackLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(Background_blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon_right)
                    .addComponent(Input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(Background_black, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_usernameActionPerformed


    }//GEN-LAST:event_Txt_usernameActionPerformed

    private void Password_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_userActionPerformed


    }//GEN-LAST:event_Password_userActionPerformed

    private void Txt_usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_usernameMousePressed
        //Ingresar texto en Txt_username

        if (Txt_username.getText().equals("Ingrese nombre de usuario")) { //Si el nombre de usuario está vacío, se llenará con un mensaje en gris.

            Txt_username.setText("");
            Txt_username.setForeground(Color.black);//Al hacer clic, se despeja el campo y cambia el color de la fuente a negro
        }

        if (String.valueOf(Password_user.getPassword()).isEmpty()) {
            Password_user.setText("**********");
            Password_user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_usernameMousePressed

    private void Password_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_userMousePressed
        //Ingresar texto en password_user

        if (String.valueOf(Password_user.getPassword()).equals("**********")) {
            Password_user.setText("");
            Password_user.setForeground(Color.black);
        }

        if (Txt_username.getText().isEmpty()) {
            Txt_username.setText("Ingrese nombre de usuario");
            Txt_username.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Password_userMousePressed

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed


    }//GEN-LAST:event_Btn_LoginActionPerformed

    private void Txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_usernameFocusLost
        // Ingresar texto en Txt_username

        if (Txt_username.getText().isEmpty()) { //Si el nombre de usuario está vacío, se llenará con un mensaje en gris.

            Txt_username.setText("Ingrese nombre de usuario");
            Txt_username.setForeground(Color.gray);//Al hacer clic, se despeja el campo y cambia el color de la fuente a negro
        }

        if (String.valueOf(Password_user.getPassword()).equals("**********")) {
            Password_user.setText("");
            Password_user.setForeground(Color.black);
        }
    }//GEN-LAST:event_Txt_usernameFocusLost

    private void Password_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_userFocusLost
        // Ingresar texto en password_user

        if (String.valueOf(Password_user.getPassword()).isEmpty()) {
            Password_user.setText("**********");
            Password_user.setForeground(Color.gray);
        }

        if (Txt_username.getText().equals("")) {
            Txt_username.setText("");
            Txt_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_Password_userFocusLost

    private void Btn_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Btn_LoginFocusLost

        //cuando el tabulador se encuentre en el boton y regrese nuevamente al nombre de usuario se borrara
        if (Txt_username.getText().equals("Ingrese nombre de usuario")) {
            Txt_username.setText("");
            Txt_username.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Btn_LoginFocusLost

    private void Password_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password_userKeyPressed
/*
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
        */
    }//GEN-LAST:event_Password_userKeyPressed

    private void Txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_usernameFocusGained

        if (Txt_username.getText().isEmpty()) {
            Txt_username.setText("");
            Txt_username.setForeground(Color.black);
        }

    }//GEN-LAST:event_Txt_usernameFocusGained

    private void Password_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_userFocusGained

        if (String.valueOf(Password_user.getPassword()).isEmpty()) {
            Password_user.setText("");
            Password_user.setForeground(Color.black);
        }
    }//GEN-LAST:event_Password_userFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        Login usuarios = new Login();
        Admin admin = new Admin();
        Controlador_Login c = new Controlador_Login(usuarios, admin);
        usuarios.setVisible(true);
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_black;
    public javax.swing.JButton Btn_Login;
    private javax.swing.JLabel Edusena;
    private javax.swing.JLabel Icon_Sena;
    private javax.swing.JLabel Icon_right;
    private javax.swing.JPanel Input_panel;
    private javax.swing.JLabel Lbl_Login;
    private javax.swing.JLabel Lbl_Password;
    private javax.swing.JLabel Lbl_User1;
    private javax.swing.JLabel Lbl_icon_login;
    private javax.swing.JPanel Left_Panel;
    public javax.swing.JPasswordField Password_user;
    public javax.swing.JTextField Txt_username;
    // End of variables declaration//GEN-END:variables
}
