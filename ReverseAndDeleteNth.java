public class ReverseAndDeleteNth {
    // As in stack or any other data structure linked lsit Doesnt have its Built in
    // Function Hence we need to Define it
    class Node {
        int Data;
        Node Next;

        public Node(int Data) {
            this.Data = Data;
            this.Next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public static void Reverse(Node Head, int n) {
        Node prev = null;
        Node curr = Tail = Head;
        Node next;
        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;

        }
        // Since we have reversed the Lonked list Here we need to do these
        Head = prev;

        // Now hee we will solve one more
        // FIND AND DELETE THE Nth Node from the List
        for (int i = 0; i < n - 1; i++) {
            prev = prev.Next;
        }
        // Simple logic for deleting we go till n-1 node then Break the link join to
        // another one

        prev.Next = prev.Next.Next;

    }

    public static void main(String[] args) {

    }

}
