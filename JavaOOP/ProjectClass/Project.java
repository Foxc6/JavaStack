import java.util.*;
public class Project {
 	private String name;
 	private String description;
 	private Double cost;

 	public Project(String name, String description, Double cost){
 		this.name = name;
 		this.description = description;
 		this.cost = cost;
 	}

 	public Project(String name, String description){
 		this.name = name;
 		this.description = description;
 	}

 	public Project(String name){
 		this.name = name;
 	}
 	public Project(){
 	}

 	// GETTERS AND SETTERS

 	public String getProjectName(){
 		if(name == null){
 			return "Blank Project";
 		}
 		return name;
 	}

 	public void setProjectName(String name){
 		this.name = name;
 	}

 	public String getProjectDesc(){
 		return description;
 	}

 	public void setProjectDesc(String description){
 		this.description = description;
 	}

 	public Double getProjectCost(){
 		return cost;
 	}

 	public void setProjectCost(Double cost){
 		this.cost = cost;
 	}
 }