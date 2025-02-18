public class Step3 {
    // Removing The Elements From the Last or From the Begining of The LnkedList
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
    public static int Size;
    
    // These Is the New Method To Add the Node;
    public void AddFirst(int Data){
        Node NewNode=new Node(Data);
        Size++;
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
        Size++;
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
     // Method to Delete at The Begining of The LinkedList;
     public int RemoveFirst(){
        if(Size==0){
            System.out.println("The Linked List Empty");
            return -1;
            
        }
        if(Size==1){
            int val=Head.Data;
            Head=Tail=null;
            return val;
        }
        int val=Head.Data;
        Head=Head.Next;
        return val;
     }
    public static void main(String []args){
     
       Step3 List=new Step3();
       List.Print();
       List.AddFirst(2);
       List.Print();
       List.AddFirst(1);
       List.Print();
       List.AddLast(3);
       List.Print();
       List.AddLast(4);
       List.Print();
       List.RemoveFirst();
       List.Print();;
      
     
      
   
      



    }
    
}
