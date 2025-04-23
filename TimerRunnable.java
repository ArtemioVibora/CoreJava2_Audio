import java.lang.Math;

//Oh yeah! Its African time!
//
//dont mind the comment above, I was hyper. Blame my mind
//But at any rate. This class acts like a stopwatch

public class TimerRunnable implements Runnable
{
  @Override
  public void run()
  {
    //Used the System.currentTimeMillis() as instructed
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    double milliseconds = end - start;
    for (int i = 0; i < 10; i++)
    {
        //Added a random quote generator to at least satisfy one of the conditions
        //to use a String Builder. I was not sure, and to be honest, I was like what
        //does text portion mean. Instead of ranting about it or doing something
        //unproductive, I took this opportunity to make a random quote generator for
        //the String builder. And it makes it cute ;) as subjective as that sound.
        //*finger guns
        //
        System.out.println((i + 1) + " second/s");
        //Forgive my naming convention for StringBuilder. I wasn't sure what to name
        //it so I went for the generic string
        StringBuilder str = new StringBuilder(" milliseconds has elapsed");
        StringBuilder strRandom = str.replace(0, 25, randomized());
        //System.out.println(milliseconds + str.toString());
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {

        }
        //This incrementation basically adds 1000 since thread.sleep is 1000. I should add
        //1000 to it. This is because, it will continually loop to 1001, 1000, 1000, 10001
        //and so on until the loop ends.
        milliseconds += 1000;
        System.out.println(milliseconds + "ms, " + strRandom.toString());
        
        
    }

  }

  //This function gives random messages for comfort and stuff hehehe
  //Let's make it fun
  //Concept here is String Builder
  //BUG REPORT: max - min + 1 is throwing an exception ArrayIndexOutOfBounds
  //So far my solution here is to remove the integer 1 from range  
  public String randomized()
  {
      String[] quotes = {
        "You are special!", "You are goodlooking",
        "Don't worry about it", "You will pull through",
        "Always give some space for yourself", "Nice hat",
        "The sun always shines in the horizon", "Be calm!",
        "Focus on yourself first", "Another one - DJ Khaled"
      };
      
      int max = 10;
      int min = 1;
      int range = max - min;
      int rand = 0;
      for (int i = 0; i < quotes.length; i++)
      {
          rand = (int)(Math.random() * range) + min;
        
      }
      return quotes[rand];



  }
}
