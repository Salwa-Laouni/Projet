package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;




public class ListeDesOiseaux {
	
	List<Oiseau> liste = new ArrayList<Oiseau>();
	
	 public void remplir() {
			liste.add(new Oiseau(1,"Vert"));
			liste.add(new Oiseau(2,"Bleu"));
			liste.add(new Oiseau(3,"Jaune"));
		}
	 public void afficher() {
			for(Oiseau ois:liste)
				System.out.println(ois);
		}
	 
	 public void parcourIt() {
			Iterator<Oiseau> it =liste.iterator();
		    while (it.hasNext()) {
		        System.out.println(it.next());
		      }
		}
	
	 
	 
	 public void ajouterOiseau(Oiseau ois) {
			liste.add(0,ois);
		}
		public Oiseau recuperOiseau(int index) {
			if(index>=0 && index <liste.size())
				return liste.get(index);
			 throw new IllegalArgumentException("l indice  doit etre compris entre 0 et la taille");
		}
	 
	 
	 
	 public boolean supprimerOiseau(Oiseau ois) {
			return liste.remove(ois);
		}
	 
	 
	 public boolean rechercheOiseau(Oiseau ois) {
			return liste.contains(ois);
		}
	 
	 public void trierEmployes(Comparator<Oiseau> cmp) { 
			Collections.sort(liste,cmp);
		}
	 
	 public ArrayList<Oiseau> copierList() {
			ArrayList<Oiseau> newlist = new ArrayList<Oiseau>();
			newlist.addAll(liste);
			return newlist; 
	 
	 }
	 public void melangerList() {
			Collections.shuffle(liste);
		}
	 public void inverserList() {
			Collections.reverse(liste);
		}	
	 public ArrayList<Oiseau> subList(int start, int end){
			if(start >=0 && end<liste.size() && start<end) {
				return new ArrayList<Oiseau>(liste.subList(start, end));
			}
			throw new IllegalArgumentException("un probleme dans start ou end");
		}
	 
	 public boolean compareList(ArrayList<Oiseau> list) {
			return liste.equals(list); 
		}
		public void echangerList(int p1,int p2) {
			Collections.swap(liste, p1, p2);
		}
		public void viderList() {
			liste.clear();
		}
		public boolean listEstVide() {
			return liste.isEmpty();
		}
	 }