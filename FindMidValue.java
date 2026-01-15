public class FindMidValue{
    public static class Node{
        int Data;
        Node Next;
        
        // Here Function i am creating is constructor
        public Node(int Data){
            this.Data=Data;
            this.Next=null;

        }

        // IN These FGunction Ia m Going to Find the Middle of the LinkedList
        public static Node Function(Node Head){
            Node Slow=Head;
            Node Fast=Head;
            while(Fast!=null && Fast.Next!=null && Slow!=null){
                Slow=Slow.Next;
                Fast=Fast.Next.Next;

            }
            return Slow ;  // These is The Middle 

        }
    }
    public static void main(String[] args) {
       Node Head = new Node(1);
        Head.Next = new Node(2);
        Head.Next.Next = new Node(3);
        Head.Next.Next.Next = new Node(4);
        Head.Next.Next.Next.Next = new Node(5);


        
    }
}
