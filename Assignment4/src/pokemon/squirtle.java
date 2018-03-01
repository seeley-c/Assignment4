package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Squirtle derived class. this is one of the derived classes
 *		of water type
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class squirtle extends waterType
 {  // begin class
 	
            public enum squirtleMoves {
                Shell, HydroBlast;
            }
     
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            squirtleMoves sMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new squirtle object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              wMoves wm: waterMoves
							
 Returns: na
 *****************************************************/
	 public squirtle(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, waterMoves wm, squirtleMoves sm){
		 
             super(g, ls, n, r, m, t, ha, wm);
             wMoves = wm;
             sMoves = sm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new squirtle object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public squirtle(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
 
         public squirtleMoves getsMoves() {
            return sMoves;
        }
         
 	// ********** mutators **********

    
 }  // end class