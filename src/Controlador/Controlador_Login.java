package Controlador;

import Modelo.Estudiantes_Modelo;
import Modelo.Metodos_login;
import Vista.Admin;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADSI
 */
public class Controlador_Login implements ActionListener{

    Metodos_login mte = new Metodos_login();
    Estudiantes_Modelo mode = new Estudiantes_Modelo();
    Login log = new Login();
    private MouseListener l;

    public Controlador_Login(Login log, Admin admin) {
        this.log = log;
        this.mte = mte;
        this.mode = mode;
        this.log.Btn_Login.addActionListener(this);
    }

  

    public void log() {
        String pass = new String(log.Password_user.getPassword());
        mode.setid_Estudiante(Long.parseLong(log.Txt_username.getText()));
        mode.setContraseña(pass);
        int r = mte.log(mode);
        if (r == 1) {
            System.out.println(mode.getid_Estudiante());
            System.out.println(mode.getContraseña());

        } else {
            JOptionPane.showMessageDialog(log, "Error, intente de nuevo");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == log.Btn_Login) {
            log();
        }

    }

}
