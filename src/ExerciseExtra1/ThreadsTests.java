package ExerciseExtra1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadsTests {
  static int i = 0;
  static int numberOfRunsPerThread = 5;

  public static void execute() {
    new Thread(t1).start();
    new Thread(t2).start();
    new Thread(t3).start();
    new Thread(t4).start();
  }

  private static void count(String name) {
    Date dateNow = new Date(System.currentTimeMillis());
    SimpleDateFormat formatter = new SimpleDateFormat("ss:SSS");
    String date = formatter.format(dateNow);
    i++;
    System.out.println("O valor atual do contador é: " + i + ", thread: " + name + ", time: " + date);
  }

  private static Runnable t1 = new Runnable() {
    public void run() {
      try {
        for (int i = 0; i < numberOfRunsPerThread; i++)
          count("t1");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  };

  private static Runnable t2 = new Runnable() {
    public void run() {
      try {
        for (int i = 0; i < numberOfRunsPerThread; i++)
          count("t2");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  };

  private static Runnable t3 = new Runnable() {
    public void run() {
      try {
        for (int i = 0; i < numberOfRunsPerThread; i++)
          count("t3");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  };

  private static Runnable t4 = new Runnable() {
    public void run() {
      try {
        for (int i = 0; i < numberOfRunsPerThread; i++)
          count("t4");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  };

}
