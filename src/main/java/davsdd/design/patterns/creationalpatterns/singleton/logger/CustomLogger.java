package davsdd.design.patterns.creationalpatterns.singleton.logger;

/*
VOLATILE:
- it's used to as an indicator to the Java compiler
to prevent a particular variable from being cached locally to the tread
- it forces all reads and writes to go straight to "main memory"
- it ensures that changes made to log are immediately made visible to other threads
* */

/*
SYNCHRONIZED:
- it's a locking mechanism which allows only one thread to access the synchronized method
or block at a time while others wait for their turn. In the context - synchronized (CustomLogger.class)
ensures that only one thread can execute the block of code inside the synchronized block at a time.
This prevents multiple threads from creating more than one instance of CustomLogger
* */

/*
DOUBLED-CHECKED LOCKING:
- it used to reduce the overhead of acquiring a lock by testing the locking criterion (the lock hint)
before actually acquiring the lock
* */

public class CustomLogger {

    private static volatile CustomLogger logger = null;

    private CustomLogger() {
    }

    public static CustomLogger getLogger() {
        if (logger == null) {
            synchronized (CustomLogger.class) {
                if (logger == null) return logger = new CustomLogger();
            }
        }
        return logger;
    }

    public void success(String message) {
        System.out.println(LoggerType.SUCCESS + ": " + message);
    }

    public void error(String message) {
        System.out.println(LoggerType.ERROR + ": " + message);
    }

}



