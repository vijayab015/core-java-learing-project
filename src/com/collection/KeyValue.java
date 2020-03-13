package com.collection;

public class KeyValue {
	private Object key;
	public Object getKey(){
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	private Object value;
	
	public KeyValue(Object key,Object value)
	{
		this.key=key;
		this.value=value;
	}
	
	public String toString()
	{
		return key +" " +value;
		
	}
	

}
