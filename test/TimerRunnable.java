public class TimerRunnable implements Runnable
{
    private int threadNumber;

    public TimerRunnable(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(threadNumber);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        timer();

    }

    public static float timer() throws Exception
    {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++)
        {
            Thread.sleep(60);

        }

        long end = System.currentTimeMillis();

        float msec = end - start;

        float sec = msec / 1000f;

        return sec;
    }
}
