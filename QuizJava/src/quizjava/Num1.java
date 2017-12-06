package quizjava;

public class Num1 {

		private String language;
		
		public Num1(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Inland Taipan") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}