package ws.model;

public enum Gender {
	MALE {
		@Override
		public String getTitle() {
			return "Mr.";
		}
	},
	FEMALE {
		@Override
		public String getTitle() {
			return "Ms.";
		}
	};
	
	public abstract String getTitle();
}
