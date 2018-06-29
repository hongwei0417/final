public class dotMatrix31 extends dotMatrixBasic implements dotMatrix3Interface {
	public String dotMatrixMain() {
		dTool.setD0D1("%."); //設定圖示
		d = new dotLetter3[TTL]; //儲存字形物件
		try 
		{
			for (int k = 0; k < TTL; k++)
				d[k] = drawLetter(inpText.charAt(k), 13 - 2 * k);
		} 
		catch (dotMatrix34Ex e) //只要不是xyza
		{
			return e.getMessage(); //回傳錯誤訊息
		}
		
		return toString(); //回傳所有圖形字串
	} // ========//
} /**** end_of_class ****/