class Membership {                //how many members will be applying
                             //price of each membership

Membership();   

int price;  
int members;                  //constructor for membership class



}

import java.util.Scanner;

public static void main(String args[])
{

Membership premium = new Membership();
Membership budget = new Membership();

premium.price = 40;
budget.price = 15;


System.out.println("How many people in your family will be getting memberships today?");

Scanner input = new Scanner(System.in);
int people = input.nextInt();


(int x = 0; x < people; x++)
{

System.out.println("Type "A" if you would like the premium membership and type "B" if you would like the budget membership.");

Scanner input = new Scanner(System.in);

char m = input.nextChar();


switch(m){

case 'A': System.out.println("You chose the premium membership!");
break;

case 'B': System.out.println("You chose the budget membership!");
break;

default: System.out.println("Invalid choice. Please input A or B.");

}

input.close();



}

int premRates;
int budgetRates;

premRates = premium.price * premium.members;
budgetRates = budget.price * premium.members;

System.out.println("The price of all of the premium memberships would be ") + premRates + (". ");

System.out.println("The price of all of the budget memberships would be ") + budgetRates + (". ");

}



void getMembers(int m)
{
m = members;
}         
void getPrice(int p)
{
p = price;
}
