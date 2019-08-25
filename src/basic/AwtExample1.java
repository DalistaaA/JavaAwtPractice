package basic;
import java.awt.Button;
import java.awt.Frame;

public class AwtExample1 extends Frame{

	AwtExample1(){
		Button b = new Button();
		b.setBounds(50,100, 100, 70);
		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		AwtExample1 a = new AwtExample1(); 
	}
}
