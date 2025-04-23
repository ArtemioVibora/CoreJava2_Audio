import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// This is basically the audioplayer taken from neo.
public class AudioPlayer {


 public static void play(String filePath) {

     AudioInputStream audioInputStream;

     Clip clip;

     try {

         File file = new File(filePath).getAbsoluteFile();

         audioInputStream = AudioSystem.getAudioInputStream(file);

         clip = AudioSystem.getClip();

         clip.open(audioInputStream);

         clip.start();

         while(!clip.isRunning())

             Thread.sleep(10);

         while (clip.isRunning())

             Thread.sleep(100);

         clip.close();

     } catch (UnsupportedAudioFileException ex) {

         Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);

     } catch (IOException ex) {

         Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);

     } catch (LineUnavailableException ex) {

         Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);

     } catch (InterruptedException ex) {

         Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);

     }
 }

    
}
