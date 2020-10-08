public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Skapar nya objektet "t1"
        T1 t1 = new T1();
        //Pausar körningen i 5 sek (5000ms)
        Thread.sleep(5000);
        // Skapar nya objektet "t2"
        T2 t2 = new T2();
        //Pausar körningen i 5 sek (5000ms)
        Thread.sleep(5000);
        //Sätter alive till false i t1 och dödar tråden
        t1.kill();
        //Pausar körningen i 5 sek (5000ms)
        Thread.sleep(5000);
        //Sätter alive till false i t2 och dödar tråden
        t2.kill();


    }


}

class T1 extends Thread{
    private boolean alive;

    /*  Konstruktor för T1 som sätter
    * alive till true och kallar på
    * startmetoden   */
    public T1(){
        alive = true;
        start();
    }

    /*Metod som printar ut texten 1 gång
     * i sekunden*/
    public void run(){
        while(alive) {
            System.out.println("T1:Tråd 1");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    /*Sätter alive till false
    * och storppar tråden*/
    public void kill(){
        alive = false;
    }

}

class T2 implements Runnable{
    /*Initierar en variabel för tråden*/
    Thread t = new Thread(this);
    private boolean alive;

    /*  Konstruktor för T2 som sätter
     * alive till true och kallar på
     * startmetoden   */
    public T2(){
        t.start();
        alive = true;
    }


    /*Metod som printar ut texten 1 gång
    * i sekunden*/
    public void run() {
        while(alive) {
            System.out.println("T2:Tråd 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    /*Sätter alive till false
     * och storppar tråden*/
    public void kill(){
        alive = false;
    }
}
