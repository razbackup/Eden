/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.Alerts;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Controlador.Controler;
import Controlador.Stop;
import Modelo.Planta;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

/**
 *
 * @author Vicente, Jeremy
 */
public class Editar extends javax.swing.JFrame {

    Controler ctrl = new Controler();
    FondoPanel fondo = new FondoPanel();

    public Editar() {
        this.setContentPane(fondo);
        initComponents();
        setIconImage(getIconImage());
        this.panel.setBackground(new Color(10, 86, 18, 120));
        alertPanel.setVisible(false);
        txtName.setBorder(BorderFactory.createCompoundBorder(this.txtName.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        txtPrecio.setBorder(BorderFactory.createCompoundBorder(this.txtPrecio.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        txtStock.setBorder(BorderFactory.createCompoundBorder(this.txtStock.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        txtDesc.setBorder(BorderFactory.createCompoundBorder(this.txtDesc.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        textFiltro.setBorder(BorderFactory.createCompoundBorder(this.textFiltro.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertPanel = new javax.swing.JPanel();
        alertText = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        titleNotUse = new javax.swing.JLabel();
        textFiltro = new javax.swing.JTextField();
        buscarTextNotUse = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        nombreDontUse = new javax.swing.JLabel();
        stockDontUse = new javax.swing.JLabel();
        descripcionDontUse = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        precioNotUse = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        desc_wrapper = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alertPanel.setBackground(new java.awt.Color(126, 2, 2));
        alertPanel.setName(""); // NOI18N
        alertPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alertText.setBackground(new java.awt.Color(255, 255, 255));
        alertText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        alertText.setForeground(new java.awt.Color(255, 255, 255));
        alertText.setText("Entrando como");
        alertText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertPanel.add(alertText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        getContentPane().add(alertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.setBackground(new java.awt.Color(0, 153, 0));
        panel.setMaximumSize(new java.awt.Dimension(902, 463));
        panel.setMinimumSize(new java.awt.Dimension(902, 463));
        panel.setPreferredSize(new java.awt.Dimension(902, 463));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(10, 86, 18));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 406, 73, 37));

        titleNotUse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleNotUse.setForeground(new java.awt.Color(255, 255, 255));
        titleNotUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_menu.png"))); // NOI18N
        titleNotUse.setText("Editar Planta");
        titleNotUse.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel.add(titleNotUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 18, -1, -1));

        textFiltro.setBackground(new java.awt.Color(255, 255, 255));
        textFiltro.setForeground(new java.awt.Color(0, 0, 0));
        textFiltro.setBorder(null);
        panel.add(textFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 129, 107, 32));

        buscarTextNotUse.setBackground(new java.awt.Color(0, 0, 0));
        buscarTextNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscarTextNotUse.setForeground(new java.awt.Color(255, 255, 255));
        buscarTextNotUse.setText("Buscar por ID:");
        panel.add(buscarTextNotUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 105, -1, -1));

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        txtStock.setBorder(null);
        panel.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 197, 102, 29));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(null);
        panel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 129, 172, 32));

        nombreDontUse.setBackground(new java.awt.Color(0, 0, 0));
        nombreDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombreDontUse.setForeground(new java.awt.Color(255, 255, 255));
        nombreDontUse.setText("Nombre");
        panel.add(nombreDontUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 105, -1, -1));

        stockDontUse.setBackground(new java.awt.Color(0, 0, 0));
        stockDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        stockDontUse.setForeground(new java.awt.Color(255, 255, 255));
        stockDontUse.setText("Stock");
        panel.add(stockDontUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 173, -1, -1));

        descripcionDontUse.setBackground(new java.awt.Color(0, 0, 0));
        descripcionDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        descripcionDontUse.setForeground(new java.awt.Color(255, 255, 255));
        descripcionDontUse.setText("Descripcion");
        panel.add(descripcionDontUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 238, -1, -1));

