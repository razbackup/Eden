package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Controlador.Controler;
import Modelo.Planta;
import Controlador.Alerts;
import Controlador.Validacion;
import Controlador.Controler;
import Controlador.Stop;

public class Ingresar extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    public Ingresar() {
        this.setContentPane(fondo);
        initComponents();
        alertPanel.setVisible(false);
        this.panel.setBackground(new Color(10, 86, 18, 120));
        this.nombreText.setBorder(BorderFactory.createCompoundBorder(this.nombreText.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        this.precioText.setBorder(BorderFactory.createCompoundBorder(this.precioText.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        this.descText.setBorder(BorderFactory.createCompoundBorder(this.descText.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        this.stock.setBorder(BorderFactory.createCompoundBorder(this.stock.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        titleNotUse = new javax.swing.JLabel();
        nameNotUse = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        descNotUse = new javax.swing.JLabel();
        desc_wrapper = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        clasifiacion_wrapper = new javax.swing.JScrollPane();
        clasificacion = new javax.swing.JList<>();
        clasificacionNotUse = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        precioNotUse1 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        precioText = new javax.swing.JTextField();
        stockNotUse = new javax.swing.JLabel();
        alertPanel = new javax.swing.JPanel();
        alertText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setMaximumSize(new java.awt.Dimension(787, 482));
        panel.setMinimumSize(new java.awt.Dimension(787, 482));
        panel.setPreferredSize(new java.awt.Dimension(787, 482));

        titleNotUse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleNotUse.setForeground(new java.awt.Color(255, 255, 255));
        titleNotUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_menu.png"))); // NOI18N
        titleNotUse.setText("Ingresar plantas");
        titleNotUse.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nameNotUse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameNotUse.setForeground(new java.awt.Color(255, 255, 255));
        nameNotUse.setText("Nombre");

        nombreText.setBackground(new java.awt.Color(255, 255, 255));
        nombreText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        nombreText.setForeground(new java.awt.Color(51, 51, 51));
        nombreText.setBorder(null);
        nombreText.setMargin(new java.awt.Insets(10, 10, 10, 10));

        descNotUse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descNotUse.setForeground(new java.awt.Color(255, 255, 255));
        descNotUse.setText("Descripcion");

        descText.setBackground(new java.awt.Color(255, 255, 255));
        descText.setColumns(20);
        descText.setForeground(new java.awt.Color(0, 0, 0));
        descText.setRows(5);
        descText.setBorder(null);
        desc_wrapper.setViewportView(descText);

        clasificacion.setBackground(new java.awt.Color(255, 255, 255));
        clasificacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        clasificacion.setForeground(new java.awt.Color(0, 0, 0));
        clasificacion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Herbáceas", "Matorrales", "Arbustos", "Árboles", "Anuales", "Bianuales", "Perennes", "Criptógamas", "Fanerógamas", "Trepadoras", "Acuáticas", "Suculentas", "Aromáticas", "Bulbosas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        clasifiacion_wrapper.setViewportView(clasificacion);

        clasificacionNotUse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clasificacionNotUse.setForeground(new java.awt.Color(255, 255, 255));
        clasificacionNotUse.setText("Clasificacion");

        salir.setBackground(new java.awt.Color(86, 9, 9));
        salir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setMaximumSize(new java.awt.Dimension(74, 31));
        salir.setMinimumSize(new java.awt.Dimension(74, 31));
        salir.setPreferredSize(new java.awt.Dimension(74, 31));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        enviar.setBackground(new java.awt.Color(10, 86, 18));
        enviar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Enviar");
        enviar.setBorder(null);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setMaximumSize(new java.awt.Dimension(74, 31));
        enviar.setMinimumSize(new java.awt.Dimension(74, 31));
        enviar.setPreferredSize(new java.awt.Dimension(74, 31));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        precioNotUse1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precioNotUse1.setForeground(new java.awt.Color(255, 255, 255));
        precioNotUse1.setText("Precio");

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        stock.setForeground(new java.awt.Color(51, 51, 51));
        stock.setBorder(null);
        stock.setMargin(new java.awt.Insets(10, 10, 10, 10));

        precioText.setBackground(new java.awt.Color(255, 255, 255));
        precioText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        precioText.setForeground(new java.awt.Color(51, 51, 51));
        precioText.setBorder(null);
        precioText.setMargin(new java.awt.Insets(10, 10, 10, 10));

        stockNotUse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockNotUse.setForeground(new java.awt.Color(255, 255, 255));
        stockNotUse.setText("Stock");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleNotUse)
                .addGap(281, 281, 281))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(desc_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioNotUse1)
                                    .addComponent(nameNotUse)
                                    .addComponent(descNotUse)
                                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stockNotUse)))
                            .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clasificacionNotUse)
                            .addComponent(clasifiacion_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleNotUse)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(precioNotUse1)
                        .addGap(1, 1, 1)
                        .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(nameNotUse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockNotUse)
                                .addGap(3, 3, 3)))
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 67, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(clasificacionNotUse)
                        .addGap(3, 3, 3)
                        .addComponent(clasifiacion_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(descNotUse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(desc_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 56, -1, -1));

        alertPanel.setBackground(new java.awt.Color(126, 2, 2));
        alertPanel.setName(""); // NOI18N
        alertPanel.setLayout(new java.awt.BorderLayout());

        alertText.setBackground(new java.awt.Color(255, 255, 255));
        alertText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        alertText.setForeground(new java.awt.Color(255, 255, 255));
        alertText.setText("Entrando como");
        alertText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertPanel.add(alertText, java.awt.BorderLayout.CENTER);

        getContentPane().add(alertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed
    // Terminar de extraer los datos de los campos para enviar la soli
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        Planta planta = new Planta();
        Validacion valid = new Validacion();
        Controler ingresar = new Controler();
        try {
            if (this.clasificacion.getSelectedIndex() >= 0 && valid.validNamePlanta(this.nombreText.getText())
                    && valid.validPrecio(Integer.parseInt(this.precioText.getText()))
                    && valid.validStock(Integer.parseInt(this.stock.getText()))
                    && valid.validDesc(this.descText.getText())) {
                planta.setNombre(this.nombreText.getText());
                planta.setPrecio(Integer.parseInt(this.precioText.getText()));
                planta.setStock(Integer.parseInt(this.stock.getText()));
                planta.setDescripcion(this.descText.getText());
                planta.setClasificacion(this.clasificacion.getSelectedIndex());
                if (ingresar.ingresarPlantas(planta)){
                    new Alerts("Correcto, Datos ingresados correctamente.").green(this.alertPanel, this.alertText);
                } else {
                    new Alerts("Error, Datos no congruentes.").red(this.alertPanel, this.alertText);
                }
            } else {
                new Alerts("Warning, Porfavor Rellene todos los campos o tienes un valor impreciso.").yellow(this.alertPanel, this.alertText);
            }
        } catch (Exception ex) {
            new Alerts("Error, Hay un campo de texto con un valor incorrecto.").red(this.alertPanel, this.alertText);
        }
        new Stop(2000){
            public void run(){
                new Alerts().offAlert(alertPanel, alertText);
            }
        };
    }//GEN-LAST:event_enviarActionPerformed

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
    private javax.swing.JScrollPane clasifiacion_wrapper;
    private javax.swing.JList<String> clasificacion;
    private javax.swing.JLabel clasificacionNotUse;
    private javax.swing.JLabel descNotUse;
    private javax.swing.JTextArea descText;
    private javax.swing.JScrollPane desc_wrapper;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel nameNotUse;
    private javax.swing.JTextField nombreText;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel precioNotUse1;
    private javax.swing.JTextField precioText;
    private javax.swing.JButton salir;
    private javax.swing.JTextField stock;
    private javax.swing.JLabel stockNotUse;
    private javax.swing.JLabel titleNotUse;
    // End of variables declaration//GEN-END:variables
}
