parent_child(joe, bob).
parent_child(joe, tim).
parent_child(joe, nina).
parent_child(emma, bob).
parent_child(emma, tim).
parent_child(emma, nina).

parent_child(clark, jack).
parent_child(mary, jack).

parent_child(bob,  elaine).
parent_child(linda, elaine).

parent_child(jack,  jane).
parent_child(jack,  jenny).
parent_child(nina, jane).
parent_child(nina, jenny).

parent_child(ray,  ryan).
parent_child(ray,  ron).
parent_child(elaine, ryan).
parent_child(elaine, ron).

male(joe).
male(clark).
male(bob).
male(tim).
male(jack).
male(ray).
male(ryan).
male(ron).
female(emma).
female(mary).
female(linda).
female(nina).
female(elaine).
female(jane).
female(jenny).

%Utilities
%X is the base of reference, Eg X is .... of Y
great_grandparent(X,Y) :- parent(X,A), parent(A,B), parent(B,Y), X\= Y.
great_grandchild(X,Y) :- great_grandparent(Y,X), X\= Y.
grandfather(X,Y) :- male(X), grandparent(X,Y), X \= Y.
grandmother(X,Y) :- female(X), grandparent(X,Y), X \= Y.
grandparent(X,Y) :- parent(Z,Y), parent(X,Z), X \= Y.
parent(X,Y):- parent_child(X,Y), X \= Y.
father(X,Y):- male(X), parent(X,Y), X\= Y.
mother(X,Y):- female(X), parent(X,Y), X\= Y.
couple(X,Y):- parent(X, Z) , parent(Y, Z), X \= Y.
daugther(X,Y):- female(X), parent(Y,X).
son(X,Y):- male(X), parent(Y,X).
sibling(X,Y):- parent(Z,X), parent(Z,Y), X \= Y.
brother(X,Y):- male(X), sibling(X,Y), X \= Y.
sister(X,Y):- female(X), sibling(X,Y), X \= Y.
child(X,Y):- parent(Y,X), X \= Y.
cousin(X,Y):- child(X,Parent), sibling(Parent,Sibling), parent(Sibling, Y), X \= Y. 
uncle(X,Y) :- niece(Y,X) ; nephew(Y,X), male(X), X \= Y.
aunt(X,Y) :- niece(Y,X) ; nephew(Y,X), female(X), X \= Y.
grandson(X,Y) :- male(X), grandparent(Y,X), X \= Y.
granddaughther(X,Y) :- female(X), grandparent(Y,X), X \= Y.
brother_in_law(X,Y) :- male(X), couple(X, Couple), sibling(Couple,Y), X \= Y.
brother_in_law(X,Y) :- male(X), sibling(X, Sibling), couple(Sibling, Y), X \= Y.
sister_in_law(X,Y) :- female(X), couple(X, Couple), sibling(Couple,Y), X \= Y.
sister_in_law(X,Y) :- female(X), sibling(X, Sibling), couple(Sibling, Y), X \= Y.
mother_in_law(X,Y) :- female(X), parent(X, Child), couple(Child, Y), X \= Y.
father_in_law(X,Y) :- male(X), parent(X, Child), couple(Child, Y), X \= Y.
niece(X,Y) :- female(X), parent(Parent, X), sibling(Parent, Y), X \= Y.
niece(X,Y) :- female(X), parent(Parent, X), sibling(Parent, Sibling), couple(Sibling,Y), X \= Y.
nephew(X,Y) :- male(X), parent(Parent, X), sibling(Parent, Y), X \= Y.
nephew(X,Y) :- male(X), parent(Parent, X), sibling(Parent, Sibling), couple(Sibling,Y), X \= Y.
son_in_law(X,Y) :- male(X), couple(X, Couple), child(Couple, Y), X \= Y.
daughther_in_law(X,Y) :- female(X), couple(X, Couple), child(Couple, Y), X \= Y.