package davsdd.design.patterns.creationalpatterns.singleton.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManager {

    private static volatile CacheManager cacheManager = null;

    private final Map<String, Object> cache;

    private CacheManager(){
        cache = new ConcurrentHashMap<>();
    }

    public static CacheManager getCacheManager(){
        if (cacheManager == null){
            synchronized (CacheManager.class){
                if (cacheManager == null) {
                    cacheManager = new CacheManager();
                }
            }
        }
        return cacheManager;
    }

    public void put(String key, Object value){
        cache.put(key, value);
    }

    public Object get(String key){
        return cache.get(key);
    }

}
