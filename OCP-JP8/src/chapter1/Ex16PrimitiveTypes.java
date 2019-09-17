package chapter1;

public class Ex16PrimitiveTypes {
	
	public static void main (String uzargumento[]){
		
		byte baite = 0b1000;	// binary literal
		byte baite2 = baite;
		short xorte = 51;
		short xorte2 = xorte;
		char xar = 'a';
		char xar2 = xar;
		int inte = 2109;
		int inte2 = inte;
		int inteXar = inte;
		long lougue = 21L;
		long lougue2 = lougue;
		float frout = 3.14f;
		float frout2 = frout;
		double dobre = 14.3;
		double dobre2 = dobre;
		
		printe(baite, xorte, xar, inte, lougue, frout, dobre);
		
		//frout = dobre;
		dobre2 = frout;
		//lougue = frout;
		frout2 = lougue;
		//inte = lougue;
		lougue2 = inte;
		
		inte2 = xorte;
		
		xorte2 = baite;
		
		inteXar = xar;
		
		//xorte = xar;		// these two cannot happen because
		//xar = xorte;
		
		printe(frout, dobre2, 
				lougue, frout2,
				inte, lougue2,
				xorte, inte2,
				baite, xorte2,
				xar, inteXar);
	}

	
	static void printe(Object... wuts){
		System.out.println("\n ~ ~ ~ ~ ~ ~ ");
		for(Object wut : wuts){
			System.out.println(wut.getClass().getName() + ": " + wut);
		}
		System.out.print(" ~ ~ ~ ~ ~ ~ \n");
	}
	
}
