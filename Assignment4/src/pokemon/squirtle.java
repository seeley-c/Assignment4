package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Squirtle derived class. this is one of the derived 
 *              classes of water type
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class squirtle extends waterType
 {  // begin class
 	
            public enum squirtleMoves { //squirtle specific moves
                Shell, HydroBlast;
            }
     
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            squirtleMoves sMoves = null; //variable for squirtle moves
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new squirtle object with initialized constructor
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              wMoves wm: waterMoves
 *              sMoves sm; squirtle
							
 Returns: na
 *****************************************************/
	 public squirtle(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, waterMoves wm, squirtleMoves sm){
		 
             super(g, ls, n, r, m, t, ha, wm); //extends object creation for water moves
             sMoves = sm; //set variable for squirtle moves
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new squirtle object with default constructors
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public squirtle(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
         
        public String toString() {
            String output = "";
            
            output = "Pokemon ID: " + this.getId() + "\n";
            output += "Pokemon: Squirtle\n";
            output += "Name: " + this.getName() + "\n";
            output += "Gender: " + this.getGender() + "\n";
            output += "Lifespan: " + this.getLifeSpan() + "\n";
            output += "Rarity: " + this.getRarity() + "\n";
            output += "Type: " + this.getType() + "\n";
            output += "Original Moves: " + this.getOgMoves() + "\n";
            output += "Hidden Ability: " + this.getHAbilities() + "\n";
            output += "Water-type Move: " + this.getwMoves()+ "\n";
            output += "Squirtle Move: " + this.getsqMoves()+ "\n";
            
            return output;
        }
         
        public squirtleMoves getsqMoves() { //getter squirtle moves
            return sMoves;
        } //end getsMoves
         
 	// ********** mutators **********

        public void setsqMoves(squirtleMoves sMoves) { //set squirtle moves
            this.sMoves = sMoves;
        } //end setsMoves

         
    
 }  // end class