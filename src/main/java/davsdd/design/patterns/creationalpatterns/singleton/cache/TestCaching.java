package davsdd.design.patterns.creationalpatterns.singleton.cache;


import static java.lang.System.*;

public class TestCaching {

    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor();

        //Without caching test data
        long startTime = nanoTime();
        Object dataWithoutCaching = processor.processDataAsync("12").join();
        out.println("Data without caching: " + dataWithoutCaching);
        long endTime = nanoTime();
        out.println("Without caching duration: " + (endTime - startTime) + " ns.");

        out.println();
        //With caching test data
        long startCacheTime = nanoTime();
        Object dataWithCaching = processor.processDataAsync("12").join();
        out.println("Data with caching: " + dataWithCaching);
        long endCacheTime = nanoTime();
        out.println("With caching duration: " + (endCacheTime - startCacheTime) + " ns.");

    }

}
