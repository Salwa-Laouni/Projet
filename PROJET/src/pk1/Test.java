package pk1;

import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
        TableauDesOiseaux ois = new TableauDesOiseaux();

    
        System.out.println("Oiseaux initiaux :");
        ois.afficher();



        System.out.println("\nLe plus grand oiseau :");
        Oiseau grandOiseau = ois.grandOiseau();
        System.out.println(grandOiseau);
        
        
        
        Oiseau nouvelOiseau = new Oiseau(4, "Rouge");
        ois.ajouter(nouvelOiseau);
        System.out.println("\nOiseaux apres ajout :");
        ois.afficher();

       
        ois.supprimer(nouvelOiseau);
        System.out.println("\nOiseaux apres suppression :");
        ois.afficher();


        
        System.out.println("\nNombre d'oiseaux : " + ois.compter());

        
        
        ListeDesOiseaux listeDesOiseaux = new ListeDesOiseaux();

    
        listeDesOiseaux.remplir();

        System.out.println("Liste des oiseaux :");
        listeDesOiseaux.afficher();

      
        System.out.println("\nParcours de la liste avec un itérateur :");
        listeDesOiseaux.parcourIt();

       
        Oiseau nouvelOiseau2 = new Oiseau(4, "Rouge");
        listeDesOiseaux.ajouterOiseau(nouvelOiseau2);

      
        System.out.println("\nListe des oiseaux apres ajout :");
        listeDesOiseaux.afficher();

     
        System.out.println("\nOiseau à l index 2 :");
        Oiseau oiseauRecupere = listeDesOiseaux.recuperOiseau(2);
        System.out.println(oiseauRecupere);

       
        listeDesOiseaux.supprimerOiseau(nouvelOiseau2);

       
        System.out.println("\nListe des oiseaux apres suppression :");
        listeDesOiseaux.afficher();

      
        System.out.println("\nRecherche d un oiseau dans la liste :");
        Oiseau oiseauARechercher = new Oiseau(2, "Bleu");
        boolean recherche = listeDesOiseaux.rechercheOiseau(oiseauARechercher);
        System.out.println("Est-ce que l oiseau est dans la liste ? " + recherche);

       
 
        ArrayList<Oiseau> copieListe = listeDesOiseaux.copierList();

      
        listeDesOiseaux.melangerList();
        System.out.println("\nListe des oiseaux apres melange :");
        listeDesOiseaux.afficher();

       
        listeDesOiseaux.inverserList();
        System.out.println("\nListe des oiseaux apres inversion :");
        listeDesOiseaux.afficher();

       
        ArrayList<Oiseau> sousListe = listeDesOiseaux.subList(0, 2);
        System.out.println("\nSous-liste des oiseaux :");
        for (Oiseau oiseau : sousListe) {
            System.out.println(oiseau);
        }

        boolean comparaison = listeDesOiseaux.compareList(copieListe);
        System.out.println("\nLes deux listes sont-elles egales ? " + comparaison);

        
        listeDesOiseaux.echangerList(0, 2);
        System.out.println("\nListe des oiseaux apres echange :");
        listeDesOiseaux.afficher();

      
        listeDesOiseaux.viderList();
        System.out.println("\nListe des oiseaux apres vidage :");
        listeDesOiseaux.afficher();

        boolean estVide = listeDesOiseaux.listEstVide();
        System.out.println("\nLa liste est-elle vide ? " + estVide);
        
        
        
    }
}



