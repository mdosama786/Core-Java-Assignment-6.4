
/** @Program to validate age for election a person eligible or not
 *  AND THROW NEGATIVE AGE EXCEPTION*/

/** @Extending ExceptionHandling from class Exception */
public class ExceptionHandling extends Exception {
	String s1;
	int voterid;
	int age;

	/** @Constuctor */
	ExceptionHandling(String s) {
		s1 = s;
	}

	/** @Method to print string and return negative age exception */
	public String toString() {
		return ("Negative age exception " + s1);
	}

	/** @Creating a method for validating age */
	public void ageLImit(int age) {
		/** @try block */
		try {
			if (age > 0 && age < 18) {
				/** @throw exception when age is between 0 and 18 */
				System.out.println("\n");

				throw new ExceptionHandling("\nYour age is less than 18 your entered age is " + age);
			}

			else if (age < 0)
			/** @throw exception when age is less than 0 */
			{
				throw new ExceptionHandling("\nYou have entered age in negative  " + age);
			} else
				System.out.println("\nYou are eligible for vote");
		}
		/** @Catching exception */
		catch (ExceptionHandling ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		/** @Object of ExceptionHandling class */
		ExceptionHandling obj = new ExceptionHandling(" Not eligible to cast vote  ");
		obj.ageLImit(16);
		obj.ageLImit(5);
		obj.ageLImit(20);
	}
}