package huawei;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Demo {

	/*根据重量排序后，输出帽子颜色
	 * 举例：	5只小白鼠，重量分别为15 30 5 9 30，帽子颜色依次为CL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY，
	 * 则排序后的输出的帽子颜色序列应该为CL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY。
		如果没有小白鼠，输出null。
	输入参数：小白鼠数组	
	*/
	
	public static MOUSE_COLOR[] sortMouse(Mouse[] mouse )
	{
		if(mouse == null || mouse.length == 0){//如果没有小白鼠，输出null。
			return null;
		}
		
		MOUSE_COLOR[] mC= new MOUSE_COLOR[mouse.length];
		
		int[] weights = new int[mouse.length];
		for(int i=0;i<weights.length;i++){//将小白鼠的重量放在一个单独的数组中
				weights[i] = mouse[i].weight;
		}
		
		Arrays.sort(weights);//对该数组排序
		
		Set<Integer> set = new LinkedHashSet<Integer>();//去除数组中重复数字
		for(int i=0;i<weights.length;i++){
			set.add(weights[i]);
		}
		
		int c = 0;//用来mC数组下标计数
		Iterator<Integer> wSet = set.iterator();
		while(wSet.hasNext()){//外层循环遍历无重复数组(注：假如存在相同重量30，那么wSet只有一个30，小白鼠数组中有若干重量，则仍然是正确顺序)
			int n = wSet.next();
			for(int m=0;m<mouse.length;m++){//wSet中每一个数值，遍历小白鼠数组中所有重量，
				if(n == mouse[m].weight){//若相等，则保存在mC数组中
					mC[c] = mouse[m].color;
					c++;
				}
			}
		}
		return mC;
	}
}


