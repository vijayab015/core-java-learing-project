package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapItr {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(10, "Mani");
		hm.put(15, "Sonu");
		hm.put(18, "Vijay");
		hm.put(12, "Ajay");
		//System.out.println(hm);
		
		Set s=hm.keySet();
		System.out.println(s);
		
		Set s1=hm.entrySet();
		System.out.println(s1);
		
		Collection c=hm.values();
		System.out.println(c);
		
		
		/*
		 * Iterator itr=hm.keySet().iterator(); while(itr.hasNext()) { Integer
		 * key=(Integer) itr.next(); String value=(String) hm.get(key);
		 * 
		 * System.out.println("Key is -"+key +" Value is -" +value);
		 * 
		 * } System.out.println(hm);
		 */
		
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry ent=(Entry) itr.next();
			System.out.println(ent.getKey() + "  " +ent.getValue());
			
			if(ent.getKey()==(Object)12)
			{
				hm.put(12, "Changed Value");
			}
		}
		
	}
}
