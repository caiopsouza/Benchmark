# Benchmark

Code examples to measure CPU time for benchmarking.

## C

Tested only on Linux (Ubuntu for WSL)

### Code

[main.c](main.c)

### Reference

https://linux.die.net/man/3/clock_gettime

### To Run

```console
caio@note7:~/benchmark$ gcc -O3 main.c
caio@note7:~/benchmark$ ./a.out
1134903170
2.553183 seconds
caio@note7:~/benchmark$
```

## Java

### Code

[App.java](App.java)

### Reference

https://docs.oracle.com/cd/E17802_01/j2se/j2se/1.5.0/jcp/beta2/apidiffs/java/lang/management/ThreadMXBean.html#getCurrentThreadCpuTime()

### To Run

```console
caio@note7:~/benchmark$ javac App.java
caio@note7:~/benchmark$ java App
1134903170
3.1947903 seconds
caio@note7:~/benchmark$
```