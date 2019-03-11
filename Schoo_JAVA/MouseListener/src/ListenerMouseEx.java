import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ListenerMouseEx  extends JFrame{
	
	
	public ListenerMouseEx(){
		setTitle("예제");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btn = new JButton("yellow");
		
		btn.setBackground(Color.YELLOW);
		add(btn);
		
		setSize(300,150);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerMouseEx();
	}

}
