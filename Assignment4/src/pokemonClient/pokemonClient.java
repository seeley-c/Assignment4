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
import pokemon.fireType;
import pokemon.fireType.fireMoves;
import pokemon.waterType;
import pokemon.waterType.waterMoves;

public class pokemonClient
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
            pokemon pokeman = new pokemon(Gender.Male, 20, "Pokeman", 
                    Rarity.Common, originalMoves.Pound, Type.Grass);
            fireType bob = new fireType(Gender.Male, 45, "Bob", 
                    Rarity.Legendary, originalMoves.Scratch, Type.Fire, 
                    fireMoves.Scorch);
            waterType joe = new waterType(Gender.Male, 23, "Joe", 
                    Rarity.Rare, originalMoves.Pound, Type.Water, 
                    waterMoves.WaterShuriken);
            
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		
		
	// ***** get input *****
	
		
	
	// ***** processing *****
	
            System.out.println(pokeman.getGender());
            System.out.println(pokeman.getLifeSpan());
            System.out.println(pokeman.getName());
            System.out.println(pokeman.getOgMoves());
            System.out.println(pokeman.getRarity());
            System.out.println(pokeman.getType());
            System.out.println(pokeman.getId() + "\n");
            System.out.println(bob.getGender());
            System.out.println(bob.getLifeSpan());
            System.out.println(bob.getName());
            System.out.println(bob.getOgMoves());
            System.out.println(bob.getRarity());
            System.out.println(bob.getType());
            System.out.println(bob.getfMoves());
            System.out.println(bob.getId() + "\n");
            
            System.out.println("Gender: " + joe.getGender());
            System.out.println("Life Span: " + joe.getLifeSpan());
            System.out.println("Name: " + joe.getName());
            System.out.println("Original Moves: " + joe.getOgMoves());
            System.out.println("Rarity: " + joe.getRarity());
            System.out.println("Pokemon Type: " + joe.getType());
            System.out.println("Water Moves: " + joe.getwMoves());
            System.out.println("Pokemon ID: " + joe.getId() + "\n");
		
	// ***** output *****
	
		

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class