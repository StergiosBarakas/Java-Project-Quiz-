package quizjava;

public class Num9 {

		private String language;
		
		public Num9(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Arthur C. Clarke") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}