package array;

public class A006_MDArray {
	public static void main(String[] args) {
		
		
		
//		int a[][] = new int[5][4];
//		
//		a[0][0] = 50;
//		a[0][1] = 55;
//		a[0][2] = 45;
//		a[0][3] = 50;
//		
//		
//		a[1][0] = 50;
//		a[1][1] = 58;
//		a[1][2] = 47;
//		a[1][3] = 50;
		
		int a[][] = {{20,50,60,40},{10,20,56,45},{41,52,63,52},{40,56,58,96},{52,69,41,52}};
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
