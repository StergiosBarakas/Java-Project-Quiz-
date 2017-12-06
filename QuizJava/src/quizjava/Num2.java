package quizjava;

public class Num2 {

		private String language;
		
		public Num2(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "1945") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}