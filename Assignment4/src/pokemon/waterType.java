package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Water type derived class. this is one of three
 *              derived classes. all water type classes will 
 *              derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class waterType extends pokemon
 {  // begin class
 	
            public enum waterMoves {    //water based moves
                WaterShuriken, AquaJet, Vortex, HydroPump;
            } 
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            waterMoves wMoves = null; //variable for water moves
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new water type object with initialized constructors
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              wMoves wm: waterMoves
							
 Returns: na
 *****************************************************/
	 public waterType(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, waterMoves wm){
		 
             super(g, ls, n, r, m, t, ha); //extend original pokemon object creation
             wMoves = wm; //set new variable for water based move
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new water type object with default constructors
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public waterType(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public waterMoves getwMoves() { //getter for water moves
            return wMoves;
        } //end getwMoves
 
         
 	// ********** mutators **********

        public void setwMoves(waterMoves wMoves) { //set water moves
            this.wMoves = wMoves;
        } //end setwMoves

    
 }  // end class