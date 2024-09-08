package Linked_List;

public class DoubleListNode {
    int val;
    DoubleListNode prev;
    DoubleListNode next;

    public DoubleListNode(int val) {
        this.val = val;
        prev=null;
        next=null;
    }

    public static void main(String[] args) {
        DoubleListNode l1=new DoubleListNode(4);
        DoubleListNode l2=new DoubleListNode(8);
        DoubleListNode l3=new DoubleListNode(15);
        l1.next=l2;
        l2.prev=l1;

        l2.next=l3;
        l3.prev=l2;

        DoubleListNode temp=l1;
        while (temp!=null){
            System.out.println(temp.val+"-->");
            temp=temp.next;
        }

        temp=l3;
        while (temp!=null){
            System.out.println(temp.val+"-->");
            temp=temp.prev;
        }
    }
    void traverseFromBeginning(DoubleListNode node){
        while (node.prev!=null){
            node=node.prev;
        }

        while (node.next!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    void traverseFromLast(DoubleListNode node){
        while (node.next!=null){
            node=node.next;
        }
        while (node.prev!=null){
            System.out.println(node.val);
            node=node.prev;
        }
    }

    void insertAtBeginning(DoubleListNode node,int valToinsert){
        while (node.prev!=null){
            node=node.prev;
        }
        DoubleListNode newNode=new DoubleListNode(valToinsert);
        newNode.next=node;
        node.prev=newNode;
    }
    void insertAtEnd(DoubleListNode node,int valtoinsert){
        while (node.next!=null){
            node=node.next;
        }
        DoubleListNode temp=new DoubleListNode(valtoinsert);
        temp.prev=node;
        node.next=temp;
    }

    void insertAtPosition(DoubleListNode node,int valtoInsert,int pos){
        while (node.prev!=null){
            node=node.prev;
        }
        for (int i=1;i<pos;i++){
            node=node.next;
        }
        DoubleListNode temp=new DoubleListNode(valtoInsert);
        temp.prev=node;
        temp.next=node.next;
        node.next.prev=temp;
        node.next=temp;
    }

    void deleteFromBeginning(DoubleListNode node){
        while (node.prev!=null){
            node=node.prev;
        }
        DoubleListNode temp=node.next;
        node.next=null;
        temp.prev=null;
    }
    void deleteFromend(DoubleListNode node){
        while (node.next!=null){
            node=node.next;
        }
        DoubleListNode temp=node.prev;
        temp.next=null;
        node.prev=node;
    }

    void deleteAtPosition(DoubleListNode node,int pos){
        while (node.prev!=null){
            node=node.prev;
        }
        for(int i=1;i<pos;i++){
            node=node.next;
        }
        node.next.prev=node.prev;
        node.prev.next=node.next;
        node.next=null;
        node.prev=null;
    }
}
