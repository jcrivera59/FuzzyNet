/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzynetswing;

import static fuzzynetswing.MenuOverview.A;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VL;
import model.variableLinguistica;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author Juan Camilo
 */
public class createInput extends javax.swing.JDialog {

    /**
     * Creates new form createVLInputNet
     */
    //Instance of the parent window
    ArrayList<String> arrayParameters = new ArrayList<String>();
    ArrayList<String> arrayEjemplo = new ArrayList<String>();
    ArrayList<Double> arrayParametersLQ = new ArrayList<Double>();
    boolean onOff = false;

    public createInput() {
    }

    private MenuOverview principalWindow = (MenuOverview) this.getParent();

    public createInput(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nameNode.setText(A.getNameNodeSeleccionado());

        
//        
//        ArrayList<String> arrayComboQualifiers = new ArrayList<>();
//        
//        arrayComboQualifiers.add("puta1");
//        arrayComboQualifiers.add("puta2");
//        
//        int z = A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().size();
//
//        for (int c = 0; c < A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().get(z - 1).getCalificadores().size(); c++) {
//            arrayComboQualifiers.add(A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().get(z - 1).getCalificadores().get(c).getNombreCL());
//        }        
//        
//        DefaultTableModel modelComboQualifiers = new DefaultTableModel();
//        
//        modelComboQualifiers.addColumn(arrayComboQualifiers);
//        comboLQ.setModel((ComboBoxModel) modelComboQualifiers);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fuzzifier = new javax.swing.JTextField();
        buttonGraph = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nameVariable = new javax.swing.JTextField();
        nameNode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newLQButton = new javax.swing.JButton();
        deleteLQButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LQName = new javax.swing.JTextField();
        comboBoxMembershipFunction = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableParameters = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboLQ = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("New Input");

        jLabel2.setText("Fuzzifier:");

        fuzzifier.setEditable(false);
        fuzzifier.setText("Singleton");
        fuzzifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuzzifierActionPerformed(evt);
            }
        });

        buttonGraph.setText("Graph");
        buttonGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGraphActionPerformed(evt);
            }
        });

        jLabel6.setText("Variables");

        nameVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameVariableActionPerformed(evt);
            }
        });

        nameNode.setEditable(false);

        jLabel1.setText("Node");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(nameNode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fuzzifier, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonGraph)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fuzzifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGraph))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Linguistic Qualifiers");

        newLQButton.setText("New LQ");
        newLQButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLQButtonActionPerformed(evt);
            }
        });

        deleteLQButton.setText("Delete LQ");

        jLabel4.setText("Name LQ: ");

        comboBoxMembershipFunction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select LQ-", "Triangular", "Trapetzoidal", "Gauss", "Generalized bell", "Sigmoidal", "Gaussian double", "Cosine", "Difference of sigmoidals", "Piece-wise linear" }));
        comboBoxMembershipFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMembershipFunctionActionPerformed(evt);
            }
        });

        jLabel5.setText("Membership Function: ");

        tableParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null},
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Parameter", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableParameters);
        if (tableParameters.getColumnModel().getColumnCount() > 0) {
            tableParameters.getColumnModel().getColumn(0).setResizable(false);
        }

        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("Accept");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("List: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LQName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxMembershipFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboLQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newLQButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteLQButton))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(okButton)
                        .addGap(51, 51, 51)
                        .addComponent(cancelButton)))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newLQButton)
                    .addComponent(deleteLQButton)
                    .addComponent(jLabel7)
                    .addComponent(comboLQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LQName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMembershipFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String parseParameters(String Parameter) {
        String parameterLQ = "";

        if (Parameter == "Triangular") {
            parameterLQ = "trian";
        }

        if (Parameter == "Trapetzoidal") {
            parameterLQ = "trape";
        }

        if (Parameter == "Gauss") {
            parameterLQ = "gauss";
        }

        if (Parameter == "Generalized bell") {
            parameterLQ = "gbell";
        }

        if (Parameter == "Sigmoidal") {
            parameterLQ = "sigm";
        }

        if (Parameter == "Gaussian double") {
            parameterLQ = "No existe";
        }

        if (Parameter == "Difference of sigmoidals") {
            parameterLQ = "No existe";
        }

        return parameterLQ;
    }

    public void parametersMembershipFunction(String MQ) {

        DefaultTableModel modelTableParameters = new DefaultTableModel();

        modelTableParameters.addColumn("Parameters");
        modelTableParameters.addColumn("Values");
        String texto = null;

        if (MQ == "Triangular") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});
            modelTableParameters.addRow(new Object[]{"C:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Trapetzoidal") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});
            modelTableParameters.addRow(new Object[]{"C:", "0.0"});
            modelTableParameters.addRow(new Object[]{"D:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Gauss") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Generalized bell") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});
            modelTableParameters.addRow(new Object[]{"C:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Sigmoidal") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Gaussian double") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});
            modelTableParameters.addRow(new Object[]{"C:", "0.0"});
            modelTableParameters.addRow(new Object[]{"D:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Cosine") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }

        if (MQ == "Difference of sigmoidals") {
            arrayParameters.clear();
            arrayParametersLQ.clear();
            modelTableParameters.addRow(new Object[]{"A:", "0.0"});
            modelTableParameters.addRow(new Object[]{"B:", "0.0"});
            modelTableParameters.addRow(new Object[]{"C:", "0.0"});
            modelTableParameters.addRow(new Object[]{"D:", "0.0"});

            int cols = modelTableParameters.getColumnCount();
            int rows = modelTableParameters.getRowCount();

            System.out.println("Cols: " + cols);
            System.out.println("Rows: " + rows);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(modelTableParameters.getValueAt(i, j));
                    System.out.println();
                    arrayParameters.add((String) modelTableParameters.getValueAt(i, j));
                }
            }
            tableParameters.setModel(modelTableParameters);
        }
    }

    public void addToFinalArray() {
        int cols = tableParameters.getColumnCount();
        int rows = tableParameters.getRowCount();

        arrayParameters.clear();
        arrayParametersLQ.clear();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrayParameters.add(tableParameters.getValueAt(i, j).toString());
            }
        }

        for (int h = 1; h < arrayParameters.size(); h++, h++) {
            arrayParametersLQ.add(Double.parseDouble(arrayParameters.get(h)));
        }

        System.out.print(arrayParametersLQ);

        System.out.println("ARRAY Antiguo" + arrayParameters);
        System.out.println("ARRAY Nuevo" + arrayParametersLQ);

    }

    private void fuzzifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuzzifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuzzifierActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void newLQButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLQButtonActionPerformed

        if (LQName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "The linguistic qualifier field is empty");
        } else {
            if (comboBoxMembershipFunction.getSelectedItem() == "-Select LQ-") {
                JOptionPane.showMessageDialog(this, "The membership function field is empty");
            } else {
                String nameLQ = LQName.getText();
                String typeLQ = comboBoxMembershipFunction.getSelectedItem().toString();

                String typeLinguisticQualifier = parseParameters(typeLQ);

                int z = A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().size();

                if (onOff == false) {

                    variableLinguistica v = new variableLinguistica();
                    v.setNombreVL(nameVariable.getText());

                    addToFinalArray();

                    v.agregarCalificador(nameLQ, typeLinguisticQualifier, arrayParametersLQ);
                    A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().add(v);

                    onOff = true;
                } else {
                    addToFinalArray();
                    A.getCapas().get(A.getPosX()).getNodos().get(A.getPosY() - 1).getVLEntrada().get(z - 1).agregarCalificador(nameLQ, typeLinguisticQualifier, arrayParametersLQ);
                }

            }
        }
    }//GEN-LAST:event_newLQButtonActionPerformed

    private void buttonGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraphActionPerformed

//        String variableLista = listLinguisticQualifiers.getSelectedValue().toString();

    }//GEN-LAST:event_buttonGraphActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        if (onOff = false) {
            variableLinguistica v = new variableLinguistica();
            v.setNombreVL(nameVariable.getText());
        }

        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void nameVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameVariableActionPerformed

    private void comboBoxMembershipFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMembershipFunctionActionPerformed
        String FQSelected = comboBoxMembershipFunction.getSelectedItem().toString();
        parametersMembershipFunction(FQSelected);
    }//GEN-LAST:event_comboBoxMembershipFunctionActionPerformed

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
            java.util.logging.Logger.getLogger(createInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createInput dialog = new createInput(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LQName;
    private javax.swing.JButton buttonGraph;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox comboBoxMembershipFunction;
    private javax.swing.JComboBox comboLQ;
    private javax.swing.JButton deleteLQButton;
    private javax.swing.JTextField fuzzifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameNode;
    private javax.swing.JTextField nameVariable;
    private javax.swing.JButton newLQButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTable tableParameters;
    // End of variables declaration//GEN-END:variables
}
