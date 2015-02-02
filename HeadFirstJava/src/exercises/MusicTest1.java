package exercises;
import javax.sound.midi.*;

public class MusicTest1 {
	public void play(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Got a sequencer");
		}
		catch(MidiUnavailableException ex){
			System.out.println("failed");
		}
	}
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}
