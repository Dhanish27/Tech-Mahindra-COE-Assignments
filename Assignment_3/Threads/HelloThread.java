package Threads;

public class HelloThread extends Thread {
    public void run(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
    }
}
