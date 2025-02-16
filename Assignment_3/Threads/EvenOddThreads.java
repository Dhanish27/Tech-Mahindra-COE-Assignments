package Threads;

class EvenThread extends Thread{
    public void run(){
        for(int i=0;i<=20;i=i+2){
            System.out.println("Even Number : "+i);
        }
    }
}
class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=20;i=i+2){
            System.out.println("Odd Number : "+i);
        }
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
