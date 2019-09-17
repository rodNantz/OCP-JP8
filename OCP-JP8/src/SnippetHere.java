
public class SnippetHere {

	public static void main(String[] args) throws Throwable {
		
		System.out.println("Test 4, ex. 16");
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println( a [ (a = b)[3] ] );
		
		System.out.println("\n~~\n");
		
		System.out.println("Test 4, ex. 12");
        int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i>c || c>5) flag = false;
            }
        }
        System.out.println(c);
        
		System.out.println("\n~~\n");
        
		System.out.println("for loop");
		final int INT1 = 1, INT2 = 3;
		for (int i=INT1; i<INT2; i++) {
			System.out.println(i);     
		}
		
		System.out.println("while loop");
		int i = INT1; 
		while (i++<INT2) { 
			System.out.println(i); 
		}
		
		
		Game g = new Soccer();		// parent reference, child instance
		g.play();
		/*
		 * Overloaded methods mind the reference, not the instance
		 * - thus, the child method play(String) is not available
		 * when using a parent reference. DO NOT mistake it with
		 * overridden methods, which instance type matters instead.  
		 */
		// g.play("hi");
		
		Soccer gs = new Soccer();
		gs.play();
		gs.play("brazuca");
		
		Soccer s = (Soccer) g;
		s.play();
		s.play("jabulani");
		
	}
}

class Game {
	  public void play() throws Exception   {
	    System.out.println("Playing...");
	  }
	}

	class Soccer extends Game {
	   public void play(String ball)    {
	      System.out.println("Playing Soccer with "+ball);      
	   }
	}
