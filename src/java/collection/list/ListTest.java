package java.collection.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListTest
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void listMethods()
	{
		
		List a1 = new ArrayList<String>();
		
		a1.add("List01");
		a1.add("List03");
		a1.add("List04");
		System.out.print("ԭ�����ϣ�\n\t"+a1+"\n");
		
		a1.add(1,"List02");
		System.out.print("ָ���Ǳ�1���룺\n\t"+a1+"\n");
		
		a1.remove(2);
		System.out.print("ָ���Ǳ�2ɾ����\n\t"+a1+"\n");
		
		System.out.print("ָ���Ǳ�2��ѯ��\n\t"+a1.get(2)+"\n");
		
		Iterator i1 = a1.iterator();
		System.out.println("�õ�������ѯȫ��Ԫ�أ�");
		while (i1.hasNext())
		{
			System.out.print(i1.next()+",");
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void iteratorTest()
	{
		List a1 = new ArrayList<String>();
		
		a1.add("List01");
		a1.add("List02");
		a1.add("List04");
		a1.add("List05");
		
		Iterator i1 = a1.iterator();
		while (i1.hasNext())
		{
			Object obj = i1.next();
			if (obj.equals("List02"))
				a1.add("List03");
		}
		
		System.out.print("���ϣ�\n\t"+a1+"\n");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void listIterator()
	{
		
		List a1 = new ArrayList<String>();
		
		a1.add("List01");
		a1.add("List");
		a1.add("List03");
		a1.add("List04");
		
		ListIterator l1 = a1.listIterator();
		while (l1.hasNext())
		{
			Object obj = l1.next();
			if (obj.equals("List"))
			{
				l1.remove();
				l1.add("List02");
			}
		}
		System.out.print("���ϣ�\n\t"+a1+"\n");
	}
	// 
	//�����޸��쳣 java.util.ConcurrentModificationException	
	//				if (obj.equals("List02"))
	//					i1.add("List05");
	// �ڵ���ʱ���������ù�������������е�Ԫ�ء�java.util.ConcurrentModificationException	
	// ֻ�ܶ�Ԫ���жϣ�ȥ����ɾ��
	// ���ܶ�����ӣ��޸�����Ҫ���ӽӿ� ListIterator
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void vectorMethods()
	{
		Vector v1 = new Vector<String>();
		
		v1.add("Vector001");
		v1.add("Vector002");
		v1.add("Vector003");
		v1.add("Vector004");
		v1.add("Vector005");
		
		Enumeration e1 =v1.elements();
		while (e1.hasMoreElements())
		{
			Object object = e1.nextElement();
			System.out.println(object);
		}
	}
	
	public static void testPerBtwnArlAndLkl()
	{
		ArrayList<Integer> arrayList   = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
				
		// ArrayList add
		long startTime	= System.nanoTime();
		long endTime;
		long duration; 
		 
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		 
		// LinkedList add
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);
		 
		// ArrayList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);
		 
		// LinkedList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);
		 
		// ArrayList remove
		startTime = System.nanoTime();
		 
		for (int i = 9999; i >=0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);
		 
		// LinkedList remove
		startTime = System.nanoTime();
		 
		for (int i = 9999; i >=0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
	}
	
	public static void main(String[] args)
	{
		//listMethods();
		//listIterator();
		//vectorMethods();
		testPerBtwnArlAndLkl();
	}
}
