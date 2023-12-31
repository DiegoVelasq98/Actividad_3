
package vista;
import modelo.Empleados;

public class frm_empleados extends javax.swing.JFrame {

    
    Empleados empleado;
    
    public frm_empleados() {
        initComponents();
        empleado = new Empleados();
        tbl_empleado.setModel(empleado.leer());
        cmb_puesto.setModel(empleado.leer_puesto());
    }
public void selec_datos(){
    int fila = tbl_empleado.getSelectedRow();
    lbl_identificacion.setText(tbl_empleado.getValueAt(fila, 0).toString());
    txt_codigo.setText(tbl_empleado.getValueAt(fila, 1).toString());
    txt_nombre.setText(tbl_empleado.getValueAt(fila, 2).toString());
    txt_apellido.setText(tbl_empleado.getValueAt(fila, 3).toString());
    txt_direccion.setText(tbl_empleado.getValueAt(fila, 4).toString());
    txt_telefono.setText(tbl_empleado.getValueAt(fila, 5).toString());
    txt_fecha.setText(tbl_empleado.getValueAt(fila, 6).toString());
    cmb_puesto.setSelectedItem(tbl_empleado.getValueAt(fila, 7).toString());
}
public void limpiar_datos(){
    
    lbl_identificacion.setText("");
    txt_codigo.setText("");
    txt_nombre.setText("");
    txt_apellido.setText("");
    txt_direccion.setText("");
    txt_telefono.setText("");
    txt_fecha.setText("");
    cmb_puesto.setSelectedItem("0) Elija Puesto");
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_puesto = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        cmb_puesto = new javax.swing.JComboBox<>();
        txt_apellido = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_direccion = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        lbl_telefono = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_identificacion = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleado = new javax.swing.JTable();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_id_puesto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_puesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_puesto.setText("Puesto");

        lbl_apellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_apellidos.setText("Apellido");

        cmb_puesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmb_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_puestoActionPerformed(evt);
            }
        });

        txt_apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyReleased(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_direccion.setText("Direccion");

        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_actualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_telefono.setText("Telefono");

        btn_eliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        txt_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbl_identificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_identificacion.setText("0");

        lbl_fecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_fecha.setText("Fecha Nacimiento");

        lbl_codigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_codigo.setText("Codigo");

        txt_fecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_codigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
        });

        tbl_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadoMouseClicked(evt);
            }
        });
        tbl_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleado);

        lbl_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fecha)
                                    .addComponent(lbl_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_id_puesto)
                                        .addGap(143, 143, 143)
                                        .addComponent(btn_agregar)
                                        .addGap(27, 27, 27)
                                        .addComponent(btn_actualizar)
                                        .addGap(30, 30, 30)
                                        .addComponent(btn_eliminar))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbl_telefono)
                                        .addComponent(lbl_codigo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_identificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fecha)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_puesto)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id_puesto))
                .addGap(127, 127, 127)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_puestoActionPerformed
        // TODO add your handling code here:
        String id_puesto= this.cmb_puesto.getSelectedItem().toString();
        int posc= id_puesto.indexOf(')');
        //Integer.parseInt(id_puesto.substring(0, posc))
        lbl_id_puesto.setText(id_puesto.substring(0, posc));
    }//GEN-LAST:event_cmb_puestoActionPerformed

    private void txt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyReleased
        // TODO add your handling code here: un apellido o dos
    }//GEN-LAST:event_txt_apellidoKeyReleased

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        String id_puesto= cmb_puesto.getSelectedItem().toString();
        int posc=id_puesto.indexOf(')');

        empleado = new Empleados(txt_codigo.getText(),0,Integer.parseInt(id_puesto.substring(0, posc)),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fecha.getText());
        empleado.crear();
        tbl_empleado.setModel(empleado.leer());
        limpiar_datos();

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        String id_puesto= cmb_puesto.getSelectedItem().toString();
        int posc=id_puesto.indexOf(')');

        empleado = new Empleados(txt_codigo.getText(),Integer.parseInt(lbl_identificacion.getText()),Integer.parseInt(id_puesto.substring(0, posc)),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fecha.getText());
        empleado.actualizar();
        tbl_empleado.setModel(empleado.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        empleado = new Empleados();
        empleado.setId(Integer.parseInt(lbl_identificacion.getText()));
        empleado.borrar();
        tbl_empleado.setModel(empleado.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoKeyReleased

    private void tbl_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadoMouseClicked
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_empleadoMouseClicked

    private void tbl_empleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadoKeyReleased
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_empleadoKeyReleased

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        // TODO add your handling code here:  \s = espacion en blanco
        // un nombre o varios
    }//GEN-LAST:event_txt_nombreKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cmb_puesto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_id_puesto;
    private javax.swing.JLabel lbl_identificacion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTable tbl_empleado;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
