
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static double computeRadio(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        //总共面积
		int area = (x2 - x1) * (y2 -y1) + (x4 - x3) * (y4 - y3);
        int width = Math.max(Math.min(x2, x4) - Math.max(x1, x3), 0);
        int height = Math.max(Math.min(y2, y4) - Math.max(y1, y3), 0);
        //交面积
        double repeatArea=width * height;
        //比值=交/并=交/（总-交）
        return repeatArea/(area-repeatArea);
    }
	/*
	 *    (x1,y1),(x2,y2)
	 * 	  (x3,y3),(x4,y4)
	 * 	   
	 * */
	public static void main(String[] args) {
		System.out.println("按格式输入：");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		int x3=scanner.nextInt();
		int y3=scanner.nextInt();
		int x4=scanner.nextInt();
		int y4=scanner.nextInt();
		System.out.println(computeRadio(x1,y1,x2,y2,x3,y3,x4,y4));
	}


}