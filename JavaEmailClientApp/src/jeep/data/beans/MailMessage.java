package jeep.data.beans;

import java.util.ArrayList;
import java.util.Date;

/**
 * This is a java bean for the database Message table.
 * 
 * @author Natacha Gabbamonte 0932340
 * 
 */
public class MailMessage {

	private int messageId;
	private String senderEmail = null;
	private ArrayList<String> receiverEmail = null;
	private ArrayList<String> bcc = null;
	private ArrayList<String> cc = null;
	private String subject = null;
	private String message = null;
	private Date messageDate = null;
	private int folderId;

	/**
	 * No parameter constructor. Sets message id and folder id to -1. Sets
	 * String to "". Sets Date to null.
	 */
	public MailMessage() {
		super();
		this.messageId = -1;
		this.senderEmail = "";
		this.receiverEmail = new ArrayList<String>();
		this.bcc = new ArrayList<String>();
		this.cc = new ArrayList<String>();
		this.message = "";
		this.messageDate = null;
		this.folderId = -1;
	}

	/**
	 * Constructor with parmeters.
	 * 
	 * @param messageId
	 * @param senderEmail
	 * @param receiverEmail
	 * @param bcc
	 * @param cc
	 * @param message
	 * @param messageDate
	 * @param folderId
	 */
	public MailMessage(int messageId, String senderEmail, ArrayList<String> receiverEmail,
			ArrayList<String> bcc, ArrayList<String> cc, String subject, String message,
			Date messageDate, int folderId) {
		super();
		this.messageId = messageId;
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
		this.bcc = bcc;
		this.cc = cc;
		this.subject = subject;
		this.message = message;
		this.messageDate = messageDate;
		this.folderId = folderId;
	}

	/**
	 * Returns the message id.
	 * 
	 * @return The message id.
	 */
	public int getMessageId() {
		return messageId;
	}

	/**
	 * Sets the message id.
	 * 
	 * @param messageId
	 *            The new message id.
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	/**
	 * Returns the sender's email.
	 * 
	 * @return The sender's email.
	 */
	public String getSenderEmail() {
		return senderEmail;
	}

	/**
	 * Sets the sender's email.
	 * 
	 * @param senderEmail
	 *            The new sender email.
	 */
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	/**
	 * Returns the receiver email list.
	 * 
	 * @return The receiver email list.
	 */
	public ArrayList<String> getReceiverEmail() {
		return receiverEmail;
	}

	/**
	 * Sets the receiver email list.
	 * 
	 * @param receiverEmail
	 *            The new receiver email list.
	 */
	public void setReceiverEmail(ArrayList<String> receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	/**
	 * Returns the BCC list.
	 * 
	 * @return The BCC list.
	 */
	public ArrayList<String> getBcc() {
		return bcc;
	}

	/**
	 * Sets the BCC list.
	 * 
	 * @param bcc
	 *            The new BCC list.
	 */
	public void setBcc(ArrayList<String> bcc) {
		this.bcc = bcc;
	}

	/**
	 * Returns the CC list.
	 * 
	 * @return The CC list.
	 */
	public ArrayList<String> getCc() {
		return cc;
	}

	/**
	 * Sets the CC list.
	 * 
	 * @param cc
	 *            The new CC list.
	 */
	public void setCc(ArrayList<String> cc) {
		this.cc = cc;
	}

	/**
	 * Returns the subject line of the message.
	 * 
	 * @return The subject.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject line of the message.
	 * 
	 * @param subject
	 *            The subject.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Returns the message (content of the mail).
	 * 
	 * @return The content of the mail.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message (content of the mail).
	 * 
	 * @return The new content of the mail.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Returns the message date.
	 * 
	 * @return The date.
	 */
	public Date getMessageDate() {
		return messageDate;
	}

	/**
	 * Sets the message date.
	 * 
	 * @param messageDate
	 *            The new message date.
	 */
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	/**
	 * Returns the folder id (where the message is located).
	 * 
	 * @return The folder id.
	 */
	public int getFolderId() {
		return folderId;
	}

	/**
	 * Sets the folder id (where the message is located).
	 * 
	 * @param folderId
	 *            The new folder id.
	 */
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}

	/**
	 * Returns a string representation of this object.
	 */
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", senderEmail="
				+ senderEmail + ", receiverEmail=" + receiverEmail + ", bcc="
				+ bcc + ", cc=" + cc + ", subject=" + subject + ", message="
				+ message + ", messageDate=" + messageDate + ", folderId="
				+ folderId + "]";
	}

}
