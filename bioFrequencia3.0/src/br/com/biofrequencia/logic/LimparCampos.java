package br.com.biofrequencia.logic;

/**
 *
 * @author lucas
 * @date 18/05/2015
 */
public class LimparCampos {

    // MÉTODO QUE LIMPA TODOS OS CAMPOS
    public static void limpaCampos(javax.swing.JPanel jpanel) {
        // (array de componentes)Component[] components = todos os componentes do painel
        java.awt.Component[] components = jpanel.getComponents();

        javax.swing.JFormattedTextField txtFField = null;
        javax.swing.JTextField txtField2 = null;
        javax.swing.JPasswordField pssField  = null;
        javax.swing.JSpinner spinner  = null;
        // percorrendo todos os campos que existem no painel
        for (int i = 0; i < components.length; i++) {
            // se o componente na posição '[i]' for uma instancia de JTextField
            if (components[i] instanceof javax.swing.JFormattedTextField) {
                // a variavel 'txtField' é igual ao componente na posição '[i]'
                txtFField = (javax.swing.JFormattedTextField) components[i];
                // limpa o campo
                txtFField.setText("");
            }
            else if (components[i] instanceof javax.swing.JTextField) {
                // a variavel 'txtField2' é igual ao componente na posição '[i]'
                txtField2 = (javax.swing.JTextField) components[i];
                // limpa o campo
                txtField2.setText("");
            }
            else if (components[i] instanceof javax.swing.JPasswordField) {
                // a variavel 'pssField' é igual ao componente na posição '[i]'
                pssField = (javax.swing.JPasswordField) components[i];
                // limpa o campo
                pssField.setText("");
            }
            else if (components[i] instanceof javax.swing.JSpinner) {
                spinner = (javax.swing.JSpinner) components[i];
                // limpa o campo
                spinner.setValue(0);
            }
        }
    }

}
