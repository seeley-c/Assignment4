package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Grass type derived class. this is one of three derived class
 *				all grass type classes will derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class grassType extends pokemon
 {  // begin class
 	
            public enum grassMoves {
                Razorleaf, Growth, Spore, Vinewhip;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            grassMoves gMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new animal object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              gMoves gm: grassMoves
							
 Returns: na
 *****************************************************/
	 public grassType(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, grassMoves gm){
		 
             super(g, ls, n, r, m, t);
             gMoves = gm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new grass type object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public grassType(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public grassMoves getfMoves() {
            return gMoves;
        }
 
         
 	// ********** mutators **********

    
 }  // end class