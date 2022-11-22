// background no tocar,es solo el back de label no cumple ninguna funcion mas
package Vistas;

import Controlador.Validacion;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import Controlador.Controler;
import Modelo.Usuario;
import Controlador.Alerts;

/**
 *
 * @author Vicente.
 */
public class Main extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); // Creamos el fondo
    Validacion val = new Validacion();
    Controler login = new Controler();
    public Main() {
        this.setContentPane(fondo);
        initComponents();
        setIconImage(getIconImage());
        alertPanel.setVisible(false);
        alertText.setBorder(BorderFactory.createCompoundBorder(this.alertText.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        userText.setBorder(BorderFactory.createCompoundBorder(this.userText.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        passwordText.setBorder(BorderFactory.createCompoundBorder(this.userText.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 5)));
        Image icon = new ImageIcon(this.getClass().getResource("/imagen/icon.png")).getImage();
        this.icon.setIcon(new ImageIcon(icon));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        headName_noUse = new javax.swing.JLabel();
        headPassword_noUse = new javax.swing.JLabel();
        welcome_noUse = new javax.swing.JLabel();
        welcome_noUse1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        alertPanel = new javax.swing.JPanel();
        alertText = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(1024, 576, 576, 576));
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        userText.setForeground(new java.awt.Color(51, 51, 51));
        userText.setBorder(null);
        userText.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 258, 204, 36));

        passwordText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passwordText.setAutoscrolls(false);
        passwordText.setBorder(null);
        passwordText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 334, 204, 36));

        headName_noUse.setBackground(new java.awt.Color(255, 255, 255));
        headName_noUse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        headName_noUse.setForeground(new java.awt.Color(255, 255, 255));
        headName_noUse.setText("Nombre");
        getContentPane().add(headName_noUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 234, -1, -1));

        headPassword_noUse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        headPassword_noUse.setForeground(new java.awt.Color(255, 255, 255));
        headPassword_noUse.setText("Contraseña");
        getContentPane().add(headPassword_noUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 312, -1, -1));

        welcome_noUse.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        welcome_noUse.setForeground(new java.awt.Color(255, 255, 255));
        welcome_noUse.setText("Bienvenido a");
        getContentPane().add(welcome_noUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 118, 200, -1));

        welcome_noUse1.setBackground(new java.awt.Color(255, 255, 255));
        welcome_noUse1.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        welcome_noUse1.setForeground(new java.awt.Color(10, 86, 18));
        welcome_noUse1.setText("Eden");
        getContentPane().add(welcome_noUse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 158, -1, -1));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 100, 60));

        ingresar.setBackground(new java.awt.Color(10, 86, 18));
        ingresar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setBorder(null);
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setMaximumSize(new java.awt.Dimension(74, 31));
        ingresar.setMinimumSize(new java.awt.Dimension(74, 31));
        ingresar.setPreferredSize(new java.awt.Dimension(74, 31));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 384, 113, -1));

        alertPanel.setBackground(new java.awt.Color(126, 2, 2));
        alertPanel.setName(""); // NOI18N
        alertPanel.setLayout(new java.awt.BorderLayout());

        alertText.setBackground(new java.awt.Color(255, 255, 255));
        alertText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        alertText.setForeground(new java.awt.Color(255, 255, 255));
        alertText.setText("Entrando como");
        alertText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertPanel.add(alertText, java.awt.BorderLayout.CENTER);
        alertText.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(alertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/icon_aplication.png"));
        return retValue;
    }
    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        Usuario user = new Usuario(this.userText.getText().toLowerCase(), this.passwordText.getText());
        if (val.validName(user.getNombre().toLowerCase())) {
            System.out.println(true);
            if (login.login(user)) {
                Menu openMenu = new Menu(); // Abre menu
                openMenu.nombre_menu.setText(toCapitalize(user.getNombre()) + ".");
                openMenu.setVisible(true);
                this.setVisible(false);
            }
            new Alerts("Error, Puede que usuario no exista").red(this.alertPanel, this.alertText);
        } else {
            System.out.println(false);
            new Alerts("Warning, Puede que haya un campo en blanco").yellow(this.alertPanel, this.alertText);
        }
    }//GEN-LAST:event_ingresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertPanel;
    private javax.swing.JLabel alertText;
    private javax.swing.JLabel headName_noUse;
    private javax.swing.JLabel headPassword_noUse;
    private javax.swing.JLabel icon;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordText;
    protected javax.swing.JTextField userText;
    private javax.swing.JLabel welcome_noUse;
    private javax.swing.JLabel welcome_noUse1;
    // End of variables declaration//GEN-END:variables

    // Clase interna con la cual agregamos un background con imagen al JFrame
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagen/576.png")).getImage(); // Designamos la ruta
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); // La posicion
            setOpaque(false);
            super.paint(g);
        }
    }

    public void setColor(JButton btn) {
        btn.setBackground(new Color(10, 0, 0, 100)); // Hover color BLACK
    }

    public void resetColor(JButton btn) {
        btn.setBackground(new Color(10, 86, 18)); // Hover color GREEN
    }

    private String toCapitalize(String texto) {
        String first = texto.substring(0, 1).toUpperCase();
        return first + texto.substring(1);

    }
}
