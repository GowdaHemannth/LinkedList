public class LinkedList{
    // Step 1 Creating new LinkedList Node;
    public static class Node{
        int Data;
       Node Next;
       public Node(int Data){
        this.Data=Data;
        this.Next=null;

       }
    }
    public static Node Head;
    public static Node Tail;
    public static void main(String []args){
        LinkedList List=new LinkedList();
        List.Head=new Node(1);
        



    }
    
}