public class dotMatrix34Ex extends Exception {
	String iText, okText;

	public dotMatrix34Ex(String inp) {
		super("bad input [" + inp + "]");
		iText = inp;
		okText = dotMatrixBasic.getOk();
	} // ========//

	public String getMessage() {
		return showBadChars();
	} // ========//

	private String showBadChars() {
		String ans = "\n";
		ans += okText + " <== allowed\n";
		ans += iText + " <== input\n";
		String bad = "";
		for (int k = 0; k < iText.length(); k++) {
			char c = iText.charAt(k);
			if (okText.indexOf(c) < 0) {
				ans += "^";
				bad += c;
			} else
				ans += " ";
		}
		if (bad.length() > 0)
			ans += " <== bad [" + bad + "]";
		else
			ans += " good !!!";
		return ans;
	} // ========//

} /**** end_of_class ****/