package pokemon;

/* **********************************************************
 * Programmer:	C. Seeley
 * Class:       CS30S
 * 
 * Assignment:	Assignment 4
 *
 * Description:	Pokemon super class. this is the main super 
 *              class all other classes will derive form this one
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class pokemon
 {  // begin class
 	
            public enum Gender{ //gender of pokemon
		 Male, Female;
            } // end gender
            
            public enum Rarity {    //rarity of pokemon
                Common, Rare, Legendary;
            } // end rarity
            
            public enum originalMoves {     //pokemon can learn one of these og moves
                Leer, Tackle, Scratch, Pound;
            } // end originalMoves
            
            public enum Type {      //the type of pokemon
                Fire, Water, Grass;
            } //end type
            
            public enum hiddenAbilities {   
            //these hidden abilities correspond to the second level derived classes
                RainDish, Unburden, Drought;
            } //end type
            
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
            private hiddenAbilities hAbilities = null;  //hidden ability of pokemon
            
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new pokemon object with initialized constructors
 Interface: IN: lifeSpan ls: int
 *              rarity r: Rarity
 *              gender g: Gender
 *              name n: String
 *              ogMoves m: originalMoves
 *              type t: Type
 *              hAbilities ha: hiddenAbilities
							
 Returns: na
 *****************************************************/
	 public pokemon(Gender g, int ls, String n, Rarity r, originalMoves m, 
                 Type t, hiddenAbilities ha){
		 id = nextId++;     //set id
             
		 lifeSpan = ls;     //set lifespan
		 gender = g;        //set gender
                 name = n;          //set name
                 rarity = r;        //set rarity
                 ogMoves = m;       //set og move
                 type = t;          //set type
                 hAbilities = ha;   //set hidden ability
	 } // and initialized constructor
         
/*****************************************************
 Purpose: create a new pokemon object with default constructors
 Interface: IN: na
							
 Returns: na
 *****************************************************/
	 public pokemon(){
		 id = nextId++;     //set id
	 } // and default constructor
            
 	// ********** accessors **********
        

        public int getId() {    //getter for id
            return id;
        } //end getId

        public String getName() {   //getter for name
            return name;
        } //end getName

        public int getLifeSpan() {  //get lifespan
            return lifeSpan;
        } //end getLifeSpan

        public Gender getGender() { //get gender
            return gender;
        } //end getGender

        public Rarity getRarity() { //get rarity
            return rarity;
        } //end getRarity

        public originalMoves getOgMoves() { //get og move
            return ogMoves;
        } //end getOgMoves
        
        public Type getType() { //get type of pokemon
            return type;
        } //end getType
        
        public hiddenAbilities getHAbilities() { //get hidden ability
            return hAbilities;
        } //end getHAbilities
         
 	// ********** mutators **********

        public void setName(String name) { //set name
            this.name = name;
        } //end setName

        public void setGender(Gender gender) { //set gender
            this.gender = gender;
        } //end setGender

        public void setRarity(Rarity rarity) { //set rarity
            this.rarity = rarity;
        } //end setRarity

        public void setOgMoves(originalMoves ogMoves) { //set og move
            this.ogMoves = ogMoves;
        } //end setOgMoves

        public void setType(Type type) {    //set type
            this.type = type;
        } //end setType

        public void setLifeSpan(int lifeSpan) { //set lifespan
            this.lifeSpan = lifeSpan;
        } //end setLifeSpan

        public void setHAbilities(hiddenAbilities hAbilities) { //set hidden ability
            this.hAbilities = hAbilities;
        } //end setHAbilities

        public void setId(int id) { //set ID
            this.id = id;
        }//end setId

        

    
 }  // end class