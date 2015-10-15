package fuzzynetswing;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import model.Administrador;

/**
 *
 * @author Juan Camilo
 */
public class MenuOverview extends javax.swing.JFrame {

    /**
     * Creates new form MenuOverview
     */
    // Matrix of layers
    JPanel Layouts[][];
    // Array of nodes
    JPanel Nodes[];
    // Layered nodes counters
    int contador = 0;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;
    int contador7 = 0;
    int contador8 = 0;
    int contador9 = 0;
    int contador10 = 0;

    //Instance Administrator
    static Administrador A = new Administrador();

    //Combobox value to static variable    
    ArrayList<String> arrayNodesNames = new ArrayList<String>();

    //Constructor that initializes the main window
    public MenuOverview() {
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (Exception ex) {
        }
        initComponents();
        addNode.setEnabled(false);
        newInputButton.setEnabled(false);
        newOutputButton.setEnabled(false);        
    }

    /**
     *Method responsible for creating the network 
     *and assign the name of the network 
     *Administrador object     
     */
    public Administrador createNetwork(String nameNetwork) {
        A.setNombreRed(nameNetwork);
        addNode.setEnabled(true);
        newInputButton.setEnabled(true);
        newOutputButton.setEnabled(true);
        configuration(1, 1);
        return A;
    }

    /**
     *Method responsible for setting the grid 
     *according to the number of layers that 
     * the user selects.      
     */
    public void configuration(int x, int y) {
        comboBoxNode.removeAllItems();
        x = 10;
        int cantidad = 0;
        panelLayer.removeAll();
        panelLayer.setLayout(new java.awt.GridLayout(x, y));
        Layouts = new JPanel[x][y];

        for (int b = 0; b < x; b++) {
            A.anadirCapa(b);
        }

        for (int i = 0; i < (x); i++) {
            for (int j = 0; j < (y); j++) {
                Layouts[i][j] = new JPanel();
                Layouts[i][j].setLayout(new java.awt.GridLayout(1, 1));
//                Layouts[i][j].setBackground(new java.awt.Color(0, 204 + (i + 10), 255));
                Border matte = BorderFactory.createMatteBorder(0, 1, 0, 1, Color.BLACK);
                Layouts[i][j].setBorder(matte);
                panelLayer.add(Layouts[i][j]);
                cantidad = y;
            }
        }
        for (int zz = 0; zz < cantidad; zz++) {
            comboBoxNode.addItem(zz + 1);
        }
        panelLayer.updateUI();
    }

    void mouseactionlabel(final JLabel node, final String nameNode, final int posX, final int posY) {
        node.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                
                System.out.println("El nodo seleccionado es:" + nameNode);
                System.out.println("PosX:" + posX + "PosY:" + posY);
                A.setPosX(posX);
                A.setPosY(posY);
                A.setNameNodeSeleccionado(nameNode);
                System.out.println("Admin Name Node:" + nameNode);
                System.out.println("Admin PosX:" + posX + "PosY:" + posY);
            }

            public void mouseEntered(MouseEvent arg0) {
            }

            public void mouseExited(MouseEvent arg0) {
            }

            public void mousePressed(MouseEvent arg0) {                
                Layouts[posY][posX].setBackground(new java.awt.Color(0, 204 + (10), 255));
                Border matte = BorderFactory.createMatteBorder(0, 1, 0, 1, Color.BLACK);
                Layouts[posY][posX].setBorder(matte);
            }

