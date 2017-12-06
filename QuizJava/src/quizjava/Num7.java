package quizjava;

public class Num7 {

		private String language;
		
		public Num7(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "A defence mechanism") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}