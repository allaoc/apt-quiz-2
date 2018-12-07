public class PowerList {
      public ListNode create(int n) {
          int insert = 1;		  
		  boolean init = true;
		  ListNode first = null;
		  ListNode last = null;
		  while (insert < n) {
			  if (init) {
				  first = new ListNode(insert, null);
				  last = first;
				  init = false;
			  }
			  else {
				  last.next = new ListNode(insert,null);
				  last = last.next;
			  }
			  insert *= 2;
		  }
	  return first;
      }
  }