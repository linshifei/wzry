package test;

import javax.swing.JFrame;


public class GameFrame extends JFrame{
	public GameFrame(){
//		���ñ���
		setTitle("������ҫ");
//		���ÿ�Ⱥ͸߶�
		setSize(1067, 600);
//		���ô������ڵ�λ�ã�x��������꣬y����������
//		setLocation(200, 200);
//		��������ʾ���м�
		setLocationRelativeTo(null);
		setResizable(false);//�����Ƿ�ɵ���
//		���ùرմ���ʱ�������������(����Ĳ�������Ϊ3����GameFrame.EXIT_ON_CLOSE)
		setDefaultCloseOperation(3);
		
		
	}
	public static void main(String[] args) {
		GameFrame frame=new GameFrame();
		GamePanel panel=new GamePanel(frame);
		frame.add(panel);//		�������ص���������
		frame.setVisible(true);//		���ô���ɼ�
	}

}
