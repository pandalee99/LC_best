import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class t143 {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int L=0,R=list.size()-1;
        while(L<R){
            list.get(L++).next=list.get(R);
            list.get(R--).next=list.get(L);
        }
        list.get(L).next=null;
    }
}
