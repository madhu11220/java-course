package session5;

public class AcessFoodMenu implements vegItems, NonvegItems {

	@Override
	public void fry() {
		System.out.println("chicken fry, mutton fry, calliflower fry ");
		
	}

	@Override
	public void gravy() {
		System.out.println("veg gravy, chicken gobi gravy ");
		
	}

	@Override
	public void breakfast() {
		System.out.println("Dosa, Idly, pongal ");
		
	}

	@Override
	public void lunch() {
		System.out.println("Tomato rice, sambar sadam, curd rice ");
		
	}
	 
	
	public static void main(String[] args) {
	   AcessFoodMenu afm = new AcessFoodMenu();
	   afm.breakfast();
	   afm.lunch();
	   afm.fry();
	   afm.gravy();
		
	}
	
	

}
