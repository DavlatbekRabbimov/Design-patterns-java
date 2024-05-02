package davsdd.design.patterns.creationalpatterns.singleton.cache;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class DataProcessor {

    private final DbManager dbManager;

    public DataProcessor() {
        dbManager = new DbManager();
        Executors.newFixedThreadPool(10);
    }

    public CompletableFuture<Object> processDataAsync(String key) {
        CacheManager cacheManager = CacheManager.getCacheManager();
        Object cachedData = cacheManager.get(key);
        if (cachedData != null) {
            return CompletableFuture.completedFuture(cachedData);
        } else {
            CompletableFuture<Object> object = dbManager.fetchDataFromDbAsync(key);
            return object.thenApply(data -> {
                if (data != null) cacheManager.put(key, data);
                return data;
            });
        }
    }

}
