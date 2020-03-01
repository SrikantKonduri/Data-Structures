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
    
    Node head;

    DoubleLinkedList(){
        this.head = null;
    }

    void insertLast(int data){
        
        if(this.head == null){
            this.head = new Node(data);
        }
        else{
            Node temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
            Node new_node = new Node(data);
            new_node.prev = temp;
            temp.next = new_node;
        }
    }

    void insertFirst(int data){
        
        if(this.head == null){
            this.head = new Node(data);
        }
        else{
            Node temp = this.head;
            Node new_node = new Node(data);
            new_node.prev = temp;
            new_node.next = temp.next;
            temp.next = new_node;
        }   
    }

    void printList(){
        Node temp = this.head;
        if(temp != null){
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("");
        }
        else
            System.out.println("Empty List");
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

    int deleteLast(){
        Node temp = this.head;
        int data = -1;
        if(temp.next != null){
            while(temp.next.next != null){
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = null;
        }   
        else{
            System.out.println("List is Empty");
        }
        return data;
    }

}