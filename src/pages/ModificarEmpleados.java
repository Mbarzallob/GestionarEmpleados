/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Empleado;
import models.TipoContrato;
import services.EmpleadoService;
import services.TipoContratoService;

/**
 *
 * @author mbarz
 */
public class ModificarEmpleados extends javax.swing.JFrame {

    EmpleadoService empleadoService;
    TipoContratoService contratoService;
    List<TipoContrato> listaContratos;
    TipoContrato contratoSeleccionado;
    VentanaPrincipal principal;

    /**
     * Creates new form AgregarEmpleado
     */
    public ModificarEmpleados(EmpleadoService empleadoService, TipoContratoService contratoService, VentanaPrincipal principal) {
        initComponents();
        this.empleadoService = empleadoService;
        this.contratoService = contratoService;
        this.principal = principal;
        visibilidad(true);
        listaContratos = contratoService.listarContratos();
        contratoSeleccionado = listaContratos.get(0);
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel) contratoCombo.getModel();
        model.removeAllElements();
        for (TipoContrato contrato : listaContratos) {
            model.addElement(contrato.getDescripcion());
        }
        contratoCombo.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefonoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salarioText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contratoCombo = new javax.swing.JComboBox<>();
        modificarEmpleado = new javax.swing.JButton();
        regresarBoton = new javax.swing.JButton();
        BuscarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Telefono");

        jLabel5.setText("Salario");

        jLabel6.setText("Tipo Contrato");

        contratoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                contratoComboItemStateChanged(evt);
            }
        });

        modificarEmpleado.setText("Modificar");
        modificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmpleadoActionPerformed(evt);
            }
        });

        regresarBoton.setText("Regresar");
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        BuscarEmpleado.setText("Buscar");
        BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarEmpleado)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefonoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(apellidoText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(salarioText)
                            .addComponent(contratoCombo, 0, 117, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(regresarBoton)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contratoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarEmpleado)
                    .addComponent(regresarBoton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmpleadoActionPerformed
        if (campos()) {

            String cedula = cedulaText.getText();
            String nombre = nombreText.getText();
            String apellido = apellidoText.getText();
            String telefono = telefonoText.getText();
            String salario = salarioText.getText();
            int idTipoContrato = contratoSeleccionado.getIdTipoContrato();
            Empleado e = new Empleado(cedula, nombre, apellido, telefono, salario, idTipoContrato);
            boolean validacion = empleadoService.modificarEmpleado(e);
            if (validacion) {
                JOptionPane.showMessageDialog(this, "Se ha modificado el empleado correctamente");
                limpiarCampos();
                this.setVisible(false);
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al modificar el empleado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Rellene todo los campos por favor");

        }
    }//GEN-LAST:event_modificarEmpleadoActionPerformed

    private void contratoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_contratoComboItemStateChanged
        int index = contratoCombo.getSelectedIndex();
        contratoSeleccionado = listaContratos.get(index);
    }//GEN-LAST:event_contratoComboItemStateChanged

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        limpiarCampos();
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_regresarBotonActionPerformed

    private void BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmpleadoActionPerformed
        if (!cedulaText.getText().isEmpty()) {
            Empleado e = empleadoService.buscarEmpleado(cedulaText.getText());
            if (e != null) {
                visibilidad(false);
                nombreText.setText(e.getNombre());
                apellidoText.setText(e.getApellido());
                telefonoText.setText(e.getTelefono());
                salarioText.setText(e.getSalario());

                for (int i = 0; i < listaContratos.size(); i++) {
                    if (listaContratos.get(i).getIdTipoContrato() == e.getIdTipoContrato()) {
                        contratoCombo.setSelectedIndex(i);
                        contratoSeleccionado = listaContratos.get(i);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado ningun empleado con esa cedula");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una cedula");
        }
    }//GEN-LAST:event_BuscarEmpleadoActionPerformed

    private boolean campos() {
        return !cedulaText.getText().isEmpty()
                && !nombreText.getText().isEmpty()
                && !apellidoText.getText().isEmpty()
                && !telefonoText.getText().isBlank()
                && !salarioText.getText().isEmpty();
    }

    private void limpiarCampos() {
        cedulaText.setText("");
        nombreText.setText("");
        apellidoText.setText("");
        telefonoText.setText("");
        salarioText.setText("");
        contratoCombo.setSelectedIndex(0);

        visibilidad(true);
    }

    private void visibilidad(boolean v) {
        cedulaText.setEnabled(v);
        BuscarEmpleado.setEnabled(v);
        nombreText.setEnabled(!v);
        apellidoText.setEnabled(!v);
        telefonoText.setEnabled(!v);
        salarioText.setEnabled(!v);
        contratoCombo.setEnabled(!v);
        modificarEmpleado.setEnabled(!v);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEmpleado;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JComboBox<String> contratoCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton modificarEmpleado;
    private javax.swing.JTextField nombreText;
    private javax.swing.JButton regresarBoton;
    private javax.swing.JTextField salarioText;
    private javax.swing.JTextField telefonoText;
    // End of variables declaration//GEN-END:variables
}