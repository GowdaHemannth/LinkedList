public class Step1 {
    // Adding The Node in the Begining of linked List;
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
    
    // These Is the New Method To Add the Node;
    public void AddFirst(int Data){
        Node NewNode=new Node(Data);
        if (Head==null){
            Head=Tail=NewNode;
            return;

        }

        NewNode.Next=Head;
        Head=NewNode;


    }
     // These is the new Method To Add Element at Last;
     public void AddLast(int Data){
        Node NewNode=new Node(Data);
        if(Head==null){
        Head=Tail=NewNode;
        return;
        }
       
        Tail.Next=NewNode;
        Tail=NewNode;
     }
    public static void main(String []args){
     
       Step1 List=new Step1();
       List.AddFirst(2);
       List.AddFirst(1);
       List.AddLast(3);
       List.AddLast(4);
     
      
   
      



    }
    
}
