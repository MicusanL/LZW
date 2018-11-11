package LZW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
    private JButton btnCode;
    private JPanel panel1;
    private JButton btnDecode;
    private JTextField textIndex;
    private JCheckBox checkBox1;
    private JComboBox comboBoxFullDictionaryAc;
    private JList list1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("UserInterface");
        frame.setContentPane(new UserInterface().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public UserInterface() {


        btnCode.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int index = Integer.parseInt(textIndex.getText());
                int fullDictionaryAction = comboBoxFullDictionaryAc.getSelectedIndex();

                Code lzwCode = new Code();
                lzwCode.codeUsingLZW(index, fullDictionaryAction);


            }
        });

        btnDecode.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

               /* Decode lz77Decode = new Decode();
                try {
                    lz77Decode.DecodeFileUsingLz77();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }*/
            }
        });
    }
}
