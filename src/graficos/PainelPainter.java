package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

import javax.swing.JPanel;

public class PainelPainter extends JPanel {

	private int contagemPontos = 0;
	private Point[] pontos = new Point[10000];
	private Random random = new Random();
	private int red, green, blue;

	public PainelPainter() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// armazena a coordenada atual do mouse ao arrastar no vetor pontos
				pontos[contagemPontos] = e.getPoint();
				contagemPontos++;

				repaint();

			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("Chamando método paintComponent...");

		// desenha todos os pontos do vetor pontos toda vez que o método repaint() é
		// chamado
		for (int i = 0; i < contagemPontos; i++) {

			red = random.nextInt(256); // 0 a 255
			green = random.nextInt(256); // 0 a 255
			blue = random.nextInt(256); // 0 a 255

			g.setColor(new Color(red, green, blue));
			g.fillOval(pontos[i].x, pontos[i].y, 40, 40);
		}
	}

}
