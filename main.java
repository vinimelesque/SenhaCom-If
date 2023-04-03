
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String senha;

        senha = JOptionPane.showInputDialog("Digite sua senha:");

        if (senha.equals("dsbq2")) {
            JOptionPane.showMessageDialog(null, "Acesso Permitido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado.");
        }
    }
}
