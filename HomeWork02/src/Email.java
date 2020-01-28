import java.io.File;

public class Email implements ShowInfo{
	private String subject;
	private String body;
	private File file;
	
	
	public Email() {
		super();
	}
	public Email(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}
	public Email(String subject, String body, File file) {
		super();
		this.subject = subject;
		this.body = body;
		this.file = file;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("show info email");
	}
	
}
