package Runner;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;

import java.util.Random;

public class Run extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage img,img1,img2,img3,img4,img1b,img2b,img3b;
	static double st=0;
	static double s0=0,s=0,s1=0;
	static int m=0;
	static int speed=0, speed1=0;
	static String cc,c;
	static int x1=1700,ya=200,x2=3000,x3=2400,x4=4400,sx1=400,sx2=1000,sx3=3700;
	static double xx=0,yy=0;
	static Rectangle2D.Double rec,srec1,srec2,srec3,rec1,rec2,rec3,rec4;
	Timer t1=new Timer(13,new timer1());
	Timer t2=new Timer(8,new timer2());
	static int tri;
	static boolean pause=false;
	static JLabel l;
	static int random=1;
	public void paint(Graphics g)
	{
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		
		JLabel l=new JLabel("");
		l.setIcon(new ImageIcon("background.jpg"));
		add(l);
		setBackground(new Color(16,111,162));
		
		rec=new Rectangle2D.Double(35+xx,ya-20+yy,40,45);
		if(random==1){
			srec1=new Rectangle2D.Double(getWidth()+sx1,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+sx2,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+sx3,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+x1,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+x2,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+x3,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+x4,ya-25,75,50);
		}
		else if(random==2){
			srec1=new Rectangle2D.Double(getWidth()+x3,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+x1,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+sx1,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+x4,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+sx3,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+x2,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+sx2,ya-25,75,50);
		}
		
		else if(random==3){
			srec1=new Rectangle2D.Double(getWidth()+x2,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+sx3,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+x4,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+sx1,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+x1,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+sx2,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+x3,ya-25,75,50);
		}
		
		else if(random==4){
			srec1=new Rectangle2D.Double(getWidth()+x1,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+sx1,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+x3,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+sx2,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+x4,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+sx3,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+x2,ya-25,75,50);
		}
		
		else if(random==5){
			srec1=new Rectangle2D.Double(getWidth()+sx3,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+x4,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+sx2,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+x2,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+x3,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+sx1,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+x1,ya-25,75,50);
		}
		
		else if(random==6){
			srec1=new Rectangle2D.Double(getWidth()+sx2,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+x2,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+x1,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+x3,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+sx1,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+x4,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+sx3,ya-25,75,50);
		}
		
		else{
			srec1=new Rectangle2D.Double(getWidth()+x4,ya-10,30,35);
			srec2=new Rectangle2D.Double(getWidth()+x3,ya-10,45,35);
			srec3=new Rectangle2D.Double(getWidth()+x2,ya-10,60,35);
			rec1=new Rectangle2D.Double(getWidth()+x1,ya-25,30,50);
			rec2=new Rectangle2D.Double(getWidth()+sx3,ya-25,45,50);
			rec3=new Rectangle2D.Double(getWidth()+sx2,ya-25,60,50);
			rec4=new Rectangle2D.Double(getWidth()+sx1,ya-25,75,50);
		}	
		
	
		
		if(yy>0)
			yy=0;
		
		
		try 
		{ 
		
		img = ImageIO.read(new File("run.png"));
		
		
		img1 = ImageIO.read(new File("1.png"));
		img2 = ImageIO.read(new File("2.png"));
		img3 = ImageIO.read(new File("3.png"));
		img4 = ImageIO.read(new File("4.png"));
		img1b = ImageIO.read(new File("1b.png"));
		img2b = ImageIO.read(new File("2b.png"));
		img3b = ImageIO.read(new File("3b.png"));
		
		g2d.drawImage(img, 35+(int)xx,ya-20+(int)yy,40,45,null);
		
		if(random==1){
		g2d.drawImage(img1, getWidth()+sx1,ya-10,30,35,null);
		g2d.drawImage(img2, getWidth()+sx2,ya-10,45,35,null);
		g2d.drawImage(img3, getWidth()+sx3,ya-10,60,35,null);
		g2d.drawImage(img1b, getWidth()+x1,ya-25,30,50,null);
		g2d.drawImage(img2b, getWidth()+x2,ya-25,45,50,null);
		g2d.drawImage(img3b, getWidth()+x3,ya-25,60,50,null);
		g2d.drawImage(img4, getWidth()+x4,ya-25,75,50,null);
		}
		else if(random==2){
			g2d.drawImage(img1, getWidth()+x3,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+x1,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+sx1,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+x4,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+sx3,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+x2,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+sx2,ya-25,75,50,null);
		}
		
		else if(random==3){
			g2d.drawImage(img1, getWidth()+x2,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+sx3,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+x4,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+sx1,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+x1,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+sx2,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+x3,ya-25,75,50,null);
		}
		
		else if(random==4){
			g2d.drawImage(img1, getWidth()+x1,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+sx1,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+x3,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+sx2,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+x4,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+sx3,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+x2,ya-25,75,50,null);
		}
		
		else if(random==5){
			g2d.drawImage(img1, getWidth()+sx3,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+x4,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+sx2,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+x2,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+x3,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+sx1,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+x1,ya-25,75,50,null);
		}
		
		else if(random==6){
			g2d.drawImage(img1, getWidth()+sx2,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+x2,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+x1,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+x3,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+sx1,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+x4,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+sx3,ya-25,75,50,null);
		}
		
		else{
			g2d.drawImage(img1, getWidth()+x4,ya-10,30,35,null);
			g2d.drawImage(img2, getWidth()+x3,ya-10,45,35,null);
			g2d.drawImage(img3, getWidth()+x2,ya-10,60,35,null);
			g2d.drawImage(img1b, getWidth()+x1,ya-25,30,50,null);
			g2d.drawImage(img2b, getWidth()+sx3,ya-25,45,50,null);
			g2d.drawImage(img3b, getWidth()+sx2,ya-25,60,50,null);
			g2d.drawImage(img4, getWidth()+sx1,ya-25,75,50,null);
		}
		
		}
		
		catch (Exception ex){ ex.printStackTrace(); } 
		
		Random ra = new Random();
		
		int r = ra.nextInt((1000-230) + 1) + 230;
		
		
		if(getWidth()+sx1<=-75){
			sx1=x4 +r;
			
		}
		
		if(getWidth()+sx2<=-75){
			sx2=sx1 +r;
			
		}
		
		if(getWidth()+x1<=-75){
			x1=sx2 +r;
			
		}
		
		if(getWidth()+x3<=-75){
			x3=x1 +r;
			
		}
		
		if(getWidth()+x2<=-75){
			x2=x3 +r;
			
		}
		
		if(getWidth()+sx3<=-75){
			sx3=x2 +r;
			
		}
		
		if(getWidth()+x4<=-75){
			x4=sx3 +r;
			
		}
		
		if(!pause){
		st=st+1.15;
		
		
		
		if(st>=8.90){
			st=0;
			s0=s0+1.2;
		}
		if(s0>=9){
			s0=0;
			s++;
		}
		
		if(s>9.9){
			s=0;
			s1++;
			
		}
		if(s1>5){
			s1=0;
			m++;
		}
		}
		
		if(s1==1&&m==0)
		{
			speed=1;speed1=1;
			if(s0==0&&s==0&&st==0)
			Sound.lup.play();
			}
		else if(s1==2&&m==0)
		{
			speed=2;
			if(s0==0&&s==0&&st==0)
				Sound.lup.play();
			}
		else if(s1==3&&m==0)
		{
			speed=3;speed1=2;
			if(s0==0&&s==0&&st==0)
				Sound.lup.play();
			}
		else if(s1==4&&m==0)
		{
			speed=4;speed1=3;
			if(s0==0&&s==0&&st==0)
			Sound.lup.play();
		}
		else if(s1==5&&m==0)
		{
			speed=5;
			if(s0==0&&s==0&&st==0)
			Sound.lup.play();
			}
		else if(m==1&&s1==0)
		{
			speed=6;speed1=4;
			if(s0==0&&s==0&&st==0)
			Sound.lup.play();
			}
		else if(m==1&&s1==1)
		{
			speed=7;speed1=5;
			if(s0==0&&s==0&&st==0)
			Sound.lup.play();
			}

		c=m+":"+(int)s1+""+(int)s;
		cc=":"+(int)s0+""+(int)st;
		Score max=new Score(c);
		//System.out.println(c);
		
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font("Verdana", Font.BOLD, 20));
		
		if(((s1==1||s1==2||s1==3||s1==4||s1==5)&&(m==0))||(m==1&&s1==0)||m==1&&s1==1){
			if((s0>=0&&s0<4)&&s==0)
				g2d.setColor(new Color(16,111,162));
		}
		
		g2d.drawString(c+cc,15,20);
		g2d.setColor(Color.DARK_GRAY);
		g2d.drawString("Best= "+max.max,500,20);
		
		g2d.setColor(Color.darkGray);
		g2d.setFont(new Font("Verdana", Font.ITALIC, 15));
		
		if(!pause)
			g2d.drawString("< P > to pause", 250, 20);
		
		if(pause)
			g2d.drawString("< R > to Resume", 250, 20);
		
		if(collision()){
			
			Sound.gamming.stop();
			Sound.gameover.play();
			tri=JOptionPane.showConfirmDialog(this,c+cc, "Do you want to try again?",JOptionPane.YES_NO_OPTION);
			if(tri==0){
				
				st=0;
				s0=0;s=0;s1=0;
				m=0;
				speed=0; speed1=0;
				x1=1700;ya=200;x2=3000;x3=2400;x4=4400;sx1=400;sx2=1000;sx3=3700;
				xx=0;yy=0;
				
				Runner.f.setVisible(false);
				Runner.begin();
				
				
				
			}
			else{
				
				System.exit(ABORT);
			}
		}
		
		if(!pause)
		recMove();
		
		key k=new key();
		addKeyListener(k);
		
		repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void randoms(){
		
			Random ra = new Random();
			
			random = ra.nextInt((7-1) + 1) + 1;
	
			
			
	}
	
	
	public boolean collision(){
		return rec.getBounds().intersects(rec1)||
				rec.getBounds().intersects(rec2)||
				rec.getBounds().intersects(rec3)||
				rec.getBounds().intersects(rec4)||
				rec.getBounds().intersects(srec1)||
				rec.getBounds().intersects(srec2)||
				rec.getBounds().intersects(srec3);
	}
	
	public void recMove(){

			x1=x1-4-speed;
			x2=x2-4-speed;
			x3=x3-4-speed;
			x4=x4-4-speed;
			sx1=sx1-4-speed;
			sx2=sx2-4-speed;
			sx3=sx3-4-speed;
			
			
		}
		
	
	
	
	class timer1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(!pause)
			yy=yy-10-speed1;
		
			if(speed==0){
				if(yy<=-123){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
					
					
				}
					}
			
			else if(speed==1){
				if(yy<=-122){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
					
					
				}
					}
			
			else if(speed==2){
				if(yy<=-121){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
					
					
				}
					}
			
			else if(speed==3){
				if(yy<=-120){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
				}
					}
			
			else if(speed==4){
				if(yy<=-119){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
				}
					}
			
			else if(speed==5){
				if(yy<=-118){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
				}
					}
			
			else if(speed==6){
				if(yy<=-117){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
				}
					}
			
			else{
				if(yy<=-116){
					t1.stop();
					if(!pause)
					t2.start();
					else
						t2.stop();
				}
					}
		}
		
	}
	
	
	
	class timer2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if(!pause)
			yy=yy+10+speed1;
			
			if(yy>=0){
				t2.stop();
				
			}
			
			
		}
		
	}
	
	public void addNotify() {
        super.addNotify();
        requestFocus();
    }
	
	class key implements KeyListener{
		public void keyPressed(KeyEvent e){
			if (e.getKeyCode() == KeyEvent.VK_UP)
			{
				
					
				if(yy>=0){
					if(!pause){
				t1.start();
				Sound.jump.play();
					}
					else
						t1.stop();
						
				}
				
				if(speed==0){
					if(yy<=-123){
						if(!pause)
						t2.start();
						else
						t2.stop();
					}
					
						}
				
				else if(speed==1){
					if(yy<=-122){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else if(speed==2){
					if(yy<=-121){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else if(speed==3){
					if(yy<=-120){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else if(speed==4){
					if(yy<=-119){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else if(speed==5){
					if(yy<=-118){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else if(speed==6){
					if(yy<=-117){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				else{
					if(yy<=-116){
						if(!pause)
						t2.start();
						else
							t2.stop();
					}
						}
				
				
				
			}
			
			if (e.getKeyCode() == KeyEvent.VK_P)
			{
				Sound.gamming.stop();
				pause=true;
				
			}
			
			if (e.getKeyCode() == KeyEvent.VK_R)
			{
				Sound.gamming.loop();
				pause=false;
                                                                         
			}
				
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	

}
