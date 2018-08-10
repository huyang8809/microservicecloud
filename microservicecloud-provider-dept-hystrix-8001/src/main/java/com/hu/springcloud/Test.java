package com.hu.springcloud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	/*
	 * public static void main(String[] args) { List<Integer> list1 = new
	 * ArrayList<Integer>(); for (int i = 0; i < 7; i++) { list1.add(i); }
	 * List<Integer> list2 = new ArrayList<Integer>(); for (int i = 3; i < 10; i++)
	 * { list2.add(i); } System.out.println("List1：" + list1);
	 * System.out.println("List2：" + list2); System.out.println("交集为" +
	 * getIntersection(list1, list2));
	 * 
	 * }
	 * 
	 * public static List<Integer> getIntersection(List<Integer> list1,
	 * List<Integer> list2) { List<Integer> result = new ArrayList<Integer>(); for
	 * (Integer integer : list1) {//遍历list2 if (Collections.frequency(list2,
	 * integer)<1) { result.add(integer); } // if (list1.contains(integer))
	 * {//如果存在这个数 // result.add(integer);//放进一个list里面，这个list就是交集 // } } return
	 * result; }
	 */
	
	/*
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("b");
		list1.add("c");
		
		list2.add("b");
		list2.add("c");
		list2.add("d");
		String duplicate = findDuplicate(list1, list2);
		System.out.println("duplicate element: " + duplicate);
	}

	private static String findDuplicate(List<String> list1, List<String> list2) {
		List<String> duplicate = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		// 1.去重
		List<String> list3 = new ArrayList<String>(new HashSet<String>(list1));
		List<String> list4 = new ArrayList<String>(new HashSet<String>(list2)); 
		// 2.将list中的元素加入map中并进行统计
		for (String s1 : list3) {
			map.put(s1, 1);
		}
		// 3.将list中的元素加入map中并进行统计
		for (String s2 : list4) {
			map.put(s2, (map.get(s2) == null ? 1 : 2));
		}
		// 4.将重复的元素放入list中
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == 2) {
				duplicate.add(m.getKey());
			}
		}
		return duplicate.toString();
	}
	*/
	public static void main(String[] args) {
		//集合一
		List<String> _first=new ArrayList<String>();
		_first.add("jim");
		_first.add("tom");
		_first.add("jack");
		//集合二
		List<String> _second=new ArrayList<String>();
		_second.add("jack");
		_second.add("happy");
		_second.add("sun");
		_second.add("good");

		_second.retainAll(_first);
		
		Collection exists=new ArrayList<String>(_second);
		Collection notexists=new ArrayList<String>(_second);

		exists.retainAll(_first);
		System.out.println("_second中不存在于_set中的："+exists);
		notexists.retainAll(exists);
		System.out.println("_second中存在于_set中的："+notexists);
	}
	
	
	
}
