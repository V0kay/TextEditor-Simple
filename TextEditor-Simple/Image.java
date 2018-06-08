import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
class Image extends javax.swing.JPanel {

	public Image() {
		this.setSize(300, 400); 
	}

	public void paint(Graphics grafico) {
		Dimension height = getSize();
		ImageIcon Img = new ImageIcon(getClass().getResource("help.png")); 
		grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

		setOpaque(false);
		super.paintComponent(grafico);
	}
}