public class Palindrome {

    // Here we need to find the Middle O fthe Linked list so we can use Fast and
    // slow approach
    // Then after you got the Middle of the Lonked list then Revers ethe Remainig
    // poart of the Linked lsit
    // check for the Data
    class Node {
        int Data;
        Node Next;

        public Node(int Data) {
            this.Data = Data;
            this.Next = null;

        }

        public static Node Head;
        public static Node Tail;

        // Method For Palindrome
        public Node FindMid(Node Head) {
            Node Slow = Head;
            Node Fast = Head;
            while (Fast != null && Fast.Next != null) {
                Slow = Slow.Next;// It Goes ONly One Step At A time
                Fast = Fast.Next.Next; // But Here IT Goes 2 Steps
            }
            return Slow;
        }

        public boolean CheckPalindrome() {
            if (Head == null || Head.Next == null) {
                return true;
            }
            // Finding the Middle;
            Node MidNode = FindMid(Head);
            Node Prev = null;
            Node Curr = MidNode;
            Node Next;
            while (Curr != null) {
                Next = Curr.Next;
                Curr.Next = Prev;
                Prev = Curr;
                Curr = Next;

            }
            Node Right = Prev;
            Node Left = Head;
            while (Right != null) {
                if (Left.Data != Right.Data) {
                    return false;
                } else {
                    Left = Left.Next;
                    Right = Right.Next;

                }

            }
            return true;
        }
    }

}
