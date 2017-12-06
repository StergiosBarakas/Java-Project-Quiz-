package quizjava;

public class Num10 {

		private String language;
		
		public Num10(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "19 years") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}