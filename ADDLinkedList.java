import java.lang.classfile.components.ClassPrinter.ListNode;

public class ADDLinkedList {
    // Here we are gonna add two liked List 
    // 9 7 6 5
    //   3 4 2
    
    // here we are gonna deal with one Edge Case like after both the LinkedList Becomes null 
    // You will be Having 1 remaonig that case 
    // Where carry is 1 
    
 class Node{
   public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    
  public static  ListNode Function(ListNode l1, ListNode l2){
     ListNode dummy = new ListNode(); 
        ListNode temp = dummy; 
        int carry=0;
        while(l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.val;
               l1= l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum=sum+carry;
            carry=sum/10;
              ListNode node = new ListNode(sum % 10); 
            temp.next = node; 
            temp = temp.next;
        }
        return dummy.next;
  }
}
}


