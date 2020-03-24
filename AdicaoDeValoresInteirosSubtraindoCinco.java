import javax.swing.JOptionPane;
public class AdicaoDeValoresInteirosSubtraindoCinco
{
    public static void main ( String [] args) 
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));

        int soma = n1 + n2;

        if(soma <= 20)
        {
            JOptionPane.showMessageDialog(null, "A Soma é: "+ (soma-5));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A soma é maior que vinte");
        }

    }
}