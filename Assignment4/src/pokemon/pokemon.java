package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Pokemon super class. this is the main super class
 *				all other classes will derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class pokemon
 {  // begin class
 	
            public enum Gender{
		 Male, Female;
            } // end gender
            
            public enum Rarity {
                Common, Rare, Legendary;
            } // end rarity
            
            public enum originalMoves {
                Leer, Tackle, Scratch, Pound;
            } // end rarity
            
            public enum Type {
                Fire, Water, Grass;
            }
            
 	// *********** class constants **********
            static int nextId = 1000;	// to generate unique id numbers
            
 	// ********** instance variable **********
            
            int id = 0000;						// unique id number
            
            private String name = "";
            private int lifeSpan = 0;			// how long they live
	 
            private Gender gender = null;		// gender
            private Rarity rarity = null;               // rarity of pokemon
            private originalMoves ogMoves = null;       // moves of pokemon
            private Type type = null;                        // type of pokemon
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new animal object
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
							
 Returns: na
 *****************************************************/
	 public pokemon(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t){
		 id = nextId++;  
             
		 lifeSpan = ls;
		 gender = g;
                 name = n;
                 rarity = r;
                 ogMoves = m;
                 type = t;
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new animal object
 Interface: IN: 
							
 Returns: na
 *****************************************************/
	 public pokemon(){
		 id = nextId++;
	 } // and default constructor
            
 	// ********** accessors **********
        
        public static int getNextId() {
            return nextId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getLifeSpan() {
            return lifeSpan;
        }

        public Gender getGender() {
            return gender;
        }

        public Rarity getRarity() {
            return rarity;
        }

        public originalMoves getOgMoves() {
            return ogMoves;
        }
        
        public Type getType() {
            return type;
        }
         
 	// ********** mutators **********

    

    
 }  // end class