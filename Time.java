public class Time{
	
	public static void main(String[] args){
			int hour = 13;
			int minute = 34;
			int second = 35;
			int minutea = 20;
			int seconda = 27;
			double midnight = ((13*3600)+(20*60)+27);
			int day = 24*60*60;
			double remainingday = day - midnight;
			double percent = midnight / day * 100;
			int passtime = (34*60+35) - (20*60+27);
			System.out.println(midnight);
			System.out.println(remainingday);
			System.out.print(percent);
			System.out.println("%");
			System.out.println(passtime);
			
		}
}

