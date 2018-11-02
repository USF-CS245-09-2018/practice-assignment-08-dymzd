
public class LinkedList implements List {
    
    Node head;
    Node tail;
    
    public LinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

	public void add(Object obj) throws Exception{
        Node newNode = new Node (obj);
        Node temp = head;

        if ( head == null ){
            newNode.head = null;
            head = newNode;
            return;
        }

        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setPrev(temp);

    }
	public void add(int pos, Object obj) throws Exception{
        Node newNode = new Node(obj);
        Node temp = head;
        Node required = null;

        if(head == null){
            head = newNode;
            return;
        }
        for(int i = 0; i < pos-1; i++){
            temp = temp.getNext();
        }
        if(temp.getNext() != null){
            required = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setPrev(temp);
        if(required != null){
            newNode.setNext(required);
            required.setPrev(newNode);
        }
    }
	public Object get(int pos) throws Exception{
        Node temp = head;
        for(int i = 0; i <= pos-1 ; i++){
            temp = temp.getNext();
        }
        return temp.getObject();
    }
	public Object remove(int pos) throws Exception{
        Node temp = head;

        if(isEmpty() != true){
            if(temp.getPrev() == temp.getNext()){
                head = null;
                return temp.getObject();
            }

            for(int i = 0; i <= pos-1; i++){
                temp = temp.getNext();
            }
        
            Node after = null;
            Node before = temp.getPrev();
            //IF THEER IS AFTER TAKE CARE OF IT
            if(temp.getNext() != null){
                after = temp.getNext();
                after.setPrev(before);
            }
            //IF THERE IS NO AFTER 
            if(after == null){
                before.setNext(null);
                return temp.getObject();
            } else {
                before.setNext(after);
                after.setPrev(before);
            }

        }        
        return temp.getObject();
    }
	public int size(){

        if(head == null){
            return 0;
        }
        int i = 0;
        Node x = head;

        while(x.getNext() != null){
            ++i;
            x = x.getNext();
        }
        
        return i+1;
    }

}
