package com.collection;

public class LinkedHashMapOwn {
	static Object arr[] =new Object[16];
	static int i=0;
	
	public Object put(KeyValue kv)
	{
		for(int j=0;j<i;j++)
		{
			if(kv.getKey()==arr[i])
			{
				
			}
		}
		
		
		arr[i]=kv;
		i++;
		return arr[i];
		
	}
	public static void main(String[] args) {
		KeyValue kv=new KeyValue(1,"A");
		LinkedHashMapOwn lhm=new LinkedHashMapOwn();
	System.out.println(lhm.put(kv));
		
	}

}
