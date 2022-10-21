package com.java8;



import java.util.*;


public class HashMapSorting

{
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("vijay",20);
        hm.put("ajay",50);
        hm.put("xyz",10);
        System.out.println("unsorted map -> " +hm);

      /*  Iterator itr= hm.entrySet().iterator();
        while (itr.hasNext())
        {
         Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey() +"" +entry.getValue());
        }*/

        //creating LIST of MAP

        List<Map.Entry<String,Integer>> listMap= new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());

       Collections.sort(listMap, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o2.getValue().compareTo(o1.getValue());
           }
       });

       HashMap<String,Integer> hashMap=new HashMap<>();
       for(Map.Entry<String,Integer> mm:listMap)
       {
           hashMap.put(mm.getKey(),mm.getValue());
       }
        System.out.println("Sorted HASH MAP -> "+hashMap);



    }
}
