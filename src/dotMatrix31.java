public class dotMatrix31 extends dotMatrixBasic implements dotMatrix3Interface {
	public String dotMatrixMain() {
		dTool.setD0D1("%."); //�]�w�ϥ�
		d = new dotLetter3[TTL]; //�x�s�r�Ϊ���
		try 
		{
			for (int k = 0; k < TTL; k++)
				d[k] = drawLetter(inpText.charAt(k), 13 - 2 * k);
		} 
		catch (dotMatrix34Ex e) //�u�n���Oxyza
		{
			return e.getMessage(); //�^�ǿ��~�T��
		}
		
		return toString(); //�^�ǩҦ��ϧΦr��
	} // ========//
} /**** end_of_class ****/