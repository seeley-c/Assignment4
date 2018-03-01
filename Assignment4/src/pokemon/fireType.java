package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Fire type derived class. this is one of three 
 *              derived class all fire type classes will 
 *              derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class fireType extends pokemon
 {  // begin class
 	
            public enum fireMoves {
                Eruption, Scorch, FlameBurst, InfernoOverdrive;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            fireMoves fMoves = null;
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new fire type object with initialized constructors
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              fMoves fm: fireMoves
							
 Returns: na
 *****************************************************/
	 public fireType(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, fireMoves fm){
		 
             super(g, ls, n, r, m, t, ha); //extends object creation of pokemon
             fMoves = fm; //set variable for fire moves
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new fire type object with default constructors
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public fireType(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public fireMoves getfMoves() { //get fire moves
            return fMoves;
        } //end getfMoves
 
         
 	// ********** mutators **********

        public void setfMoves(fireMoves fMoves) { //set fire moves
            this.fMoves = fMoves;
        } //end setfMoves
    
 }  // end class