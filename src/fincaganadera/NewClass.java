/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fincaganadera;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author BlackHawk
 */
public class NewClass {
     public class combo extends JFrame{
        public combo(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(30,30,400,50);
            setVisible(true);
            String vector[] = {"l", "shncj"};
            JComboBox combo = new JComboBox(vector);
            getContentPane().add(combo);
        
        }
    
    }
    
    public static void main (String args []){
        
    NewClass combo = new NewClass();
    }
}
