/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_fernandopadilla;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Wendy
 */
public class FrameM extends javax.swing.JFrame {

    /**
     * Creates new form FrameM
     */
    public FrameM() {
        initComponents();
        inicializarListaCarro();
        inicializarListaVendedor();
        inicializarListaCliente();
        inicializarListaVenta();
        cb_carro.setModel(actualizarcbCarro());
        cb_Cliente.setModel(actualizarcbCliente());
        cb_Vendedor.setModel(actualizarcbVendedor());
        inicializaridCarro();
        System.out.println(idCarro);
    }

    ArrayList<Vehiculo> carros = new ArrayList();
    ArrayList<Vendedor> vendedores = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Venta> ventas = new ArrayList();
    File archivo = null;

    int idCarro = 1;

    public void inicializarListaCarro() {

        try {
            File file = new File("./Carros.txt");
            ArrayList<ArrayList<String>> listas = obtenerListas(file);
            for (ArrayList<String> t : listas) {
                if (t.size() == 6) {
                    String marca = t.get(0).replace(",", "");
                    String color = t.get(1).replace(",", "");
                    String modelo = t.get(2).replace(",", "");
                    String año = String.valueOf(t.get(3).replace(",", ""));
                    int id = Integer.parseInt(t.get(4).replace(",", ""));
                    double precio = Double.parseDouble(t.get(5).replace(",", ""));
                    carros.add(new Vehiculo(marca, color, modelo, año, precio, id));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inicializarListaVendedor() {

        try {
            File file = new File("./Vendedores.txt");
            ArrayList<ArrayList<String>> listas = obtenerListas(file);
            for (ArrayList<String> t : listas) {
                if (t.size() == 3) {
                    String nombre = t.get(0).replace(",", "");
                    String CV = t.get(1).replace(",", "");
                    String dineroG = t.get(2).replace(",", "");
                    vendedores.add(new Vendedor(nombre, Integer.parseInt(CV), Double.parseDouble(dineroG)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inicializarListaCliente() {

        try {
            File file = new File("./Clientes.txt");
            ArrayList<ArrayList<String>> listas = obtenerListas(file);
            for (ArrayList<String> t : listas) {
                if (t.size() == 5) {
                    String nombre = t.get(0).replace(",", "");
                    String edad = t.get(1).replace(",", "");
                    String profesion = t.get(2).replace(",", "");
                    String CC = t.get(3).replace(",", "");
                    String sueldo = t.get(4).replace(",", "");
                    clientes.add(new Cliente(nombre, Integer.parseInt(edad), profesion, Integer.parseInt(CC), Double.parseDouble(sueldo)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inicializarListaVenta() {

        try {
            File file = new File("./Ventas.txt");
            ArrayList<ArrayList<String>> listas = obtenerListas(file);
            for (ArrayList<String> t : listas) {
                if (t.size() == 5) {
                    String vendedor = t.get(0).replace(",", "");
                    String cliente = t.get(1).replace(",", "");
                    String carro = t.get(2).replace(",", "");
                    double precio = Double.parseDouble(t.get(3).replace(",", ""));
                    int id = Integer.parseInt(t.get(4).replace(",", ""));
                    ventas.add(new Venta(vendedor, cliente, precio, carro, id));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inicializaridCarro() {
        idCarro = carros.size() + 1;
    }

    public static ArrayList<ArrayList<String>> obtenerListas(File file) throws IOException {
        ArrayList<ArrayList<String>> listas = new ArrayList<>();
        ArrayList<String> listaActual = null;
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("[")) {
                    listaActual = new ArrayList<>();
                } else if (linea.contains("]")) {
                    if (listaActual != null) {
                        listas.add(listaActual);
                    }
                } else if (listaActual != null && !linea.trim().isEmpty()) {
                    listaActual.add(linea.trim());
                }
            }
        } catch (Exception e) {
        }

        return listas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_guardarcambios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_crearVehiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_modelo = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        btn_crearVehiculo = new javax.swing.JButton();
        tf_color = new javax.swing.JTextField();
        panel_crearVendedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_cantCV = new javax.swing.JTextField();
        tf_dineroG = new javax.swing.JTextField();
        tf_nombreVendedor = new javax.swing.JTextField();
        btn_crearVendedor = new javax.swing.JButton();
        panel_crearCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_nombreCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_profesion = new javax.swing.JTextField();
        btn_crearCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tf_cantCC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_sueldo = new javax.swing.JTextField();
        jSpinner_edad = new javax.swing.JSpinner();
        panel_asignarV = new javax.swing.JPanel();
        cb_Vendedor = new javax.swing.JComboBox<>();
        cb_Cliente = new javax.swing.JComboBox<>();
        cb_carro = new javax.swing.JComboBox<>();
        btn_vender = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        TreeAct = new javax.swing.JTree();
        btn_finalizar = new javax.swing.JButton();
        btn_actualizartree1 = new javax.swing.JButton();
        btn_actualizartree2 = new javax.swing.JButton();
        btn_editarJSON = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        btn_guardarcambios.setText("Guardar");
        btn_guardarcambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarcambiosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(btn_guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardarcambios, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        panel_crearVehiculo.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Marca");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Color");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio");

        btn_crearVehiculo.setText("Crear");
        btn_crearVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearVehiculoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_crearVehiculoLayout = new javax.swing.GroupLayout(panel_crearVehiculo);
        panel_crearVehiculo.setLayout(panel_crearVehiculoLayout);
        panel_crearVehiculoLayout.setHorizontalGroup(
            panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_crearVehiculoLayout.createSequentialGroup()
                        .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_modelo)
                            .addComponent(tf_marca, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(tf_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_color))
                        .addGap(0, 372, Short.MAX_VALUE))
                    .addComponent(btn_crearVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_crearVehiculoLayout.setVerticalGroup(
            panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearVehiculoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_crearVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Vehiculo", panel_crearVehiculo);

        panel_crearVendedor.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad de Carros Vendidos");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad de Dinero Generado");

        btn_crearVendedor.setText("Agregar");
        btn_crearVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearVendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_crearVendedorLayout = new javax.swing.GroupLayout(panel_crearVendedor);
        panel_crearVendedor.setLayout(panel_crearVendedorLayout);
        panel_crearVendedorLayout.setHorizontalGroup(
            panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crearVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_crearVendedorLayout.createSequentialGroup()
                        .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panel_crearVendedorLayout.createSequentialGroup()
                                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crearVendedorLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_dineroG, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_crearVendedorLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_nombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_cantCV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_crearVendedorLayout.setVerticalGroup(
            panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearVendedorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_cantCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_dineroG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(btn_crearVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Vendedor", panel_crearVendedor);

        panel_crearCliente.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Edad");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Profesion");

        btn_crearCliente.setText("Agregar");
        btn_crearCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearClienteMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Cant. Carros Comprados");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Sueldo Disp.");

        jSpinner_edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));

        javax.swing.GroupLayout panel_crearClienteLayout = new javax.swing.GroupLayout(panel_crearCliente);
        panel_crearCliente.setLayout(panel_crearClienteLayout);
        panel_crearClienteLayout.setHorizontalGroup(
            panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_crearClienteLayout.createSequentialGroup()
                        .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_crearClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_crearClienteLayout.createSequentialGroup()
                                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_crearClienteLayout.createSequentialGroup()
                                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cantCC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_crearClienteLayout.setVerticalGroup(
            panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearClienteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinner_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_cantCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_crearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Cliente", panel_crearCliente);

        panel_asignarV.setBackground(new java.awt.Color(0, 102, 102));

        btn_vender.setText("Vender");
        btn_vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_venderMouseClicked(evt);
            }
        });

        jLabel14.setText("Vendedor");

        jLabel15.setText("Cliente");

        jLabel16.setText("Carro");

        javax.swing.GroupLayout panel_asignarVLayout = new javax.swing.GroupLayout(panel_asignarV);
        panel_asignarV.setLayout(panel_asignarVLayout);
        panel_asignarVLayout.setHorizontalGroup(
            panel_asignarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_asignarVLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cb_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(cb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignarVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_asignarVLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignarVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_asignarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignarVLayout.createSequentialGroup()
                        .addComponent(cb_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignarVLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(302, 302, 302))))
        );
        panel_asignarVLayout.setVerticalGroup(
            panel_asignarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_asignarVLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panel_asignarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_asignarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btn_vender, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Asignar Venta", panel_asignarV);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Admin");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Dia");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Venta");
        treeNode1.add(treeNode2);
        TreeAct.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(TreeAct);

        btn_finalizar.setText("Finalizar Dia");
        btn_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseClicked(evt);
            }
        });

        btn_actualizartree1.setText("Actualizar Tree de Actividad");
        btn_actualizartree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizartree1MouseClicked(evt);
            }
        });

        btn_actualizartree2.setText("Actualizar Tree de Admin");
        btn_actualizartree2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizartree2MouseClicked(evt);
            }
        });

        btn_editarJSON.setText("Editar JSON");
        btn_editarJSON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarJSONMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizartree1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(btn_actualizartree2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(btn_editarJSON, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizartree1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizartree2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Trees  y Finalizar Dia", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearVehiculoMouseClicked
        // TODO add your handling code here:
        if (tf_marca.getText().isEmpty() || tf_modelo.getText().isEmpty() || tf_precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los parametros deben estar completos");
        } else {
            String marca = tf_marca.getText();
            String color = tf_color.getText();
            String modelo = tf_modelo.getText();
            int ft = jYearChooser1.getYear();
            String año = String.valueOf(ft);
            double precioV = Double.parseDouble(tf_precio.getText());
            carros.add(new Vehiculo(marca, color, modelo, año, precioV, idCarro));
            cb_carro.setModel(actualizarcbCarro());
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                file = new File("./Carros.txt");
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                String lineas = "[\n"
                        + "\t" + marca + ",\n"
                        + "\t" + color + ",\n"
                        + "\t" + modelo + ",\n"
                        + "\t" + año + ",\n"
                        + "\t" + idCarro + ",\n"
                        + "\t" + precioV + "\n];\n";
                bw.write(lineas);
                bw.flush();
                fw.close();
                bw.close();
                idCarro++;
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Agregado exitosamente");
            tf_marca.setText("");
            tf_modelo.setText("");
            tf_precio.setText("");
            tf_color.setText("");
        }
    }//GEN-LAST:event_btn_crearVehiculoMouseClicked

    private void btn_crearVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearVendedorMouseClicked
        // TODO add your handling code here:
        if (tf_nombreVendedor.getText().isEmpty() || tf_cantCV.getText().isEmpty() || tf_dineroG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los parametros deben estar llenos");
        } else {
            String nombre = tf_nombreVendedor.getText();
            int cantCV = Integer.parseInt(tf_cantCV.getText());
            double cantDG = Double.parseDouble(tf_dineroG.getText());
            vendedores.add(new Vendedor(nombre, cantCV, cantDG));
            cb_Vendedor.setModel(actualizarcbVendedor());
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                file = new File("./Vendedores.txt");
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                String lineas = "[\n"
                        + "\t" + nombre + ",\n"
                        + "\t" + cantCV + ",\n"
                        + "\t" + cantDG + "\n];\n";
                bw.write(lineas);
                bw.flush();
                fw.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Agregado exitosamente");
            tf_nombreVendedor.setText("");
            tf_cantCV.setText("");
            tf_dineroG.setText("");
        }
    }//GEN-LAST:event_btn_crearVendedorMouseClicked

    private void btn_crearClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearClienteMouseClicked
        // TODO add your handling code here:
        if (tf_cantCC.getText().isEmpty()
                || tf_nombreCliente.getText().isEmpty()
                || tf_profesion.getText().isEmpty()
                || tf_sueldo.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Todos los parametros deben estar llenos");
        } else {
            String nombre = tf_nombreCliente.getText();
            int edad = (int) jSpinner_edad.getValue();
            String profesion = tf_profesion.getText();
            int cantCC = Integer.parseInt(tf_cantCC.getText());
            double sueldoD = Double.parseDouble(tf_sueldo.getText());
            clientes.add(new Cliente(nombre, edad, profesion, cantCC, sueldoD));
            cb_Cliente.setModel(actualizarcbCliente());
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                file = new File("./Clientes.txt");
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                String lineas = "[\n"
                        + "\t" + nombre + ",\n"
                        + "\t" + edad + ",\n"
                        + "\t" + profesion + ",\n"
                        + "\t" + cantCC + ",\n"
                        + "\t" + sueldoD + "\n];\n";
                bw.write(lineas);
                bw.flush();
                fw.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Agregado exitosamente");
            tf_nombreCliente.setText("");
            tf_sueldo.setText("");
            tf_cantCC.setText("");
            tf_profesion.setText("");
        }
    }//GEN-LAST:event_btn_crearClienteMouseClicked

    private void btn_venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_venderMouseClicked
        // TODO add your handling code here:
        if (cb_Cliente.getSelectedIndex() >= 0 || cb_Vendedor.getSelectedIndex() >= 0 || cb_carro.getSelectedIndex() >= 0) {
            Cliente cliente = clientes.get(cb_Cliente.getSelectedIndex());
            Vendedor vendedor = vendedores.get(cb_Vendedor.getSelectedIndex());
            Vehiculo carro = carros.get(cb_carro.getSelectedIndex());
            String vend = vendedor.getNombre();
            String client = cliente.getNombre();
            String carroV = carro.getMarca() + " " + carro.getModelo();
            double costo = carro.getPrecioV();
            int idCarro = carro.getIdCarro();
            ventas.add(new Venta(vend, client, costo, carroV, idCarro));
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                file = new File("./Ventas.txt");
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                String lineas = "[\n"
                        + "\t" + vend + ",\n"
                        + "\t" + client + ",\n"
                        + "\t" + carroV + ",\n"
                        + "\t" + costo + ",\n"
                        + "\t" + idCarro + "\n];\n";
                bw.write(lineas);
                bw.flush();
                fw.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Venta realizada exitosamente");
        }
    }//GEN-LAST:event_btn_venderMouseClicked

    private void btn_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Esta seguro?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String path = "./actividades/";
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            String lineas = "";
            path += JOptionPane.showInputDialog("Ingrese el nombre del archivo de actividad");
            path += ".txt";
            try {
                file = new File(path);
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                int cont = 1;
                for (Venta t : ventas) {
                    lineas = "[\n"
                            + "\t" + cont + ",\n"
                            + "\t" + t.getCliente() + ",\n"
                            + "\t" + t.getVendedor() + ",\n"
                            + "\t" + t.getCarroV() + ",\n"
                            + "\t" + t.getIdCarro() + "\n];\n";
                    bw.write(lineas);
                    cont++;
                }
                bw.flush();
                fw.close();
                bw.close();
                ventas.clear();
                JOptionPane.showMessageDialog(this, "Actividades guardadas exitosamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_finalizarMouseClicked

    private void btn_guardarcambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarcambiosMouseClicked
        // TODO add your handling code here:
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (JOptionPane.showConfirmDialog(this, "Desea Guardar los cambios", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                bw.write(jTextArea1.getText());
                bw.flush();
                fw.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btn_guardarcambiosMouseClicked

    private void btn_editarJSONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarJSONMouseClicked
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de texto", "txt");
            jfc.setFileFilter(filtro);
            FileReader fr = null;
            BufferedReader br = null;
            int select = jfc.showOpenDialog(this);
            if (select == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                jTextArea1.setText("");
                while ((linea = br.readLine()) != null) {
                    jTextArea1.append(linea);
                    jTextArea1.append("\n");
                }
                jDialog1.setModal(true);
                jDialog1.setLocationRelativeTo(this);
                jDialog1.pack();
                jDialog1.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_editarJSONMouseClicked

    private void btn_actualizartree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizartree1MouseClicked
        // TODO add your handling code here:
        modeloDefault();
        DefaultTreeModel m = (DefaultTreeModel) TreeAct.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        try {
            JFileChooser jfc = new JFileChooser("./actividades");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de texto", "txt");
            jfc.setFileFilter(filtro);
            File file = null;
            int select = jfc.showOpenDialog(this);
            if (select == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();
                ArrayList<ArrayList<String>> listas = obtenerListas(file);
                for (ArrayList<String> t : listas) {
                    if (t.size() == 5) {
                        DefaultMutableTreeNode a = new DefaultMutableTreeNode(t.get(0).replace(",", ""));
                        DefaultMutableTreeNode b = new DefaultMutableTreeNode(t.get(1).replace(",", ""));
                        DefaultMutableTreeNode c = new DefaultMutableTreeNode(t.get(2).replace(",", ""));
                        DefaultMutableTreeNode d = new DefaultMutableTreeNode(t.get(3).replace(",", ""));
                        DefaultMutableTreeNode e = new DefaultMutableTreeNode(t.get(4).replace(",", ""));
                        ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(a);
                        a.add(b);
                        a.add(c);
                        a.add(d);
                        a.add(e);
                    }
                }
                m.reload();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_actualizartree1MouseClicked

    private void btn_actualizartree2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizartree2MouseClicked
        // TODO add your handling code here:
        modeloDefault2();
        DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode vehi = new DefaultMutableTreeNode("Vehiculos");
        DefaultMutableTreeNode vend = new DefaultMutableTreeNode("Vendedores");
        DefaultMutableTreeNode client = new DefaultMutableTreeNode("Clientes");
        DefaultMutableTreeNode vent = new DefaultMutableTreeNode("Ventas");
        raiz.add(vehi);
        raiz.add(vend);
        raiz.add(client);
        raiz.add(vent);
        int cont = 1;
        try {
            File Vehiculos = new File("./Carros.txt");
            File Vendedores = new File("./Vendedores.txt");
            File Clientes = new File("./Clientes.txt");
            File Ventas = new File("./Ventas.txt");
            ArrayList<ArrayList<String>> listasVehiculos = obtenerListas(Vehiculos);
            ArrayList<ArrayList<String>> listasVendedores = obtenerListas(Vendedores);
            ArrayList<ArrayList<String>> listasClientes = obtenerListas(Clientes);
            ArrayList<ArrayList<String>> listasVentas = obtenerListas(Ventas);
            for (ArrayList<String> t : listasVehiculos) {
                DefaultMutableTreeNode a = new DefaultMutableTreeNode(t.get(0).replace(",", ""));
                DefaultMutableTreeNode b = new DefaultMutableTreeNode(t.get(1).replace(",", ""));
                DefaultMutableTreeNode c = new DefaultMutableTreeNode(t.get(2).replace(",", ""));
                DefaultMutableTreeNode d = new DefaultMutableTreeNode(t.get(3).replace(",", ""));
                DefaultMutableTreeNode e = new DefaultMutableTreeNode(t.get(4).replace(",", ""));
                DefaultMutableTreeNode f = new DefaultMutableTreeNode(t.get(5).replace(",", ""));
                e.add(a);
                e.add(b);
                e.add(c);
                e.add(d);
                e.add(f);
                vehi.add(e);
            }
            for (ArrayList<String> t : listasVendedores) {
                DefaultMutableTreeNode a = new DefaultMutableTreeNode(t.get(0).replace(",", ""));
                DefaultMutableTreeNode b = new DefaultMutableTreeNode(t.get(1).replace(",", ""));
                DefaultMutableTreeNode c = new DefaultMutableTreeNode(t.get(2).replace(",", ""));
                a.add(b);
                a.add(c);
                vend.add(a);
            }

            for (ArrayList<String> t : listasClientes) {
                DefaultMutableTreeNode a = new DefaultMutableTreeNode(t.get(0).replace(",", ""));
                DefaultMutableTreeNode b = new DefaultMutableTreeNode(t.get(1).replace(",", ""));
                DefaultMutableTreeNode c = new DefaultMutableTreeNode(t.get(2).replace(",", ""));
                DefaultMutableTreeNode d = new DefaultMutableTreeNode(t.get(3).replace(",", ""));
                DefaultMutableTreeNode e = new DefaultMutableTreeNode(t.get(4).replace(",", ""));
                a.add(b);
                a.add(c);
                a.add(d);
                a.add(e);
                client.add(a);
            }

            for (ArrayList<String> t : listasVentas) {
                DefaultMutableTreeNode a = new DefaultMutableTreeNode(cont);
                DefaultMutableTreeNode b = new DefaultMutableTreeNode(t.get(0).replace(",", ""));
                DefaultMutableTreeNode c = new DefaultMutableTreeNode(t.get(1).replace(",", ""));
                DefaultMutableTreeNode d = new DefaultMutableTreeNode(t.get(2).replace(",", ""));
                DefaultMutableTreeNode e = new DefaultMutableTreeNode(t.get(3).replace(",", ""));
                DefaultMutableTreeNode f = new DefaultMutableTreeNode(t.get(4).replace(",", ""));
                a.add(b);
                a.add(c);
                a.add(d);
                a.add(e);
                a.add(f);
                vent.add(a);
                cont++;
            }
            m.reload();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_actualizartree2MouseClicked

    public void modeloDefault() {
        DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Dia");
        DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Venta");
        treeNode1.add(treeNode2);
        TreeAct.setModel(new DefaultTreeModel(treeNode1));
    }

    public void modeloDefault2() {
        DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Admin");
        jTree1.setModel(new DefaultTreeModel(treeNode1));
    }

    public DefaultComboBoxModel actualizarcbCarro() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Vehiculo t : carros) {
            modelo.addElement(t);
        }
        return modelo;
    }

    public DefaultComboBoxModel actualizarcbVendedor() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Vendedor t : vendedores) {
            modelo.addElement(t);
        }
        return modelo;
    }

    public DefaultComboBoxModel actualizarcbCliente() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Cliente t : clientes) {
            modelo.addElement(t);
        }
        return modelo;
    }

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
            java.util.logging.Logger.getLogger(FrameM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree TreeAct;
    private javax.swing.JButton btn_actualizartree1;
    private javax.swing.JButton btn_actualizartree2;
    private javax.swing.JButton btn_crearCliente;
    private javax.swing.JButton btn_crearVehiculo;
    private javax.swing.JButton btn_crearVendedor;
    private javax.swing.JButton btn_editarJSON;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_guardarcambios;
    private javax.swing.JButton btn_vender;
    private javax.swing.JComboBox<String> cb_Cliente;
    private javax.swing.JComboBox<String> cb_Vendedor;
    private javax.swing.JComboBox<String> cb_carro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_edad;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JPanel panel_asignarV;
    private javax.swing.JPanel panel_crearCliente;
    private javax.swing.JPanel panel_crearVehiculo;
    private javax.swing.JPanel panel_crearVendedor;
    private javax.swing.JTextField tf_cantCC;
    private javax.swing.JTextField tf_cantCV;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_dineroG;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nombreCliente;
    private javax.swing.JTextField tf_nombreVendedor;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_profesion;
    private javax.swing.JTextField tf_sueldo;
    // End of variables declaration//GEN-END:variables
}
