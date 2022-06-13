import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

// Reference: https://docs.oracle.com/cd/E17802_01/j2se/j2se/1.5.0/jcp/beta2/apidiffs/java/lang/management/ThreadMXBean.html#getCurrentThreadCpuTime()
public class App {
    private static long fib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();

        long start = threadBean.getCurrentThreadCpuTime();
        System.out.println(fib(45));
        long end = threadBean.getCurrentThreadCpuTime();

        System.out.println(((end - start) / 1e+9) + " seconds");
    }
}
