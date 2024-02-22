class A extends Thread {

  public void run() {
    for (int i = 0; i < 3; i++) System.out.println("thread1 is executing");
  }
}

class B extends Thread {

  public void run() {
    for (int i = 0; i < 3; i++) System.out.println("thread2 is executing");
  }
}

class C extends Thread {

  public void run() {
    for (int i = 0; i < 3; i++) System.out.println("thread3 is executing");
  }
}

class MainThread {

  public static void main(String args[]) {
    A t1 = new A();

    System.out.println("t1 priority = " + t1.getPriority());

    t1.setPriority(Thread.MAX_PRIORITY);

    System.out.println("After setting t1 priority: " + t1.getPriority());
    System.out.println("Name is: " + t1.getName());

    t1.setName("MyThread1");

    System.out.println("t1 after setName: " + t1.getName());

    B t2 = new B();

    System.out.println("\nt2 priority = " + t2.getPriority());

    t2.setPriority(Thread.MIN_PRIORITY);

    System.out.println("After setting t2 priority: " + t2.getPriority());
    System.out.println("Name is: " + t2.getName());

    t2.setName("MyThread2");

    System.out.println("t2 after setName: " + t2.getName());

    C t3 = new C();

    System.out.println("\nt3 priority = " + t3.getPriority());

    t3.setPriority(Thread.NORM_PRIORITY);

    System.out.println("After setting t3 priority: " + t3.getPriority());
    System.out.println("Name is: " + t3.getName());

    t3.setName("MyThread3");

    System.out.println("t3 after setName: " + t3.getName());

    System.out.println("\nthread1 is executing");
    t1.start();

    System.out.println("thread2 is executing");
    t2.start();

    System.out.println("thread3 is executing");
    t3.start();
  }
}
