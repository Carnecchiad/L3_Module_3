package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String x = "";
		char[] temp = s.toCharArray();
		for (int i = 0; i < temp.length; i++) {
		if(i == 0) {
			x+=temp[i];
		}
			else if(i%2!=0) {
				x+=Character.toUpperCase(temp[i]);
			}
			else {
				x+=temp[i];
			}
		}
		return x;
		
	}

}
