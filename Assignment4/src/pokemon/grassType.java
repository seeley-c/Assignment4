package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Grass type derived class. this is one of three
 *              derived class all grass type classes will 
 *              derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class grassType extends pokemon
 {  // begin class
 	
            public enum grassMoves { //grass-based moves
                Razorleaf, Spore, Vinewhip;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            grassMoves gMoves = null;   //variable for grass moves
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new animal object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              gMoves gm: grassMoves
							
 Returns: na
 *****************************************************/
	 public grassType(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, grassMoves gm){
		 
             super(g, ls, n, r, m, t, ha); //extends pokemon object creation
             gMoves = gm; //set new variable for grass moves
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new grass type object with default constructors
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public grassType(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public grassMoves getgMoves() { //get grass move
            return gMoves;
        } //end getgMoves
         
 	// ********** mutators **********

        public void setgMoves(grassMoves gMoves) { //set grass move
            this.gMoves = gMoves;
        } //end setgMoves
    
 }  // end class