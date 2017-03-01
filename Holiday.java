/* Holiday.java
@author Yo
01/03/17
*/

public class Holiday{

	//vars
	private int cost;
	private int people;
	private String season;

	//constructor
	public Holiday(){
	cost=0;
	people=0;
	season="";
	}

	//setters
	public void setSeason(String season){
		this.season=season;
	}
	public void setPeople(int people){
		this.people=people;
	}

	//compute
	public void compute(){
		if(season.equalsIgnoreCase("Winter")){
			//the syntax ignores spaces and case
			if(people>0 && people<5){
				cost=300;
			}
			else if(people>=5){
				cost=200;
			}
		}
		if(season.equalsIgnoreCase("Summer")){
			if(people>0 && people<5){
				cost=500;
			}
			else if(people>=5){
				cost=400;
			}
		}
		if(season.equalsIgnoreCase("Spring")){
			if(people>0 && people<5){
				cost=400;
			}
			else if(people>=5){
				cost=300;
			}
		}
		if(season.equalsIgnoreCase("Autumn")){
			if(people>0 && people<5){
				cost=500;
			}
			else if(people>=5){
				cost=400;
			}
		}
	}

	//getters
	public int getCost(){
		return cost;
	}
}