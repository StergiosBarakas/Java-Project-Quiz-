package quizjava;

public class Num4 {

		private String language;
		
		public Num4(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Nile Crocodile") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}