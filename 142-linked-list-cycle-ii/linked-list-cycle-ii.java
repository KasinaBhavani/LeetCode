/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode S,F;
        S=F=head;
        while(F!=null && F.next!=null){
            S=S.next;
            F=F.next.next;
            if(S==F){
                S=head;
                while(S!=F){
                    S=S.next;
                    F=F.next;
                }
                return S;
            }
        }
        return null;
    }
}