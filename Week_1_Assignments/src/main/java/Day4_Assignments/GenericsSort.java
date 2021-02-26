package Day4_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenericsSort {
	
	
	public class GenericsSortComparator {
		
	
		
		
			
			}



	public static void main(String[] args) {
		ArrayList<Trainers> Trainer = new ArrayList<Trainers>();
		Trainer.add(new Trainers("Muthu","Java","Xyz and Co",120000));
		Trainer.add(new Trainers("Sriram","AndRoid","Mmm and Co",12000));
		Trainer.add(new Trainers("Shiva","Angular","Lkj and Co",150000));
		Trainer.add(new Trainers("Mota","Java","Rty and Co",100000));
		Trainer.add(new Trainers("Sri","Java","Bnm and Co",50000));
		Trainer.add(new Trainers("Piyu","Python","Mkj and Co",680000));

		  System.out.println("Unsorted");
	        for (int i=0; i<Trainer.size(); i++) {
	            System.out.println(Trainer.get(i));
	        }
	        Collections.sort(Trainer, Trainers.NameComparator);
	        
	 
	        System.out.println("\nSorted by Salary");
	        for (int i=0; i<Trainer.size(); i++) {
	            System.out.println(Trainer.get(i));
	        }
	        Collections.sort(Trainer, Trainers.SalaryCamparator);
	 
	        System.out.println("\nSorted by Trainer Name");
	        for (int i=0; i<Trainer.size(); i++) {
	            System.out.println(Trainer.get(i));
	            
	}
	        
	}
	}


