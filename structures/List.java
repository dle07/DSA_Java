package structures;


public interface List<xType> {
    
    public void insertFront (xType data);
    public void insertBack  (xType data);
    public void insertAt    (int index, xType data);

    public boolean deleteAtIndex ( int index);
    public boolean contains( xType data);
    public void print();


};
