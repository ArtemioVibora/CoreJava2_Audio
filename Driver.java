//Driver class contains main
//

public class Driver {

    public static void main(String[] args)
    {
        System.out.println("Cherish every second in your life!");
        System.out.println(); 
        TimerRunnable tr = new TimerRunnable();
        Thread trThread = new Thread(tr);
        trThread.start();
        AudioRunnable ar = new AudioRunnable();
        Thread arThread = new Thread(ar);
        arThread.start();
                
    }

    //THOUGHTS ON THIS ONE - 9:28 pm
    //Had fun with this coding exam
    //Though I have to admit, I didn't need the resource file
    //I am basically done with the program. it works as intended
    //according to my mind LMAO.
    //Holy. But I am going to attempt to gather the resources there
    //How to do it hahahahaha
    //
    //I understand that industry standards and so on. I just want my code
    //to be readable by me. So I decided to simplify it in order for me
    //trace my code. 
    //
    //However I am proud I figured this one out on my own. Given that I am
    //from a creative writing course transferred to Computer Science. I 
    //could have copied my classmate's works but I do not want to cheat myself.
    //
    //Yes, I am aware that there might be mistakes but I am going to take it
    //like a champ and be better. I wont mind having deductions because I need
    //to learn. And I dont take grades personally because by the end of the day
    //grades are just indications to be better.
    //
    //Going to clean the code
    //
    //
    //OKAY! THAT'S ABOUT IT
    //
    //BELLA CIAO! 

}
