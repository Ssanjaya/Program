package EvaluationPhase2;

import java.util.*;

public class LinkedListProblem {
    static ListNode head;
    static public int[] nextLargerHead(ListNode head) {
        int count = sizeOfLinkedList(head);
        int[] ans = new int[count];
        int indexOfAns = 0;
        ListNode listNode;
        while (head != null) {
            if (head.next == null) {
                ans[indexOfAns] = 0;
                break;
            }
               listNode = head.next;
            if (head.value < listNode.value) {
                ans[indexOfAns] = listNode.value;
                indexOfAns++;
            } else {
                while (listNode != null && head.value >= listNode.value) {
                    listNode = listNode.next;
                }
                if (listNode != null) {
                    ans[indexOfAns] = listNode.value;
                    indexOfAns++;
                }
                else {
                    ans[indexOfAns] = 0;
                    indexOfAns++;
                }
            }
            head = head.next;
        }
        return ans;
    }

    public void add(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }
   static  public void printList() {
        System.out.println(Arrays.toString(nextLargerHead(head)));
    }
    static public int sizeOfLinkedList(ListNode head) {
        int count = 0;
        while (head != null) {
            count ++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedListProblem linkedlist = new LinkedListProblem();
        linkedlist.add(2);
        linkedlist.add(1);
        linkedlist.add(5);
        linkedlist.add(1);
        linkedlist.add(2);
//        nextLargerLinkedList(linkedlist.head);
//        linkedlist.printList();
        nextLargerHead(linkedlist.head);
        printList();
    }



}
