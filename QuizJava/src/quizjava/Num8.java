package quizjava;

public class Num8 {

		private String language;
		
		public Num8(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Ottoman Empire") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}