import javax.swing.JOptionPane;

public class CalculoFatorial{

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")), i, aux;

        aux = n;

        for (i = 1; i < aux ; i++){

            n = n * i;

        }

        JOptionPane.showMessageDialog(null, String.format("Resultado: %d", n));

    }
    
}