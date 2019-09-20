/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void spire() {
		System.out.println("                        //\\\\");
		System.out.println("                        |**|");
		System.out.println("                        |**|");
		System.out.println("                        |**|");
		System.out.println("                        |**|");
		System.out.println("                        |**|");
		System.out.println("                        |**|");
	}

	public static void head() {
		System.out.println("               _________|__|_________");
		System.out.println("              /                      \\");
		System.out.println("             <oooooooooooooooooooooooo>");
		System.out.println("              \\           T           /");
		System.out.println("              |           O          |");
		System.out.println("             /            R           \\");
		System.out.println("            /             O            \\");
		System.out.println("           /              N             \\");
		System.out.println("          /               T              \\");
		System.out.println("         /                O               \\");
		System.out.println("        <oooooooooooooooooooooooooooooooooo>");
		System.out.println("        \\                 T               /");
		System.out.println("         \\                O              /");
		System.out.println("          \\               W             /");
		System.out.println("           \\              E            /");
		System.out.println("            |             R           |");
		System.out.println("            |                         |");
		System.out.println("            |                         |");
		System.out.println("           <                           >");
		System.out.println("          <ooooooooooooooooooooooooooooo>");
		System.out.println("           <                           >");
	}

	public static void upperTower() {
		System.out.println("            \\                         /");
		System.out.println("             \\                       /");
		System.out.println("              \\                     /");
		System.out.println("               \\                   /");
		System.out.println("                \\                 /");
		System.out.println("                 \\               /");
		System.out.println("                  \\             /");
		System.out.println("                   \\           /");
		System.out.println("                    \\         /");
		System.out.println("                     \\ooooooo/");
	}

	public static void middleTower() {
		System.out.println("                      |     |");
	}

	public static void tenMiddleTower() {
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
		middleTower();
	}

	public static void lowerTower() {
		System.out.println("                     /       \\");
		System.out.println("                    /         \\");
		System.out.println("                   /           \\");
		System.out.println("                  /             \\");
		System.out.println("                 /               \\");
		System.out.println("                /                 \\");
		System.out.println("               /                   \\");
		System.out.println("              /                     \\");
		System.out.println("             /                       \\");
		System.out.println("            /                         \\");
		System.out.println("           /                           \\");

	}

	public static void happyCanadian() {
		System.out.println("  O       /                             \\");
		System.out.println(" /|\\     /                               \\");
		System.out.println("  |     /                                 \\");
		System.out.println(" /\\    /                                   \\");
		System.out.println("      /-------------------------------------\\");
	}

	public static void main(String[] args) {
		spire();
		head();
		upperTower();
		tenMiddleTower();
		tenMiddleTower();
		tenMiddleTower();
		lowerTower();
		happyCanadian();
	}
}