package test;

import javax.swing.JFrame;


public class GameFrame extends JFrame{
	public GameFrame(){
//		设置标题
		setTitle("王者荣耀");
//		设置宽度和高度
		setSize(1067, 600);
//		设置窗体所在的位置，x代表横坐标，y代表纵坐标
//		setLocation(200, 200);
//		将窗体显示在中间
		setLocationRelativeTo(null);
		setResizable(false);//窗口是否可调节
//		设置关闭窗体时结束程序的运行(里面的参数设置为3或者GameFrame.EXIT_ON_CLOSE)
		setDefaultCloseOperation(3);
		
		
	}
	public static void main(String[] args) {
		GameFrame frame=new GameFrame();
		GamePanel panel=new GamePanel(frame);
		frame.add(panel);//		将面板加载到窗体里面
		frame.setVisible(true);//		设置窗体可见
	}

}
