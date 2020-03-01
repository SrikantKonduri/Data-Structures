
class LRUCacheTester{

    public static void main(String[] args) {
        
        LRUCache cache = new LRUCache(5);

        cache.fetch(6);
        cache.printCache();
        cache.fetch(5);
        cache.printCache();
        cache.fetch(6);
        cache.printCache();
        cache.fetch(4);
        cache.printCache();
        cache.fetch(3);
        cache.printCache();
        cache.fetch(10);
        cache.printCache();
        cache.fetch(9);
        cache.printCache();
        cache.fetch(3);
        cache.printCache();
        cache.fetch(5);
        cache.printCache();
        cache.fetch(4);
        cache.printCache();
        cache.fetch(3);
        cache.printCache();        
        cache.fetch(10);
        cache.printCache();   
    }
}