package ro.unitbv.linux.entity;

public class Mail {

	private String tomail;
	private String subject;
	private String body;
	
	public Mail() {
		super();
	}
	
	public Mail(String tomail, String subject, String body) {
		super();
		this.tomail = tomail;
		this.subject = subject;
		this.body = body;
	}
	
	public String getTomail() {
		return tomail;
	}
	
	public void setTomail(String tomail) {
		this.tomail = tomail;
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
	
	@Override
	public String toString() {
		return "MailDetail [tomail=" + tomail + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
}
