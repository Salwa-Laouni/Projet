package pk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TableauDesOiseaux{

	private Oiseau[] Oiseaux = new Oiseau[3];
		
	public TableauDesOiseaux() {
		
		Oiseaux[0]=new Oiseau(1,"Vert");
		Oiseaux[1]=new Oiseau(2,"Bleu");
		Oiseaux[2]=new Oiseau(3,"Jaune");
	}
	
	public void trier(Comparator<Oiseau> comparator) {
		Arrays.sort(Oiseaux,comparator);
	} 
	
	public void ajouter(Oiseau ois)
	{
	Oiseaux = Arrays.copyOf(Oiseaux, Oiseaux.length+1);
	Oiseaux[Oiseaux.length-1]=ois;
	}
	
	public boolean supprimer(Oiseau ois) {
		ArrayList<Oiseau> liste=new ArrayList<Oiseau>(Arrays.asList(Oiseaux));
		liste.remove(ois);
		Oiseaux=liste.toArray(new Oiseau[liste.size()]);
		return true;
	}
	
	public int compter()
	{
	return Oiseaux.length;
			
	}
	public void inverser()
	{
		ArrayList<Oiseau>liste=new ArrayList<Oiseau>(Arrays.asList());
		Collections.reverse(liste);
		Oiseaux=liste.toArray(new Oiseau[liste.size()]);
		
	}
	public void afficher()
	{
		for(Oiseau ois:Oiseaux)
		{
			System.out.println(ois);
		}
	}
	public Oiseau grandOiseau() {
		Oiseau grandOiseau = Oiseaux[0];
		for(int i =0;i<Oiseaux.length ;i++)
	
	    {  
			if(i!=0)
			{
			  if(Oiseaux[i].compareTo(Oiseaux[i-1])> 0)
			  { 
				  grandOiseau = Oiseaux[i];
			  }
				  
			}
	    }
		return grandOiseau;
	}
	
	public boolean tester(Oiseau[] Oiseaux_2){
		boolean verification_oiseau = false;
		if(Arrays.equals(Oiseaux,Oiseaux_2))
		{
			verification_oiseau = true;
		}
		
				return verification_oiseau;	
	}
	
   
}
