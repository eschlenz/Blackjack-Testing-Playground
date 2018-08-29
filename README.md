# Blackjack-Testing-Playground
A simple Blackjack program that can be used to experiment writing tests for.

This project exists to allow others to practice writing tests. In its current state, the program works if you execute
the Main class. There are 0 tests written for it. Some of the classes were intentionally written in a way that makes
testing them almost impossible, without a little refactoring.

The program to be tested is written in Java. The project is setup to support writing tests in Kotlin, but you can use whatever you'd like.

If you decide you want to practice writing tests for this codebase, please fork the project and work from that.

A little background on the classes in this project:


Card
----

This is a simple representation of a playing card in a standard 52 card deck.

Deck
----

This represents a full set of playing cards. You can either shuffle the deck, or draw a card from it.

Hand
----

This represents the hand a player or dealer is holding while playing the game. There are methods for determining the hand value, whether the hand is "soft", whether the hand is "busted", and also for adding a dealt card to the hand.

Game
----

This is simply the orchestrator of the game logic. It provides methods to walk through a single round of Blackjack in a logical order. It will also output the results of the game to System.out.

Player
----

This represents a player in the game. A player has a Hand, and must be able to choose an Action. Special note: Dealer (below) inherits from Player.

Dealer
----

The Dealer is primarily responsible for taking cards from the Deck and dealing them to the Players. Dealer inherits from Player, because they play the game as well.

PlayerStrategy
----

This class holds logic for which Action to take given the current Hand. There are two implementations of this: SimplePlayerStrategyImpl and DealerStrategyImpl. A Player can use this to help make game-time decisions.

Action
----

An Enum representing Actions a user can take: HIT or STAY

Value
----

An Enum of possible values for a Card, 1 through 11 in the case of Blackjack. The ACE is special in that it is either a 1 or an 11 depending on the state of the Hand.

Suit
----

An Enum of possible Suits for a Card: CLUBS, DIAMONDS, HEARTS and SPADES.

Outcome
----

An Enum of possible Game Outcomes: PLAYER_WINS, DEALER_WINS, and PUSH.

