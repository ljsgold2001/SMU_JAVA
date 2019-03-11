import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class ListenerMouseEx extends JFrame{
	
	JLabel label;
	JPanel cp = new JPanel();
	public ListenerMouseEx() {
		
		setTitle("example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MyMouseListener listener = new MyMouseListener();
		setContentPane(cp);
		label = new JLabel(" no mouse event");
		
		
		
		cp.addMouseListener(listener);
		cp.addMouseMotionListener(listener);
		cp.add(label);
		
		setSize(300,200);
		setVisible(true);
		
		
	}
	public class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		
			label.setText(e.getX() + e.getY());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerMouseEx();
	}

}
