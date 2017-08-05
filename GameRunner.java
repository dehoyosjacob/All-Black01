import static java.lang.System.*;
import java.util.Scanner;

public class GameRunner 
{
	public static void main(String[] args)
	{
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int choice = 0;
		int c5 = 0;
		int c6 = 0;
		int c7 = 0;
		String weapon = "";
		int enemHP = 0;
		int HP = 0;
		
		out.println("You are awoken by a loud crash. Your head is searing with pain.");
		out.println("For the moment, you don\'t remember where you are. You also cant");
		out.println("remember how you got here. The bars holding you prisoner to this");
		out.println("cell-like room have been broken, leaving an exit for you.\n");

		Scanner s = new Scanner(System.in);
		
		out.println("\nWhat would you like to do?");
		out.println("1. Exit room");
		out.println("2. Exit room");
		out.println("3. It doesn't matter what you choose, you're going to exit the room.\n");
		int c = s.nextInt();
		
		out.println("\nYou enter a large hallway with passages leading north, towards the dock");
		out.println("bay, and east, towards the medical bay. Before you can even consider");
		out.println("how useless it is to imagine cardinal directions while floating through space,");
		out.println("you come across a crew member. He appears to be rocking that pirate gimmick");
		out.println("and also appears hostile.\n");
		out.println("What do you do?");
		out.println("1. Fight");
		out.println("2. Run towards the docking bay");
		out.println("3. Run towards the medical bay\n");
		
		c1 = s.nextInt();
		
		if(c1 == 1)
		{
			
			int hit = 0;
			int damage = 0;
			enemHP = 10;
			HP = 35;
			while(enemHP > 0 && HP > 0)
			{
				hit = (int)(Math.random()*4)+1;
				enemHP -= hit;
				damage = (int)(Math.random()*6)+1;
				HP -= damage;
			}
			
			if(HP <= 0)
			{
				out.println("\nThe pirate has defeated you. Game Over.\n");
			}
			
			else if(damage > 0)
			{
				out.println("\nYou defeated your enemy, but took some damage, your HP");
				out.println("ammount is "+ HP + "\n");
				out.println("What do you want to do next?");
				out.println("1. Run towards the docking bay");
				out.println("2. Run towards the medical bay\n");
				c2 = s.nextInt();
			}
			
			else if(damage == 0)
			{
				out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
				out.println("What do you want to do next?");
				out.println("1. Run towards the docking bay");
				out.println("2. Run towards the medical bay\n");
				c2 = s.nextInt();
			}
			
			if(c2 == 1)
			{
				out.println("\nYou enter the docking bay. There are currently no ships docking");
				out.println("at the time, but there is another pirate, he's spotted you and is");
				out.println("approaching fast. You pick up a crowbar as he is running towards you.\n");
				out.println("What do you do?");
				out.println("1. Attack");
				out.println("2. Run away");
				c3 = s.nextInt();
				
				if(c3 == 1)
				{
					hit = 0;
					damage = 0;
					enemHP = 15;
					while(enemHP > 0 && HP > 0)
					{
						hit = (int)(Math.random()*9)+1;
						enemHP -= hit;
						damage = (int)(Math.random()*6)+1;
						HP -= damage;
					}
			
					if(HP <= 0)
					{
						out.println("\nThe pirate has defeated you. Game Over.\n");
					}
			
					else if(damage > 0)
					{
						out.println("\nYou defeated your enemy, but took some damage, your HP");
						out.println("ammount is "+ HP + "\n");
						out.println("What do you want to do next?");
						out.println("1. Run towards the medical bay\n");
						c4 = s.nextInt();
					}
			
					else if(damage == 0)
					{
						out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
						out.println("What do you want to do next?");
						out.println("1. Run towards the medical bay\n");
						c4 = s.nextInt();
					}
					
					out.println("\nYou enter the medical bay, there are a few medical supplies here.");
					int ranMed = (int)(Math.random()*9)+1;
					if(ranMed <= 3)
					{
						HP += 50;
						out.println("You found some medicine, you take this medicine and you gain some");
						out.println("HP, your new HP total is " + HP +  "\n");
					}
					
					else if(ranMed >= 6)
					{
						out.println("You found a defibrilator, you think you might be able to use this");
						out.println("in combat. You have equiped the defibrilator.");
						weapon = "defibrilator";
					}
					
					else if(ranMed > 3 && ranMed < 6)
					{
						HP += 50;
						out.println("You found some medicine, you take this medicine and you gain some");
						out.println("HP, your new HP total is " + HP +  "\n");
						out.println("You also found a defibrilator, you think you might be able to use this");
						out.println("in combat. You have equiped the defibrilator.");
						weapon = "defibrilator";
					}
					
						out.println("After exiting the medical bay, you enter an empty hallway with a passage leading");
						out.println("forward.");
						out.println("you walk down the corridor to the lobby.");
						out.println("From here you have 3 options...\n");
						out.println("Option 1 is to turn to the engine room...\n");
						out.println("Option 2 is to turn and head towards the bunkers...\n");
						out.println("and option 3 is to head straight towards the holding bay\n");
						choice = s.nextInt();
						out.print("What option do you want to choose (1) (2) (3)?\n");
  						if ( choice == 1)
  						{
							out.println("\nAs you enter the engine room you see a crowbar and pick it up");
							out.println("Further into the engine room you encounter a guard and he approaches");
							out.println("you.\n");
							out.println("What do you do?");
							out.println("1. Attack");
							out.println("2. Run away");
							c5 = s.nextInt();
							
							if(c5 == 1)
							{
								hit = 0;
								damage = 0;
								enemHP = 20;
								while(enemHP > 0 && HP > 0)
								{
									if(weapon.equals("defibrilator"))
									{
										hit = (int)(Math.random()*14)+1;
										enemHP -= hit;
										damage = (int)(Math.random()*9)+1;
										HP -= damage;
									}
									else
									{
										hit = (int)(Math.random()*9)+1;
										enemHP -= hit;
										damage = (int)(Math.random()*9)+1;
										HP -= damage;
									}
									
								}
			
								if(HP <= 0)
								{
									out.println("\nThe pirate has defeated you. Game Over.\n");
								}
			
								else if(damage > 0)
								{
									out.println("\nYou defeated your enemy, but took some damage, your HP");
									out.println("ammount is "+ HP + "\n");
									out.println("What do you want to do next?");
									out.println("1. Turn back and go to the holding room");
									out.println("2. Turn back and go to the bunkers");
									c6 = s.nextInt();
								}
			
								else if(damage == 0)
								{
									out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
									out.println("What do you want to do next?");
									out.println("1. Turn back and go to the holding room");
									out.println("2. Turn back and go to the bunkers");
									c6 = s.nextInt();
								}
								
								if(c6 == 1)
								{
									out.println("The hallway leads you to the cockpit, and once you get there you realize that the door is blocked"); 
  									out.println("by a piece of metal on the keypad.\n");
  									if(c2 == 1 || choice == 1)
  									{
  										out.println("You use your crowbar to pry open the door.");
  										out.println("Inside the cockpit is the captain. When he sees you, he approaches you, with an intent to kill");
  										
  										hit = 0;
										damage = 0;
										enemHP = 60;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
											out.println("You have taken control of the ship, congratulations, you win!");
											c6 = s.nextInt();
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
											out.println("You have taken control of the ship, congratulations, you win!");
											c6 = s.nextInt();
  										}
  									
  										else if(!(c2 == 1 || choice == 1))
  										{
  											out.println("You can\'t seem to open the door. ");
  										}
									}
								
									else if(c6 == 2)
									{
										out.println("Walking towards the bunkers another guard appears.\n");
									
										hit = 0;
										damage = 0;
										enemHP = 20;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
  										}
									
										out.println("After defeating the pirate guard you make it to the bunkers where you notice"); 
										out.println("pictures of the crew and their families. You examine some of the pictures and ");
										out.println("see a photo of one of the pirates with his wife and two kids looking happy and quaint.");
										out.println("Lost in the picture you do not notice when a helmet on the floor and trip causing ");
										out.println("a big racket. Leaving the bunkers you enter a corridor glowing green. As you travel ");
										out.println("further down the hall you see escape pods, but you also hear the steps of something coming closer.");
										out.println("A pirate is fast approaching, you rush into the room containing the escape pods to try and escape\n");
										out.println("What do you do?");
										out.println("1. Enter an escape pod");
										out.println("2. Attack");
										c7 = s.nextInt();
									
									if(c7 == 1)
									{
										int podDeath = (int)(Math.random()*9)+1;
										if(podDeath <= 4)
										{
											out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
											out.println("space. Game Over");
										}
										
										else if(podDeath > 4 && podDeath < 7)
										{
											int podSucc = (int)(Math.random()*9)+1;
											if(podSucc <= 5)
											{
												out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
											}
											
											else if(podSucc >=6)
											{
												out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
												out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
												out.println("Game Over");
											}
										}
										
										else if(podDeath >= 7)
										{
											out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
											out.println("and rather than you being sucked into the endless void of space.");
										}
									}
									
									else if(c7 == 2)
									{
										hit = 0;
										damage = 0;
										enemHP = 20;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
											out.println("You attempt to escape the ship by using an escape pod.\n");
											
											int podDeath = (int)(Math.random()*9)+1;
											if(podDeath <= 4)
											{
												out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
												out.println("space. Game Over");
											}
										
											else if(podDeath > 4 && podDeath < 7)
											{
												int podSucc = (int)(Math.random()*9)+1;
												if(podSucc <= 5)
												{
													out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
												}
											
												else if(podSucc >=6)
												{
													out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
													out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
													out.println("Game Over");
												}
											}
										
											else if(podDeath >= 7)
											{
												out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
												out.println("and rather than you being sucked into the endless void of space.");
											}
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
											out.println("You attempt to escape the ship by using an escape pod.\n");
											
											int podDeath = (int)(Math.random()*9)+1;
											if(podDeath <= 4)
											{
												out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
												out.println("space. Game Over");
											}
										
											else if(podDeath > 4 && podDeath < 7)
											{
												int podSucc = (int)(Math.random()*9)+1;
												if(podSucc <= 5)
												{
													out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
												}
											
												else if(podSucc >=6)
												{
													out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
													out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
													out.println("Game Over");
												}
											}
										
											else if(podDeath >= 7)
											{
												out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
												out.println("and rather than you being sucked into the endless void of space.");
											}
  										}
									}
								}
							}
	}
}


	
	
		
							
							/*else if(c5 == 2)
							{
								out.println("The hallway leads you to the cockpit, and once you get there you realize that the door is blocked"); 
  									out.println("by a piece of metal on the keypad.\n");
  									if(c2 == 1 || choice == 1)
  									{
  										out.println("You use your crowbar to pry open the door.");
  										out.println("Inside the cockpit is the captain. When he sees you, he approaches you, with an intent to kill");
  										
  										hit = 0;
										damage = 0;
										enemHP = 60;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
											out.println("You have taken control of the ship, congratulations, you win!");
											c6 = s.nextInt();
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
											out.println("You have taken control of the ship, congratulations, you win!");
											c6 = s.nextInt();
  										}
  									
  										else if(!(c2 == 1 || choice == 1))
  										{
  											out.println("You can\'t seem to open the door. ");
  										}
									}
								
									out.println("you leave the ");
										out.println("Walking towards the bunkers another guard appears.\n");
									
										hit = 0;
										damage = 0;
										enemHP = 20;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
  										}
									
										out.println("After defeating the pirate guard you make it to the bunkers where you notice"); 
										out.println("pictures of the crew and their families. You examine some of the pictures and ");
										out.println("see a photo of one of the pirates with his wife and two kids looking happy and quaint.");
										out.println("Lost in the picture you do not notice when a helmet on the floor and trip causing ");
										out.println("a big racket. Leaving the bunkers you enter a corridor glowing green. As you travel ");
										out.println("further down the hall you see escape pods, but you also hear the steps of something coming closer.");
										out.println("A pirate is fast approaching, you rush into the room containing the escape pods to try and escape\n");
										out.println("What do you do?");
										out.println("1. Enter an escape pod");
										out.println("2. Attack");
										c7 = s.nextInt();
									
									if(c7 == 1)
									{
										int podDeath = (int)(Math.random()*9)+1;
										if(podDeath <= 4)
										{
											out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
											out.println("space. Game Over");
										}
										
										else if(podDeath > 4 && podDeath < 7)
										{
											int podSucc = (int)(Math.random()*9)+1;
											if(podSucc <= 5)
											{
												out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
											}
											
											else if(podSucc >=6)
											{
												out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
												out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
												out.println("Game Over");
											}
										}
										
										else if(podDeath >= 7)
										{
											out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
											out.println("and rather than you being sucked into the endless void of space.");
										}
									}
									
									else if(c7 == 2)
									{
										hit = 0;
										damage = 0;
										enemHP = 20;
										
										while(enemHP > 0 && HP > 0)
										{
											if(weapon.equals("defibrilator"))
											{
												hit = (int)(Math.random()*14)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
											else
											{
												hit = (int)(Math.random()*9)+1;
												enemHP -= hit;
												damage = (int)(Math.random()*9)+1;
												HP -= damage;
											}
									
										}
			
										if(HP <= 0)
										{
											out.println("\nThe pirate has defeated you. Game Over.\n");
										}
			
										else if(damage > 0)
										{
											out.println("\nYou defeated your enemy, but took some damage, your HP");
											out.println("ammount is "+ HP + "\n");
											out.println("You attempt to escape the ship by using an escape pod.\n");
											
											int podDeath = (int)(Math.random()*9)+1;
											if(podDeath <= 4)
											{
												out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
												out.println("space. Game Over");
											}
										
											else if(podDeath > 4 && podDeath < 7)
											{
												int podSucc = (int)(Math.random()*9)+1;
												if(podSucc <= 5)
												{
													out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
												}
											
												else if(podSucc >=6)
												{
													out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
													out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
													out.println("Game Over");
												}
											}
										
											else if(podDeath >= 7)
											{
												out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
												out.println("and rather than you being sucked into the endless void of space.");
											}
										}
			
										else if(damage == 0)
										{
											out.println("\nYou defeated your enemy, your HP ammount is " + HP + "\n");
											out.println("You attempt to escape the ship by using an escape pod.\n");
											
											int podDeath = (int)(Math.random()*9)+1;
											if(podDeath <= 4)
											{
												out.println("As you attempt to enter the escape pod, it releases earlier than expected and you are sucked into");
												out.println("space. Game Over");
											}
										
											else if(podDeath > 4 && podDeath < 7)
											{
												int podSucc = (int)(Math.random()*9)+1;
												if(podSucc <= 5)
												{
													out.println("You have successfully escaped the ship. Congratulations, you have survived. End of Game");
												}
											
												else if(podSucc >=6)
												{
													out.println("You have escaped the ship... but through a faulty pod. The thrusters have gone out and");
													out.println("now you are stuck in the endless void that is space, no means of escape are possible.");
													out.println("Game Over");
												}
											}
										
											else if(podDeath >= 7)
											{
												out.println("As you are messing with the pod to try and escape, the pod ejects. But you manage to hold on");
												out.println("and rather than you being sucked into the endless void of space.");
											}
  										}
									}
								}
							}
							}
  						}
 
  						else if (choice == 2)
  						{
							out.println("Walking towards the bunkers another guard appears.\n");
	
	
							out.println("After defeating the pirate guard you make it to the bunkers where you notice"); 
							out.println("pictures of the crew and their families. You examine some of the pictures and ");
							out.println("see a photo of one of the pirates with his wife and two kids looking happy and quaint.");
							out.println("Lost in the picture you do not notice when a helmet on the floor and trip causing ");
							out.println("a big racket. Leaving the bunkers you enter a corridor glowing green. As you travel ");
							out.println("further down the hall you see escape pods, but you also hear the steps of something coming closer.");
  						}
 
 	 					else if (choice == 3)
 	 					{
  							out.println("The hallway leads you to the cockpit, and once you get there you realize that the door is blocked"); 
  							out.println("by a piece of metal on the keypad.\n");
  							
	  					}

				}
				
				else if(c3 == 2)
				{
					out.println("\nYou enter the medical bay, there are a few medical supplies here.");
					out.println("");
				}
			}
			
			else if(c2 == 2)
			{
				out.println("\nYou enter the medical bay, there are a few medical supplies here.");
				out.println("");
			}
			
		}
		
		else if(c1 == 2)
		{
			
		}
		
		else if(c1 == 3)
		{
			
		}*/
	}


	

							}
  						}
			}  						
				}