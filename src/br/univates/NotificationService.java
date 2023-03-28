package br.univates;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oberger Rockenbach
 * @email samuel.rockenbach@universo.univates.br
 */
public class NotificationService {
	
	private final List<EmailMsgListener> customers;

	public NotificationService() {
		customers = new ArrayList<EmailMsgListener>();
	}
	
	/**
	 * Realizar subscricao
	 * @param listener
	 */
	public void subscribe(EmailMsgListener listener) {
		customers.add(listener);
	}
	
	/**
	 * Remover subscricao
	 * @param listener
	 */
	public void unsubscribe(EmailMsgListener listener) {
		customers.remove(listener);
	}
	
	/**
	 * Enviar e-mail para os subscritos
	 * @method notifyObserver
	 */
	public void notifyObserver() {
		customers.forEach(listener -> listener.sendMail());
	}
}
