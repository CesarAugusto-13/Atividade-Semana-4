import javax.swing.JOptionPane;
public class QuadradoOuRaiz
{
    public static void main ( String [] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if(n < 0)
        {
            double quadrado = Math.pow(n, 2);
            JOptionPane.showMessageDialog(null, "O quadrado do número é: " + quadrado);
        }
        else
        if(n > 0)
        {
            double raiz = Math.pow(n, 0.5);
            JOptionPane.showMessageDialog(null, "A raíz do número é: " + raiz);
        }

    }
}