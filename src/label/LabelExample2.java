package label;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelExample2 extends Frame implements ActionListener {

	TextField textField;
	Label label;
	Button button;
	
	LabelExample2(){
		textField = new TextField();
		textField.setBounds(50,50, 150,20);  
		label = new Label();
		label.setBounds(50,100, 250,20);      
		button = new Button("Find IP");
		button.setBounds(50,150,60,30); 
		
		button.addActionListener(this);
		add(textField);
		add(label);
		add(button);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			String host = textField.getText();
			String ip = java.net.Inet4Address.getByName(host).getHostAddress();
			label.setText("IP Of "+host+"is"+ip);
		}
		catch (Exception e2) {
			System.out.println(e2);
		}
	}
	
	public static void main(String args[]) {
		new LabelExample2();
	}

}
