package br.univates;

/**
 * @author Samuel Oberger Rockenbach
 * @email samuel.rockenbach@universo.univates.br
 */
public class Store {
	
	private final NotificationService notificationService;
	
	public Store() {
		notificationService = new NotificationService();
	}
	
	/**
	 * Nova promocao ira notificar inscritos
	 */
	public void newItemPromotion() {
		notificationService.notifyObserver();
	}
	
	public NotificationService getNotificationService() {
		return notificationService;
	}
}
