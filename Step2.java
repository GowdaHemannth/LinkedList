
public class Step2 {
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
     // Method To print The Linked list;
     public void Print(){
        if(Head==null){
            System.out.println("The Linked List is Empty");
            return;
        }
        Node Temp=Head;
        while(Temp!=null){
            System.out.print(Temp.Data+" -->");
            Temp=Temp.Next;
        }
        System.out.println("null");
     }
    public static void main(String []args){
     
       Step2 List=new Step2();
       List.Print();
       List.AddFirst(2);
       List.Print();
       List.AddFirst(1);
       List.Print();
       List.AddLast(3);
       List.Print();
       List.AddLast(4);
       List.Print();
      
     
      
   
      



    }
    
}
