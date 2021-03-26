
public class StudentUtil {

	
	public static char getGrade(double point) {
		char grade;
		
		if(point >= 90.0) {
			grade = 'A';
		}else if(point >= 80.0) {
			grade = 'B';
		}else if(point >= 70.0) {
			grade = 'C';
		}else if(point >= 60.0) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		return grade;
	}
}
