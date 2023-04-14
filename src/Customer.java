public class Customer {
    int count;
    void increment() {
        synchronized (this) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Customer customer = new Customer();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    customer.increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    customer.increment();
                }
            }
        });
        thread.start();
//        Thread.sleep(10);
        thread1.start();
//         thread.join();
//        thread1.join();

        System.out.println("test");
        System.out.println(customer.count);

        System.out.println("test1");


    }



}