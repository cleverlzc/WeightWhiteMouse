package huawei;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Demo {

	/*����������������ñ����ɫ
	 * ������	5ֻС���������ֱ�Ϊ15 30 5 9 30��ñ����ɫ����ΪCL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY��
	 * �������������ñ����ɫ����Ӧ��ΪCL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY��
		���û��С�������null��
	���������С��������	
	*/
	
	public static MOUSE_COLOR[] sortMouse(Mouse[] mouse )
	{
		if(mouse == null || mouse.length == 0){//���û��С�������null��
			return null;
		}
		
		MOUSE_COLOR[] mC= new MOUSE_COLOR[mouse.length];
		
		int[] weights = new int[mouse.length];
		for(int i=0;i<weights.length;i++){//��С�������������һ��������������
				weights[i] = mouse[i].weight;
		}
		
		Arrays.sort(weights);//�Ը���������
		
		Set<Integer> set = new LinkedHashSet<Integer>();//ȥ���������ظ�����
		for(int i=0;i<weights.length;i++){
			set.add(weights[i]);
		}
		
		int c = 0;//����mC�����±����
		Iterator<Integer> wSet = set.iterator();
		while(wSet.hasNext()){//���ѭ���������ظ�����(ע�����������ͬ����30����ôwSetֻ��һ��30��С��������������������������Ȼ����ȷ˳��)
			int n = wSet.next();
			for(int m=0;m<mouse.length;m++){//wSet��ÿһ����ֵ������С��������������������
				if(n == mouse[m].weight){//����ȣ��򱣴���mC������
					mC[c] = mouse[m].color;
					c++;
				}
			}
		}
		return mC;
	}
}


