public class Node{
    Node head;
    Node tail;
    Object data;
    
    public Node(){
        Object data;
        Node prev;
        Node next;
    }
    public Node(Object d){ 
        data = d; 
    } 
    public Node(Node x, Object d, Node y){
        head = x;
        tail = y;
        data = d;
    }
    public Object getObject(){
        return data;
    }
    public Node getNext(){
        return tail;
    }
    public Node getPrev(){
        return head;
    }

    public void setObject(Object x){
        data = x;
    }
    public void setNext(Node n){
        tail = n;
    }
    public void setPrev(Node n){
        head = n;
    }
}