import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Math;
import java.util.Collections;
import java.lang.Integer;
public class ValidAddresses {
       List<String> mylist = new ArrayList<String>();
	   public String[] valid(String possible){
             if (possible.length() < 4 || possible.length() > 12) return new String[0];
			 String[] parts = new String[4];
			 fillList(possible, 0, parts);
			 Collections.sort(mylist);
			 return mylist.toArray(new String[0]);
       }
	   private void fillList(String possible, int index, String[] parts) {
		   if (index < 3) {
			   for (int c = 1; c <= Math.min(possible.length(),3); c++) {
				   if (isvalid(possible.substring(0,c))) {
					   parts[index] = possible.substring(0,c);
					   fillList(possible.substring(c), index+1, parts);
				   }
			   }
		   }
		   else {
			   if (isvalid(possible)) {
				   parts[index] = possible;
				   mylist.add(String.join(".",parts));
			   }
		   }
	   }
	   private boolean isvalid(String possible) {
		   if (possible.length() > 0 && possible.length() <= 3 && possible.charAt(0) != '0' && Integer.parseInt(possible) < 256) return true;
		   else if (possible.length() == 1) return true;
		   return false;
	   }
		   
   }