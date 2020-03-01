
class Queue{
    DoubleLinkedList head;
    int size ;
    Queue(){
        this.head = new DoubleLinkedList();  
        this.size = 0;
    }

    void enqueue(int data){
        this.head.insertLast(data);
        this.size++;
    }

    void dequeue(){
        this.head.deleteFirst(); 
        this.size--;  
    }

    void printQueue(){
        this.head.printList();        
    }

    boolean has(int value){
        return this.head.find(value);
    }

    void delete(int value){
        this.size--; 
        this.head.findAndDelete(value);
    }

    int getSize(){
        return this.size;
    }

}