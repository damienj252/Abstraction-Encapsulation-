package ie.gmit.sw;

public interface Cypherator {

	// public CharSequence - android
	String encrypt(String plainText) throws CypherException;

	byte[] encrypt(byte[] plainText) throws CypherException;

	String decrypt(String cypherText) throws CypherException;

	byte[] decrypt(byte[] cypherText) throws CypherException;

}