class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int mod = 0,sum;
        while(l1 != null || l2 != null || mod == 1)
        {
            sum=0; 
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            sum+=mod;
            mod=sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return temp.next; 
    }
}
