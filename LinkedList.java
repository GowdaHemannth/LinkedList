// This Like a Big Manufacturing Map
public class LinkedList{
    // Step 1 Creating new LinkedList Node;
    public static class Node{
        // These are the Certain Materials of Node;
        int Data;
       Node Next;
       public Node(int Data){
        // Now we Need To Create A new Car by Assem blying The Parts;
        this.Data=Data;
        this.Next=null;

       }
    }
    public static Node Head;
    public static Node Tail;
    public static void main(String []args){
     
        LinkedList List=new LinkedList();
        // Here We are Careting a New Cars;;;
        List.Head=new Node(1);
        List.Head.Next=new Node(2);
        



    }
    
}