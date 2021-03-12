package submit_wdj;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame implements ChangeListener{
	
	static final int INIT_VALUE = 15;
	private JButton OKBtn;
	private JSlider slider;
	private JButton btn;
	
	 public SliderDemo() {
		 JPanel panel = new JPanel();
		 JLabel label = new JLabel("슬라이더를 움직여보세요", SwingConstants.CENTER);
		 panel.add(label);
		 
		 slider = new JSlider(0,100,INIT_VALUE);
		 slider.setMajorTickSpacing(10);
		 slider.setMinorTickSpacing(5);
		 slider.setPaintTicks(true);
		 slider.setPaintLabels(true);
		 slider.addChangeListener(this);
		 panel.add(slider);
		 
		 btn = new JButton(" ");
		 ImageIcon icon = new ImageIcon("images/dog.jpg");
		 btn.setIcon(icon);
		 btn.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		 panel.add(btn);
		 		 
		 this.add(panel);
		 this.setTitle("Slider test");
		 this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		 this.setSize(700,700);
		 this.setLocationRelativeTo(null);
		 this.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		if(!source.getValueIsAdjusting()) {
			int value = source.getValue();
			btn.setSize(value * 5, value * 5);
		}
	}
	public static void main(String[] args) {
		new SliderDemo();
	}
}
