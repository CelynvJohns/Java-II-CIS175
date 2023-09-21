/**
 * @author Celyn Johns - jvjohns1
 *  CIS175 - FALL 2023
 *  ${date}
 */

package model;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	// set variables
	private int birthYear;
    private int birthMonth;
    private int birthDay;

    //constructor
    public AgeCalculator(int birthYear, int birthMonth, int birthDay) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }
 
    
    public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int calculateAge() {
        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        return age.getYears();
        
    }
    
	@Override
	public String toString() {
		return "AgeCalculator [birthYear=" + birthYear + ", birthMonth=" + birthMonth + ", birthDay=" + birthDay
				+ ", calculateAge()=" + calculateAge() + "]";
	}

	
}