            public void mouseReleased(MouseEvent arg0) {
            }
        });
    }

    public boolean createNode(String nameNode) {

        //If that validates whether a node already exists
        if (arrayNodesNames.contains(nameNode)) {
            JOptionPane.showMessageDialog(this, "The node already exists");
            return false;
        }

        arrayNodesNames.add(nameNode);

        //Select the layer where the node is added 
        //and stored in the variable variable name
        int variable = (int) comboBoxNode.getSelectedItem();

        //Validates that the text field node name is empty
        if (nameNode.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "The text field is empty");
        } else {

            //Sections nodes added to layers
            //WHERE
            //Number of the LAYER(X) is VARIABLE and the ROW(Y) is CONTADOR
            //Layout 1            
            if (variable == 1) {
                if (contador1 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador1][variable - 1].add(node);
                    Layouts[contador1][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador1);

                    A.getCapas().get(0).anadirNodo(contador1, nameNode);
                    contador1++;
                    
                    mouseactionlabel(node, nameNode, variable - 1, contador1);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }

            }

            //Layout 2            
            if (variable == 2) {
                if (contador2 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador2][variable - 1].add(node);
                    Layouts[contador2][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador2);

                    A.getCapas().get(1).anadirNodo(contador2, nameNode);

                    contador2++;

                    mouseactionlabel(node, nameNode, variable - 1, contador2);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 3         
            if (variable == 3) {
                if (contador3 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador3][variable - 1].add(node);
                    Layouts[contador3][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador3);

                    A.getCapas().get(2).anadirNodo(contador3, nameNode);

                    contador3++;

                    mouseactionlabel(node, nameNode, variable - 1, contador3);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 4            
            if (variable == 4) {
                if (contador4 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador4][variable - 1].add(node);
                    Layouts[contador4][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador4);

                    A.getCapas().get(3).anadirNodo(contador4, nameNode);

                    contador4++;

                    mouseactionlabel(node, nameNode, variable - 1, contador4);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 5            
            if (variable == 5) {
                if (contador5 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador5][variable - 1].add(node);
                    Layouts[contador5][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador5);

                    A.getCapas().get(4).anadirNodo(contador5, nameNode);

                    contador5++;

                    mouseactionlabel(node, nameNode, variable - 1, contador5);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 6            
            if (variable == 6) {
                if (contador6 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador6][variable - 1].add(node);
                    Layouts[contador6][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador6);

                    A.getCapas().get(5).anadirNodo(contador6, nameNode);

                    contador6++;

                    mouseactionlabel(node, nameNode, variable - 1, contador6);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 7            
            if (variable == 7) {
                if (contador7 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador7][variable - 1].add(node);
                    Layouts[contador7][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador7);

                    A.getCapas().get(6).anadirNodo(contador7, nameNode);

                    contador7++;

                    mouseactionlabel(node, nameNode, variable - 1, contador7);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 8            
            if (variable == 8) {
                if (contador8 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador8][variable - 1].add(node);
                    Layouts[contador8][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador8);

                    A.getCapas().get(7).anadirNodo(contador8, nameNode);

                    contador8++;

                    mouseactionlabel(node, nameNode, variable - 1, contador8);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 9            
            if (variable == 9) {
                if (contador9 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador9][variable - 1].add(node);
                    Layouts[contador9][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador9);

                    A.getCapas().get(8).anadirNodo(contador9, nameNode);

                    contador9++;

                    mouseactionlabel(node, nameNode, variable - 1, contador9);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

            //Layout 10            
            if (variable == 10) {
                if (contador10 < 10) {
                    JLabel node = new JLabel();
                    node.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Node.png"));
                    node.setComponentPopupMenu(NodePopup);
                    node.setToolTipText(nameNode);

                    Layouts[contador10][variable - 1].add(node);
                    Layouts[contador10][variable - 1].updateUI();

                    System.out.println("CAPA:" + variable);
                    System.out.println("ROW:" + contador10);

                    A.getCapas().get(9).anadirNodo(contador10, nameNode);

                    contador10++;

                    mouseactionlabel(node, nameNode, variable - 1, contador10);

                } else {
                    JOptionPane.showMessageDialog(null, "Maximum numbers of nodes is 10");
                }
            }

        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NodePopup = new javax.swing.JPopupMenu();
        InputPopUp = new javax.swing.JMenu();
        NodeFuzzify = new javax.swing.JMenuItem();
        NewInput = new javax.swing.JMenuItem();
        OutputPopUp = new javax.swing.JMenu();
        NodeDefuzzify = new javax.swing.JMenuItem();
        NewOutput = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Methods = new javax.swing.JMenuItem();
        Rules = new javax.swing.JMenuItem();
        PanelToolbar = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        New = new javax.swing.JButton();
        Open = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        ButtonSimulateNode = new javax.swing.JButton();
        ButtonSimulateNetwork = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        comboBoxNode = new javax.swing.JComboBox();
        textNameNode = new javax.swing.JTextField();
        addNode = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator1 = new javax.swing.JSeparator();
        PanelInputs = new javax.swing.JPanel();
        newInputButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        PanelOutputs = new javax.swing.JPanel();
        newOutputButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelLayer = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        FileNew = new javax.swing.JMenuItem();
        FileOpen = new javax.swing.JMenuItem();
        FileSave = new javax.swing.JMenuItem();
        FileSaveAs = new javax.swing.JMenuItem();
        FileExit = new javax.swing.JMenuItem();
        Layer = new javax.swing.JMenu();
        ManageLayouts = new javax.swing.JMenu();
        layer1 = new javax.swing.JRadioButtonMenuItem();
        layer2 = new javax.swing.JRadioButtonMenuItem();
        layer3 = new javax.swing.JRadioButtonMenuItem();
        layer4 = new javax.swing.JRadioButtonMenuItem();
        layer5 = new javax.swing.JRadioButtonMenuItem();
        layer6 = new javax.swing.JRadioButtonMenuItem();
        layer7 = new javax.swing.JRadioButtonMenuItem();
        layer8 = new javax.swing.JRadioButtonMenuItem();
        layer9 = new javax.swing.JRadioButtonMenuItem();
        layer10 = new javax.swing.JRadioButtonMenuItem();
        Node = new javax.swing.JMenu();
        NodeCreate = new javax.swing.JMenuItem();
        NodeEdit = new javax.swing.JMenuItem();
        NodeDelete = new javax.swing.JMenuItem();
        Fuzzify = new javax.swing.JMenu();
        FuzzifyAdd = new javax.swing.JMenuItem();
        FuzzifyDelete = new javax.swing.JMenuItem();
        FuzzifyEdit = new javax.swing.JMenuItem();
        Defuzzify = new javax.swing.JMenu();
        DeffuzifyAdd = new javax.swing.JMenuItem();
        DeffuzifyDelete = new javax.swing.JMenuItem();
        DeffuzifyEdit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        EditUserManual = new javax.swing.JMenuItem();
        EditOperatorsManual = new javax.swing.JMenuItem();
        EditAboutUs = new javax.swing.JMenuItem();

        NodePopup.setComponentPopupMenu(NodePopup);
        NodePopup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        InputPopUp.setText("Input");

        NodeFuzzify.setText("Edit Input");
        NodeFuzzify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeFuzzifyActionPerformed(evt);
            }
        });
        InputPopUp.add(NodeFuzzify);

        NewInput.setText("New Input");
        NewInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInputActionPerformed(evt);
            }
        });
        InputPopUp.add(NewInput);

        NodePopup.add(InputPopUp);

        OutputPopUp.setText("Output");

        NodeDefuzzify.setText("Edit Output");
        NodeDefuzzify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeDefuzzifyActionPerformed(evt);
            }
        });
        OutputPopUp.add(NodeDefuzzify);

        NewOutput.setText("New Output");
        NewOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOutputActionPerformed(evt);
            }
        });
        OutputPopUp.add(NewOutput);

        NodePopup.add(OutputPopUp);
        NodePopup.add(jSeparator2);

        Methods.setText("Methods");
        Methods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MethodsActionPerformed(evt);
            }
        });
        NodePopup.add(Methods);

        Rules.setText("Rules");
        Rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesActionPerformed(evt);
            }
        });
        NodePopup.add(Rules);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        New.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Archivo.png")); // NOI18N
        New.setToolTipText("New\n");
        New.setFocusable(false);
        New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        New.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jToolBar1.add(New);

        Open.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Abrir.png")); // NOI18N
        Open.setToolTipText("Open");
        Open.setFocusable(false);
        Open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Open.setMaximumSize(new java.awt.Dimension(49, 55));
        Open.setMinimumSize(new java.awt.Dimension(49, 55));
        Open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Open);

        Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Guardar.png")); // NOI18N
        Save.setToolTipText("Save");
        Save.setFocusable(false);
        Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Save.setMaximumSize(new java.awt.Dimension(49, 55));
        Save.setMinimumSize(new java.awt.Dimension(49, 55));
        Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Save);

        ButtonSimulateNode.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Ejecutar nodo.png")); // NOI18N
        ButtonSimulateNode.setToolTipText("Simulate node");
        ButtonSimulateNode.setFocusable(false);
        ButtonSimulateNode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSimulateNode.setMaximumSize(new java.awt.Dimension(49, 55));
        ButtonSimulateNode.setMinimumSize(new java.awt.Dimension(49, 55));
        ButtonSimulateNode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSimulateNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimulateNodeActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonSimulateNode);

        ButtonSimulateNetwork.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\FuzzyNetSwing\\resources\\images\\Iconos\\Post\\Ejecutar red.png")); // NOI18N
        ButtonSimulateNetwork.setToolTipText("Simulate network");
        ButtonSimulateNetwork.setFocusable(false);
        ButtonSimulateNetwork.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSimulateNetwork.setMaximumSize(new java.awt.Dimension(49, 55));
        ButtonSimulateNetwork.setMinimumSize(new java.awt.Dimension(49, 55));
        ButtonSimulateNetwork.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSimulateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimulateNetworkActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonSimulateNetwork);
        jToolBar1.add(jSeparator5);

        comboBoxNode.setToolTipText("Select the layer to add new node");
        comboBoxNode.setMaximumSize(new java.awt.Dimension(50, 20));
        comboBoxNode.setMinimumSize(new java.awt.Dimension(50, 20));
        comboBoxNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNodeActionPerformed(evt);
            }
        });
        jToolBar1.add(comboBoxNode);

        textNameNode.setToolTipText("Node name");
        textNameNode.setInheritsPopupMenu(true);
        textNameNode.setMaximumSize(new java.awt.Dimension(100, 20));
        textNameNode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameNodeKeyTyped(evt);
            }
        });
        jToolBar1.add(textNameNode);

        addNode.setText("Add Node");
        addNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNodeActionPerformed(evt);
            }
        });
        jToolBar1.add(addNode);
        jToolBar1.add(jSeparator6);

        javax.swing.GroupLayout PanelToolbarLayout = new javax.swing.GroupLayout(PanelToolbar);
        PanelToolbar.setLayout(PanelToolbarLayout);
        PanelToolbarLayout.setHorizontalGroup(
            PanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1392, Short.MAX_VALUE)
        );
        PanelToolbarLayout.setVerticalGroup(
            PanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        newInputButton.setBackground(new java.awt.Color(0, 0, 0));
        newInputButton.setText("New Input");
        newInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInputButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Inputs");

        javax.swing.GroupLayout PanelInputsLayout = new javax.swing.GroupLayout(PanelInputs);
        PanelInputs.setLayout(PanelInputsLayout);
        PanelInputsLayout.setHorizontalGroup(
            PanelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelInputsLayout.createSequentialGroup()
                .addComponent(newInputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelInputsLayout.setVerticalGroup(
            PanelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputsLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        newOutputButton.setBackground(new java.awt.Color(0, 0, 0));
        newOutputButton.setText("New output");
        newOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOutputButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Outputs");

        javax.swing.GroupLayout PanelOutputsLayout = new javax.swing.GroupLayout(PanelOutputs);
        PanelOutputs.setLayout(PanelOutputsLayout);
        PanelOutputsLayout.setHorizontalGroup(
            PanelOutputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOutputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(newOutputButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        PanelOutputsLayout.setVerticalGroup(
            PanelOutputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOutputsLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelLayerLayout = new javax.swing.GroupLayout(panelLayer);
        panelLayer.setLayout(panelLayerLayout);
        panelLayerLayout.setHorizontalGroup(
            panelLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1179, Short.MAX_VALUE)
        );
        panelLayerLayout.setVerticalGroup(
            panelLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        File.setText("File");

        FileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        FileNew.setText("New");
        FileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileNewActionPerformed(evt);
            }
        });
        File.add(FileNew);

        FileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        FileOpen.setText("Open");
        File.add(FileOpen);

        FileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        FileSave.setText("Save");
        File.add(FileSave);

        FileSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        FileSaveAs.setText("Save as");
        File.add(FileSaveAs);

        FileExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        FileExit.setText("Exit");
        File.add(FileExit);

        MenuBar.add(File);

        Layer.setText("Layer");

        ManageLayouts.setText("Manage Layouts");

        layer1.setSelected(true);
        layer1.setText("1 Layers");
        layer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer1ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer1);

        layer2.setText("2 Layers");
        layer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer2ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer2);

        layer3.setText("3 Layers");
        layer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer3ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer3);

        layer4.setText("4 Layers");
        layer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer4ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer4);

        layer5.setText("5 Layers");
        layer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer5ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer5);

        layer6.setText("6 Layers");
        layer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer6ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer6);

        layer7.setText("7 Layers");
        layer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer7ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer7);

        layer8.setText("8 Layers");
        layer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer8ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer8);

        layer9.setText("9 Layers");
        layer9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer9ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer9);

        layer10.setText("10 Layers");
        layer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layer10ActionPerformed(evt);
            }
        });
        ManageLayouts.add(layer10);

        Layer.add(ManageLayouts);

        MenuBar.add(Layer);

        Node.setText("Node");

        NodeCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NodeCreate.setText("Create node");
        NodeCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeCreateActionPerformed(evt);
            }
        });
        Node.add(NodeCreate);

        NodeEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NodeEdit.setText("Edit node");
        Node.add(NodeEdit);

        NodeDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NodeDelete.setText("Delete node");
        Node.add(NodeDelete);

        MenuBar.add(Node);

        Fuzzify.setText("Fuzzify");

        FuzzifyAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        FuzzifyAdd.setText("Add input");
        FuzzifyAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuzzifyAddActionPerformed(evt);
            }
        });
        Fuzzify.add(FuzzifyAdd);

        FuzzifyDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        FuzzifyDelete.setText("Delete input");
        Fuzzify.add(FuzzifyDelete);

        FuzzifyEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        FuzzifyEdit.setText("Edit input");
        Fuzzify.add(FuzzifyEdit);

        MenuBar.add(Fuzzify);

        Defuzzify.setText("Defuzzify");

        DeffuzifyAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        DeffuzifyAdd.setText("Add output");
        DeffuzifyAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeffuzifyAddActionPerformed(evt);
            }
        });
        Defuzzify.add(DeffuzifyAdd);

        DeffuzifyDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        DeffuzifyDelete.setText("Delete output");
        Defuzzify.add(DeffuzifyDelete);

        DeffuzifyEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        DeffuzifyEdit.setText("Edit output");
        Defuzzify.add(DeffuzifyEdit);

        MenuBar.add(Defuzzify);

        Help.setText("Help");

        EditUserManual.setText("User Manual");
        Help.add(EditUserManual);

        EditOperatorsManual.setText("Operator Manual");
        Help.add(EditOperatorsManual);

        EditAboutUs.setText("About us");
        Help.add(EditAboutUs);

        MenuBar.add(Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelOutputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelOutputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ActionPerformed button for new network
    private void FileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileNewActionPerformed

        windowNameNet window = new windowNameNet(this, true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }//GEN-LAST:event_FileNewActionPerformed

    //ActionPerformed button for new Input to the Newtork from the menubar
    private void FuzzifyAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuzzifyAddActionPerformed
        // TODO add your handling code here:
        createVLInputNet windowVLInputNet = new createVLInputNet(this, true);
        windowVLInputNet.setLocationRelativeTo(null);
        windowVLInputNet.setVisible(true);

    }//GEN-LAST:event_FuzzifyAddActionPerformed

    //ActionPerformed button for new output to the network from the menubar
    private void DeffuzifyAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeffuzifyAddActionPerformed
        // TODO add your handling code here:
        createVLOutputNet windowVLOutputNet = new createVLOutputNet(this, true);
        windowVLOutputNet.setLocationRelativeTo(null);
        windowVLOutputNet.setVisible(true);
    }//GEN-LAST:event_DeffuzifyAddActionPerformed


    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        windowNameNet window = new windowNameNet(this, true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }//GEN-LAST:event_NewActionPerformed

    //ActionPerformed button for new node to the network
    private void NodeCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeCreateActionPerformed
        // TODO add your handling code here:
