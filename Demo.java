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

	/*根据重量排序后，输出帽子颜色
	 * 举例：	5只小白鼠，重量分别为15 30 5 9 30，帽子颜色依次为CL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY，
	 * 则排序后的输出的帽子颜色序列应该为CL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY。
		如果没有小白鼠，输出null。
	输入参数：小白鼠数组	
		
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
			System.out.println("－－－－－－－－－－" + mC[c]);
			c++;
		}
		/*
		//使用TreeMap实现的，但是TreeMap默认是对key进行去除重复的，同样的key，后面的valu会覆盖前面的value，于是重复的key只能
		//有一个，导致答案不全，需要进一步设计代码
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


