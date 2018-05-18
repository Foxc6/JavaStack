import java.util.*;
public class ProjectTest{
 	public static void main(String[] args){
 		Project blankProject = new Project();
 		Project namedProject = new Project("My Named Project");
 		Project nameDescProject = new Project("My Named and Described Project", "This is a project with a name and description.");
 		Project fullProject = new Project("My Full Project", "This is a full project with name, description and cost.", 666.00);

 		// System.out.println(blankProject.getProjectName());
 		// System.out.println(namedProject.getProjectName());
 		// System.out.println(nameDescProject.getProjectName() + ": " + nameDescProject.getProjectDesc());
 		System.out.println(fullProject.getProjectName() + ": " + fullProject.getProjectDesc() + " (Cost: $" + fullProject.getProjectCost() + "0)");
 	}
 }