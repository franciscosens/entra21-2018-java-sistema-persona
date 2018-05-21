
import javax.swing.JOptionPane;

/**
 * @author Francisco Lucas Sens
 */
public class CadastroCliente {

    String[] nomes = new String[100];
    int[] idades = new int[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] logradouros = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome  para editar");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }

        }
    }
    
    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "   " + cpfs[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void contabilizarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: " + quantidadeRegistros
        );
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloCPF() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o cpf para busca").replace(".", "").replace("-", "");
        for (int i = 0; i < atual; i++) {
            if (cpfs[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nCPF: " + cpfs[posicao]
                + "\nEstado: " + estados[posicao]
                + "\nCidade: " + cidades[posicao]
                + "\nBairro: " + bairros[posicao]
                + "\nLogradouro: " + logradouros[posicao]
                + "\nCEP: " + ceps[posicao]
                + "\nNúmero: " + numeros[posicao]
                + "\nComplemento: " + complementos[posicao]);
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Digite o seu nome");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                nomes[posicao] + " digite a sua idade"));
        sexos[posicao] = JOptionPane.showInputDialog(
                nomes[posicao] + " digite o seu sexo").charAt(0);
        cpfs[posicao] = JOptionPane
                .showInputDialog(nomes[posicao] + " digite o seu CPF")
                .replace(".", "").replace("-", "");
        estados[posicao] = JOptionPane.showInputDialog(
                "Digite o seu estado").trim().toUpperCase();
        cidades[posicao] = JOptionPane.showInputDialog("Digite a sua cidade");
        logradouros[posicao] = JOptionPane.showInputDialog(
                "Digite o seu logradouro");
        bairros[posicao] = JOptionPane.showInputDialog("Digite o seu bairro");
        ceps[posicao] = JOptionPane.showInputDialog("Digite o seu cep");
        numeros[posicao] = JOptionPane.showInputDialog("Digite o seu número");
        complementos[posicao] = JOptionPane.showInputDialog("Digite o complemento");
    }
}
