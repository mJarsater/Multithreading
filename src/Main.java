public class Main {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        Thread.sleep(5000);
        T2 t2 = new T2();
        Thread.sleep(5000);
        t1.kill();
        Thread.sleep(5000);
        t2.kill();


    }


}

class T1 extends Thread{
    private boolean alive;


    public T1(){
        alive = true;
        start();
    }


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

    public void kill(){
        alive = false;
    }

}

class T2 implements Runnable{
    Thread t = new Thread(this);
    private boolean alive;

    public T2(){
        t.start();
        alive = true;
    }

    @Override
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

    public void kill(){
        alive = false;
    }
}
