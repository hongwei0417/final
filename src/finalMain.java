import java.util.Scanner;

public class finalMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("? ");
		String c = kb.nextLine().toLowerCase();
		dotMatrix33 obj = new dotMatrix33(c);
		System.out.println(obj.dotMatrixMain()); //��ܩҦ��ϧ�
		kb.close();
	} // ========//
} /**** end_of_class ****/