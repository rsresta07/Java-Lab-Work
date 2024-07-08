/**
 * runablethread
 */
public class runablethread {
    public static void main(String [] args) {
        SavingAccount sa = new SavingAccount();
        SyncThread r1 = new SyncThread();
        SyncThread r2 = new SyncThread();
        r1.sa = sa;
        r2.sa = sa;
        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");
        t1.start();
        t2.start();
    }
}
class SavingAccount{
    private int balance=5000;
    public synchronized boolean withDraw(int amount) {
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Remaining balance: "+balance);
            return true;
        }
        return false;
    }
}
class SyncThread implements Runnable{
    SavingAccount sa;
    public void run() {
        for(int i=0;i<5;i++){
            sa.withDraw(200);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }        
    }
}