/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzynetswing;

import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author Juan Camilo
 */
public class FuzzyNetSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuOverview Stage = new MenuOverview();
        Stage.setExtendedState(MAXIMIZED_BOTH);
        Stage.setTitle("FuzzyNet v0.1");
        Stage.setVisible(true);
    
}
}
