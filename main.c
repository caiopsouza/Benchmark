#include <stdio.h>
#include <time.h>

// Reference: https://linux.die.net/man/3/clock_gettime
double get_time_in_seconds()
{
    struct timespec t;
    clock_gettime(CLOCK_MONOTONIC, &t);
    return (double)t.tv_sec + 1.0e-9 * t.tv_nsec;
}

long fib(long n)
{
    if (n == 0 || n == 1)
    {
        return n;
    }

    return fib(n - 1) + fib(n - 2);
}

int main()
{
    double start = get_time_in_seconds();
    printf("%ld\n", fib(45));
    double end = get_time_in_seconds();

    printf("%f seconds\n", end - start);

    return 0;
}