public class MyThreads extends Thread {
	boolean control=true;
	int waitTime=0;
	Main m;
	int whichOne;
	public MyThreads(int nmbr ,int whichOne,Main m) {
		waitTime=nmbr;
		this.m=m;
		this.whichOne=whichOne;
	}
	public void run() {
		try {while(m.control) {			
			sleep(waitTime);
			if(whichOne==0) {
				if(m.mavi_x!=m.cisim_x) {
					if(m.mavi_x>m.cisim_x)m.mavi_x-=10;
					else m.mavi_x+=10;
				}
				else {
					if(m.mavi_y>m.cisim_y)m.mavi_y-=10;
					else m.mavi_y+=10;
				}
			}
			else if(whichOne==1) {
				if(m.yesil_y!=m.cisim_y) {
					if(m.yesil_y>m.cisim_y)m.yesil_y-=10;
					else m.yesil_y+=10;
				}
				else {
					if(m.yesil_x>m.cisim_x)m.yesil_x-=10;
					else m.yesil_x+=10;
				}
			}
			else if(whichOne==2) {
				if(m.kirmizi_y!=m.cisim_y) {
					if(m.kirmizi_y>m.cisim_y)m.kirmizi_y-=10;
					else m.kirmizi_y+=10;
				}
				else {
					if(m.kirmizi_x>m.cisim_x)m.kirmizi_x-=10;
					else m.kirmizi_x+=10;
				}
			}
			else {
				if(m.turuncu_x!=m.cisim_x) {
					if(m.turuncu_x>m.cisim_x)m.turuncu_x-=10;
					else m.turuncu_x+=10;
				}
				else {
					if(m.turuncu_y>m.cisim_y)m.turuncu_y-=10;
					else m.turuncu_y+=10;
				}				
			}m.repaint();			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}