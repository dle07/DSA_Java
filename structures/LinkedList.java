package structures;



public class LinkedList <xType>  implements List<xType>{
    Node<xType> head = null;
    Node <xType> tail = null;
    int size_ = 0;

    public void insertFront(xType data){
        Node <xType> node = new Node<xType>(data);
        if( this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            node.next = head;
            head = node;
        }
        this.size_++;
    }
    public void insertFront(Node<xType> node){   //Pushes to front of the list
        if( this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            node.next = head;
            head = node;
        }
        this.size_++;
    }
    
    public boolean contains(xType data  ){
        Node <xType> curr = head;
        while( curr != null ){
            if( curr.data.equals(data) ) return true;
            curr = curr.next;
        }
        return false;
    };
    
    public void insertAt ( int index, xType data ){
        if( index < 0 || index > this.size_ ) return;
        else if( index == 0 ){
            insertFront(data);
            return;
        }
        else if( index == this.size_){
            insertBack(data);
            return;
        }
        else{
            Node<xType> temp = new Node<xType> (data);
            Node<xType> curr = this.head; 
            for( int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp.next;
        }
        this.size_++;
    }

    public void insertBack(xType data){
        Node <xType> node = new Node<xType>(data);
        if( this.head == null ){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        this.size_++;

    }
    public void insertBack(Node<xType> node){
        if( size_ == 0){
            head = node;
            node.next = null;
        }
        this.size_++;
    }
    
    public boolean deleteAtIndex(int index){
        if( index < 0 || size_ == 0 || index >= size_) return false;
        Node<xType> curr = head;

        for( int i = 0; i < index-1; i++){  
            curr = curr.next;
        }
        if( curr == head ){  //Are we deleting head?
            if( curr.next == null) curr = null;
            else{
                head = curr.next;
                curr.next = null;
            }
        }else if( index == size_ - 1 ){  //deleting tail?
            curr.next = null;
        }else{              //Deletion in the middle
            Node<xType> temp = curr.next;
            curr.next = curr.next.next;
            temp.next = null;
        }
        --size_;
        return true;
    }
    public void print(){
        Node<xType> curr = head;
        StringBuilder result = new StringBuilder("");
        String resultString = "";

        while( curr != null){
            result.append(curr.data + "->");
            curr = curr.next;
        }

        if( result.isEmpty()){
            System.out.println("This List Is Empty");
        }else{
            result.deleteCharAt(result.length()-1);
            result.deleteCharAt(result.length()-1);
            resultString = result.toString();
            System.out.println(resultString);
        }
    }

};
