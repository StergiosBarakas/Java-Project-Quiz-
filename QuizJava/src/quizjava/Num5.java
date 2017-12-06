package quizjava;

public class Num5 {

		private String language;
		
		public Num5(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Grand Duchy of Luxenburg") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}