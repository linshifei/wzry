package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	BufferedImage bg;//���ñ���ͼƬ
	Zhaoyun zy=new Zhaoyun();
	Lvbu lb=new Lvbu();
	public GamePanel(GameFrame frame){
		setBackground(Color.black);
		
//			���ر���ͼƬ
//			bg=ImageIO.read(GamePanel.class.getResource("/img/bg3.jpg"));
		bg=Util.getImg("/img/bg3.jpg");
//		��������������
		KeyAdapter adapter=new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				char c=e.getKeyChar();
//				System.out.println(e);
//				�������ƶ�
				if(c=='d'){//��
					zy.moveRight();
					zy.change();
				}else if(c=='a'){
					zy.moveLeft();
					zy.change();
				}else if(c=='w'){
					zy.moveUp();
				}else if(c=='s'){
					zy.moveDown();
				}
				repaint();
			}
		};
//		��������Ӽ��̼�����
		frame.addKeyListener(adapter);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0,null);
		g.drawImage(zy.img, zy.x, zy.y,null);
		g.drawImage(lb.lv,lb.x,lb.y,null);
	}

}