//        createNodeWindowPreview wCreateNode = new createNodeWindowPreview();
//        wCreateNode.setLocationRelativeTo(null);
//        wCreateNode.setVisible(true);
    }//GEN-LAST:event_NodeCreateActionPerformed

    //ActionPerformed button for the new input to the node
    private void NodeFuzzifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeFuzzifyActionPerformed
        // TODO add your handling code here:
        createVLInputNet windowVLInputNet = new createVLInputNet(this, true);
        windowVLInputNet.setLocationRelativeTo(null);
        windowVLInputNet.setVisible(true);
    }//GEN-LAST:event_NodeFuzzifyActionPerformed

    //ActionPerformed button for configure the node methods
    private void MethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MethodsActionPerformed
        // TODO add your handling code here:
        methodsWindows windowMethods = new methodsWindows(this, true);
        windowMethods.setLocationRelativeTo(null);
        windowMethods.setVisible(true);
    }//GEN-LAST:event_MethodsActionPerformed

    //ActionPerformed button for new output to the network from the menubar
    private void newOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOutputButtonActionPerformed
        // TODO add your handling code here:
        createVLOutputNet windowVLOutputNet = new createVLOutputNet(this, true);
        windowVLOutputNet.setLocationRelativeTo(null);
        windowVLOutputNet.setVisible(true);
    }//GEN-LAST:event_newOutputButtonActionPerformed

    //ActionPerformed button for new input to the network from the menubar
    private void newInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInputButtonActionPerformed
        // TODO add your handling code here:
        createVLInputNet windowVLInputNet = new createVLInputNet(this, true);
        windowVLInputNet.setLocationRelativeTo(null);
        windowVLInputNet.setVisible(true);


    }//GEN-LAST:event_newInputButtonActionPerformed

    //ActionPerformed button for new real values to simulate the network. 
    private void ButtonSimulateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimulateNetworkActionPerformed
        // TODO add your handling code here:
        realValuesNet realValuesNet = new realValuesNet();
        realValuesNet.setLocationRelativeTo(null);
        realValuesNet.setVisible(true);
    }//GEN-LAST:event_ButtonSimulateNetworkActionPerformed

    //ActionPerformed button for new real values to simulate the node. 
    private void ButtonSimulateNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimulateNodeActionPerformed
        // TODO add your handling code here:
        realValuesNodes windowRealValuesNodes = new realValuesNodes(this, true);
        windowRealValuesNodes.setLocationRelativeTo(null);
        windowRealValuesNodes.setVisible(true);
    }//GEN-LAST:event_ButtonSimulateNodeActionPerformed

    private void layer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer1ActionPerformed
        // TODO add your handling code here:
        configuration(1, 1);
    }//GEN-LAST:event_layer1ActionPerformed

    private void layer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer2ActionPerformed
        // TODO add your handling code here:
        configuration(2, 2);
    }//GEN-LAST:event_layer2ActionPerformed

    private void layer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer3ActionPerformed
        // TODO add your handling code here:
        configuration(3, 3);
    }//GEN-LAST:event_layer3ActionPerformed

    private void layer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer4ActionPerformed
        // TODO add your handling code here:
        configuration(4, 4);
    }//GEN-LAST:event_layer4ActionPerformed

    private void layer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer5ActionPerformed
        // TODO add your handling code here:
        configuration(5, 5);
    }//GEN-LAST:event_layer5ActionPerformed

    private void layer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer6ActionPerformed
        // TODO add your handling code here:
        configuration(6, 6);
    }//GEN-LAST:event_layer6ActionPerformed

    private void layer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer7ActionPerformed
        // TODO add your handling code here:
        configuration(7, 7);
    }//GEN-LAST:event_layer7ActionPerformed

    private void layer8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer8ActionPerformed
        // TODO add your handling code here:
        configuration(8, 8);
    }//GEN-LAST:event_layer8ActionPerformed

    private void layer9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer9ActionPerformed
        // TODO add your handling code here:
        configuration(9, 9);
    }//GEN-LAST:event_layer9ActionPerformed

    private void layer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layer10ActionPerformed
        // TODO add your handling code here:
        configuration(10, 10);
    }//GEN-LAST:event_layer10ActionPerformed

    private void addNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNodeActionPerformed
        // TODO add your handling code here:

        String name = textNameNode.getText();
        textNameNode.setText(null);

        createNode(name);
    }//GEN-LAST:event_addNodeActionPerformed

    private void comboBoxNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNodeActionPerformed

    private void textNameNodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameNodeKeyTyped
        // TODO add your handling code here:        
    }//GEN-LAST:event_textNameNodeKeyTyped

    private void RulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesActionPerformed
        rules windowRules = new rules(this, true);
        windowRules.setLocationRelativeTo(null);
        windowRules.setVisible(true);
    }//GEN-LAST:event_RulesActionPerformed

    //ActionPerformed button for the new output to the node
    private void NodeDefuzzifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeDefuzzifyActionPerformed
        // TODO add your handling code here:
        createVLOutputNet windowVLOutputNet = new createVLOutputNet(this, true);
        windowVLOutputNet.setLocationRelativeTo(null);
        windowVLOutputNet.setVisible(true);
    }//GEN-LAST:event_NodeDefuzzifyActionPerformed

    private void NewInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInputActionPerformed
        createInput windowCreateInput = new createInput(this, true);
        windowCreateInput.setLocationRelativeTo(null);
        windowCreateInput.setVisible(true);
    }//GEN-LAST:event_NewInputActionPerformed

    private void NewOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOutputActionPerformed
        createOutput windowCreateOutput = new createOutput(this, true);
        windowCreateOutput.setLocationRelativeTo(null);
        windowCreateOutput.setVisible(true);
    }//GEN-LAST:event_NewOutputActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOverview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSimulateNetwork;
    private javax.swing.JButton ButtonSimulateNode;
    private javax.swing.JMenuItem DeffuzifyAdd;
    private javax.swing.JMenuItem DeffuzifyDelete;
    private javax.swing.JMenuItem DeffuzifyEdit;
    private javax.swing.JMenu Defuzzify;
    private javax.swing.JMenuItem EditAboutUs;
    private javax.swing.JMenuItem EditOperatorsManual;
    private javax.swing.JMenuItem EditUserManual;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem FileExit;
    private javax.swing.JMenuItem FileNew;
    private javax.swing.JMenuItem FileOpen;
    private javax.swing.JMenuItem FileSave;
    private javax.swing.JMenuItem FileSaveAs;
    private javax.swing.JMenu Fuzzify;
    private javax.swing.JMenuItem FuzzifyAdd;
    private javax.swing.JMenuItem FuzzifyDelete;
    private javax.swing.JMenuItem FuzzifyEdit;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu InputPopUp;
    private javax.swing.JMenu Layer;
    private javax.swing.JMenu ManageLayouts;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Methods;
    private javax.swing.JButton New;
    private javax.swing.JMenuItem NewInput;
    private javax.swing.JMenuItem NewOutput;
    private javax.swing.JMenu Node;
    private javax.swing.JMenuItem NodeCreate;
    private javax.swing.JMenuItem NodeDefuzzify;
    private javax.swing.JMenuItem NodeDelete;
    private javax.swing.JMenuItem NodeEdit;
    private javax.swing.JMenuItem NodeFuzzify;
    private javax.swing.JPopupMenu NodePopup;
    private javax.swing.JButton Open;
    private javax.swing.JMenu OutputPopUp;
    private javax.swing.JPanel PanelInputs;
    private javax.swing.JPanel PanelOutputs;
    private javax.swing.JPanel PanelToolbar;
    private javax.swing.JMenuItem Rules;
    private javax.swing.JButton Save;
    private javax.swing.JButton addNode;
    private javax.swing.JComboBox comboBoxNode;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButtonMenuItem layer1;
    private javax.swing.JRadioButtonMenuItem layer10;
    private javax.swing.JRadioButtonMenuItem layer2;
    private javax.swing.JRadioButtonMenuItem layer3;
    private javax.swing.JRadioButtonMenuItem layer4;
    private javax.swing.JRadioButtonMenuItem layer5;
    private javax.swing.JRadioButtonMenuItem layer6;
    private javax.swing.JRadioButtonMenuItem layer7;
    private javax.swing.JRadioButtonMenuItem layer8;
    private javax.swing.JRadioButtonMenuItem layer9;
    private javax.swing.JButton newInputButton;
    private javax.swing.JButton newOutputButton;
    public static javax.swing.JPanel panelLayer;
    private javax.swing.JTextField textNameNode;
    // End of variables declaration//GEN-END:variables
}
