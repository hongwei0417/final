public class dotMatrix32 extends dotMatrix31 {
	dotLetter3 drawA(int LEN) {
		int[][] ans = new int[LEN][LEN];
//		for (int c = 0; c <= LEN / 2; c++)
//			ans[LEN - 1 - 2 * c][c] = 1;
//		for (int c = 0; c <= LEN / 2; c++)
//			ans[LEN - 1 - 2 * c][LEN - 1 -c] = 1;
//		for (int c = (LEN - 1) * 1 / 3; c <= LEN * 2 / 3; c++)
//			ans[(LEN - 1) * 2 / 3][c] = 1;
		for (int r = 0; r < LEN; r++)
			ans[LEN - 1 - r][r / 2] = 1;
		for (int r = 0; r < LEN; r++)
			ans[LEN - 1 - r][LEN - 1 - r / 2] = 1;
		for (int c = (LEN - 1) * 1 / 3; c <= LEN * 2 / 3; c++)
			ans[(LEN - 1) * 2 / 3][c] = 1;
		return new dotLetter3(ans);
	} // ========//
} /**** end_of_class ****/