public class threadRunnable implements Runnable{
    public static void main(String[] args) {

        // cannot create an object for an interface since it is just a defenition

        threadRunnable tr = new threadRunnable();

        // create object also for the Thread class
        //have to pass it to the user defined object here tr

        Thread thread = new Thread(tr);
        thread.start();

        threadRunnable tr1 = new threadRunnable();
        Thread thread1 = new Thread(tr1);
        thread1.start();

        threadRunnable tr2 = new threadRunnable();
        Thread thread2 = new Thread(tr2);
        thread2.start();

        

        
    }
    @Override
    public void run(){
        for(int i =0; i< 20;i++)
        {
            System.out.println(i);
        }
        
    }
}
// disadvantage
// lot more complex we simple can call run() n number of times we can get the ans but here we have lot of code
// has unpredictable behaviour different output for different user 
// if you send a data in thread, the order may vary or the order of execution also varies
// difficult to debug 
// memory space -> thread has a huge memory (in run(); linear memory allocation is done one after 
//the other but in the thread a huge memory space is dedicated since it takes palce simultaneously)
// deadlock 
// 