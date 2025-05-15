
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode smallTail = null;
        ListNode smallHead = null;
        ListNode largeHead = null;
        do(smallTail, smallHead, largeHead, head, x);

        smallTail.next = largeHead;
        return smallHead;
    }

    public void do(ListNode smallTail, ListNode smallHead , ListNode largeHead, ListNode curr, int x) {
        if (cuur == null) {
            return;
        }
        if (curr.val < x) {
            // 小节点
            if (samllHead == null) {
                smallHead = curr;
                smallTail = smallHead;
            } else {
                smallTail.next = curr;
                smallTail = curr;
            }
        } else {
            if (largeHead == null) {
                largeHead = curr;
            } else {
                largeHead.next = curr;
            }
        }

        do(smallTail, smallHead, largeHead, curr.next, x);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
