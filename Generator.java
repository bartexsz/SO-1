import java.util.*;
public class Generator {
	
	public int id=0;
	Process next = null;
	static boolean active;
	static int timeNext = 0;
	
	public Generator()
	{
		active = true;
	}
	
	public void generate(){
		
		Random random = new Random();
		next = new Process(id, random.nextInt(30));
		id++;
	}
	public Process getNext(){
		
		generate();
		Random random = new Random();
		timeNext=random.nextInt(30);
		return next;	
	}
	public boolean isReady(){
		
		if(timeNext<=0) return true;
		return false;
	}
	public static boolean isActive(){
		
		return active;
	}
	public static void switchOn(){
		
		active=true;
	}
	public static void switchOff(){
		
		active=false;
	}
	public static void updateTime(){
		
		if(timeNext>0)
			timeNext--;
	}
}
