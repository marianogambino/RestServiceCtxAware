package ar.fwkService.contextAware.response;

/**
 * @author mariano
 *
 */
public class ContextAwareResponse {

	private final Long id;
	private final String content;
	
	/**
	 * 
	 * @param id
	 * @param content
	 */
	public ContextAwareResponse( Long id, String content){
		this.id = id;
		this.content = content;
	}
	
	/**
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "ContextAwareResponse [id=" + id + ", content=" + content + "]";
	}

}
