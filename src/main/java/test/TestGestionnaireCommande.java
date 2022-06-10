package test;

import fr.univartois.butinfo.sae.projetventes.model.article.Article;
import fr.univartois.butinfo.sae.projetventes.model.article.Stock;
import fr.univartois.butinfo.sae.projetventes.model.client.Client;
import fr.univartois.butinfo.sae.projetventes.model.client.ClientParticulier;
import fr.univartois.butinfo.sae.projetventes.model.client.Genre;
import fr.univartois.butinfo.sae.projetventes.model.commande.Commande;
import fr.univartois.butinfo.sae.projetventes.model.gestionnaire.GestionnaireCommande;

/**
 * Une classe contenant une méthode main permettant de tester un gestionnaire de commande et donc de tester également la classe Commande.
 * @author Jean-François Condotta
 * @version 17/03/22
 */
public class TestGestionnaireCommande {
	/**
	 * Méthode permettant de tester un gestionnaire de commande et donc de tester également la classe Commande. Cette méthode permet de :
	 *
	 * (1) Créer un stock avec 4 articles.
	 * (2) Créer un client particulier.
	 * (3) Créer une commande pour le client précédemment créé.
	 * (4) Lancer le gestionnaire de commande associé au stock et à la commande créée.
	 *  
	 * @param args Auncun argument.
	 */
	public static void main(String[] args) {
		Stock stock=new Stock("Stock 2022");
		stock.ajouterArticle(new Article("Super Article",15.0,5));
		stock.ajouterArticle(new Article("Article Sympa",10.0,123));
		stock.ajouterArticle(new Article("Article Super Cool",4.0,1));
		stock.ajouterArticle(new Article("Article Génial",4.0,10));
		Client client=new ClientParticulier("Cure","30 rue des Tulipes, 62300 Lens, France",600,"Hector",Genre.Homme);
		Commande commande=new Commande(client);
		GestionnaireCommande gestionnaireCommande=new GestionnaireCommande(commande,stock);
		gestionnaireCommande.afficherGererMenu();
	}

}