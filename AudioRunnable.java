import java.lang.Math;

//Audio Runnable is responsible for playing the audio.
//If I am being honest, I was tempted to extend to AudioPlayer class
//but I decided not to due to me not being sure if it will work
//as intended.
public class AudioRunnable implements Runnable
{
    @Override
    public void run()
    {
        AudioPlayer ap = new AudioPlayer();
        //ap.play(randomizeAudioFiles());
        for (int i = 0; i < 3; i++)
        {
            try
            {
                //I made it to 1650 because 3000 makes it jump 4 seconds for
                //some reason. 
                Thread.sleep(1650);
            }
            catch (InterruptedException ex)
            {
            
            }
            //After the thread sleep it will play audio
            ap.play(randomizeAudioFiles());
        }
    }
    
    //I used a randomizer function to play randomized files.
    public String randomizeAudioFiles()
    {
        //Mayhaps after this exam. I will get back to this code and refractor it
        //and use the Resource file.
        String[] files = {"sample1.wav", "sample2.wav", "sample3.wav"};
        int max = 3;
        int min = 1;
        int range = max - min;
        int rand = 0;
        
        //It should be files.length because it will throw me an error that I have array out
        //of bounds. If it is like 3 instead of length the program will bug and throw me the
        //error.
        for (int i = 0; i < files.length; i++)
        {
            //Usage of math.random here hehe
            rand = (int)(Math.random() * range) + min;
        
        }

        return files[rand];
    }

}
