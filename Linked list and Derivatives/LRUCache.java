
class LRUCache{
    Queue queue;
    int size; 

    LRUCache(int size){
        this.size = size;
        this.queue = new Queue(); 
    }

    private void insert(int value){
        
        if(this.queue.getSize() == this.size){
            this.queue.dequeue();
        }
        
        this.queue.enqueue(value);
    }

    private boolean doesExist(int value){
        
        return this.queue.has(value);
    }

    int fetch(int value){
        
        if(this.doesExist(value)){
            this.queue.delete(value);
        }
        this.insert(value);
        return value;
    }

    void printCache(){
        this.queue.printQueue();
    }

}
