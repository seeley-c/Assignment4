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
		
            sceptile sceptile = new sceptile(Gender.Male, 45, "Sceptile", 
                    Rarity.Legendary, originalMoves.Scratch, Type.Fire, 
                    hiddenAbilities.Unburden, grassMoves.Spore, 
                    sceptileMoves.LeafStorm);
            squirtle squirtle = new squirtle(Gender.Male, 56, "Squirtle", 
                    Rarity.Rare, originalMoves.Pound, Type.Water, 
                    hiddenAbilities.RainDish, waterMoves.WaterShuriken, 
                    squirtleMoves.HydroBlast);
            Ninetails ninetails = new Ninetails(Gender.Male, 1234, "Ninetails", 
                    Rarity.Legendary, originalMoves.Pound, Type.Fire, 
                    hiddenAbilities.Drought, fireMoves.InfernoOverdrive, 
                    ninetailsMoves.FlameCharge);
            
            
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		
		
	// ***** get input *****
	
		
	
	// ***** processing *****
	
            
		
	// ***** output *****
	
            joe.setGender(Gender.Female);
            joe.setName("Josephine");
            joe.setRarity(Rarity.Common);
            
            System.out.println("Name: " + bob.getName());
            System.out.println("Gender: " + bob.getGender());
            System.out.println("Life Span: " + bob.getLifeSpan());
            System.out.println("Rarity: " + bob.getRarity());
            System.out.println("Pokemon Type: " + bob.getType());
            System.out.println("Original Moves: " + bob.getOgMoves());
            System.out.println("Grass Moves: " + bob.getgMoves());
            System.out.println("Sceptile Moves: " + bob.getsceptileMoves());
            System.out.println("Hidden Ability: " + bob.getHAbilities());
            System.out.println("Pokemon ID: " + bob.getId() + "\n");
            
            System.out.println("Gender: " + joe.getGender());
            System.out.println("Life Span: " + joe.getLifeSpan());
            System.out.println("Name: " + joe.getName());
            System.out.println("Rarity: " + joe.getRarity());
            System.out.println("Pokemon Type: " + joe.getType());
            System.out.println("Original Moves: " + joe.getOgMoves());
            System.out.println("Water Moves: " + joe.getwMoves());
            System.out.println("Squirtle Moves: " + joe.getsMoves());
            System.out.println("Hidden Ability: " + joe.getHAbilities());
            System.out.println("Pokemon ID: " + joe.getId() + "\n");
            
            System.out.println("Gender: " + Sminem.getGender());
            System.out.println("Life Span: " + Sminem.getLifeSpan());
            System.out.println("Name: " + Sminem.getName());
            System.out.println("Rarity: " + Sminem.getRarity());
            System.out.println("Pokemon Type: " + Sminem.getType());
            System.out.println("Original Moves: " + Sminem.getOgMoves());
            System.out.println("Fire Moves: " + Sminem.getfMoves());
            System.out.println("Ninetails Moves: " + Sminem.getntMoves());
            System.out.println("Hidden Ability: " + Sminem.getHAbilities());
            System.out.println("Pokemon ID: " + Sminem.getId() + "\n");
            
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class