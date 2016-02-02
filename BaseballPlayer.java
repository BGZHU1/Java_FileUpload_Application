
public class BaseballPlayer {

//Initialize the player number, last name, first name, and average into separate variables
	
	protected String Title;
	protected int number;
	protected String lastName;
	protected String firstName;
	protected float average;
	protected float ERA;
	
//Constructor with the 4 parameters

	public BaseballPlayer(String title, int num, String lN, String fN, float avg){

//Check if average and player number are legal
		
		if(avg>1 || avg<0)
			throw new IllegalArgumentException("Average must be between 1 and 0");
		if(num<0 || num>100)
			throw new IllegalArgumentException("Number must be between 0 and 100");
		
		Title = title;
		number = num;
		lastName = lN;
		firstName = fN;
		average = avg;
		
		Title = "";
	}
	
//Constructor with the 5 parameters
	
	public BaseballPlayer(String title, int num, String lN, String fN, float avg, float era){

//Check if average and player number are legal
				
		if(avg>1 || avg<0)
			throw new IllegalArgumentException("Average must be between 1 and 0");
		if(num<0 || num>100)
			throw new IllegalArgumentException("Number must be between 0 and 100");
				
		Title = title;
		number = num;
		lastName = lN;
		firstName = fN;
		average = avg;
		ERA = era;
		
		Title = "";
	}


//Get methods for each parameter

	public int getNumber(){
		return number;
	}
	
	public float getAverage(){
		return average;
	}
	
	public float getERA(){
		return average;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}

//Methods to easily convert floats and integers to strings 
	
	public String EtoString(){
		return(Float.toString(ERA));
	}
	
	public String FtoString(){
		return(Float.toString(average));
	}
	
	public String ItoString(){
		return(Integer.toString(number));
	}

//Method to get each parameter ready to be printed as a string
	
	public String getAllF(){
		return ItoString() + "," + getLastName() + "." + getFirstName() + "," + FtoString();
	}
	
	public String getAllP(){
		return ItoString() + "," + getLastName() + "." + getFirstName() + "," + FtoString() + "," + EtoString();
	}
	
//Method to convert from hex address to String	
	
	public String toString() {
		//ERA must be legal to distinguish between Pitchers and Fielders
		if(ERA > 0.0f)
	      return getTitle() +  ItoString() + "," + getLastName() + "," + getFirstName() + "," + FtoString() + "," + EtoString() + "\n";
		else
			return getTitle() +  ItoString() + "," + getLastName() + "," + getFirstName() + "," + FtoString() + "\n";
	   }
	
	 public int compareTo(BaseballPlayer bp) {
	     return (ItoString()).compareTo(bp.ItoString());
	  }
	 
	   public int sort(BaseballPlayer a, BaseballPlayer b){  
		   String s1 = new String();
		   String s2 = new String();
		   s1 = a.ItoString();
		   s2 = b.ItoString();
		   if(s1.compareTo(s2) < 0)
			   return -1;
		   else if (s1.compareTo(s2) > 0)
				return 1;
			else return 0;
	   }
	
}
