public class RefactorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer Pete = new Customer("Peter");
        Movie Shouf = new Movie("Shouf Shouf Habibi",1);
        Movie Black = new Movie("Black Book",2);
        
        
        Pete.addRental(new Rental(Shouf,2));
        Pete.addRental(new Rental(Black,1));
        
        System.out.println(Pete.statement());
        
	}

}
