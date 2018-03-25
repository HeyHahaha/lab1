import java.util.Arrays;
import java.util.Scanner;

public class triangle {
	public int result = 0;
	public void angle(double a, double b, double c) {
		double edge[] = new double[3];
		int square[] = new int[3];
		edge[0] = a;
		edge[1] = b;
		edge[2] = c;
		Arrays.sort(edge);
		if(edge[0] >= 0 & edge[1] >= 0 & edge[2] >= 0) {
			if(edge[0] + edge[1] > edge[2]) {
				for(int i = 0; i < 3; i ++) {
					square[i] = (int)(edge[i] * edge[i]);
				}
				if(square[0] == square[1] && square[0] == square[2]) {
					result = 1;
				}else if((square[0] == square[1] && square[0] != square[2])||(square[0] == square[1] && square[0] != square[1])||(square[1] == square[2] && square[0] != square[1])) {
					result = 2;
				}else {
					result = 3;
				}
			}else {
				result =  -111;
			}
		}else {
			result = -10000;
		}
	}
	
	public int getResult() {
		return result;
	}
}
