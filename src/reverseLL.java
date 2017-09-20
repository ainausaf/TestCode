
public class reverseLL {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ListNode l1 = new ListNode(5,new ListNode(10,new ListNode(15)));
		
		ListNode l3 = new ListNode(0);
		
		l3 = reverseLList(l1);
		System.out.println("sorted listnode is");
		while(l3!=null){
			System.out.println(l3.data);
			l3=l3.next;
		}
		

	}
	
	public static ListNode reverseLList(ListNode l1){
		
		ListNode newhead = null;
		while(l1!=null)
		{
			ListNode temp = l1.next;
			l1.next=newhead;
			newhead=l1;		
	l1 = temp;
		}
		
		return newhead;
	}
	

}
