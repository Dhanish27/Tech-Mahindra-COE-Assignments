public class ThreadProgram extends Thread {
    int ThreadNumber = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            ThreadProgram object = new ThreadProgram();
            object.ThreadNumber = i;
            object.start();

        }
    }

    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Thread Number : " + ThreadNumber + " " + j);
        }
    }
}
