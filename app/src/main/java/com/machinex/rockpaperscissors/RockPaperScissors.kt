package com.machinex.rockpaperscissors

fun main()
{
    var computerChoice = ""
    var playerChoice = ""

    //Prompt user to make a choice among the 3 option, rock, paper or scissors
    println("Rock, Paper or Scissors? What's your choice, pick one...");

    //Capture the player's choice
    playerChoice = readln()

    //Generate a random number between 1 & 3
    val randomNumber = (1..3).random()

    //Comparing random numbers against the RPS
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        else -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    //Comparing user and Comp selections
    val winner = when
    {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else->"Computer"
    }

    //Generating results
    if(winner == "Tie")
    {
        println("It's a tie")
    }
    else
    {
        println( "$winner Won!")
    }
}