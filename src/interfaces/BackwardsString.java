package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String x = "";
		char[] temp = s.toCharArray();
		for (int i = temp.length-1; i > -1; i--) {
			x+=temp[i];
		}
		return x;
	}

}
