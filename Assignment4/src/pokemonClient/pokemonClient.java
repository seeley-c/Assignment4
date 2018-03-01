package pokemonClient;

// **********************************************************************
// Programmer:	C. Seeley
// Class:       CS30S
//
// Assignment:	Assignment 4
//
// Description:	
//
//
//  Input:	
//
//  Output:	
// ***********************************************************************

import pokemon.pokemon;
import pokemon.pokemon.Gender;
import pokemon.pokemon.Rarity;
import pokemon.pokemon.originalMoves;
import pokemon.pokemon.Type;
import javax.swing.*;
import java.text.DecimalFormat;
import pokemon.Ninetails;
import pokemon.Ninetails.ninetailsMoves;
import pokemon.fireType;
import pokemon.fireType.fireMoves;
import pokemon.grassType;
import pokemon.grassType.grassMoves;
import pokemon.pokemon.hiddenAbilities;
import pokemon.sceptile;
import pokemon.sceptile.sceptileMoves;
import pokemon.squirtle;
import pokemon.squirtle.squirtleMoves;
import pokemon.waterType;
import pokemon.waterType.waterMoves;

public class pokemonClient
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
            sceptile sceptile = new sceptile(Gender.Male, 45, "Joe", 
                    Rarity.Legendary, originalMoves.Scratch, Type.Fire, 
                    hiddenAbilities.Unburden, grassMoves.Spore, 
                    sceptileMoves.LeafStorm);
            squirtle squirtle = new squirtle(Gender.Male, 56, "Bob", 
                    Rarity.Rare, originalMoves.Pound, Type.Water, 
                    hiddenAbilities.RainDish, waterMoves.WaterShuriken, 
                    squirtleMoves.HydroBlast);
            Ninetails ninetails = new Ninetails(Gender.Male, 1234, "Phil", 
                    Rarity.Legendary, originalMoves.Pound, Type.Fire, 
                    hiddenAbilities.Drought, fireMoves.InfernoOverdrive, 
                    ninetailsMoves.FlameCharge);
            
            
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		
	// ***** get input *****
	
		//na
	
	// ***** processing *****
	
            //na
		
	// ***** output *****
            
            //output the pokemon objects
            System.out.println(sceptile.toString());
            System.out.println(squirtle.toString());
            System.out.println(ninetails.toString());
            
            //change properties of sceptile object
            sceptile.setGender(Gender.Female);
            sceptile.setId(1003);
            sceptile.setLifeSpan(101);
            sceptile.setName("Josephine");
            sceptile.setgMoves(grassMoves.Razorleaf);
            sceptile.setsMoves(sceptileMoves.LeafBlade);
            
            //change properties of squirtle object
            squirtle.setOgMoves(originalMoves.Tackle);
            squirtle.setId(1004);
            squirtle.setName("Squirtle");
            squirtle.setRarity(Rarity.Common);
            squirtle.setwMoves(waterMoves.Vortex);
            squirtle.setsqMoves(squirtleMoves.Shell);
            
            //change properties of ninetails object
            ninetails.setHAbilities(hiddenAbilities.Unburden);
            ninetails.setId(1005);
            ninetails.setName("Ninetails");
            ninetails.setType(Type.Grass);
            ninetails.setfMoves(fireMoves.Scorch);
            ninetails.setNtMoves(ninetailsMoves.Flamethrower);
            
            //output objects with updated properties
            System.out.println(sceptile.toString());
            System.out.println(squirtle.toString());
            System.out.println(ninetails.toString());
            
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class