package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	ninetails derived class. this is a
 *              fire type derived class
 *				
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Ninetails extends fireType
 {  // begin class
 	
            public enum ninetailsMoves {
                Flamethrower, FlameCharge;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            ninetailsMoves ntMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new ninetails object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              fMoves fm: fireMoves
 *              ntMoves nm: ninetailsMoves
							
 Returns: na
 *****************************************************/
	 public Ninetails(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, fireMoves fm, ninetailsMoves nm){
		 
             super(g, ls, n, r, m, t, ha, fm);
             ntMoves = nm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new ninetails object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public Ninetails(){
             
	 } // end initialized constructor
            
 	// ********** accessors **********
        
        public ninetailsMoves getntMoves() {
            return ntMoves;
        }
 
         
 	// ********** mutators **********

    
 }  // end class