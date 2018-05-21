
import javax.swing.JOptionPane;

/**
 * @author Francisco Lucas Sens
 */
public class Sistema {

    CadastroCliente registroCliente = new CadastroCliente();

    public void apresentarMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Cliente" + "\n2 - Editar Cliente"
                + "\n3 - Buscar pelo nome" + "\n4 - Buscar pelo cpf"
                + "\n5 - Listar clientes" + "\n8001 - Sair"));
        while (menu != 8001) {
            switch (menu) {
                case 1:
                    registroCliente.cadastrar();
                    break;
                case 2:
                    break;
                case 3:
                    registroCliente.buscarPeloNome();
                    break;
                case 4:
                    registroCliente.buscarPeloCPF();
                    break;
                case 5:
                    registroCliente.listar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastrar Cliente"
                    + "\n2 - Editar Cliente"
                    + "\n3 - Buscar pelo nome"
                    + "\n4 - Buscar pelo cpf"
                    + "\n5 - Listar clientes"
                    + "\n8001 - Sair"));
        }

    }

}
