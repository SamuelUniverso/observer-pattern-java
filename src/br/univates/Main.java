package br.univates;

/**
 * @author Samuel Oberger Rockenbach
 * @email samuel.rockenbach@universo.univates.br
 */
public class Main {
	
	public static void main(String[] args) {
		
		Store store = new Store();
		store.getNotificationService().subscribe(
				new EmailMsgListener("samuel.rockenbach@unviates.br")
		);
		store.getNotificationService().subscribe(
			new EmailMsgListener("Samuel.rockenbach@unvierso.unviates.br")
		);
	}
}
