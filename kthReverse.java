public class kthReverse {

    // These Is A Hard Numerical If we Ddi9nt egt one Go Dont be Harsh will get it
    // one more truial

    public static class Node {
        int Data;
        Node Next;

        // Here Function i am creating is constructor
        public Node(int Data) {
            this.Data = Data;
            this.Next = null;

        }
    }

    public static Node Function(Node Head, int k) {
        Node Dummy = new Node(0);
        Dummy.Next = Head;
        Node Prev = Dummy;
        Node Nex = Dummy;
        Node Curr = Dummy;

        int Count = 0;
        while (Curr.Next != null) {
            Count++;
            Curr = Curr.Next;
        }

        while (Count >= k) {
            Curr = Prev.Next;
            Nex = Curr.Next;
            for (int i = 0; i < k; i++) {
                Curr.Next = Nex.Next;
                Nex.Next = Prev.Next;
                Prev.Next = Nex;
                Nex = Curr.Next;
        
            }
            // AS KNO PREV CHANGES DUMMY.NEXT WILL BE POINTED AT PREV.NEXT BUT 
            // BUT HERE AS PREV CGHANGES DUMMY ASO CHANGES 
            Prev = Curr;
            Count = Count - k;
        }

        // dummy.next changes ONLY when prev == dummy.
        // Once prev moves away from dummy, they are no longer linked.
        return Dummy.Next;
    }

    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.Next = new Node(2);
        Head.Next.Next = new Node(3);
        Head.Next.Next.Next = new Node(4);
        Head.Next.Next.Next.Next = new Node(5);
    }

}
