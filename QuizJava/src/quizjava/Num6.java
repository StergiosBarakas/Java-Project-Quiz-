package quizjava;

public class Num6 {

		private String language;
		
		public Num6(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "United Kingdom") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}