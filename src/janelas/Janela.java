package janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private JButton botao1, botao2;
	private JTextField campo;

	public Janela() {
		// remove o layout padrão (sem layout)
		setLayout(null);
		setSize(800, 600);
		// centrtalize
		setLocationRelativeTo(null);
		setTitle("Janela com Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		botao1 = new JButton("Botão 1");
		botao2 = new JButton("Botão 2");

		botao1.setSize(150, 60);
		botao2.setSize(150, 60);

		botao1.setLocation(200, 200);
		botao2.setLocation(500, 200);

		add(botao1);
		add(botao2);

		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(campo.getText());

			}
		});

		JLabel texto = new JLabel("Exemplo texto swing");
		texto.setLocation(200, 300);
		texto.setSize(200, 30);
		add(texto);

		campo = new JTextField();
		campo.setLocation(200, 350);
		campo.setSize(200, 30);
		add(campo);

	}

	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.setVisible(true);

	}

}
