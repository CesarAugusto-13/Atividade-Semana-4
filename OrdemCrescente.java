import javax.swing.JOptionPane;
public class OrdemCrescente
{
   public static void main (String [] args)
   {
   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero")); 
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero"));

      if ((n1 <= n2)&&(n1 <= n3))
      {
         if (n2 <= n3)
         JOptionPane.showMessageDialog (null, n1 + "   " + n2 + "   " + n3);
      else
         JOptionPane.showMessageDialog (null, n1 + "   " + n3 + "   " + n2);
      }
      else
      {
      if ((n2 <= n1) && (n2 <= n3))
      {
         if (n1 <= n3)
         JOptionPane.showMessageDialog (null, n2 + "   " + n1 + "   " + n3);
      else
         JOptionPane.showMessageDialog (null, n2 + "   " + n3 + "   " + n1);
      }
      else
      {
         if (n1 <= n2)
         JOptionPane.showMessageDialog (null, n3 + "   " + n1 + "   " + n2);
      else
         JOptionPane.showMessageDialog (null, n3 + "   " + n2 + "   " + n1);
      }
      }
   }
}