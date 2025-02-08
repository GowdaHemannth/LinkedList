

public class Numerical4 {
    // Here we are Going to Reverse a Linked List on K Gruop Basis
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
     public static int Count;
     
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
      // Recursive Approach to Find THe Element 
      public int Helper(Node Head,int key){
 
         if(Head==null){
             return -1;
 
         }
         if(Head.Data==key){
             return 0;
 
         }
         int index=Helper(Head.Next, key);
         if(index==-1){
             return -1;
         }
         else{
             return index+1;
         }
      }
 
      public int Recursive(int key){
         return Helper(Head,key);
      }
     
      // Method to Reverse a Linked List 
      public void Reverese(int n){
         Node Prev=null;
         Node Curr=Tail=Head;
         Node Next;
         while(Curr!=null){
             Next=Curr.Next;
             Curr.Next=Prev;
             Prev=Curr;
             Curr=Next;
 
         }
         Head=Prev;
         for (int i=0;i<n-1;i++){
             Prev=Prev.Next;
         }
         Prev.Next=Prev.Next.Next;
      }
     
      // Method For Palindrome
      public Node FindMid(Node Head){
         Node Slow=Head;
         Node Fast=Head;
         while(Fast!=null&&Fast.Next!=null){
             Slow=Slow.Next;// It Goes ONly One Step At A time
             Fast=Fast.Next.Next; // But Here IT Goes 2 Steps
         }
         return Slow;
     }
 
     public boolean CheckPalindrome(){
         if(Head==null||Head.Next==null){
             return true;
         }
         // Finding the Middle;
         Node MidNode=FindMid(Head);
         Node Prev=null;
         Node Curr=MidNode;
         Node Next;
         while(Curr!=null){
             Next=Curr.Next;
             Curr.Next=Prev;
             Prev=Curr;
             Curr=Next;
 
         }
         Node Right=Prev;
         Node Left=Head;
         while(Right!=null){
             if(Left.Data!=Right.Data){
                 return false;
             }
             else{
                 Left=Left.Next;
                 Right=Right.Next;
 
             }
 
         }
         return true;
     }
     public Node Find(int k) {
        if (Head == null || k <= 1) return Head;
    
        Node dummy = new Node(0); 
        dummy.Next = Head;
        Node Prev = dummy, Curr = Head, Next = null;
        int Count = 0;
    
        // Count nodes
        Node temp = Head;
        while (temp != null) {
            Count++;
            temp = temp.Next;
        }
    
        // Reverse in groups of k
        while (Count >= k) {
            Curr = Prev.Next;
            Next = Curr.Next;
            for (int i = 1; i < k; i++) {
                Curr.Next = Next.Next;
                Next.Next = Prev.Next;
                Prev.Next = Next;
                Next = Curr.Next;
            }
            Prev = Curr;
            Count -= k;
        }
        return dummy.Next;
    }
    
     public static void main(String []args){
      
        Numerical4 List=new Numerical4();
       
        List.AddFirst(2);
       
        List.AddFirst(1);
      
        List.AddLast(3);
     
        List.AddLast(4);
        List.Find(2);
        List.Print();
      
    
    
    
       
    
       
       
      
       
    
       
 
 
 
     }
     
 }
 