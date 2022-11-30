package Vistas;

import Controlador.Controler;
import Modelo.Planta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Vicente, Jeremy
 */
public class Menu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    Controler ctrl = new Controler();

    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        hub_menu.setBackground(new Color(10, 86, 18, 120));
        this.logOut_btn.setBorder(BorderFactory.createCompoundBorder(this.logOut_btn.getBorder(), BorderFactory.createEmptyBorder(0, 15, 0, 0)));
        setIconImage(getIconImage());
        actualizarContadores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hub_menu = new javax.swing.JPanel();
        bienvenidoNoUsar = new javax.swing.JLabel();
        nombre_menu = new javax.swing.JLabel();
        logOut_btn = new javax.swing.JLabel();
        ingresarPlanta = new javax.swing.JLabel();
        btnListar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modificarPlanta = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        headTextNotUse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(1024, 576, 576, 576));
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        hub_menu.setBackground(new java.awt.Color(0, 0, 0));
        hub_menu.setPreferredSize(new java.awt.Dimension(257, 576));

        bienvenidoNoUsar.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bienvenidoNoUsar.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidoNoUsar.setText("Bienvenido");

        nombre_menu.setBackground(new java.awt.Color(255, 255, 255));
        nombre_menu.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        nombre_menu.setForeground(new java.awt.Color(10, 86, 18));
        nombre_menu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre_menu.setText("Nombre");

        logOut_btn.setBackground(new java.awt.Color(255, 255, 255));
        logOut_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(255, 255, 255));
        logOut_btn.setText("Log Out");
        logOut_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut_btn.setFocusable(false);
        logOut_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut_btnMouseClicked(evt);
            }
        });

        ingresarPlanta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresarPlanta.setForeground(new java.awt.Color(255, 255, 255));
        ingresarPlanta.setText("Ingresar Planta");
        ingresarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarPlantaMouseClicked(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar y Borrar Plantas");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_menu.png"))); // NOI18N

        modificarPlanta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modificarPlanta.setForeground(new java.awt.Color(255, 255, 255));
        modificarPlanta.setText("Modificar Planta");
        modificarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarPlantaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hub_menuLayout = new javax.swing.GroupLayout(hub_menu);
        hub_menu.setLayout(hub_menuLayout);
        hub_menuLayout.setHorizontalGroup(
            hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hub_menuLayout.createSequentialGroup()
                .addGroup(hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bienvenidoNoUsar)
                            .addGroup(hub_menuLayout.createSequentialGroup()
                                .addComponent(nombre_menu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ingresarPlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(modificarPlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hub_menuLayout.setVerticalGroup(
            hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hub_menuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenidoNoUsar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_menu)
                    .addComponent(jLabel5))
                .addGap(72, 72, 72)
                .addComponent(ingresarPlanta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarPlanta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(logOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        count3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count3.setForeground(new java.awt.Color(10, 86, 18));
        count3.setText("Planta 3");

        count1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count1.setForeground(new java.awt.Color(10, 86, 18));
        count1.setText("Planta 1");

        count2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count2.setForeground(new java.awt.Color(10, 86, 18));
        count2.setText("Planta 2");

        headTextNotUse.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        headTextNotUse.setForeground(new java.awt.Color(10, 86, 18));
        headTextNotUse.setText("Top 3 tipos de plantas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hub_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(headTextNotUse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(count1)
                        .addGap(72, 72, 72)
                        .addComponent(count2)
                        .addGap(59, 59, 59)
                        .addComponent(count3)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hub_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(headTextNotUse)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Main main = new Main();
    Ingresar ing = new Ingresar();
    Listar lis = new Listar();
    Editar edit = new Editar();

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/icon_aplication.png"));
        return retValue;
    }
    private void logOut_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_btnMouseClicked
        main.setVisible(true);
        this.dispose();
        ing.dispose();
        lis.dispose();
        edit.dispose();
    }//GEN-LAST:event_logOut_btnMouseClicked

    private void ingresarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarPlantaMouseClicked
        ing.setVisible(true);
        actualizarContadores();
    }//GEN-LAST:event_ingresarPlantaMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        lis.setVisible(true);
        actualizarContadores();
    }//GEN-LAST:event_btnListarMouseClicked

    private void modificarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPlantaMouseClicked
        edit.setVisible(true);
        actualizarContadores();
    }//GEN-LAST:event_modificarPlantaMouseClicked

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

    public void actualizarContadores() {
        try {
            for (Planta p : ctrl.plantaPopular()) {
                System.out.println(p.getCantidad());
            }
            count1.setText(ctrl.plantaPopular().get(0).getCantidad() + " " + ctrl.plantaPopular().get(0).getNombre_clasi());
            count2.setText(ctrl.plantaPopular().get(1).getCantidad() + " " + ctrl.plantaPopular().get(1).getNombre_clasi());
            count3.setText(ctrl.plantaPopular().get(2).getCantidad() + " " + ctrl.plantaPopular().get(2).getNombre_clasi());
        } catch (Exception e) {
            count1.setText("");
            count2.setText("Aun no hay plantas populares");
            count3.setText("");

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoNoUsar;
    private javax.swing.JLabel btnListar;
    protected javax.swing.JLabel count1;
    protected javax.swing.JLabel count2;
    protected javax.swing.JLabel count3;
    private javax.swing.JLabel headTextNotUse;
    private javax.swing.JPanel hub_menu;
    private javax.swing.JLabel ingresarPlanta;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logOut_btn;
    private javax.swing.JLabel modificarPlanta;
    protected javax.swing.JLabel nombre_menu;
    // End of variables declaration//GEN-END:variables
}
