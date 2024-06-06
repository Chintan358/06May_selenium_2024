package impclasses;

public class I003_StringBufferBuilder {
	public static void main(String[] args) {
		
		//sync
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i=1;i<=100000;i++)
		{
			sb.append("Hello");
		}
		
		double endtime = System.currentTimeMillis();
		
		//async
		
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");
		for(int i=1;i<=100000;i++)
		{
			sb1.append("Hello");
		}
		double endtime1 = System.currentTimeMillis();
		
		
		System.out.println("time taken by buffer : "+(endtime-startTime));
		System.out.println("time taken by builder : "+(endtime1-startTime1));
	}
}