	
public class addTwoLinkedListReversed {
	
	public static void main(String[] args){
		
		ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
		ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
		
		ListNode l3 = new ListNode(0);
		
		l3 = sumofReverseLL(l1,l2);
		System.out.println("Nodes of reversed sum:");
		while(l3!=null){
			System.out.println(l3.data);
			l3=l3.next;
		}
		
		
	}
	
	public static ListNode sumofReverseLL(ListNode l1, ListNode l2){
		ListNode reverseSum = new ListNode(0);
		ListNode d = reverseSum;
		int sum = 0;
		while(l1!=null || l2!=null){
			sum = sum/10;
			if(l1!=null)
			{
				sum = sum+l1.data;
				l1 = l1.next;
			}
			if(l2!=null)
			{
				sum = sum+l2.data;
				l2 = l2.next;
			}
			d.next= new ListNode(sum%10);
			d = d.next;
		}
		if(sum/10 == 1){
			d.next= new ListNode(1);
		}
		
		return reverseSum.next;
	}

}
