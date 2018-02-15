package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Squirtle derived class. this is one of two derived class
 *				of water type
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
                 Type t, waterMoves wm){
		 
             super(g, ls, n, r, m, t, wm);
             wMoves = wm;
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new squirtle object
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public squirtle(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
 
         
 	// ********** mutators **********

    
 }  // end class