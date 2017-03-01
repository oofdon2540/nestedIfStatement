/* HolidayApp.java
@author Yo
01/03/17
*/

import javax.swing.*;
public class HolidayApp{
	public static void main(String args[]){

		//vars
		int cost;
		int people;
		String season;
		String answer;
		//objects
		Holiday myHoliday;
		myHoliday =new Holiday();

		//inputs
		do{
		season=JOptionPane.showInputDialog(null, "What season is it?");
		myHoliday.setSeason(season);

		people=Integer.parseInt(JOptionPane.showInputDialog(null, "How many people are going?"));
		myHoliday.setPeople(people);

		//process
		myHoliday.compute();

		//output
		cost=myHoliday.getCost();
		JOptionPane.showMessageDialog(null, "Your journey cost " +cost);
		answer=JOptionPane.showInputDialog(null, "Again?");
		}while(answer.equalsIgnoreCase("y"));
}
}