package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Sceptile derived class. this is one of the derived classes
 *				of grass type
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class sceptile extends grassType
 {  // begin class
 	
            public enum sceptileMoves {
                LeafBlade, LeafStorm;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            sceptileMoves sMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new sceptile object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              gMoves gm: grassMoves
 *              sMoves sm; sceptileMoves
							
 Returns: na
 *****************************************************/
	 public sceptile(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, grassMoves gm, sceptileMoves sm){
		 
             super(g, ls, n, r, m, t, ha, gm);
             sMoves = sm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new sceptile object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public sceptile(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public sceptileMoves getsceptileMoves() {
            return sMoves;
        }
 
         
 	// ********** mutators **********

    
 }  // end class