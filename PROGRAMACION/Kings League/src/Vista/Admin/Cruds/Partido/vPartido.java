package Vista.Admin.Cruds.Partido;

import Controlador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vPartido {
    private JPanel pPrincipal;
    private JPanel panelAbajo;
    private JPanel panelArriba;
    private JButton volverButton;
    private JPanel panelCentrado;
    private JPanel panelInicio;
    private JButton insertarButton;
    private JButton borrarButton;
    private JButton consultarButton;
    private JButton actualizarButton;

    //Getter
    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    //Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("vPartido");
        frame.setContentPane(new vPartido().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //Todo
    public vPartido() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.vPartido.setVisible(false);
                Main.vCRUD.setVisible(true);
            }
        });
    }
}
