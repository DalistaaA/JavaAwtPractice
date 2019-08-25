package basic;
import java.awt.Button;
import java.awt.Frame;

public class AwtExample2 {

	AwtExample2(){
		Frame f = new Frame();
		Button b = new Button("Click Me");
		b.setBounds(50, 100, 100, 50);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		AwtExample2 a = new AwtExample2();
	}
	
}
