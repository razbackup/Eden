package Vistas;

import Vistas.Main.FondoPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Vicente
 */
public class Menu extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        hub_menu.setBackground(new Color(10,86,18,120));
        this.logOut_btn.setBorder(BorderFactory.createCompoundBorder(this.logOut_btn.getBorder(), BorderFactory.createEmptyBorder(0, 15, 0, 0)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hub_menu = new javax.swing.JPanel();
        bienvenidoNoUsar = new javax.swing.JLabel();
        nombre_menu = new javax.swing.JLabel();
        logOut_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(1024, 576, 576, 576));
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOut_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOut_btnMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Planta");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listar Plantas");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar Planta");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Borrar planta");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon.png"))); // NOI18N

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
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hub_menuLayout.setVerticalGroup(
            hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hub_menuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenidoNoUsar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(hub_menuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(nombre_menu)))
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(logOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hub_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 764, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hub_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOut_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_btnMouseClicked
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOut_btnMouseClicked

    private void logOut_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_btnMouseEntered
        this.logOut_btn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_logOut_btnMouseEntered

    private void logOut_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_btnMouseExited
        this.logOut_btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_logOut_btnMouseExited
  
    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagen/576.png")).getImage(); // Designamos la ruta
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); // La posicion
            setOpaque(false);
            super.paint(g);
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoNoUsar;
    private javax.swing.JPanel hub_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logOut_btn;
    protected javax.swing.JLabel nombre_menu;
    // End of variables declaration//GEN-END:variables
}
