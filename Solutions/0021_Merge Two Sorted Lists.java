class Solution 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        ListNode result = new ListNode(0);
        ListNode current = result;
        while(list1 != null && list2!= null)
        {
            if(list1.val <= list2.val)
            {
                current.next = list1;
                list1 = list1.next;
            }
            else 
            {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null ? list2:list1;
        return result.next;
    }
}
