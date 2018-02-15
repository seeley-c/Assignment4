package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Water type derived class. this is one of three derived class
 *				all water type classes will derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class waterType extends pokemon
 {  // begin class
 	
            public enum waterMoves {
                WaterShuriken, AquaJet, Vortex, HydroPump;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            waterMoves wMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new water type object 
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              wMoves wm: waterMoves
							
 Returns: na
 *****************************************************/
	 public waterType(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, waterMoves wm){
		 
             super(g, ls, n, r, m, t);
             wMoves = wm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new water type object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public waterType(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public waterMoves getwMoves() {
            return wMoves;
        }
 
         
 	// ********** mutators **********

    
 }  // end class