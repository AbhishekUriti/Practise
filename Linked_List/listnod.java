package Linked_List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class listnod {
    public int val;
    public listnod next;
    public listnod(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        listnod l1=new listnod(4);
        listnod l2=new listnod(8);
        listnod l3=new listnod(12);
        l1.next=l2;
        l2.next=l3;
        l3.next=null;


        listnod list1=new listnod(1);
        list1.next=new listnod(3);
        list1.next.next=new listnod(5);
        listnod list2=new listnod(2);
        list2.next=new listnod(4);
        list2.next.next=new listnod(6);

        listnod mergedlist=mergeTwoLists(list1,list2);









        traversing(l1);
        System.out.println();
        l1=insertAtBeginning(l1,2);
        traversing(l1);
        System.out.println();
        l1=insertAtEnd(l1,16);
        traversing(l1);
        System.out.println();
        l1=insertAtMiddle(l1,45,2);
        traversing(l1);
        System.out.println();
        l1=deleteAtBeginng(l1);
        traversing(l1);
        System.out.println();
        l1=deleteAtEnd(l1);
        traversing(l1);
        System.out.println();
        l1=deleteatmiddle(l1,2);
        traversing(l1);

        traversing(mergedlist);
    }
    static void traversing(listnod head){
        listnod ptr=head;
        while (ptr!=null){
            System.out.print(ptr.val+"-->");
            ptr=ptr.next;
        }
    }
    static listnod insertAtBeginning(listnod head,int valToInsert){
        listnod newNode=new listnod(valToInsert);
        newNode.next=head;
        head=newNode;
        return head;
    }
    static listnod insertAtEnd(listnod head,int valtoinsert){
        listnod newNode=new listnod(valtoinsert);
        listnod ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        return head;
    }
    static listnod insertAtMiddle(listnod head,int valtoinsert,int position){
        listnod newNode=new listnod(valtoinsert);
        listnod ptr=head;
        for(int i=0;i<position;i++){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
        return head;
    }

    static listnod deleteAtBeginng(listnod head){
        head=head.next;
        return head;
    }
    static listnod deleteAtEnd(listnod head){
        listnod ptr=head;
        while (ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
        return head;
    }
    static listnod deleteatmiddle(listnod head,int position){
        listnod ptr=head;
        for (int i=0;i<position-1;i++){
            ptr=ptr.next;
        }
        listnod nodeToDelte=ptr.next;
        listnod nextNode=nodeToDelte.next;
        ptr.next=nextNode;
        return head;
    }

    public static listnod mergeTwoLists(listnod list1,listnod list2){
        listnod returnnode=new listnod(Integer.MIN_VALUE);
        listnod head=returnnode;
        while (list1!=null||list2!=null){
            if(list1.val<=list2.val){
                returnnode.next=list1;
                list1=list2.next;
            }else {
                returnnode.next=list2;
                list2=list2.next;
            }
        }
        if(list1==null){
            returnnode.next=list2;
        }else if(list2==null){
            returnnode.next=list1;
        }
        return head.next;
    }

    static ListNode reverseLinkedList(ListNode head){
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
    static ListNode reverseLinkedwithout(ListNode head){
        if(head==null)
            return null;
        if(head.next==null){
            return head;
        }

        ListNode preNode=null;
        ListNode currNode=head;
        while (currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=preNode;
            preNode=currNode;
            currNode=nextNode;
        }
        head=preNode;

        return head;
    }
    void reversePrintUsingRecurring(ListNode head){
        if(head.next==null)
            return;
        reversePrintUsingRecurring(head.next);

        System.out.println(head.val);
    }

    static ListNode removeDuplicates(ListNode head){
        ListNode prev=head;
        ListNode temp=prev.next;
        while (temp!=null){
            if(temp.val==prev.val){
                continue;
            }
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
       prev.next=null;
        return head;
    }
}
