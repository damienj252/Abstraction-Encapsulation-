package ie.gmit.sw;

public class CaesarCypher implements CypherKey, Cypherator {

	private CypherKey key;// bad

	public CaesarCypher(CypherKey key) {
		super();
		this.key = new CypherKeyImpl(key);
	}

	public void setKey(String k) throws CypherException {
		this.key.setKey(k);
		//key.setKey(k);
	}

	public String getKey() {
		return key.getKey();
	}

	/*
	 * Not to do public int getKey() { return key; }
	 * If you refactor it will break stuff
	 * public void setKey(int key) { this.key = key; }
	 */

	// public CharSequence - android
	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws CypherException {
		for (int i = 0; i < plainText.length; i++) {
			plainText[i] = (byte) (plainText[i] + Integer.parseInt(getKey()));
		}
		return plainText;
	}

	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws CypherException {

		for (int i = 0; i < cypherText.length; i++) {
			cypherText[i] = (byte) (cypherText[i] - getKey());
		}
		return cypherText;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public class CypherKeyImpl implements CypherKey {
		private int key;
		
		

		public CypherKeyImpl(int key) {
			super();
			this.key = key;
		}

		@Override
		public void setKey(String key) throws CypherException {
			this.key = Integer.parseInt(key);

			// Refer to container
			// CaesarCypher.this.key

		}

		@Override
		public String getKey() {

			return new String(key + "");
		}

	}

}// CaesarCypher
