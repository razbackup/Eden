package Vistas;

import Controlador.Alerts;
import Controlador.Controler;
import Controlador.Stop;
import Modelo.Planta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vicente, Jeremy
 */
public class Listar extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    Controler sv = new Controler();

    public Listar() {
        this.setContentPane(fondo);
        initComponents();
        alertPanel.setVisible(false);
        this.panel.setBackground(new Color(10, 86, 18, 120));
        setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        tableItems = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        titleNotUse = new javax.swing.JLabel();
        buscarTextNotUse = new javax.swing.JLabel();
        textFiltro = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        eliminarTextNotUse = new javax.swing.JLabel();
        textFiltroElimianar = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        txtContador = new javax.swing.JLabel();
        alertPanel = new javax.swing.JPanel();
        alertText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(1024, 576, 576, 576));
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 576));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 153, 0));
        panel.setMaximumSize(new java.awt.Dimension(902, 463));
        panel.setMinimumSize(new java.awt.Dimension(902, 463));

        tableItems.setBackground(new java.awt.Color(255, 255, 255));
        tableItems.setBorder(null);
        tableItems.setToolTipText("");
        tableItems.setViewportBorder(new javax.swing.border.MatteBorder(null));

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Clasificacion", "Stock", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableItems.setViewportView(itemTable);

        btnActualizar.setBackground(new java.awt.Color(10, 86, 18));
        btnActualizar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        titleNotUse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleNotUse.setForeground(new java.awt.Color(255, 255, 255));
        titleNotUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_menu.png"))); // NOI18N
        titleNotUse.setText("Listar Plantas");
        titleNotUse.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        buscarTextNotUse.setBackground(new java.awt.Color(0, 0, 0));
        buscarTextNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscarTextNotUse.setForeground(new java.awt.Color(255, 255, 255));
        buscarTextNotUse.setText("Buscar por Clasificacion:");

        textFiltro.setBackground(new java.awt.Color(255, 255, 255));
        textFiltro.setForeground(new java.awt.Color(0, 0, 0));

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

        eliminarTextNotUse.setBackground(new java.awt.Color(0, 0, 0));
        eliminarTextNotUse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        eliminarTextNotUse.setForeground(new java.awt.Color(255, 255, 255));
        eliminarTextNotUse.setText("Borrar Planta, ID: ");

        textFiltroElimianar.setBackground(new java.awt.Color(255, 255, 255));
        textFiltroElimianar.setForeground(new java.awt.Color(0, 0, 0));

        btnBorrar.setBackground(new java.awt.Color(10, 86, 18));
        btnBorrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        txtContador.setBackground(new java.awt.Color(0, 0, 0));
        txtContador.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtContador.setForeground(new java.awt.Color(255, 255, 255));
        txtContador.setText("Cantidad de: ");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buscarTextNotUse)
                        .addGap(18, 18, 18)
                        .addComponent(textFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTextNotUse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFiltroElimianar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(titleNotUse)
                            .addGap(90, 90, 90)
                            .addComponent(txtContador)
                            .addGap(43, 43, 43))
                        .addComponent(tableItems, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleNotUse)
                    .addComponent(txtContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableItems, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTextNotUse)
                    .addComponent(textFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarTextNotUse)
                    .addComponent(textFiltroElimianar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 450));

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
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/icon_aplication.png"));
        return retValue;
    }

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        new Alerts("Actualizado!").green(alertPanel, alertText);
        new Stop(2000) {
            public void run() {
                new Alerts().offAlert(alertPanel, alertText);
            }
        };

        String nombre, descripcion, clasificacion;
        int precio, stock, idPlanta;
        DefaultTableModel modelo = (DefaultTableModel) this.itemTable.getModel();
        try {
            clasificacion = this.textFiltro.getText();
        } catch (Exception e) {
            clasificacion = "";
        }
        modelo.setRowCount(0);
        List<Planta> lista;
        lista = sv.listarTodos();
        if (clasificacion.equals("")) {
            lista = sv.listarTodos();
        } else {
            lista = sv.listarPorClasificacion(clasificacion);
        }
        txtContador.setText("Cantidad de: " + String.valueOf(sv.contadorPlantas(clasificacion)) + " plantas");
        for (Planta p : lista) {
            nombre = p.getNombre();
            descripcion = p.getDescripcion();
            clasificacion = p.getNombre_clasi();
            precio = p.getPrecio();
            stock = p.getStock();
            idPlanta = p.getId_producto();
            modelo.addRow(new Object[]{idPlanta, nombre, precio, clasificacion, stock, descripcion});
        }
    }//GEN-LAST:event_btnActualizarMouseClicked


    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        textFiltro.setText("");
        textFiltroElimianar.setText("");
        DefaultTableModel modelo = (DefaultTableModel) this.itemTable.getModel();
        modelo.setRowCount(0);
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        String id_planta = this.textFiltroElimianar.getText();
        Controler sv = new Controler();
        if (sv.borrarPlanta(id_planta)) {
            new Alerts("Elemento Borrado con exito!").green(alertPanel, alertText);
            new Stop(2000) {
                public void run() {
                    new Alerts().offAlert(alertPanel, alertText);
                }
            };
        } else {
            new Alerts("Probablemente el elemento que estas buscando borrar no exista!").red(alertPanel, alertText);
            new Stop(2000) {
                public void run() {
                    new Alerts().offAlert(alertPanel, alertText);
                }
            };

        }
    }//GEN-LAST:event_btnBorrarMouseClicked

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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel buscarTextNotUse;
    private javax.swing.JLabel eliminarTextNotUse;
    private javax.swing.JTable itemTable;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane tableItems;
    private javax.swing.JTextField textFiltro;
    private javax.swing.JTextField textFiltroElimianar;
    private javax.swing.JLabel titleNotUse;
    private javax.swing.JLabel txtContador;
    // End of variables declaration//GEN-END:variables
}
