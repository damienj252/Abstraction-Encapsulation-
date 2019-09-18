package ie.gmit.sw;

public class CypherRunner {
	//Meant to catch it
	public static void main(String[] args) throws CypherException {
		Cypherator cc = new CaesarCypher(7);
		//cc.setKey(7);

		String message = "Attack the castle wall after drinks";
		String enc = cc.encrypt(message);

		System.out.println(enc);
		System.out.println(cc.decrypt(enc));
	}//main

}//CypherRunner
