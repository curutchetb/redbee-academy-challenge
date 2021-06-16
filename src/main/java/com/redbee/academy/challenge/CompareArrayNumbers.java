package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    //TODO: Implement me
int i = 0, j = 0;
	  
	  List<Integer> c = new ArrayList<Integer>();
	  
	  while(i<a.size() && j<b.size()) {
		  c.add(Math.max(a.get(i),b.get(j)));
		  i++;
		  j++;
	  }
	  
	 //in case sizes are different,once it arrives to the final length of one of the lists, it adds the rest of the other list
	  
	  if(i<a.size()) {
		  c.addAll(i, a.subList(i, a.size()));
	  }
	  else if (j<b.size()){
		  c.addAll(j, b.subList(j, b.size()));
	  }
	  
    return c;
  }



}
