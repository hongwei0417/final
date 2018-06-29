
public class dTool {
	private static char dot0 = ' ';
	private static char dot1 = '*';

	public static char d0() {
		return dot0;
	} // ========//

	public static char d1() {
		return dot1;
	} // ========//

	public static void setD0D1(String d0d1) {
		dot0 = d0d1.charAt(0);
		dot1 = d0d1.charAt(1);
	} // ========//

	public static int[][] row2ary(String[] row) {
		int SIZE = row.length, ary[][] = new int[SIZE][SIZE];
		for (int r = 0; r < SIZE; r++)
			for (int c = 0; c < SIZE; c++)
				if (row[r].charAt(c) != dot0)
					ary[r][c] = 1;
		return ary;
	} // ========//

	public static String[] ary2row(int[][] ary) {
		int SIZE = ary.length;
		String row[] = new String[SIZE];
		for (int r = 0; r < SIZE; r++) {
			row[r] = "";
			for (int c = 0; c < SIZE; c++)
				if (ary[r][c] == 0)
					row[r] += dot0;
				else
					row[r] += dot1;
		}
		return row;
	} // ========//

	public static String[] str2row(String str) {
		return str.split("\n");
	} // ========//

	public static String row2str(String[] row) {
		int SIZE = row.length;
		String str = "";
		for (int r = 0; r < SIZE; r++)
			str += row[r] + "\n";
		return str;
	} // ========//

	public static int[][] str2ary(String str) {
		return row2ary(str2row(str));
	} // ========//

	public static String ary2str(int[][] ary) {
		return row2str(ary2row(ary));
	} // ========//

} /**** end_of_class ****/