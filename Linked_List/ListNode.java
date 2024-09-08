package Linked_List;

import java.util.Stack;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(4);
        ListNode l2=new ListNode(8);
        ListNode l3=new ListNode(12);

        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        traverseALinked(l1);
        System.out.println();
        l1=insertAtBeginning(l1,2);
        traverseALinked(l1);
        System.out.println();
        l1=insertAtEnd(l1,16);
        traverseALinked(l1);
        System.out.println();
        l1=insertAtMiddle(l1,40,3);
        traverseALinked(l1);
        System.out.println();
        l1=deleteAtBegining(l1);
        traverseALinked(l1);
        System.out.println();
        l1=deleteAtEnd(l1);
        traverseALinked(l1);
        System.out.println();
        l1=deleteAtMiddle(l1,2);
        traverseALinked(l1);
    }
    static void traverseALinked(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
    }

    static ListNode insertAtBeginning(ListNode head,int valtoinsert){
        ListNode newNode=new ListNode(valtoinsert);

        newNode.next=head;
        head=newNode;
    return head;
    }
    static ListNode insertAtEnd(ListNode head,int valtoinsert){
        ListNode newNode=new ListNode(valtoinsert);
        ListNode ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        return head;
    }

    static ListNode insertAtMiddle(ListNode head,int valuetoinsert,int position){
        ListNode newNode=new ListNode(valuetoinsert);
        ListNode ptr=head;
        for (int i=0;i<position;i++){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;

        return head;
    }

    //deletion
    static ListNode deleteAtBegining(ListNode head){
        head=head.next;
        return head;
    }

    static ListNode deleteAtEnd(ListNode head){
        ListNode ptr=head;
        while (ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;

        return head;
    }
    static ListNode deleteAtMiddle(ListNode head,int position){
        ListNode ptr=head;
        for (int i=0;i<position-1;i++){
            ptr=ptr.next;
        }
        ListNode nodetodelete=ptr.next;
        ListNode nextnode=nodetodelete.next;
        ptr.next=nextnode;
        return head;
    }

    boolean hasCycleFound(ListNode head){
        ListNode slowptr=head;
        ListNode fastptr=head;
        while (slowptr!=null&&fastptr!=null&&fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;

            if(slowptr==fastptr) {
                return true;
            }
        }
        return false;
    }

    ListNode intersectionNode(ListNode headA,ListNode headB){
        int lenA=getListLength(headA);
        int lenB=getListLength(headB);

        while (lenA>lenB){
            lenA--;
            headA=headA.next;
        }
        while (lenB>lenA){
            lenB--;
            headB=headB.next;
        }
        while (headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
     return headA;
    }
    static int getListLength(ListNode head){
        int length=0;
        while (head!=null){
            head=head.next;
            length++;
        }
        return length;
    }

    ListNode detectCycle(ListNode head){
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                while (head!=slow){
                    slow=slow.next;
                    head=head.next;
                }
                return slow;
            }
        }
        return null;
    }

    static ListNode middleNode(ListNode head){
        ListNode fastptr=head;
        ListNode slowptr=head;

        while (fastptr.next!=null && fastptr.next.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next;
        }
        return slowptr;
    }
    static ListNode removeElement(ListNode head,int val){
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode curr=dummy;
        while (curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else {
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    boolean isPalindrome(ListNode head){
        ListNode fast=head,slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        slow=reverseList(slow);
        fast=head;

        while (slow!=null){
            if(fast.val!=slow.val)
                return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    ListNode reverseList(ListNode head){
        Stack<Integer> stack=new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }
        ListNode returnNode=new ListNode(Integer.MIN_VALUE);
        ListNode ptr=returnNode;
        while (!stack.isEmpty()){
            ptr.next=new ListNode(stack.pop());
            ptr=ptr.next;
        }
        return returnNode.next;
    }

    ListNode oddEvenList(ListNode head){
        if(head==null)
            return head;
        ListNode odd=head;
        ListNode even=head.next;

        ListNode evenhead=even;

        while (even.next!=null && even.next.next!=null){
            odd=odd.next.next;
            odd=odd.next;

            even=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

    ListNode addtwoNumbers(ListNode l1,ListNode l2){
        ListNode result=new ListNode(0);
        ListNode ptr=result;
        int carry=0;
        while (l1!=null || l2!=null){
            int sum=0+carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
        }
        if(carry==1) ptr.next=new ListNode(1);
        return result.next;
    }
    ListNode swapPairs(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode point=dummy;
        while (point.next!=null||point.next.next!=null){
            ListNode swap1=point.next;
            ListNode swap2=point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;
        }
        return dummy.next;
    }
}
