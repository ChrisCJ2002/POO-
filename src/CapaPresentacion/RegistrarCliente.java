/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import CapaBaseDatos.DataCliente;
import CapaLogica.Cliente;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class RegistrarCliente extends javax.swing.JPanel {

   
    public RegistrarCliente() {
        initComponents();
    }
    
    private void limpiarCampos() {
        tfDni.setText("");
        tfNombre.setText("");
        tfApPaterno.setText("");
        tfApMaterno.setText("");
        dcFechaNaci.setDate(null);
        tfTelefono.setText("");
        tfDireccion.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txDni = new javax.swing.JLabel();
        imgCliente = new javax.swing.JLabel();
        txNombre = new javax.swing.JLabel();
        txApPaterno = new javax.swing.JLabel();
        txApMaterno = new javax.swing.JLabel();
        txFechaNaci = new javax.swing.JLabel();
        dcFechaNaci = new com.toedter.calendar.JDateChooser();
        txDireccion = new javax.swing.JLabel();
        txTelefono = new javax.swing.JLabel();
        btRegCliente = new javax.swing.JButton();
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApPaterno = new javax.swing.JTextField();
        tfApMaterno = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setAlignmentY(0.0F);
        setLayout(new java.awt.GridBagLayout());

        txDni.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txDni.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 0, 0);
        add(txDni, gridBagConstraints);

        imgCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgRegCliente.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 8;
        add(imgCliente, gridBagConstraints);

        txNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txNombre, gridBagConstraints);

        txApPaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txApPaterno.setText("Apellido Paterno:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txApPaterno, gridBagConstraints);

        txApMaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txApMaterno.setText("Apellido Materno:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txApMaterno, gridBagConstraints);

        txFechaNaci.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txFechaNaci.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txFechaNaci, gridBagConstraints);

        dcFechaNaci.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dcFechaNaci.setOpaque(false);
        dcFechaNaci.setPreferredSize(new java.awt.Dimension(450, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(dcFechaNaci, gridBagConstraints);

        txDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txDireccion.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txDireccion, gridBagConstraints);

        txTelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        add(txTelefono, gridBagConstraints);

        btRegCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addClientex48.png"))); // NOI18N
        btRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        add(btRegCliente, gridBagConstraints);

        tfDni.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfDni.setForeground(new java.awt.Color(153, 153, 153));
        tfDni.setPreferredSize(new java.awt.Dimension(450, 35));
        tfDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfDniMousePressed(evt);
            }
        });
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });
        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDniKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(tfDni, gridBagConstraints);

        tfNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(153, 153, 153));
        tfNombre.setPreferredSize(new java.awt.Dimension(450, 35));
        tfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreMousePressed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(tfNombre, gridBagConstraints);

        tfApPaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfApPaterno.setForeground(new java.awt.Color(153, 153, 153));
        tfApPaterno.setPreferredSize(new java.awt.Dimension(450, 35));
        tfApPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfApPaternoMousePressed(evt);
            }
        });
        tfApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApPaternoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfApPaternoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(tfApPaterno, gridBagConstraints);

        tfApMaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfApMaterno.setForeground(new java.awt.Color(153, 153, 153));
        tfApMaterno.setPreferredSize(new java.awt.Dimension(450, 35));
        tfApMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfApMaternoMousePressed(evt);
            }
        });
        tfApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApMaternoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfApMaternoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(tfApMaterno, gridBagConstraints);

        tfDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfDireccion.setForeground(new java.awt.Color(153, 153, 153));
        tfDireccion.setPreferredSize(new java.awt.Dimension(450, 35));
        tfDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfDireccionMousePressed(evt);
            }
        });
        tfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDireccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDireccionKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(tfDireccion, gridBagConstraints);

        tfTelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(153, 153, 153));
        tfTelefono.setPreferredSize(new java.awt.Dimension(450, 35));
        tfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfTelefonoMousePressed(evt);
            }
        });
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 0, 0);
        add(tfTelefono, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegClienteActionPerformed
       
        String dni = tfDni.getText().trim();
        String nombre = tfNombre.getText().trim();
        String apPaterno = tfApPaterno.getText().trim();
        String apMaterno = tfApMaterno.getText().trim();
        Date fechaNaci = dcFechaNaci.getDate();
        String telefono = tfTelefono.getText().trim();
        String direccion = tfDireccion.getText().trim();

       
        if (dni.isEmpty() || nombre.isEmpty() || apPaterno.isEmpty() || fechaNaci == null) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor, complete todos los campos obligatorios:\n- DNI\n- Nombre\n- Apellido Paterno\n- Fecha de Nacimiento", 
                    "Error de Validación", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        if (dni.length() > 8) {
            JOptionPane.showMessageDialog(this, 
                    "El DNI no puede exceder los 8 caracteres.", 
                    "Error de Validación", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            
            Cliente nuevoCliente = new Cliente(
                dni,
                nombre,
                apPaterno,
                apMaterno,
                fechaNaci,
                telefono,
                direccion
            );
            
            
            DataCliente Lector= new DataCliente();
            boolean registrado = Lector.registrarCliente(nuevoCliente);

          
            if (registrado) {
                JOptionPane.showMessageDialog(this, 
                        "¡Cliente " + nombre + " " + apPaterno + " registrado exitosamente!", 
                        "Registro Exitoso", 
                        JOptionPane.INFORMATION_MESSAGE);
                
               
                limpiarCampos();
                
            } else {
                JOptionPane.showMessageDialog(this, 
                        "No se pudo registrar el cliente.\n" +
                        "Posibles causas:\n" +
                        "- El DNI ya está registrado en la base de datos\n" +
                        "- Error de conexión con la base de datos", 
                        "Error de Registro", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Ocurrió un error inesperado al procesar los datos:\n" + e.getMessage(), 
                    "Error Interno", 
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btRegClienteActionPerformed

    private void tfDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDniMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniMousePressed

    private void tfDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniKeyPressed

    private void tfDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniKeyReleased

    private void tfNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreMousePressed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreKeyReleased

    private void tfApPaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfApPaternoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApPaternoMousePressed

    private void tfApPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApPaternoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApPaternoKeyPressed

    private void tfApPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApPaternoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApPaternoKeyReleased

    private void tfApMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfApMaternoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApMaternoMousePressed

    private void tfApMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApMaternoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApMaternoKeyPressed

    private void tfApMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApMaternoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApMaternoKeyReleased

    private void tfDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionMousePressed

    private void tfDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionKeyPressed

    private void tfDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionKeyReleased

    private void tfTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoMousePressed

    private void tfTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoKeyPressed

    private void tfTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoKeyReleased

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegCliente;
    private com.toedter.calendar.JDateChooser dcFechaNaci;
    private javax.swing.JLabel imgCliente;
    private javax.swing.JTextField tfApMaterno;
    private javax.swing.JTextField tfApPaterno;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JLabel txApMaterno;
    private javax.swing.JLabel txApPaterno;
    private javax.swing.JLabel txDireccion;
    private javax.swing.JLabel txDni;
    private javax.swing.JLabel txFechaNaci;
    private javax.swing.JLabel txNombre;
    private javax.swing.JLabel txTelefono;
    // End of variables declaration//GEN-END:variables
}
