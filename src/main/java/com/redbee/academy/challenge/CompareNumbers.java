package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    //TODO: Implement me
	  
	  if(a!=null && b!= null && c!=null) {
		  return Math.max(Math.max(a,b), c);
	  }
	  
	  if(a==null && b==null && c!=null) {
		  return c;
	  } else if (a!=null && b==null && c==null) {
		  return a;
	  }else if (a==null && b!=null && c==null) {
		  return b;
	  }
	  
	  if(a==null && b!=null && c!=null) {
		  return Math.max(b, c);
	  }else if (b==null && a!=null && c!=null) {
		  return Math.max(a, c);
	  } else if (c==null && a!=null && b!=null) {
		  return Math.max(a, b);
	  }
	  
	  
    return null;
  }
}