        btnSalir.setBackground(new java.awt.Color(86, 0, 0));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        panel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 388, 50, 37));

        precioNotUse.setBackground(new java.awt.Color(0, 0, 0));
        precioNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        precioNotUse.setForeground(new java.awt.Color(255, 255, 255));
        precioNotUse.setText("Precio");
        panel.add(precioNotUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 173, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(null);
        panel.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 197, 95, 29));

        desc_wrapper.setMaximumSize(new java.awt.Dimension(540, 1630));
        desc_wrapper.setMinimumSize(new java.awt.Dimension(540, 163));
        desc_wrapper.setName(""); // NOI18N
        desc_wrapper.setPreferredSize(new java.awt.Dimension(540, 163));

        txtDesc.setBackground(new java.awt.Color(255, 255, 255));
        txtDesc.setColumns(20);
        txtDesc.setForeground(new java.awt.Color(0, 0, 0));
        txtDesc.setRows(5);
        txtDesc.setAutoscrolls(false);
        txtDesc.setBorder(null);
        desc_wrapper.setViewportView(txtDesc);

        panel.add(desc_wrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 262, -1, -1));
        desc_wrapper.getAccessibleContext().setAccessibleName("");

        btnBuscar.setBackground(new java.awt.Color(10, 86, 18));
        btnBuscar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        panel.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 388, 73, 37));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 68, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/icon_aplication.png"));
        return retValue;
    }
    Planta planta = new Planta();
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        try {
            planta.setNombre(txtName.getText());
            planta.setDescripcion(txtDesc.getText());
            planta.setPrecio(Integer.parseInt(txtPrecio.getText()));
            planta.setStock(Integer.parseInt(txtStock.getText()));
            if (ctrl.modificarPlanta(planta)) {
                textFiltro.setText("");
                planta.kill_id_Planta(planta);
                new Alerts("Planta editada con exito").green(alertPanel, alertText);
            } else {
                new Alerts("Warning, Porfavor vuelve a consultar una planta").yellow(alertPanel, alertText);
            }
        } catch (Exception e) {
            new Alerts("Warning, Porfavor consulta una planta").yellow(alertPanel, alertText);
        }
        new Stop(2000) {
            public void run() {
                new Alerts().offAlert(alertPanel, alertText);
            }
        };
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        planta.kill_id_Planta(planta); // Se borran los datos de si mismo, para que no quede guardado despues de la ejecucion
        txtName.setText("");
        txtDesc.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        textFiltro.setText("");
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        try {
            Planta p = ctrl.buscarPorID(Integer.parseInt(textFiltro.getText()));
            if (p.getNombre() == null) {
                new Alerts("Warning ,La planta buscada no existe").yellow(alertPanel, alertText);
            } else {
                this.txtName.setText("");
                this.txtPrecio.setText("");
                this.txtStock.setText("");
                this.txtDesc.setText("");
                // Limpiar e ingresar
                this.txtName.setText(p.getNombre());
                this.txtPrecio.setText(String.valueOf(p.getPrecio()));
                this.txtDesc.setText(p.getDescripcion());
                this.txtStock.setText(String.valueOf(p.getStock()));
                try {
                    planta.setId_producto(Integer.parseInt(textFiltro.getText()));
                } catch (Exception e) {
                    new Alerts("Error, El dato ingresado en ID es invalido!").red(alertPanel, alertText);
                }
            }
        } catch (Exception e) {
            new Alerts("Warning, Selecciona un dato").yellow(alertPanel, alertText);
        }
        new Stop(2000) {
            public void run() {
                new Alerts().offAlert(alertPanel, alertText);
            }
        };
    }//GEN-LAST:event_btnBuscarMouseClicked
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertPanel;
    private javax.swing.JLabel alertText;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel buscarTextNotUse;
    private javax.swing.JScrollPane desc_wrapper;
    private javax.swing.JLabel descripcionDontUse;
    private javax.swing.JLabel nombreDontUse;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel precioNotUse;
    private javax.swing.JLabel stockDontUse;
    private javax.swing.JTextField textFiltro;
    private javax.swing.JLabel titleNotUse;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
