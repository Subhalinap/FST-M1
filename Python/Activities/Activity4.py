player1 = input("Enter Player1's name? ")
player2 = input("Enter Player2's name? ")
while True:

    player1_choice = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    player2_choice = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()


    if player1_choice == player2_choice:
        print("It's a tie!")
    elif player1_choice == 'rock':
        if player2_choice == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif player1_choice == 'scissors':
        if player2_choice == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif player1_choice == 'paper':
        if player2_choice == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    
    if repeat == "yes":
        pass
    # If they say no, exit the game
    elif repeat == "no":
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit