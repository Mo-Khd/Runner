package Runner;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {
	
	public static AudioClip lup=Applet.newAudioClip(Sound.class.getResource("lup.wav"));
	public static AudioClip gameover=Applet.newAudioClip(Sound.class.getResource("lost.wav"));
	public static AudioClip gamming=Applet.newAudioClip(Sound.class.getResource("play.wav"));
	public static AudioClip jump=Applet.newAudioClip(Sound.class.getResource("jump.wav"));
}