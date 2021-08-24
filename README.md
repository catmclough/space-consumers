# Space Consumers

I made this weird little game in 2012 as part of CS101 at NYU. The class taught Java and this project was meant to display my understanding of interfaces.

In the game, you are a black hole that consumes other space things.

It's written in Java and using the Processing library's PApplet to draw the visualization, as well as the Minim library to make cool space sounds.

![Moving Triangles](lib/space-ballz.png)

## Running Instructions
- Make sure you are running Java 8 as the processing library doesn't seem to work with anything newer
- Run `mvn clean compile assembly:single` to create a jar with the processing dependency
- Run the jar: `java -jar target/consumers-1.0-SNAPSHOT-jar-with-dependencies.jar`

## A Note About Code Quality

This is one of the first applications I ever wrote, so the code quality is real bad. There are no tests, way too many comments, and plenty of other glaring problems that could be refactored. That being said, I like that this project is a little time-capsule of where I was when I first started learning OO concepts. For that reason, I have not updated the code since 2012.
