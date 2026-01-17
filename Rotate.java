public class Rotate {
    public static class Node {
        int Data;
        Node Next;

        // these is the Constructor
        public Node(int Data) {
            this.Data = Data;
            this.Next = null;

        }
    }

    public static Node Function(Node Head,int k){
        if(Head==null || Head.Next==null || k==0){
            return null;

        }
        int Length=1;
        Node Tail=Head;
        while (Tail.Next!=null) {
            Tail=Tail.Next;
            Length++;


            
        }
        // Makig these As A New head or circular
        Tail.Next=Head;

         k=k%Length;

         Node newTail=Head;
         for(int i=0;i<Length-k-1;i++){
            newTail=newTail.Next;
         }
         
        //   Here Assigning the New Head Value 
         Node newHead=newTail.Next;
         newTail.Next=null;


    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.Next = new Node(2);
        Head.Next.Next = new Node(2);
        Head.Next.Next.Next = new Node(2);
        Head.Next.Next.Next.Next = new Node(2);

    }

}
