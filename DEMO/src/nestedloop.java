
public class nestedloop {

	public static void main(String[] args) {
		int weeks = 2;
		int days = 6;
		for(int i = 1; i<=weeks; ++i) {
			System.out.println("week:"+ i);
			for(int j = 1; j<=days; ++j) {
				System.out.println("day:"+ j);
			}
		}

	}

}
