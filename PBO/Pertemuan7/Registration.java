package com.Shafwan.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame{
    private JTextField tfNama;
    private JTextField tfNim;
    private JComboBox cbProdi;
    private JRadioButton LAKILAKIRadioButton;
    private JRadioButton radioButton2;
    private JTextArea taAlamat;
    private JButton bClear;
    private JButton bSave;
    private JPanel owangpanel;
    private JTextField tfTelp;

    public Registration() {
        super("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(owangpanel);
        this.setSize(800, 600);
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }



}
