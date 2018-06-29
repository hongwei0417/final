public class dotMatrixBasic {
	static String okText = "xyzA".toLowerCase();
	String inpText = "";
	int TTL = 0;
	dotLetter3[] d;

	dotLetter3 drawLetter(char ch, int LEN) throws dotMatrix34Ex {
		if (ch == 'x')
			return drawX(LEN);
		else if (ch == 'y')
			return drawY(LEN);
		else if (ch == 'z')
			return drawZ(LEN);
		else if (ch == 'a')
			return drawA(LEN);
		throw new dotMatrix34Ex(inpText);
	} // ========//

	public void addOk(char newChars) {
		if (okText.indexOf(newChars) < 0)
			okText = (okText + newChars).toLowerCase();
	} // ========//

	public static String getOk() {
		return okText.toLowerCase();
	} // ========//

	dotLetter3 drawA(int LEN) {
		int[][] ans = new int[LEN][LEN];
		return new dotLetter3(ans);
	} // ========//

	private dotLetter3 drawX(int LEN) {
		int[][] ans = new int[LEN][LEN];
		for (int r = 0; r < LEN; r++)
			ans[r][r] = 1;
		for (int r = 0; r < LEN; r++)
			ans[r][LEN - 1 - r] = 1;
		return new dotLetter3(ans);
	} // ========//

	private dotLetter3 drawY(int LEN) {
		String ans = "";
		for (int r = 0; r < LEN; r++) {
			for (int c = 0; c < LEN; c++)
				if (r == c && r < LEN / 2)
					ans += dTool.d1();
				else if (r + c == LEN - 1 && r < LEN / 2)
					ans += dTool.d1();
				else if (r >= LEN / 2 && c == LEN / 2)
					ans += dTool.d1();
				else
					ans += dTool.d0();
			ans += "\n";
		}
		return new dotLetter3(ans);
	} // ========//

	private dotLetter3 drawZ(int LEN) {
		String[] ans = new String[LEN];
		for (int r = 0; r < LEN; r++) {
			ans[r] = "";
			for (int c = 0; c < LEN; c++)
				if (r == 0)
					ans[r] += dTool.d1();
				else if (r + c == LEN - 1)
					ans[r] += dTool.d1();
				else if (r == LEN - 1)
					ans[r] += dTool.d1();
				else
					ans[r] += dTool.d0();
		}
		return new dotLetter3(ans);
	} // ========//

	String out(String[] dk) {
		TTL = d.length;
		d = new dotLetter3[TTL];
		for (int k = 0; k < TTL; k++)
			d[k] = new dotLetter3(dk[k]);
		return toString();
	} // ========//

	String out(int[][][] newD) {
		TTL = newD.length;
		d = new dotLetter3[TTL];
		for (int k = 0; k < TTL; k++)
			d[k] = new dotLetter3(newD[k]);
		return toString();
	} // ========//

	String out(dotLetter3[] newD) {
		TTL = newD.length;
		d = newD;
		return toString();
	} // ========//

	public String toString() { //輸出橫的圖形
		String ans = "";
		int maxRow = 0;
		for (int k = 0; k < TTL; k++) //取得輸出最大行數
			maxRow = maxRow < d[k].length() ? d[k].length() : maxRow;		
		//開始畫圖
		for (int r = 0; r < maxRow; r++) { 
			dotLetter3.currentRow = r; //設定目前列印行數
			for (int k = 0; k < TTL; k++) {
				ans += d[k].toString(); //印出每個字形
			} // k-loop
			ans += "\n";
		} // r-loop]
		return ans;
	} // ========//

//	public String toString() { //輸出斜得圖形
//		String ans = "";
//		for (int k = 0, lead = 24; k < TTL; lead += 4 - d[k].length(), k++)
//			ans += "" + d[k].toString(lead + d[k].length() - 1, lead);
//		return ans;
//	} // ========//
} /**** end_of_class ****/