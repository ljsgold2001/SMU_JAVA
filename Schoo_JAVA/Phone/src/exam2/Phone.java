
package exam2;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

class data{
	String number;
	String address;
	
	data(String number,String address){
		this.number = number;
		this.address = address;
		
	}
	
}


public class Phone extends JFrame{

		// button의 객체를 생성한다.
		JButton btn1 = new JButton("삽입");
		JButton btn2 = new JButton("삭제");
		JButton btn3 = new JButton("검색");
		JButton btn4 = new JButton("조회");
		
		JPanel panel = new JPanel();
		// label 객체 생성한다. 
		JLabel l1 = new JLabel("name");
		JLabel l2 = new JLabel("address");
		JLabel l3 = new JLabel("Phone");
		
		// textField 객체 생성한다. 
		JTextField tf1 = new JTextField(150);
		JTextField tf2 = new JTextField(150);
		JTextField tf3 = new JTextField(150);
		
		// text 상자를 만들고 그곳에 scroll 추가하는방법 
		JTextArea box = new JTextArea();
		JTextArea scroll = new JTextArea(20,300);
		JScrollPane scrollpane = new JScrollPane(box);
		
		//hashmap을 생성하자
	
		HashMap<String,data> map = new HashMap<String,data>();
	
	
	public Phone(){
		Container c = getContentPane();
		
		setTitle("자바 시험공부2 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Mouse Listener 객체를 새로 생성해주고 버튼들에 리스너를 달아준다.
		MyMouseListener listener = new MyMouseListener();
		
		btn1.addMouseListener(listener);
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		btn4.addMouseListener(listener);
		
		//c의 레이아웃을 null 로 주면 내가 원하는곳에 지정해서 붙여넣을수 있다.
		c.setLayout(null);
		// btnd1 ,2 ,3 의 위치와 사이즈를 지정해준다. 그이후에 container에 붙여준다.
		btn1.setLocation(450, 100);
		btn1.setSize(100, 50);
		c.add(btn1);

		btn2.setLocation(550, 100);
		btn2.setSize(100, 50);
		c.add(btn2);

		btn3.setLocation(650, 100);
		btn3.setSize(100, 50);
		c.add(btn3);

		btn4.setLocation(750, 100);
		btn4.setSize(100, 50);
		c.add(btn4);
		
		
		// 판넬을 만들어보자 1. panel을 gridlayout으로 만들기 2. 만들어둔 panel에다가 라벨 l1,l2,l3 랑 텍스트박스 tf1,tf2,tf3 을 붙이기 3.사이즈랑 위치정해주고container에 붙이
		panel.setLayout(new GridLayout(3,2));
		
		panel.add(l1);
		panel.add(tf1);
		
		panel.add(l2);
		panel.add(tf2);
		
		panel.add(l3);
		panel.add(tf3);
		
		panel.setLocation(450,200);
		panel.setSize(400,200);
		c.add(panel);
		//스크롤 페인을 어디에다가 위치할지 주소와 사이즈를 정한뒤에 container 에부착시킨다.
		scrollpane.setLocation(100,50);
		scrollpane.setSize(300,300);
		c.add(scrollpane);
		// 마지막 전체를 사이즈를 정해주고 visible 띄워주기
		setSize(900,500);
		setVisible(true);
	
		
	
}
	
public class MyMouseListener implements MouseListener,MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
		if (b.getText().equals("삽입")) {
			map.put(tf1.getText(), new data(tf2.getText(),tf3.getText()));
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		if ( b.getText().equals("삭제")) {
			map.remove(tf1.getText());
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		if( b.getText().equals("검색")) {
			String findvalue = tf1.getText(); // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			data finddata = map.get(findvalue);// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			
			if ( finddata ==null) {				// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				box.append("저장된사람들의 정보가 없습니다.");
			}
			else {
				box.append("이름은"+findvalue+ "주소는" + finddata.address+ "번호는" + finddata.number);
			}
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			
		}
		
		if( b.getText().equals("조회")) {
			box.append("저장된 사람들의 정보를출력합니다. ");
			
			Set<String> result = map.keySet();		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			Iterator <String> it =result.iterator();// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			while(it.hasNext()) {					// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				String Data = null;					// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				Data = it.next();
				data value = map.get(Data);			// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@중요@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				box.append("이름은"+Data+ "주소는" + value.address+ "번호는" + value.number);
			}
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	
}
	
public static void main(String[] args) {
	new Phone();
	}
}