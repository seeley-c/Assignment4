package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Sceptile derived class. this is one of the derived 
 *              classes of grass type
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class sceptile extends grassType
 {  // begin class
 	
            public enum sceptileMoves { //moves specific to sceptile
                LeafBlade, LeafStorm;
            } 
            
 	// *********** class constants **********
            
 	// ********** instance variable **********
            
            sceptileMoves sMoves = null; //variable for sceptile moves
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new sceptile object with initialized constructors
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
 *              gMoves gm: grassMoves
 *              sMoves sm; sceptileMoves
							
 Returns: na
 *****************************************************/
	 public sceptile(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha, grassMoves gm, sceptileMoves sm){
		 
             super(g, ls, n, r, m, t, ha, gm); //extends object creation of grass type
             sMoves = sm; //set variable for sceptile moves
             
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new sceptile object with default objects
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public sceptile(){
             
	 } // and initialized constructor
            
 	// ********** accessors **********
        
        public String toString() {
            String output = "";
            
            output = "Pokemon ID: " + this.getId() + "\n";
            output += "Pokemon: Sceptile\n";
            output += "Name: " + this.getName() + "\n";
            output += "Gender: " + this.getGender() + "\n";
            output += "Lifespan: " + this.getLifeSpan() + "\n";
            output += "Rarity: " + this.getRarity() + "\n";
            output += "Type: " + this.getType() + "\n";
            output += "Original Moves: " + this.getOgMoves() + "\n";
            output += "Hidden Ability: " + this.getHAbilities() + "\n";
            output += "Grass-type Move: " + this.getgMoves()+ "\n";
            output += "Sceptile Move: " + this.getsMoves()+ "\n";
            
            return output;
        }
         
        public sceptileMoves getsMoves() { //getter sceptile moves
            return sMoves;
        } //end getsMoves
 
         
 	// ********** mutators **********

        public void setsMoves(sceptileMoves sMoves) { //set sceptile moves
            this.sMoves = sMoves;
        } //end setsMoves

        
    
 }  // end class