package com.json;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.json.XML;
import org.json.simple.JSONValue;

public class JsonExp {
	public static void main(String[] args) throws JSONException {
		JSONObject jobj = new JSONObject();
		String xml = "<response>";

		HashMap hm = new HashMap();

		hm.put("Hi", "Hello");
		hm.put("greet", "good Morning");

		jobj.put("Vijay", "Bangalore");
		jobj.put("Sony", "Darbhanga");
		jobj.put("Ajay", "Pune");
		jobj.put("1", 2000000000);
		jobj.put("Mobile", "9611649225");
		jobj.put("Had Food", false);
		//jobj.put("firstAct", hm);

		//System.out.println(jobj);

		String jString = JSONValue.toJSONString(jobj);

		xml = xml+XML.toString(jobj)+"</response>"; // Json Object
		//System.out.println(xml);
		
		
		//JSONObject jsonObject = new JSONObject(contents.trim());
		Iterator<String> keys = jobj.keys();

		while(keys.hasNext()) {
		    String key = keys.next();
		 //  System.out.println(jobj.get(key));
		}
		
		String myJson="{\r\n" + 
				"	\"2\": \"IN8845623\",\r\n" + 
				"	\"24\": \"200\",\r\n" + 
				"	\"MTI\": \"1200\",\r\n" + 
				"	\"4\": \"0\",\r\n" + 
				"	\"49\": \"USD\",\r\n" + 
				"	\"102\": \"919886614620\",\r\n" + 
				"	\"11\": \"22751\",\r\n" + 
				"	\"12\": \"2020-02-15 19:08:06\",\r\n" + 
				"	\"17\": \"2020-02-15\",\r\n" + 
				"	\"123\": \"CMN\",\r\n" + 
				"	\"3\": \"310000\",\r\n" + 
				"	\"41\": \"00800535282910\",\r\n" + 
				"	\"42\": \"00800535282910\",\r\n" + 
				"	\"32\": \"00057\",\r\n" + 
				"	\"43\": \"00800535282910\"\r\n" + 
				"}";
		JSONObject jsonObject = new JSONObject(myJson.trim());
		Iterator<String> keys1= jsonObject.keys();
	    System.out.println(jsonObject);

		while(keys1.hasNext()) {
		    String key1 = keys1.next();
		   System.out.println(key1 +":"+jsonObject.get(key1));
		}

	}
	

}
