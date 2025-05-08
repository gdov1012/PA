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
public class _exer7 {
        public static void main(String[] args) { 
         // TODO code application logic here
        String valor = JOptionPane.showInputDialog(null,"Digite o valor de saque dejesado \n"
             + "RS10 \n"
             + "RS20 \n"
             + "RS50 \n"
             + "RS100 \n");
       
       switch (valor) {
            case "10":
                JOptionPane.showMessageDialog(null,"Agradecemos o saque!");
            break;
            case "20":
                JOptionPane.showMessageDialog(null,"Agradecemos o saque!");
            break;
            case "50":
                JOptionPane.showMessageDialog(null,"Agradecemos o saque!");
            break;
            case "100":
                JOptionPane.showMessageDialog(null,"Agradecemos o saque!");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Valor nao encontrado");
            break;
                       
       }
    }
    
}
        
