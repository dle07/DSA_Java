import structures.*;

public class Test {

    public static void main(String [] args){

        LinkedList<Integer> myList = new LinkedList<Integer>();
        for( int i = 0; i < 11; i++){
            myList.insertBack(Integer.valueOf(i));
        }

        myList.print();
        myList.insertAt(0, 555);
        myList.insertAt(1, 555);
        myList.insertAt(12, 555);
        myList.insertAt(14, 555);
        myList.print();
        /*
        Integer temp = 5;
        temp++;
        System.out.println(temp);
        /*
        StringBuilder temp = new StringBuilder();
        String result = temp.toString();
        temp.append("Hello There");
        temp.setCharAt(0, 'G');
        
        result = temp.toString();
        System.out.println(result);
        */
    }
    
        
}
