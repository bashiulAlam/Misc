/**
 * Created by Sabab on 5/5/2016.
 */

import groovy.beans.Bindable
import groovy.swing.SwingBuilder;
import java.awt.*;
import javax.swing.*;
import  java.lang.*;

class CalculatorUI {

    @Bindable

        String street, number, city
        String toString() { "address[street=$street,number=$number,city=$city]" }


    public static void buildUI()
    {
        JLabel textlabel
        def address = new CalculatorUI(street: "0", number: "0", city: "0")

        def m
        def n
        def o

        def swing = new SwingBuilder()

        swing.edt {
            frame(title: 'Calculator', size: [350, 230], show: true, locationRelativeTo: null, defaultCloseOperation: JFrame.EXIT_ON_CLOSE) {
                vbox {
                    panel(constraints: BorderLayout.CENTER,
                            border: compoundBorder([emptyBorder(10), titledBorder('Simple Calculator')])) {
                        tableLayout {
                            tr {
                                td {
                                    label 'First Number:'  // text property is default, so it is implicit.
                                }
                                td {
                                    n = textField address.street, id: 'streetField', columns: 12
                                }
                            }
                            tr {
                                td {
                                    label 'Second Number:'
                                }
                                td {
                                    o = textField id: 'numberField', columns: 12, text: address.number
                                }
                            }
                            tr {
                                td {
                                    label 'Result:'
                                }
                                td {
                                    m =  textField id: 'cityField', columns: 12, text: address.city
                                }
                            }
                        }

                    }

                }
                panel(constraints: BorderLayout.SOUTH) {
                    button text: '+', actionPerformed: {

                        String s = o.getText()
                        int i = Integer.parseInt(s)

                        String t = n.getText()
                        int j = Integer.parseInt(t)
                        int res = i + j
                        String tt = res.toString()

                        m.setText(tt)
                        System.out.println(tt);

                    }

                    button text: '-', actionPerformed: {
                        String s = o.getText()
                        int i = Integer.parseInt(s)

                        String t = n.getText()
                        int j = Integer.parseInt(t)
                        int res =  j - i;
                        String tt = res.toString()

                        m.setText(tt)
                        System.out.println(tt);
                    }

                    button text: '*', actionPerformed: {
                        String s = o.getText()
                        int i = Integer.parseInt(s)

                        String t = n.getText()
                        int j = Integer.parseInt(t)
                        int res = j * i
                        String tt = res.toString()

                        m.setText(tt)
                        System.out.println(tt);
                    }

                    button text: '/', actionPerformed: {
                        String s = o.getText()
                        int i = Integer.parseInt(s)

                        String t = n.getText()
                        int j = Integer.parseInt(t)
                        int res = j / i
                        String tt = res.toString()

                        m.setText(tt)
                        System.out.println(tt);
                    }
                }
            }
        }
    }

}
