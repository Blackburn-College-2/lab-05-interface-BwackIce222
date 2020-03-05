Why is this functionality better placed in an interface rather than taking advantage of inheritance?
Since it's only one method, it would be a waste to use inheritance, since a class can only directly subclass a single other class. 
It is better to use an interface because it is more conservitive of freedoms within the program now as well as in the future. 
Ex. Using the interface now would allow us to potentially use inheritance in the future if need be.