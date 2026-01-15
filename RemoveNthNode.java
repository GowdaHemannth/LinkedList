public class RemoveNthNode {

    // More optmised Approahb

    // Here I Might Hve Used Fst and Slow pointers
    // 1st Stepmove fast pointer
    // for (int i = 0; i <= N; i++) {
    // fast = fast.next;
    // }
    // Like at the beginig Only Move the fAST sIMPLE aS THAT
    // nOW THE SLOW IS tWO POINTER bEHIND THE Fast Hence move till fast is null at
    // last slow is at k-1 position then
    // slow.next=slow.next.next;

    // In these Code We need to Remove the Nth Node from the Nodes
    public static class Node {
        int Data;
        Node Next;

        // Here Function i am creating is constructor
        public Node(int Data) {
            this.Data = Data;
            this.Next = null;

        }

    }

    public static void Function(Node Head, int n) {
        int Count = 0;
        Node Temp = Head;
        while (Temp != null) {

            Temp = Temp.Next;
            Count++;
        }
        int res = Count - n;
        while (Temp != null) {
            res--;
            Temp = Temp.Next;
            if (res == 0) {
                break;
            }
        }
        Temp.Next = Temp.Next.Next;

    }

    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.Next = new Node(2);
        Head.Next.Next = new Node(3);
        Head.Next.Next.Next = new Node(4);
        Head.Next.Next.Next.Next = new Node(5);
        Function(Head, 0);

    }

}
