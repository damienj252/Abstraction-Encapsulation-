package ie.gmit.sw;

// Really bad idea - doesn't belong here
public interface CypherKey {
	public void setKey(String key) throws CypherException;

	public String getKey();

}