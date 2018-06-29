
public class dotLetter3 {
	private int LEN = 7;
	private int[][] ary;
	private String[] row;
	public static int currentRow = 0; //�r���ثe�C�L���

	public int length() {
		return LEN;
	} // ========//

	public dotLetter3(String s) {
		row = dTool.str2row(s);
		ary = dTool.str2ary(s);
		LEN = row.length;
	} // ========//

	public dotLetter3(int[][] a) {
		ary = a;
		row = dTool.ary2row(a);
		LEN = row.length;
	} // ========//

	public dotLetter3(String[] r) {
		row = r;
		ary = dTool.row2ary(r);
		LEN = row.length;
	} // ========//

	public int ary(int r, int c) {
		return ary[r][c];
	} // ========//
	
	public String row(int r) {
		return row[r];
	} // ========//
	
	public String str() {
		return toString(0, 0);
	} // ========//
	
	public String toString() { //��X�����ϧ�
		String ans = "";
		char dot0 = dTool.d0();
		char dot1 = dTool.d1();
		ans += dot0;
		for (int c = 0; c < this.LEN; c++) {
			if (currentRow >= this.LEN)
				ans += dot0;
			else if (this.ary[currentRow][c] == 0)
				ans += dot0;
			else
				ans += dot1;
		} // c-loop
		ans += dot0;
		return ans;
	}
	
//	public String toString() { //��X�ת��ϧ�
//		return toString(0, LEN - 1);
//	} // ========//

	public String toString(int leadFrom, int leadTo) { //�ת��ϧ�
		String ans = "";
		for (int r = 0; r < LEN; r++) {
			String spc = "";
			int lead = leadFrom, offset = leadTo - leadFrom;
			if (offset != 0)
				lead += r * offset / (LEN - 1);
			for (int i = 0; i < lead; i++)
				spc += dTool.d0();
			ans += spc + row[r] + "\n";
		}
		return ans;
	} // ========//
} /**** end_of_class ****/