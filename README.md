# Deck-of-cards

Implement class Card containing : enumeration Rank (Ace, 2,3,4,5,6,7,8,9,10, Knight, Queen, King) and enumeration Suit (Clubs, Diamonds, Hearts, and spades). Implement class  Hand which has an array of cards. Hand has methods addCard(Card c), deleteCard(Rank, Suit), sort(), display(). Cards are sorted first by suit and then by rank. If 2 cards are equal raise custom exceptions. Make Hand implement Storable 
Create a new interface, Storable with a method “store(String file)” which writes in a file the attributes of the implementing object. 
