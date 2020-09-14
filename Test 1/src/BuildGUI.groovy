/**
 * Created by Sabab on 5/6/2016.
 */

import com.thoughtworks.xstream.mapper.Mapper

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BuildGUI {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JTextField lowerLimit = new JTextField(6);
    private JTextField upperLimit = new JTextField(6);

    public void prepareGUI(){
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("",JLabel.CENTER );
        statusLabel = new JLabel("",JLabel.CENTER);

        statusLabel.setSize(650,100);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public void showEventDemo(){
        headerLabel.setText("Control in action: Button");

        JLabel lowerLimitLabel = new JLabel("Lower Range: ", JLabel.RIGHT);
        JLabel upperLimitLabel = new JLabel("Upper Range: ", JLabel.RIGHT);

        JButton okButton = new JButton("Even Numbers");
        JButton submitButton = new JButton("Odd Numbers");
        JButton cancelButton = new JButton("Prime Numbers");

        okButton.setActionCommand("Even Numbers");
        submitButton.setActionCommand("Odd Numbers");
        cancelButton.setActionCommand("Prime Numbers");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(lowerLimitLabel);
        controlPanel.add(lowerLimit);
        controlPanel.add(upperLimitLabel);
        controlPanel.add(upperLimit);
        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }

    public class ButtonClickListener implements ActionListener{
        Utility u = new Utility();
        def list = []

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if( command.equals( "Even Numbers" ))  {
                String s1 = lowerLimit.getText();
                String s2 = upperLimit.getText();

                if(s1 == "" || s2 == "")
                    statusLabel.setText("Ranges cannot be empty!");
                else if(Integer.parseInt(s1) > Integer.parseInt(s2))
                    statusLabel.setText("Lower Range cannot be greater than Upper Range!");
                else
                {
                    list = u.calculateEven(Integer.parseInt(s1), Integer.parseInt(s2));

                    String res = "";
                    for(int i = 0; i < list.size(); i++)
                        res += (list[i].toString()).concat(" ");

                    statusLabel.setText("Even Numbers Generated:  " + res);
                }
            }
            else if( command.equals( "Odd Numbers" ) )  {
                String s1 = lowerLimit.getText();
                String s2 = upperLimit.getText();

                if(s1 == "" || s2 == "")
                    statusLabel.setText("Ranges cannot be empty!");
                else if(Integer.parseInt(s1) > Integer.parseInt(s2))
                    statusLabel.setText("Lower Range cannot be greater than Upper Range!");
                else
                {
                    list = u.calculateOdd(Integer.parseInt(s1), Integer.parseInt(s2));

                    String res = "";
                    for(int i = 0; i < list.size(); i++)
                        res += (list[i].toString()).concat(" ");

                    statusLabel.setText("Odd Numbers Generated:  " + res);
                }
            }
            else  {
                String s1 = lowerLimit.getText();
                String s2 = upperLimit.getText();

                if(s1 == "" || s2 == "")
                    statusLabel.setText("Ranges cannot be empty!");
                else if(Integer.parseInt(s1) > Integer.parseInt(s2))
                    statusLabel.setText("Lower Range cannot be greater than Upper Range!");
                else {
                    list = u.calculatePrime(Integer.parseInt(s1), Integer.parseInt(s2));

                    String res = "";
                    for(int i = 0; i < list.size(); i++)
                        res += (list[i].toString()).concat(" ");

                    statusLabel.setText("Prime Numbers Generated:  " + res);
                }
            }
        }
    }
}
