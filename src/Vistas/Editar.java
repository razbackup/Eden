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
        this.panel.setBackground(new Color(10, 86, 18, 120));
        alertPanel.setVisible(false);
        txtName.setBorder(BorderFactory.createCompoundBorder(this.txtName.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        txtPrecio.setBorder(BorderFactory.createCompoundBorder(this.txtPrecio.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        txtStock.setBorder(BorderFactory.createCompoundBorder(this.txtStock.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        descText.setBorder(BorderFactory.createCompoundBorder(this.descText.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        textFiltro.setBorder(BorderFactory.createCompoundBorder(this.textFiltro.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertPanel = new javax.swing.JPanel();
        alertText = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
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
        descText = new javax.swing.JTextArea();

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
        alertPanel.add(alertText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        getContentPane().add(alertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        panel.setBackground(new java.awt.Color(0, 153, 0));
        panel.setMaximumSize(new java.awt.Dimension(897, 435));
        panel.setMinimumSize(new java.awt.Dimension(897, 435));

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

        titleNotUse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleNotUse.setForeground(new java.awt.Color(255, 255, 255));
        titleNotUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_menu.png"))); // NOI18N
        titleNotUse.setText("Editar Planta");
        titleNotUse.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        textFiltro.setBackground(new java.awt.Color(255, 255, 255));
        textFiltro.setForeground(new java.awt.Color(0, 0, 0));
        textFiltro.setBorder(null);

        buscarTextNotUse.setBackground(new java.awt.Color(0, 0, 0));
        buscarTextNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscarTextNotUse.setForeground(new java.awt.Color(255, 255, 255));
        buscarTextNotUse.setText("Buscar por ID:");

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        txtStock.setBorder(null);

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(null);

        nombreDontUse.setBackground(new java.awt.Color(0, 0, 0));
        nombreDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombreDontUse.setForeground(new java.awt.Color(255, 255, 255));
        nombreDontUse.setText("Nombre");

        stockDontUse.setBackground(new java.awt.Color(0, 0, 0));
        stockDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        stockDontUse.setForeground(new java.awt.Color(255, 255, 255));
        stockDontUse.setText("Stock");

        descripcionDontUse.setBackground(new java.awt.Color(0, 0, 0));
        descripcionDontUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        descripcionDontUse.setForeground(new java.awt.Color(255, 255, 255));
        descripcionDontUse.setText("Descripcion");

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

        precioNotUse.setBackground(new java.awt.Color(0, 0, 0));
        precioNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        precioNotUse.setForeground(new java.awt.Color(255, 255, 255));
        precioNotUse.setText("Precio");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(null);

        descText.setBackground(new java.awt.Color(255, 255, 255));
        descText.setColumns(20);
        descText.setForeground(new java.awt.Color(0, 0, 0));
        descText.setRows(5);
        descText.setBorder(null);
        descText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descTextKeyTyped(evt);
            }
        });
        desc_wrapper.setViewportView(descText);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(buscarTextNotUse)
                        .addGap(140, 140, 140)
                        .addComponent(nombreDontUse))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(textFiltro)
                                .addGap(140, 140, 140)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionDontUse)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stockDontUse)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioNotUse)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleNotUse)
                .addGap(347, 347, 347))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleNotUse)
                .addGap(55, 55, 55)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarTextNotUse)
                            .addComponent(nombreDontUse))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(textFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(stockDontUse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(descripcionDontUse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(precioNotUse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desc_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 94, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Planta planta = ctrl.buscarPorID(Integer.parseInt(textFiltro.getText()));
        if(planta.getNombre() == null){
            new Alerts("La planta buscada no existe").yellow(alertPanel, alertText);
        } else {
            this.txtName.setText("");
            this.txtPrecio.setText("");
            this.txtStock.setText("");
            this.descText.setText("");
            // Limpiar e ingresar
            this.txtName.setText(planta.getNombre());
            this.txtPrecio.setText(String.valueOf(planta.getPrecio()));
            this.descText.setText(planta.getDescripcion());
            this.txtStock.setText(String.valueOf(planta.getStock()));
            
        }
            new Stop(2000){
            public void run(){
                new Alerts().offAlert(alertPanel, alertText);
            }
        };
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void descTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descTextKeyTyped

    }//GEN-LAST:event_descTextKeyTyped
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
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel buscarTextNotUse;
    private javax.swing.JTextArea descText;
    private javax.swing.JScrollPane desc_wrapper;
    private javax.swing.JLabel descripcionDontUse;
    private javax.swing.JLabel nombreDontUse;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel precioNotUse;
    private javax.swing.JLabel stockDontUse;
    private javax.swing.JTextField textFiltro;
    private javax.swing.JLabel titleNotUse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
