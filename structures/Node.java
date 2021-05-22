package structures;

public class Node <xType>{
    public xType data;
    public Node<xType> next = null;

    public Node( xType data){
        this.data = data;
    }
    public Node( xType data, Node<xType> next ){
        this.data = data;
        this.next = next;
    }
    
    public Node(){
        
    };

    public Node( Node<xType> copy){
        Node<xType> result = new Node<xType>();
        result.data = copy.data;
    }


}
