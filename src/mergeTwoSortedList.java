
public class mergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ListNode l1 = new ListNode(5,new ListNode(10,new ListNode(15)));
		ListNode l2 = new ListNode(2,new ListNode(3,new ListNode(20)));
		
		ListNode l3 = new ListNode(0);
		
		l3 = merge2SortedList(l1,l2);
		System.out.println("sorted listnode is");
		while(l3!=null){
			System.out.println(l3.data);
			l3=l3.next;
		}
		

	}
	
	public static ListNode merge2SortedList(ListNode l1, ListNode l2){
		
	if(l1==null &&l2==null)
	{
		return null;
	}
		
		ListNode result = new ListNode(0);
		ListNode l4=result;
		int min1=0;
		int min2=0;
		
		while(l1!=null && l2!=null){
			
			if(l1!=null)
			{
				min1=l1.data;
			}
			if(l2!=null)
			{
				min2=l2.data;
			}
			if(min1<min2)
			{
				l4.next=new ListNode(min1);
				l4 = l4.next;
				l1= l1.next;
			}
			else if(min2<min1){
				l4.next=new ListNode(min2);
				l4 = l4.next;
				l2=l2.next;
			}
			else if(min1==min2)
			{
				l4.next=new ListNode(min1);
				l4 = l4.next;
				l4.next=new ListNode(min2);
				l4 = l4.next;
				l1=l1.next;
				l2=l2.next;
			}
		}if(l1!=null){
			while(l1!=null)
		{
			l4.next=new ListNode(l1.data);
			l1=l1.next;
			l4=l4.next;
		}
		}
		else if(l2!=null){
			while(l2!=null)
		{
			l4.next=new ListNode(l2.data);
			l2=l2.next;
			l4=l4.next;
		}
		}
		return result.next;
		
	}

}
