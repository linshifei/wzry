package test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.RepaintManager;

public class Zhaoyun {
	BufferedImage img;
	int x;
	int y;
	public Zhaoyun(){
//			���ر���ͼƬ
//			img=ImageIO.read(GamePanel.class.getResource("/img/right-0.png"));
		img=Util.getImg("/img/right-0.png");
		x=200;
		y=150;
	}
	int dir=0;//����ͼƬ�ƶ��ķ������dirΪ0��ʾ�����ƶ���1��ʾ�����ƶ�
	public void moveRight() {
		dir=0;
		x+=10;
	}
	public void moveLeft() {
		dir=1;
		x-=10;
	}
	public void moveUp() {
		y-=10;
	}
	public void moveDown() {
		y+=10;
	}
	int index=0;
	public void change() {
		index++;
		if(index>7){
			index=0;
		}
		if(dir==0){
			img=Util.getImg("/img/right-"+index+".png");
		}else if(dir==1){
			img=Util.getImg("/img/left-"+index+".png");
		}
		
	}

}
