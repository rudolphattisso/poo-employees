package fr.afpa.employees;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain {
	//rajout d'un attribut privé logger pour jeter afficher un exeption
	private static Logger logger = LogManager.getLogger(EmployeeMain.class);
	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");
		
		try {
			// Tinstanciez 4 objets de la classe "Employee" (une fois celle-ci
			// implémentée)
			LocalDate birthDate = LocalDate.parse("1990-02-25");
			Employee employee1 = new Employee("11AAA33", "Shazam", "Samantha", 1800.0, "1994-12-12");
			Employee employee2 = new Employee("jlfj16", "NONO", "Zunon", 15075.60, "1995-02-23");
			Employee employee3 = new Employee("jlfj17", "NONO", "fraqua", 1560.70, "1996-02-24");
			logger.trace(employee1.getFirstName());
			// employee1.setFirstName("robin");
			logger.trace(employee1.getFirstName());
			logger.trace(employee1.toString());
			logger.trace(employee2.netSalary());

			// Tentative de modification avec un matricule correctement formaté

			employee1.setRegistrationNumber("11AAA33");

			logger.trace(employee1.getRegistrationNumber());

			logger.trace(employee1.toString());
			//
			//String stringConverter = Double.toString(employee1.netSalary());

			/*Normalement dans l'objet Employee nous avons des élements en doubles et  d'autres en string;
			 Cependant nous avons  créé dans le fichier employé une méthode toString qui nous permet 
			transformer tous les attributs des l'object employé en string.*/

			//création de la ArrayList(tableau dynamique Employé)
			ArrayList<Employee> employees = new ArrayList<Employee>();
			//ajout des employés dans le tableau
			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			//implémentatation de la  bouche foreach qui permettra d'imprimer un a un les données des employées
			//for( type de l'objet - nom de l'objet - nom du tableau)
			for (Employee emp : employees) {
			logger.trace(emp.toString());// to string pour traduire les données de sortie en string.
			
			}
		} catch (Exception e) {

			logger.error(e.getMessage());
		}

		



	



	}
	

}

