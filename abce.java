package Test;

import com.windfire.apis.asysConnectData;
import com.windfire.apis.asys.asysUsrElement;

public class abce {


	public asysConnectData con = null;
	
	public abce() {
		
		con = new asysConnectData("192.168.19.53", 2102, "client", "SUPER", "SUPER");
				 
	}
	

	public int create() {
		
		asysUsrElement ays = new asysUsrElement(con);
		
		ays.setInfo("description", "NONE", "IMAGE", "C:\\XvarmSimpleTest.txt");
		ays.m_cClassId="BASIC";
		int ret = ays.create("XVARM_MAIN");
		
	
		if(ret==0) {
			
			System.out.println("성공" + "숫자" +ret + ays.m_elementId);
			
		}else {
			
			System.out.println("실패" + ays.getLastError());
		}
	
		return ret;
	}
	
	
	public static void main(String args[]) {
		
		abce aa = new abce();
		aa.create();
		
	}
	

}
