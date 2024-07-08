class morning extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }        
    }
}
class night extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Good Night");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }        
    }
}
public class threadrun {
    public static void main(String[] args) {
        Thread g1=new morning();
        Thread g2=new night();
        g1.start();
        g2.start();

    }    
}