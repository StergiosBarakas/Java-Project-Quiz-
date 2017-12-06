package quizjava;

public class Num3 {

		private String language;
		
		public Num3(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Teutonic Order") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}