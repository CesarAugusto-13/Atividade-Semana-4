import javax.swing.JOptionPane;
public class AdicaoDeValoresInteiros
{
    public static void main ( String [] args) 
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        int soma = n1 + n2;

        if(soma > 10)
        {
            JOptionPane.showMessageDialog(null, soma);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A soma é menor que 10");
        }

    }
}