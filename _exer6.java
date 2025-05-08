/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcase;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class _exer6 {
     public static void main(String[] args) {
     String planeta = JOptionPane.showInputDialog(null,"Digite o nome de um planeta:");
       
       switch (planeta) {
            case "VENUS":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "TERRA":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "MARTE":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "MERCURIO":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "JUPITER":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "SATURNO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "URANO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "NETUNO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Planeta nao existente");
            break;
       
    }
  }  
}
