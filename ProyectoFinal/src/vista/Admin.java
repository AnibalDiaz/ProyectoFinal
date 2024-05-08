package vista;

//librerias de conexion
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class Admin extends javax.swing.JFrame {

    //variables de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
        
    public Admin() {
        initComponents();
    }
    
    public void conectarBase(){//inicia metodo conectar
    try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdproyectofinal","root","");
       stmt=cn.createStatement();//genera sentencias sql
       JOptionPane.showMessageDialog(null,"CONEXION BD ESTABLECIDA \nDiaz");
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null, ex);
    }catch(Exception e){//inica exception errores generales
        JOptionPane.showMessageDialog(null, e);
    }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panEliminar = new javax.swing.JPanel();
        lblIdServicioEliminar = new javax.swing.JLabel();
        txtEliminarServicio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        panModificar = new javax.swing.JPanel();
        lblIdServicioModificar = new javax.swing.JLabel();
        lblServicioModificar = new javax.swing.JLabel();
        lblCantidadMOdificar = new javax.swing.JLabel();
        lblDistanciaModificar = new javax.swing.JLabel();
        txtServicioModificar = new javax.swing.JTextField();
        txtIdServicioModificar = new javax.swing.JTextField();
        txtCantidadModificar = new javax.swing.JTextField();
        txtDistanciaModificar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnLimpiarModificar = new javax.swing.JButton();
        panRegistrar = new javax.swing.JPanel();
        lblIdServicioRegistrar = new javax.swing.JLabel();
        lblServicioRegistrar = new javax.swing.JLabel();
        lblCantidadRegistrar = new javax.swing.JLabel();
        lblDistanciaregistrar = new javax.swing.JLabel();
        txtServicioRegistrar = new javax.swing.JTextField();
        txtIdServicioRegistrar = new javax.swing.JTextField();
        txtCantidadRegistrar = new javax.swing.JTextField();
        txtDistanciaRegistrar = new javax.swing.JTextField();
        btnRegistrar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiarResgitro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultarServicio = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panEliminar.setBackground(new java.awt.Color(102, 204, 0));

        lblIdServicioEliminar.setText("Capturara el IdServicio:");

        txtEliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarServicioActionPerformed(evt);
            }
        });

        btnEliminar.setText("Dar de baja Servicio");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEliminarLayout = new javax.swing.GroupLayout(panEliminar);
        panEliminar.setLayout(panEliminarLayout);
        panEliminarLayout.setHorizontalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(lblIdServicioEliminar)))
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(txtEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panEliminarLayout.setVerticalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblIdServicioEliminar)
                .addGap(18, 18, 18)
                .addComponent(txtEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEliminar)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        panModificar.setBackground(new java.awt.Color(204, 204, 0));

        lblIdServicioModificar.setText("IdServicio:");

        lblServicioModificar.setText("Servicio:");

        lblCantidadMOdificar.setText("Cantidad:");

        lblDistanciaModificar.setText("Distancia:");

        txtIdServicioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdServicioModificarActionPerformed(evt);
            }
        });

        txtDistanciaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("oz");

        jLabel4.setText("m2");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiarModificar.setText("Limpiar");
        btnLimpiarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panModificarLayout = new javax.swing.GroupLayout(panModificar);
        panModificar.setLayout(panModificarLayout);
        panModificarLayout.setHorizontalGroup(
            panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panModificarLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(43, 43, 43)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarModificar)
                        .addContainerGap())
                    .addGroup(panModificarLayout.createSequentialGroup()
                        .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panModificarLayout.createSequentialGroup()
                                .addComponent(lblCantidadMOdificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                                .addComponent(lblIdServicioModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdServicioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                                .addComponent(lblServicioModificar)
                                .addGap(37, 37, 37)
                                .addComponent(txtServicioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                                .addComponent(lblDistanciaModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDistanciaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panModificarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        panModificarLayout.setVerticalGroup(
            panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdServicioModificar)
                    .addComponent(txtIdServicioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServicioModificar)
                    .addComponent(txtServicioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadMOdificar)
                    .addComponent(txtCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistanciaModificar)
                    .addComponent(txtDistanciaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiarModificar))
                .addGap(28, 28, 28))
        );

        panRegistrar.setBackground(new java.awt.Color(102, 153, 0));

        lblIdServicioRegistrar.setText("IdServicio:");

        lblServicioRegistrar.setText("Servicio:");

        lblCantidadRegistrar.setText("Cantidad:");

        lblDistanciaregistrar.setText("Distancia:");

        txtIdServicioRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdServicioRegistrarActionPerformed(evt);
            }
        });

        txtDistanciaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaRegistrarActionPerformed(evt);
            }
        });

        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        jLabel5.setText("oz");

        jLabel6.setText("m2");

        btnLimpiarResgitro.setText("Limpiar");
        btnLimpiarResgitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarResgitroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarLayout = new javax.swing.GroupLayout(panRegistrar);
        panRegistrar.setLayout(panRegistrarLayout);
        panRegistrarLayout.setHorizontalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panRegistrarLayout.createSequentialGroup()
                        .addComponent(lblCantidadRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidadRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarLayout.createSequentialGroup()
                        .addComponent(lblIdServicioRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdServicioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarLayout.createSequentialGroup()
                        .addComponent(lblServicioRegistrar)
                        .addGap(37, 37, 37)
                        .addComponent(txtServicioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarLayout.createSequentialGroup()
                        .addComponent(lblDistanciaregistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDistanciaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegistrar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarResgitro)
                .addGap(56, 56, 56))
        );
        panRegistrarLayout.setVerticalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdServicioRegistrar)
                    .addComponent(txtIdServicioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServicioRegistrar)
                    .addComponent(txtServicioRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadRegistrar)
                    .addComponent(txtCantidadRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistanciaregistrar)
                    .addComponent(txtDistanciaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar2)
                    .addComponent(btnLimpiarResgitro))
                .addGap(28, 28, 28))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Sistema Admin");

        jtConsultarServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Servicios", "Servicios", "Cantidad", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jtConsultarServicio);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fly.png"))); // NOI18N

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(488, 488, 488))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(168, 168, 168))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel8)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(panEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(panModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdServicioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdServicioModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdServicioModificarActionPerformed

    private void txtDistanciaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            conectarBase();
            int idServicioModificar=Integer.parseInt(this.txtIdServicioModificar.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM tbflyking where idservicio='"+idServicioModificar+"'");
            JOptionPane.showMessageDialog(null, "Buscando Servicio...");
            if (rs.next()==true) {
                this.txtServicioModificar.setText(rs.getString("servicio"));
                this.txtCantidadModificar.setText(rs.getString("cantidad"));
                this.txtDistanciaModificar.setText(rs.getString("distancia"));

            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de servicio\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD"+ e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdServicioRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdServicioRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdServicioRegistrarActionPerformed

    private void txtDistanciaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaRegistrarActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idservicio=Integer.parseInt(txtIdServicioRegistrar.getText());
        String servicio=txtServicioRegistrar.getText();
        String cantidad=txtCantidadRegistrar.getText();
        String distancia=txtDistanciaRegistrar.getText();
       
        //proceso guardar en la base de datos
  String altaProducto="INSERT INTO TBFLYKING VALUES ('"+idservicio+"','"+servicio+"','"+cantidad+"','"+distancia+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego servicio de forma correcta\n"+servicio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsultarServicio.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from tbflyking");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("IdServicio ");
                 modeloDatos.addColumn("Servicio");
                 modeloDatos.addColumn("Cantidad");
                 modeloDatos.addColumn("Distancia");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtEliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarServicioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            int productoBaja=Integer.parseInt(txtEliminarServicio.getText());
           
            confirmaBaja=stmt.executeUpdate("DELETE FROM tbflyking WHERE IDSERVICIO = '"+productoBaja+"'");
           
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Id de Servicio : \n"+productoBaja);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID de Servicio  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD\n"+ e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String editarSQL="";
             
        try {
            conectarBase();
            int idServicioMod=Integer.parseInt(this.txtIdServicioModificar.getText());
            String servicio = this.txtServicioModificar.getText();
            String cantidad = this.txtCantidadModificar.getText();
            String distancia = this.txtDistanciaModificar.getText();
           
editarSQL="UPDATE tbflyking SET servicio = '"+servicio+"',cantidad = '"+cantidad+"', distancia='"+distancia+"' where idservicio = '"+idServicioMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Servicio actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD"+ e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarResgitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarResgitroActionPerformed
        txtIdServicioRegistrar.setText("");
        txtServicioRegistrar.setText("");
        txtCantidadRegistrar.setText("");
        txtDistanciaRegistrar.setText("");
    }//GEN-LAST:event_btnLimpiarResgitroActionPerformed

    private void btnLimpiarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarModificarActionPerformed
        txtIdServicioModificar.setText("");
        txtServicioModificar.setText("");
        txtCantidadModificar.setText("");
        txtDistanciaModificar.setText("");
    }//GEN-LAST:event_btnLimpiarModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        acceso ventanaAcceso = new acceso();//llamada
                ventanaAcceso.setVisible(true);//visible
                this.hide();//oculta ventana anterior
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarModificar;
    private javax.swing.JButton btnLimpiarResgitro;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultarServicio;
    private javax.swing.JLabel lblCantidadMOdificar;
    private javax.swing.JLabel lblCantidadRegistrar;
    private javax.swing.JLabel lblDistanciaModificar;
    private javax.swing.JLabel lblDistanciaregistrar;
    private javax.swing.JLabel lblIdServicioEliminar;
    private javax.swing.JLabel lblIdServicioModificar;
    private javax.swing.JLabel lblIdServicioRegistrar;
    private javax.swing.JLabel lblServicioModificar;
    private javax.swing.JLabel lblServicioRegistrar;
    private javax.swing.JPanel panEliminar;
    private javax.swing.JPanel panModificar;
    private javax.swing.JPanel panRegistrar;
    private javax.swing.JTextField txtCantidadModificar;
    private javax.swing.JTextField txtCantidadRegistrar;
    private javax.swing.JTextField txtDistanciaModificar;
    private javax.swing.JTextField txtDistanciaRegistrar;
    private javax.swing.JTextField txtEliminarServicio;
    private javax.swing.JTextField txtIdServicioModificar;
    private javax.swing.JTextField txtIdServicioRegistrar;
    private javax.swing.JTextField txtServicioModificar;
    private javax.swing.JTextField txtServicioRegistrar;
    // End of variables declaration//GEN-END:variables
}
