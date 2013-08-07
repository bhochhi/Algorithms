public class Anagram {
	int count=0;
	public void anag(String s1, String s2) {
		System.out.println("call: "+ ++count+"   with   "+s1+"  , "+s2);
		if (s1.length() == 0)
			System.out.println(s2);
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(i);
			anag(s1.substring(0, i) + s1.substring(i + 1, s1.length()), s1.charAt(i) + s2);
		}
	}
	public static void main(String[] args){
		Anagram ana = new Anagram();
		ana.anag("cat", "");
	}
}
/**
1 call: cat, ""
	1 call i = 0, ang(cat,c)
		1 call ang(cat,


**/