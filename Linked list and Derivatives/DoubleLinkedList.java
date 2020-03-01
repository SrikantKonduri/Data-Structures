class Node{
    Node prev,next;
    int data;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList{
    
    Node head,tail;

    DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    void insertLast(int data){
        
        if(this.head == null){
            this.head = new Node(data);
            this.tail = this.head;
        }
        else{
            Node new_node = new Node(data);
            new_node.prev = this.tail;
            this.tail.next = new_node;
            this.tail = new_node;
        }
    }

    void printList(){
        Node temp = this.head;
        // System.out.println("------PRINT LIST-----");
        if(temp != null){
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("");
        }
        else{
            System.out.println("Empty List");
        }// System.out.println("------PRINT LIST-----");
    }

    void printReverseList(){
        Node temp = this.head;
        if(temp != null){
            while(temp.next != null){
                temp = temp.next;
            }
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.println("");
        }
        else{
            System.out.println("List is Empty");
        }
    }

    void deleteLast(){
        Node temp_tail = this.tail;

        if(temp_tail != null){
            if(this.head == this.tail){
                this.head = null;
                this.tail = null;
            }
            else{
                this.tail = temp_tail.prev;
                this.tail.next = null;
            }
        }
        else{
            System.out.println("List is Empty");
        }
    }

    void deleteFirst(){

        if(this.head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = this.head;

            //  IF LIST CONTAINS ONLY 1 NODE
            if(temp.next == null){
                this.head = null;
            }
            else{
                Node future_head = this.head.next;
                this.head = future_head; 
                this.head.prev = null;
            }
        }
    }

    boolean find(int value){
        Node temp = this.head;
        if(temp != null){
            while(temp != null){
               if(temp.data == value){
                   return true;
               }
               temp = temp.next; 
            }
        }
        return false;

    }

    void findAndDelete(int value){
        Node temp = this.head;
        if(temp != null){
            while(temp != null){

                if(temp.data == value){
                    // IF LIST HAS A SINGLE NODE
                    if(temp.prev == null && temp.next == null){
                        this.head = null;
                    }
                    // IF LIST HAS MANY NODES BUT THE DATA IS IN FIRST NODE
                    else if(temp.prev == null){
                        Node cur_node = temp;
                        Node next_node = temp.next;
                        this.head = next_node;
                        this.head.prev = null;
                    }
                    // IF DATA IS IN LAST NODE
                    else if(temp.next == null){
                        temp.prev.next = null;
                    }
                    // IF DATA IS IN MIDDLE OF THE LIST
                    else{
                        Node next_node = temp.next;
                        Node prev_node = temp.prev;
                        prev_node.next = next_node;
                        next_node.prev = prev_node;                         
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

}