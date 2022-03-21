public class SingleLinkedList<T>{
     //Class Node
     private class Node<T>{
        //instance variable for next and element
        private T element;
        private Node<T> next;
        
        public Node(T element,Node<T> node){
            this.element = element;
            this.next = node;
        }
        public T getElement(){
            return this.element;
        }
        public Node<T> getNext(){
            return this.next;
        }
        public void setNode(Node<T> node){
            this.next = node;
        }

     }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;
    public SingleLinkedList(){}
    
    //get number nodes
    public int getSize(){
        return this.size;
    }
    //check if empty
    public boolean isEmpty(){
        return getSize() > 0;
    }
    //return the first element
    public T first(){
        if(getSize() == 0){
            return null;
        }
        return head.getElement();
    }
    //return the last element
    public T last(){
        if(getSize() == 0){
            return null;
        }
        return tail.getElement();
    }
    //add Node
    public void addFirst(T element){
         head = new Node<T>(element,head);
         if(getSize() ==0){
            tail = head;
         }
        size++;

    }
    public void addLast(T element){
        Node<T> newNode = new Node<T>(element,null);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.setNode(newNode);
        }
        tail = newNode;
        size++;
    }
     public T removeFirst(){
         if(isEmpty()){
             return null;
         }
         T answer = head.getElement();
         head = head.getNext();
         size --;
         if(size == 0){
             tail = null;
         }
         return answer;

     }

}