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
 	
            public enum ninetailsMoves { //move for ninetail
                Flamethrower, FlameCharge;
            }
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            ninetailsMoves ntMoves = null; //variable for ninetails moves
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new ninetails object with initialized constructors
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              fMoves fm: fireMoves
 *              ntMoves nm: ninetailsMoves
							
 Returns: na
 *****************************************************/
	 public Ninetails(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, fireMoves fm, ninetailsMoves nm){
		 
             super(g, ls, n, r, m, t, ha, fm); //extends object creation of fire type
             ntMoves = nm; //set variable for ninetails moves
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new ninetails object with default properties
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public Ninetails(){
             
	 } // end initialized constructor
            
 	// ********** accessors **********
        
        public String toString() {
            String output = "";
            
            output = "Pokemon ID: " + this.getId() + "\n";
            output += "Pokemon: Ninetails\n";
            output += "Name: " + this.getName() + "\n";
            output += "Gender: " + this.getGender() + "\n";
            output += "Lifespan: " + this.getLifeSpan() + "\n";
            output += "Rarity: " + this.getRarity() + "\n";
            output += "Type: " + this.getType() + "\n";
            output += "Original Moves: " + this.getOgMoves() + "\n";
            output += "Hidden Ability: " + this.getHAbilities() + "\n";
            output += "Fire-type Move: " + this.getfMoves()+ "\n";
            output += "Ninetails Move: " + this.getntMoves()+ "\n";
            
            return output;
        }
         
        public ninetailsMoves getntMoves() { //getter for ninetails moves
            return ntMoves;
        } //end getntMoves
         
 	// ********** mutators **********

        public void setNtMoves(ninetailsMoves ntMoves) { //set ninetails moves
            this.ntMoves = ntMoves;
        } //end setNtMoves
    
 }  // end class