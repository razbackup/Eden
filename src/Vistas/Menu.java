package Vistas;

import java.awt.Color;

/**
 *
 * @author Vicente
 */
public class Menu extends Main {
    FondoPanel fondo = new FondoPanel();
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        hub_menu.setBackground(new Color(10,86,18,147));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hub_menu = new javax.swing.JPanel();
        bienvenidoNoUsar = new javax.swing.JLabel();
        nombre_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1024, 576, 576, 576));
        setResizable(false);

        hub_menu.setBackground(new java.awt.Color(0, 0, 0));
        hub_menu.setPreferredSize(new java.awt.Dimension(257, 576));

        bienvenidoNoUsar.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bienvenidoNoUsar.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidoNoUsar.setText("Bienvenido");

        nombre_menu.setBackground(new java.awt.Color(255, 255, 255));
        nombre_menu.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        nombre_menu.setForeground(new java.awt.Color(10, 86, 18));
        nombre_menu.setText("Nombre");

        javax.swing.GroupLayout hub_menuLayout = new javax.swing.GroupLayout(hub_menu);
        hub_menu.setLayout(hub_menuLayout);
        hub_menuLayout.setHorizontalGroup(
            hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hub_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_menu)
                    .addComponent(bienvenidoNoUsar))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        hub_menuLayout.setVerticalGroup(
            hub_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hub_menuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenidoNoUsar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_menu)
                .addContainerGap(459, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hub_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 767, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hub_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoNoUsar;
    private javax.swing.JPanel hub_menu;
    protected javax.swing.JLabel nombre_menu;
    // End of variables declaration//GEN-END:variables
}
