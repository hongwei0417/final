public class dotMatrix33 extends dotMatrix32 {
	public dotMatrix33(String c) {
		inpText = c;
		TTL = c.length();
	} // ========//

	dotLetter3 drawLetter(char ch, int LEN) throws dotMatrix34Ex {
		addOk('h');
		if (ch == 'h')
			return drawH(LEN);
		try {
			return super.drawLetter(ch, LEN);
		} catch (dotMatrix34Ex e) {
			throw e;
		}
	} // ========//

	dotLetter3 drawH(int LEN) {
		int[][] ans = new int[LEN][LEN];
		for (int r = 0; r < LEN; r++)
			ans[r][0] = ans[r][LEN - 1] = 1;
		for (int c = 0; c < LEN; c++)
			ans[LEN / 2][c] = 1;
		return new dotLetter3(ans);
	} // ========//
} /**** end_of_class ****/