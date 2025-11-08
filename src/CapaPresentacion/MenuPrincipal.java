/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author LENOVO
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
      java.net.URL iconoURL = getClass().getResource("/imagenes/icono.png");
    
    if (iconoURL != null) {
        // Solo si el recurso existe, intentamos establecer la imagen
        setIconImage(new ImageIcon(iconoURL).getImage());
    } else {
        // Opcional: Imprime un mensaje si no se encuentra (útil para depurar)
        System.err.println("Error: Icono no encontrado. Verifique la ruta /imagenes/icono.png");
    }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlCerrarCliente = new javax.swing.JPanel();
        txRegCliente = new javax.swing.JLabel();
        btnCerrarCliente = new javax.swing.JButton();
        pnlCerrarCuenta = new javax.swing.JPanel();
        btnCerrarCuenta = new javax.swing.JButton();
        txRegCuenta = new javax.swing.JLabel();
        PnlCerrarDeposito = new javax.swing.JPanel();
        txTitulo = new javax.swing.JLabel();
        btnCerrarDeposito = new javax.swing.JButton();
        PnlCerrarRetiro = new javax.swing.JPanel();
        btnCerrarRetiro = new javax.swing.JButton();
        txTitulo1 = new javax.swing.JLabel();
        PnlCerrarCerrarCuenta = new javax.swing.JPanel();
        btnCerrarCerrarCuenta = new javax.swing.JButton();
        txTitulo2 = new javax.swing.JLabel();
        PnlCerraRpt1 = new javax.swing.JPanel();
        btnCerrarRpt1 = new javax.swing.JButton();
        txTitulo3 = new javax.swing.JLabel();
        PnlCerrarRpt2 = new javax.swing.JPanel();
        btnCerrarRpt2 = new javax.swing.JButton();
        txTitulo4 = new javax.swing.JLabel();
        PnlCerrarRpt3 = new javax.swing.JPanel();
        btnCerrarRpt3 = new javax.swing.JButton();
        txTitulo5 = new javax.swing.JLabel();
        PnlCerrarRpt4 = new javax.swing.JPanel();
        btnCerrarRpt4 = new javax.swing.JButton();
        txTitulo6 = new javax.swing.JLabel();
        PnlCerrarRpt5 = new javax.swing.JPanel();
        btnCerrarRpt5 = new javax.swing.JButton();
        txTitulo7 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        btnRegCliente = new javax.swing.JButton();
        btnRegCuenta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnRetirar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        ctnCerrarCuenta = new javax.swing.JButton();
        tabbedPanel = new javax.swing.JTabbedPane();
        tpHome = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        mantenimiento = new javax.swing.JMenu();
        mRegisCliente = new javax.swing.JMenuItem();
        mRegisCuenta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mSalir = new javax.swing.JMenuItem();
        procesos = new javax.swing.JMenu();
        mDepositar = new javax.swing.JMenuItem();
        mRetirar = new javax.swing.JMenuItem();
        mCerrar = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        mRepCuentasGeneral = new javax.swing.JMenuItem();
        mRepCuentasPorAño = new javax.swing.JMenuItem();
        mRepCuentasPorCliente = new javax.swing.JMenuItem();
        mRepCantCuentasPorMoneda = new javax.swing.JMenuItem();
        mRepCuentasCerradas = new javax.swing.JMenuItem();

        pnlCerrarCliente.setOpaque(false);
        pnlCerrarCliente.setLayout(new java.awt.GridBagLayout());

        txRegCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txRegCliente.setText("Registrar Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlCerrarCliente.add(txRegCliente, gridBagConstraints);

        btnCerrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarCliente.setContentAreaFilled(false);
        btnCerrarCliente.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarCliente.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pnlCerrarCliente.add(btnCerrarCliente, gridBagConstraints);

        pnlCerrarCuenta.setOpaque(false);
        pnlCerrarCuenta.setLayout(new java.awt.GridBagLayout());

        btnCerrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarCuenta.setContentAreaFilled(false);
        btnCerrarCuenta.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarCuenta.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCuentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pnlCerrarCuenta.add(btnCerrarCuenta, gridBagConstraints);

        txRegCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txRegCuenta.setText("Registrar Cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlCerrarCuenta.add(txRegCuenta, gridBagConstraints);

        PnlCerrarDeposito.setOpaque(false);
        PnlCerrarDeposito.setLayout(new java.awt.GridBagLayout());

        txTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo.setText("Deposito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarDeposito.add(txTitulo, gridBagConstraints);

        btnCerrarDeposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarDeposito.setContentAreaFilled(false);
        btnCerrarDeposito.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarDeposito.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarDeposito.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarDepositoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarDeposito.add(btnCerrarDeposito, gridBagConstraints);

        PnlCerrarRetiro.setOpaque(false);
        PnlCerrarRetiro.setLayout(new java.awt.GridBagLayout());

        btnCerrarRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRetiro.setContentAreaFilled(false);
        btnCerrarRetiro.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRetiro.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRetiro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRetiroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarRetiro.add(btnCerrarRetiro, gridBagConstraints);

        txTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo1.setText("Retiro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarRetiro.add(txTitulo1, gridBagConstraints);

        PnlCerrarCerrarCuenta.setOpaque(false);
        PnlCerrarCerrarCuenta.setLayout(new java.awt.GridBagLayout());

        btnCerrarCerrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarCerrarCuenta.setContentAreaFilled(false);
        btnCerrarCerrarCuenta.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarCerrarCuenta.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarCerrarCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarCerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCerrarCuentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarCerrarCuenta.add(btnCerrarCerrarCuenta, gridBagConstraints);

        txTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo2.setText("Cerrar Cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarCerrarCuenta.add(txTitulo2, gridBagConstraints);

        PnlCerraRpt1.setOpaque(false);
        PnlCerraRpt1.setLayout(new java.awt.GridBagLayout());

        btnCerrarRpt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRpt1.setContentAreaFilled(false);
        btnCerrarRpt1.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRpt1.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRpt1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRpt1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerraRpt1.add(btnCerrarRpt1, gridBagConstraints);

        txTitulo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo3.setText("Reporte 01");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerraRpt1.add(txTitulo3, gridBagConstraints);

        PnlCerrarRpt2.setOpaque(false);
        PnlCerrarRpt2.setLayout(new java.awt.GridBagLayout());

        btnCerrarRpt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRpt2.setContentAreaFilled(false);
        btnCerrarRpt2.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRpt2.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRpt2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRpt2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt2.add(btnCerrarRpt2, gridBagConstraints);

        txTitulo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo4.setText("Reporte 02");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt2.add(txTitulo4, gridBagConstraints);

        PnlCerrarRpt3.setOpaque(false);
        PnlCerrarRpt3.setLayout(new java.awt.GridBagLayout());

        btnCerrarRpt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRpt3.setContentAreaFilled(false);
        btnCerrarRpt3.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRpt3.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRpt3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRpt3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt3.add(btnCerrarRpt3, gridBagConstraints);

        txTitulo5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo5.setText("Reporte 03");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt3.add(txTitulo5, gridBagConstraints);

        PnlCerrarRpt4.setOpaque(false);
        PnlCerrarRpt4.setLayout(new java.awt.GridBagLayout());

        btnCerrarRpt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRpt4.setContentAreaFilled(false);
        btnCerrarRpt4.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRpt4.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRpt4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRpt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRpt4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt4.add(btnCerrarRpt4, gridBagConstraints);

        txTitulo6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo6.setText("Reporte 04");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt4.add(txTitulo6, gridBagConstraints);

        PnlCerrarRpt5.setOpaque(false);
        PnlCerrarRpt5.setLayout(new java.awt.GridBagLayout());

        btnCerrarRpt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax16.png"))); // NOI18N
        btnCerrarRpt5.setContentAreaFilled(false);
        btnCerrarRpt5.setMargin(new java.awt.Insets(0, 12, 0, 4));
        btnCerrarRpt5.setPreferredSize(new java.awt.Dimension(28, 20));
        btnCerrarRpt5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closePestañax20.png"))); // NOI18N
        btnCerrarRpt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRpt5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt5.add(btnCerrarRpt5, gridBagConstraints);

        txTitulo7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTitulo7.setText("Reporte 05");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PnlCerrarRpt5.add(txTitulo7, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".: Proyecto Final - Sistema Bancario :.");
        setExtendedState(6);

        panel.setLayout(new java.awt.GridBagLayout());

        barraHerramientas.setRollover(true);

        btnRegCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regClientex64.png"))); // NOI18N
        btnRegCliente.setText("Cliente");
        btnRegCliente.setFocusable(false);
        btnRegCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegClienteActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnRegCliente);

        btnRegCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regCuentax64.png"))); // NOI18N
        btnRegCuenta.setText("Cuenta");
        btnRegCuenta.setFocusable(false);
        btnRegCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCuentaActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnRegCuenta);
        barraHerramientas.add(jSeparator2);

        btnRetirar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retirarx64.png"))); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.setFocusable(false);
        btnRetirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetirar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnRetirar);

        btnDepositar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositarx64.png"))); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.setFocusable(false);
        btnDepositar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepositar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnDepositar);

        ctnCerrarCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ctnCerrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/closeCuentax64.png"))); // NOI18N
        ctnCerrarCuenta.setText("Cerrar Cuenta");
        ctnCerrarCuenta.setFocusable(false);
        ctnCerrarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ctnCerrarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ctnCerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctnCerrarCuentaActionPerformed(evt);
            }
        });
        barraHerramientas.add(ctnCerrarCuenta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        panel.add(barraHerramientas, gridBagConstraints);

        tabbedPanel.setFocusable(false);
        tabbedPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabbedPanel.setPreferredSize(new java.awt.Dimension(400, 250));

        tpHome.setLayout(new java.awt.GridBagLayout());
        tabbedPanel.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/imagenes/homex16.png")), tpHome); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(tabbedPanel, gridBagConstraints);

        mantenimiento.setText("Mantenimiento");
        mantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mRegisCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRegisCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regClientex24.png"))); // NOI18N
        mRegisCliente.setText("Registrar Cliente");
        mRegisCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegisClienteActionPerformed(evt);
            }
        });
        mantenimiento.add(mRegisCliente);

        mRegisCuenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRegisCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regCuentax24.png"))); // NOI18N
        mRegisCuenta.setText("Registrar Cuenta");
        mRegisCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegisCuentaActionPerformed(evt);
            }
        });
        mantenimiento.add(mRegisCuenta);
        mantenimiento.add(jSeparator1);

        mSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar x32.png"))); // NOI18N
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mantenimiento.add(mSalir);

        barraMenu.add(mantenimiento);

        procesos.setText("Procesos");
        procesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mDepositar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositarx24.png"))); // NOI18N
        mDepositar.setText("Depositar dinero a una cuenta");
        mDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDepositarActionPerformed(evt);
            }
        });
        procesos.add(mDepositar);

        mRetirar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retirarx24.png"))); // NOI18N
        mRetirar.setText("Retirar dinero de una cuenta");
        mRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRetirarActionPerformed(evt);
            }
        });
        procesos.add(mRetirar);

        mCerrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeCuentax24.png"))); // NOI18N
        mCerrar.setText("Cerrar una cuenta");
        mCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarActionPerformed(evt);
            }
        });
        procesos.add(mCerrar);

        barraMenu.add(procesos);

        reportes.setText("Reportes");
        reportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mRepCuentasGeneral.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRepCuentasGeneral.setText("Listado general de cuentas");
        mRepCuentasGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRepCuentasGeneralActionPerformed(evt);
            }
        });
        reportes.add(mRepCuentasGeneral);

        mRepCuentasPorAño.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRepCuentasPorAño.setText("Mostrar cuentas creadas en un año especifico");
        mRepCuentasPorAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRepCuentasPorAñoActionPerformed(evt);
            }
        });
        reportes.add(mRepCuentasPorAño);

        mRepCuentasPorCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRepCuentasPorCliente.setText("Listado de cuentas de un cliente especifico");
        mRepCuentasPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRepCuentasPorClienteActionPerformed(evt);
            }
        });
        reportes.add(mRepCuentasPorCliente);

        mRepCantCuentasPorMoneda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRepCantCuentasPorMoneda.setText("Mostrar la cantidad cuentas existentes de acuerdo al tipo de moneda");
        mRepCantCuentasPorMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRepCantCuentasPorMonedaActionPerformed(evt);
            }
        });
        reportes.add(mRepCantCuentasPorMoneda);

        mRepCuentasCerradas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mRepCuentasCerradas.setText("Listado de cuentas cerradas");
        mRepCuentasCerradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRepCuentasCerradasActionPerformed(evt);
            }
        });
        reportes.add(mRepCuentasCerradas);

        barraMenu.add(reportes);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void mRegisClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegisClienteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mRegisClienteActionPerformed

    private void mRegisCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegisCuentaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mRegisCuentaActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mSalirActionPerformed

    private void mDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDepositarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mDepositarActionPerformed

    private void mRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRetirarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mRetirarActionPerformed

    private void mCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mCerrarActionPerformed

    private void mRepCuentasGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRepCuentasGeneralActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mRepCuentasGeneralActionPerformed

    private void mRepCuentasPorAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRepCuentasPorAñoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mRepCuentasPorAñoActionPerformed

    private void mRepCuentasPorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRepCuentasPorClienteActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_mRepCuentasPorClienteActionPerformed

    private void mRepCantCuentasPorMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRepCantCuentasPorMonedaActionPerformed
     
    }//GEN-LAST:event_mRepCantCuentasPorMonedaActionPerformed

    private void mRepCuentasCerradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRepCuentasCerradasActionPerformed
  
    }//GEN-LAST:event_mRepCuentasCerradasActionPerformed

    
    private void btnCerrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarClienteActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnCerrarClienteActionPerformed

    private void btnCerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCuentaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnCerrarCuentaActionPerformed

    private void btnCerrarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarDepositoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnCerrarDepositoActionPerformed

    private void btnCerrarRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRetiroActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCerrarRetiroActionPerformed

    private void btnCerrarCerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCerrarCuentaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCerrarCerrarCuentaActionPerformed

    private void btnCerrarRpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRpt1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnCerrarRpt1ActionPerformed

    private void btnCerrarRpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRpt2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCerrarRpt2ActionPerformed

    private void btnCerrarRpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRpt3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCerrarRpt3ActionPerformed

    private void btnCerrarRpt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRpt4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCerrarRpt4ActionPerformed

    private void btnCerrarRpt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRpt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarRpt5ActionPerformed

    
    private void btnRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegClienteActionPerformed
        // TODO add your handling code here:
     RegistrarCliente pnlRegCliente = new RegistrarCliente();

    // Crear el contenedor JFrame (temporal)
    javax.swing.JFrame frameRegistro = new javax.swing.JFrame("Registrar Nuevo Cliente");
    frameRegistro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    
    // Añadir el JPanel RegistrarCliente al JFrame
    frameRegistro.getContentPane().add(pnlRegCliente);
    
    // Ajustar el tamaño del frame al contenido (el JPanel)
    frameRegistro.pack();
    
    // Centrar la ventana en la pantalla
    frameRegistro.setLocationRelativeTo(null);
    
    // Mostrar la ventana
    frameRegistro.setVisible(true);

 

    }//GEN-LAST:event_btnRegClienteActionPerformed

    private void btnRegCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCuentaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRegCuentaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void ctnCerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctnCerrarCuentaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ctnCerrarCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlCerraRpt1;
    private javax.swing.JPanel PnlCerrarCerrarCuenta;
    private javax.swing.JPanel PnlCerrarDeposito;
    private javax.swing.JPanel PnlCerrarRetiro;
    private javax.swing.JPanel PnlCerrarRpt2;
    private javax.swing.JPanel PnlCerrarRpt3;
    private javax.swing.JPanel PnlCerrarRpt4;
    private javax.swing.JPanel PnlCerrarRpt5;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnCerrarCerrarCuenta;
    private javax.swing.JButton btnCerrarCliente;
    private javax.swing.JButton btnCerrarCuenta;
    private javax.swing.JButton btnCerrarDeposito;
    private javax.swing.JButton btnCerrarRetiro;
    private javax.swing.JButton btnCerrarRpt1;
    private javax.swing.JButton btnCerrarRpt2;
    private javax.swing.JButton btnCerrarRpt3;
    private javax.swing.JButton btnCerrarRpt4;
    private javax.swing.JButton btnCerrarRpt5;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRegCliente;
    private javax.swing.JButton btnRegCuenta;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton ctnCerrarCuenta;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JMenuItem mCerrar;
    private javax.swing.JMenuItem mDepositar;
    private javax.swing.JMenuItem mRegisCliente;
    private javax.swing.JMenuItem mRegisCuenta;
    private javax.swing.JMenuItem mRepCantCuentasPorMoneda;
    private javax.swing.JMenuItem mRepCuentasCerradas;
    private javax.swing.JMenuItem mRepCuentasGeneral;
    private javax.swing.JMenuItem mRepCuentasPorAño;
    private javax.swing.JMenuItem mRepCuentasPorCliente;
    private javax.swing.JMenuItem mRetirar;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenu mantenimiento;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnlCerrarCliente;
    private javax.swing.JPanel pnlCerrarCuenta;
    private javax.swing.JMenu procesos;
    private javax.swing.JMenu reportes;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JPanel tpHome;
    private javax.swing.JLabel txRegCliente;
    private javax.swing.JLabel txRegCuenta;
    private javax.swing.JLabel txTitulo;
    private javax.swing.JLabel txTitulo1;
    private javax.swing.JLabel txTitulo2;
    private javax.swing.JLabel txTitulo3;
    private javax.swing.JLabel txTitulo4;
    private javax.swing.JLabel txTitulo5;
    private javax.swing.JLabel txTitulo6;
    private javax.swing.JLabel txTitulo7;
    // End of variables declaration//GEN-END:variables
}
