package testcase;

import huawei.Demo;

import junit.framework.TestCase;
import huawei.MOUSE_COLOR;
import huawei.Mouse;
import java.util.Arrays;


public class DemoTest extends TestCase {

	public void testCase01() {
		Mouse mouse[]= new Mouse[5];
		mouse[0] =new Mouse(15,MOUSE_COLOR.CL_RED);
		mouse[1] =new Mouse(30,MOUSE_COLOR.CL_BLUE);
		mouse[2] =new Mouse(5,MOUSE_COLOR.CL_BLUE);
		mouse[3] =new Mouse(9,MOUSE_COLOR.CL_YELLOW);
		mouse[4] =new Mouse(30,MOUSE_COLOR.CL_GRAY);
//		mouse[5] =new Mouse(35,MOUSE_COLOR.CL_WHITE);
		
		MOUSE_COLOR[] actual = Demo.sortMouse(mouse);
		
		for(int i=0;i<actual.length;i++){
			System.out.println("=================================" + actual[i]);
		}
		MOUSE_COLOR expected[] = {MOUSE_COLOR.CL_BLUE, MOUSE_COLOR.CL_YELLOW, MOUSE_COLOR.CL_RED, MOUSE_COLOR.CL_BLUE, MOUSE_COLOR.CL_GRAY};
		assertEquals(true,Arrays.equals(expected, actual));
	}
	
	


	
	


}
