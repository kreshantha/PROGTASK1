/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;

import javax.swing.JFrame;

/**
 *
 * @author kreshantha
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("");
    registrationframe viewSelectedRow = new registrationframe();
    viewSelectedRow.setVisible(true);
    //prevent the frame from closing the parent frame
    viewSelectedRow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }
    
}
