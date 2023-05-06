package Runner;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class Runner {
	
	static JFrame f;
	
	public static void main(String [] args)
	{
		
		
	begin();
	
	
	
	}
public static void begin(){
		
		f=new JFrame("Endless Runner");
		Run p = new Run();
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.setContentPane(p);
		f.setLocation (300,100);
		f.setSize(650,310);
		f.setVisible(true);
		f.setResizable(false);
		
		Run.randoms();
		Sound.gamming.loop();
		JMenuBar menuBar = new JMenuBar();
		
        JMenu menu = new JMenu("Menu");
        JMenu help = new JMenu("Help");
        
        KeyStroke ctrlH = KeyStroke.getKeyStroke(KeyEvent.VK_H, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        KeyStroke ctrlE = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        
        menuBar.add(menu);
        menuBar.add(help);
        
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem info = new JMenuItem("Help");
        JMenuItem about = new JMenuItem("About");
        
        
        exit.setMnemonic('e');
        exit.setAccelerator(ctrlE);
        
        info.setMnemonic('h');
        info.setAccelerator(ctrlH);
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        info.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	Run.pause=true;
            	Sound.gamming.stop();
                JOptionPane.showMessageDialog(null, "Use (up) key on your keyboard to jump , you must not hit your self with trees" + "\n" + 
            	"P: Pause"+ "\n" + "R: Resume"+ "\n");
                
            }
        });
        
        about.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	Run.pause=true;
            	Sound.gamming.stop();
                JOptionPane.showMessageDialog(null, "Coded By Mohamed Azhy");
                
            }
        });
        
        exit.setIcon(UIManager.getIcon("OptionPane.errorIcon"));
        
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        menu.add(exit);
        help.add(info);
        help.addSeparator();
        help.add(about);
        f.setJMenuBar(menuBar);
	        
}

}
