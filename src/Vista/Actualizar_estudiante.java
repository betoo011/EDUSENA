/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aprendiz
 */
public class Actualizar_estudiante extends javax.swing.JPanel {



    public Actualizar_estudiante() {
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

        Container = new javax.swing.JPanel();
        North_panel = new javax.swing.JPanel();
        btn_confirmar = new javax.swing.JButton();
        btn_moficar = new javax.swing.JButton();
        Btn_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Form = new javax.swing.JPanel();
        Lbl_Student = new javax.swing.JLabel();
        Lbl_Document = new javax.swing.JLabel();
        Txt_DocumentStudent = new javax.swing.JTextField();
        Lbl_Name1 = new javax.swing.JLabel();
        Txt_nameStudent = new javax.swing.JTextField();
        Lbl_LastName = new javax.swing.JLabel();
        Txt_LastNameStudent = new javax.swing.JTextField();
        Lbl_Born = new javax.swing.JLabel();
        Lbl_Format = new javax.swing.JLabel();
        Txt_Day_Born = new javax.swing.JTextField();
        sexo = new javax.swing.JLabel();
        btn_M = new javax.swing.JRadioButton();
        btn_F = new javax.swing.JRadioButton();
        Lbl_Direction = new javax.swing.JLabel();
        Txt_Direction = new javax.swing.JTextField();
        Lbl_Telephone = new javax.swing.JLabel();
        Txt_telephone = new javax.swing.JTextField();
        Lbl_Email = new javax.swing.JLabel();
        Txt_email = new javax.swing.JTextField();
        Lbl_password = new javax.swing.JLabel();
        Txt_password = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));

        North_panel.setBackground(new java.awt.Color(0, 173, 0));
        North_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        North_panel.setOpaque(false);

        btn_confirmar.setBackground(new java.awt.Color(0, 173, 0));
        btn_confirmar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmar.setText("Confirmar");
        btn_confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        btn_moficar.setBackground(new java.awt.Color(0, 173, 0));
        btn_moficar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_moficar.setForeground(new java.awt.Color(255, 255, 255));
        btn_moficar.setText("Modificar");
        btn_moficar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_moficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moficarActionPerformed(evt);
            }
        });

        Btn_cancelar.setBackground(new java.awt.Color(0, 173, 0));
        Btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout North_panelLayout = new javax.swing.GroupLayout(North_panel);
        North_panel.setLayout(North_panelLayout);
        North_panelLayout.setHorizontalGroup(
            North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(North_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_moficar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        North_panelLayout.setVerticalGroup(
            North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, North_panelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_moficar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Lbl_Student.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbl_Student.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Student.setText("DATOS PERSONALES");

        Lbl_Document.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Document.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Document.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Document.setText("N. Documento");

        Txt_DocumentStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_DocumentStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Name1.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Name1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Name1.setText("Nombres");

        Txt_nameStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_nameStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_LastName.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_LastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_LastName.setText("Apellidos");

        Txt_LastNameStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_LastNameStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Born.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Born.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Born.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Born.setText("Fecha de Nacimiento");

        Lbl_Format.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        Lbl_Format.setForeground(new java.awt.Color(153, 153, 153));
        Lbl_Format.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Format.setText("Formato: dd/MM/yyyy");

        Txt_Day_Born.setBackground(new java.awt.Color(235, 235, 235));
        Txt_Day_Born.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 173, 0));
        sexo.setText("Sexo");

        btn_M.setText("Masculino");

        btn_F.setText("Femenino");

        Lbl_Direction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Direction.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Direction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Direction.setText("Dirección");

        Txt_Direction.setBackground(new java.awt.Color(235, 235, 235));
        Txt_Direction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Telephone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Telephone.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Telephone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Telephone.setText("Teléfono");

        Txt_telephone.setBackground(new java.awt.Color(235, 235, 235));
        Txt_telephone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Email.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Email.setText("Email");

        Txt_email.setBackground(new java.awt.Color(235, 235, 235));
        Txt_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_password.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_password.setText("Contraseña");

        Txt_password.setBackground(new java.awt.Color(235, 235, 235));
        Txt_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Student)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addComponent(Lbl_Document)
                                .addGap(67, 67, 67)
                                .addComponent(Txt_DocumentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexo)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addComponent(Lbl_Name1)
                                        .addGap(223, 223, 223)
                                        .addComponent(Lbl_LastName)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txt_LastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Format)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addComponent(Lbl_Born)
                                                .addGap(18, 18, 18)
                                                .addComponent(Txt_Day_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addComponent(Lbl_Email)
                                        .addGap(64, 64, 64)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addComponent(btn_M)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_F))
                                            .addComponent(Txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                            .addComponent(Txt_nameStudent)))
                                    .addComponent(Lbl_Telephone))
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(Lbl_Direction)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Lbl_password)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Student, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Document, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DocumentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_nameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_LastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Lbl_Format, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Day_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo)
                    .addComponent(btn_M)
                    .addComponent(btn_F)
                    .addComponent(Lbl_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FormLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Lbl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(North_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(North_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
     JOptionPane.showMessageDialog(this, "Cambios guardados");
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void Btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cancelarActionPerformed

    }//GEN-LAST:event_Btn_cancelarActionPerformed

    private void btn_moficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moficarActionPerformed
        // Modificar

    }//GEN-LAST:event_btn_moficarActionPerformed

    private void Txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_passwordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_cancelar;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Form;
    private javax.swing.JLabel Lbl_Born;
    private javax.swing.JLabel Lbl_Direction;
    private javax.swing.JLabel Lbl_Document;
    private javax.swing.JLabel Lbl_Email;
    private javax.swing.JLabel Lbl_Format;
    private javax.swing.JLabel Lbl_LastName;
    private javax.swing.JLabel Lbl_Name1;
    private javax.swing.JLabel Lbl_Student;
    private javax.swing.JLabel Lbl_Telephone;
    private javax.swing.JLabel Lbl_password;
    private javax.swing.JPanel North_panel;
    public javax.swing.JTextField Txt_Day_Born;
    public javax.swing.JTextField Txt_Direction;
    public javax.swing.JTextField Txt_DocumentStudent;
    public javax.swing.JTextField Txt_LastNameStudent;
    public javax.swing.JTextField Txt_email;
    public javax.swing.JTextField Txt_nameStudent;
    public javax.swing.JTextField Txt_password;
    public javax.swing.JTextField Txt_telephone;
    public javax.swing.JRadioButton btn_F;
    public javax.swing.JRadioButton btn_M;
    public javax.swing.JButton btn_confirmar;
    public javax.swing.JButton btn_moficar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables



}
