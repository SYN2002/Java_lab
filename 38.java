class A38{
	public static void main(String args[]){
		String s = "          Rishabh         ";
		int ans = 0, p =0;
		System.out.println("Length of string = : "+ s.length());
		for(int i=0;i<s.length();i++){
			char q = s.charAt(i);
			char a = ' ';
			if(q == a){
				p++;
			}
			else{
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--){
			char q = s.charAt(i);
			char a = ' ';
			if(q == a){
				p++;
			}
			else{
				break;
			}
		}
		ans = s.length();
		System.out.println("Length of string without wight spaces= : "+ (ans-p));
	}
}
			