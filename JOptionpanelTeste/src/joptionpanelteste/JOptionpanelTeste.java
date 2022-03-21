package joptionpanelteste;
import javax.swing.JOptionPane;

public class JOptionpanelTeste {
    
    public static void main(String[] args) {
     int i;
     JOptionPane.showMessageDialog(null, "Seja Bem Vindo!!!");
     do
     {
     String menu= JOptionPane.showInputDialog("Digite 1-Inserir, 2-Alterar- 3-Excluir e 4-Sair");
     i = Integer.parseInt(menu);
     switch (i)
        {
             case 1:
                 JOptionPane.showMessageDialog(null, "Você escolheu a opção 1");
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null, "Você escolheu a opção 2");
                 break;
             case 3:
                 JOptionPane.showMessageDialog(null, "Você escolheu a opção 3");
                 break;
             case 4:
                 break;
             default:
                  //JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
            	 new JOptionpanelTeste().iniciarTela();
            	 break;
        }
     } while (i!=4);
}
    private void iniciarTela(){
        Tela1 frame = new Tela1();
        frame.setVisible(true);
    }
}

 