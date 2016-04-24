package huawei;

import huawei.Mouse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class Demo {

	/*����������������ñ����ɫ
	 * ������	5ֻС���������ֱ�Ϊ15 30 5 9 30��ñ����ɫ����ΪCL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY��
	 * �������������ñ����ɫ����Ӧ��ΪCL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY��
		���û��С�������null��
	���������С��������	
		
	*/
	
	public static MOUSE_COLOR[] sortMouse(Mouse[] mouse )
	{
		if(mouse.length == 0 || mouse == null){
			return null;
		}
		
		MOUSE_COLOR[] mC= new MOUSE_COLOR[mouse.length]; 
		
		List<Mouse> list = new ArrayList<Mouse>();
		for(int i=0;i<mouse.length;i++){
			list.add(mouse[i]);
		}
		
		Collections.sort(list,new Comparator<Mouse>(){
			public int compare(Mouse a,Mouse b){
				if(a.weight - b.weight > 0){
					return 1;
				}else{
					return -1;
				}
			}
		});
		
		int c = 0;
		Iterator<Mouse> it = list.iterator();
		while(it.hasNext()){
			mC[c] = it.next().color;
			System.out.println("��������������������" + mC[c]);
			c++;
		}
		/*
		//ʹ��TreeMapʵ�ֵģ�����TreeMapĬ���Ƕ�key����ȥ���ظ��ģ�ͬ����key�������valu�Ḳ��ǰ���value�������ظ���keyֻ��
		//��һ�������´𰸲�ȫ����Ҫ��һ����ƴ���
		MOUSE_COLOR[] mC= new MOUSE_COLOR[mouse.length]; 
		Map<Integer,MOUSE_COLOR> map = new TreeMap<Integer,MOUSE_COLOR>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2); 
			}
		});
		
		for(int i=0;i<mouse.length;i++){
			map.put(mouse[i].weight, mouse[i].color); 
		}
		System.out.println("---map1----" + map); 
		
		int i = 0;
		Set<Entry<Integer,MOUSE_COLOR>> set = map.entrySet();
		for (Entry<Integer, MOUSE_COLOR> s: set) {
			mC[i] = s.getValue();
		    System.out.println("mC-----" + mC[i]);
			i++;
		}
		*/
		return mC;
	}
}


