import javax.swing.JOptionPane;

public class Exercicio13{

    public static void main(String[] args) {
        String nome;
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade: ")); 
        nome = JOptionPane.showInputDialog("Coloque seu nome: ");
        if (idade >= 15 && idade <= 25){ JOptionPane.showMessageDialog(null, nome + " Aceito ");
       
        }else{ JOptionPane.showMessageDialog(null, nome + " Recusado");
        }
        }
        
}
