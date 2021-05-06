/**
 * ClassName:TextDemp4
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/4/30 13:12
 */

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }


 }
public class TextDemo4 {

    //最大子序和
//    public int maxSubArray(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        int n = nums.length;
//        int[] dp = new int[n];
//        dp[0] = nums[0];
//        int res = nums[0];
//        for(int i = 1; i < n; i++) {
//            dp[i] = Math.max(nums[i] + dp[i - 1],nums[i]);
//            res = Math.max(dp[i],res);
//        }
//        return res;
//    }
//    public ListNode head = null;
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int res1 = 0,res2 = 0;
//        int result = 0;
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        //计算l1的倒序和
//        while(l1 != null) {
//            sb1.append(l1.val);
//            l1 = l1.next;
//        }
//        //计算l2的倒序和
//        while(l2 != null) {
//            sb2.append(l2.val);
//            l2 = l2.next;
//        }
//        res1 = Integer.parseInt(sb1.reverse().toString());
//        res2 = Integer.parseInt(sb2.reverse().toString());
//        result = res1 + res2;
//        if(result == 0) return new ListNode(0);
//        while(result != 0) {
//            int tmp = result % 10;
//            ListNode node = new ListNode(tmp);
//            tailInsert(node);
//            result /= 10;
//        }
//        return head;
//    }
//    //尾插法
//    public void tailInsert(ListNode node) {
//        if(head == null) {
//            head = node;
//        }
//        ListNode cur = head;
//        while(cur.next != null) {
//            cur = cur.next;
//        }
//        cur.next = node;
//        cur = node;
//    }


    public ListNode add1() {
        ListNode l1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        l1.next = node1;
        node1.next = node2;
        return l1;
    }
    public ListNode add2() {

        ListNode l2 = new ListNode(5);
        ListNode nod1 = new ListNode(6);
        ListNode nod2 = new ListNode(4);
        l2.next = nod1;
        nod1.next = nod2;
        return l2;
    }

    public ListNode head = null;
    public void reverseNode(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;
        while(cur.next != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        node = cur;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        reverseNode(l1);
        reverseNode(l2);
        int res1 = 0,res2 = 0;
        int result = 0;
        while(l1 != null) {
            res1 = res1 * 10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null) {
            res2 = res2 * 10 + l2.val;
            l2 = l2.next;
        }
        result = res1 + res2;
        if(result == 0) return new ListNode(0);
        while(result != 0) {
            int tmp = result % 10;
            ListNode node = new ListNode(tmp);
            if(head == null) head = node;
            ListNode cur = head;
            while(cur.next != null) cur = cur.next;
            cur.next = node;
            // tailInsert(node);
            result /= 10;
        }
        return head;
    }
    public static void main(String[] args) {
        TextDemo4 text = new TextDemo4();
        ListNode l1 = text.add1();
        ListNode l2 = text.add2();
        text.addTwoNumbers(l1,l2);
    }
}
