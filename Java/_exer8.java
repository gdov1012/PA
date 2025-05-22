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
public class _exer8 {
     public static void main(String[] args) { 
        String fase = JOptionPane.showInputDialog(null,"Informe o nivel em que se encontra:");
       
       switch (fase) {
            case "1":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 10");
            break;
            case "2":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 20");
            break;
            case "3":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 30");
            break;
            case "4":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 40");
            break;
            case "5":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 50");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Sem pontuacao");
            break;
        }
    }       
}
