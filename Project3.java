import java.util.StringTokenizer;

public class Project3 {

	public static StringTokenizer token;
	
	public static void main(String [] args){
		
		//Initialize 3 separate Linked Lists
		BaseballPlayerList Unsorted = new BaseballPlayerList();
		BaseballPlayerList Fielders = new BaseballPlayerList();
		BaseballPlayerList Pitchers = new BaseballPlayerList();
		
		//Call 3 separate methods to fill each list with data from the file
		fillUnsortedList(Unsorted,"project3data.txt");
		fillFieldList(Fielders,"project3data.txt");
		fillPitchList(Pitchers,"project3data.txt");

		//Initialize JFrame via the GUI class and fill it with each list
		GUI GUIframe = new GUI();
		GUIframe.textArea.append(Unsorted + "\n");
		GUIframe.textArea2.append(Fielders + "\n");
		GUIframe.textArea3.append(Pitchers + "\n");
	}
	
	//Method to fill list with all the unsorted baseball player data from the file
	public static void fillUnsortedList(BaseballPlayerList Unsorted,String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();
		token = new StringTokenizer(line);
		while (line!=null){
			if(line.charAt(0) == 'F'){
				StringTokenizer utoken = new StringTokenizer(line,",");
				while(utoken.hasMoreTokens()){
					Unsorted.append(new BaseballPlayer((utoken.nextToken()),Integer.parseInt(utoken.nextToken()),utoken.nextToken(),utoken.nextToken(),Float.parseFloat(utoken.nextToken())));
				}	
			}
			else if(line.charAt(0) == 'P'){
				StringTokenizer utoken = new StringTokenizer(line,",");
				while(utoken.hasMoreTokens()){
					Unsorted.append(new BaseballPlayer((utoken.nextToken()),Integer.parseInt(utoken.nextToken()),utoken.nextToken(),utoken.nextToken(),Float.parseFloat(utoken.nextToken()),Float.parseFloat(utoken.nextToken())));
				}
			}
			line = in.readLine();
		}
	}
	
	//Method to fill list with only the fielders from the file
	public static void fillFieldList(BaseballPlayerList Fielders,String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();
		token = new StringTokenizer(line);
		while (line!=null){
			if(line.charAt(0) == 'F'){
				StringTokenizer ftoken = new StringTokenizer(line,",");
				while(ftoken.hasMoreTokens()){
					Fielders.insert(new BaseballPlayer((ftoken.nextToken()),Integer.parseInt(ftoken.nextToken()),ftoken.nextToken(),ftoken.nextToken(),Float.parseFloat(ftoken.nextToken())));
				}
			}
			line = in.readLine();
		}
	}
	
	//Method to fill list with only the pitchers from the file
	public static void fillPitchList(BaseballPlayerList Pitchers,String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();
		token = new StringTokenizer(line);
		while (line!=null){
			if(line.charAt(0) == 'P'){
				StringTokenizer ptoken = new StringTokenizer(line,",");
				while(ptoken.hasMoreTokens()){
					Pitchers.insert(new BaseballPlayer((ptoken.nextToken()),Integer.parseInt(ptoken.nextToken()),ptoken.nextToken(),ptoken.nextToken(),Float.parseFloat(ptoken.nextToken()),Float.parseFloat(ptoken.nextToken())));
				}
			}
			line = in.readLine();
		}
	}

		
}