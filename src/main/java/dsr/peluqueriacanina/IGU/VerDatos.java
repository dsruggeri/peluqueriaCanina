
package dsr.peluqueriacanina.IGU;

import dsr.peluqueriacanina.entidades.Controladora;
import dsr.peluqueriacanina.entidades.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null;

    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Ver datos");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnEditar)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnEliminar)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );

        tablaMascotas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Mascotas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();        
                
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
           
        //primero me fijo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //luego controlo que haya una fila seleccionada
            if (tablaMascotas.getSelectedRow() != -1) {
                
                // traigo el ID de la mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(
                        tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos pantallaEdit = new ModificarDatos(num_cliente);
                pantallaEdit.setVisible(true);
                pantallaEdit.setLocationRelativeTo(null);
                
                this.dispose();
                
                
            } else {
                mostrarMensaje("no seleccionó ninguna mascota", 
                        "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay mascotas en la tabla", 
                        "Error", "No se puede realizar la operación");
        }
    
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //primero me fijo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //luego controlo que haya una fila seleccionada
            if (tablaMascotas.getSelectedRow() != -1) {
                //traigo el ID
                int num_cliente = Integer.parseInt(String.valueOf(
                        tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                
                //llamo al método borrar de la controladora de lógica
                control.borrarMascota(num_cliente);
                
                //aviso al usuario que se borró OK               
                mostrarMensaje("Mascota eliminada correctamente", 
                        "Info", "Operación exitosa");
                
                //vuelvo a cargar la tabla para ver datos actualizados
                cargarTabla();
              
                
            } else {
                mostrarMensaje("no seleccionó ninguna mascota", 
                        "Error", "Error al eliminar");
            }
            
        } else {
            mostrarMensaje("No hay mascotas en la tabla", 
                        "Error", "No se puede realizar la operación");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrarMensaje(String mensaje, String tipoMensaje, String tituloMensaje){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipoMensaje.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(tituloMensaje);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //definir modelo de modeloTabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            //evitamos que se pueda editar fila y columna
            
            @Override
            public boolean isCellEditable (int row, int column){
                return false; 
            }
            
        };
        
        //establecemos nombre de las columnas
        String titulos[] = {"ID", "Nombre", "Tipo", "Raza", "Color", "Alérgico", 
            "At. Esp.", "Observaciones", "Dueño", "Cel", "Dir"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //carga de datos desde la BD
        List <Mascota> listaMascotas = control.traerMascotas();
        
        
        //recorro la lista para mostrar elementos en modeloTabla
        if (listaMascotas != null){
            
            for (Mascota mascota : listaMascotas) {
                
                Object[] objeto = {mascota.getNum_cliente(), 
                                   mascota.getNombreMascota(),
                                   mascota.getTipoAnimal(),
                                   mascota.getRaza(),
                                   mascota.getColor(),
                                   mascota.getAlergico(),
                                   mascota.getAtencionEspecial(),
                                   mascota.getObservaciones(),
                                   mascota.getDuenio().getNombre(),
                                   mascota.getDuenio().getCelular(),
                                   mascota.getDuenio().getDireccion()
                                   };
                
                modeloTabla.addRow(objeto);
                
            }
            
        }
        
        tablaMascotas.setModel(modeloTabla);
        
    }
}
