# Space Adventure 3398
> Space Adventure 3398 is an arcade style game is developed by Tanner Coker, Lucas Anesti, Brice Ashburn, Erik Cortez, and Eric Figueroa.
> It will feature a main menu with options to: start the game, view the scoreboard, go to settings, and to exit the game. 
> The game will have a space theme and it will be similar to a retro arcade game. The gameplay will consist of the player having basic 
> movements and having to shoot projectiles at the enemies in order to wipe them out. The player will be able to progress through 
> stages and will encounter boss fights and more difficult enemies along their travels. The game will save the top scores of 
> all players across multiple play sessions which is viewable in the scoreboard. Players can also find some settings and will be 
> able to tweak some gameplay settings through a settings area which is on the main menu.
> We're creating this game to further develop our skills as programmers but also it entertaining for anybody to enjoy.
> The audience for Space Advenuter 3398 can be for everyone or people who just want to play a fun arcade style game. 

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
The goal of the project is to make an entertaining game while practicing sound Software Engineering principles in a team.

Here is a picture of our game logo:


![Example screenshot](./images/pixil-frame-0.png)


## Technologies
* Java version 11.0.8 (https://www.oracle.com/java/) 
* Git	version 2.17.1 (https://github.com/team) 
* Sourcetree version 4.0.2 (https://support.atlassian.com/bitbucket-cloud/docs/tutorial-learn-bitbucket-with-sourcetree/)
* Jira (https://www.atlassian.com/software/jira)
* BitBucket (https://bitbucket.org/product)

## Setup
* Follow the hyperlinks listed above to set up your local environment needed.

## Code Examples


* Code is in progess...

## Features


Features list:


* Ship Builder- player will be able to choose and customize their ship for gameplay. Corresponds to Controllabe Character user story


* Cheat Codes- player will be able to tweak gameplay features by inputing a special code with game controls. Corresponds to Cheat/Bonus user story


* Boss Level Difficulty- player will be able to choose difficulty of game before starting. Corresponds to Scalable Difficulty user story


To-do list:


* Design a UML for overall game


* Create the game mechanics


* Create a background (non-thematic)


* Create players/enemies of game


* Create game menu

## Status
Project is: 


* In progess...

## Inspiration
Project inspired by arcade style games.

## Contact
Created by Tanner Coker, Lucas Anesti, Brice Ashburn, Erik Cortez and Eric Figueroa.









# Sprint 1 Review (Assignment 11)



### Brice Ashburn
As a team we all have been working on individual classes and implementations for our end goal for the game. I have been able to finish the bullet class as part to implenmented with my groupmates, there was a few blocks as I fairly new to Java and had to watch many videos to learn about these designs. My team have also completing their work as you can see the back done by Tanner is very high quaily and 
has many aspects to it. As a team we are having to learn SourceTree, BitBucket and Jira on the fly lucky although it still takes up a lot of time it has been interesting to learn. I am still working correcting the hitbox as it has a few bugs still.

### Lucas Anesti
The Design Patterns that will be used for the game have been finalized and the code for the class design have been implemented. In addition, both unit testing for the individual design patterns and integration testing between the patterns have been completed using JUnit. The following two documents demonstrate the progress made:

![Sample UML](./doc/UML/ShipDecorator.jpg)

![JUnit Test Results](./images/testResult.png)

Currently, the code and the documentation is stored under the DesignPatterns branch. The following links can be used to find:

* Documentation: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/doc/UML/

* Source Code: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/src/main/java/SpaceAdventure3398/

* Testing Code: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/src/test/java/SpaceAdventure3398/

The code shows basic application of some of the design patterns and how to use them in reference to the game. The design patterns will become more relevant as we update the game design to include more features. For the time being, that remain a separate and abstract component of the game design process until the initial game units have been implemented and ready to be combined.

Currently, they are not used by the team and not intended to be merged into the Development branch.

To run the code, checkout the 'DesignPatterns' branch, navigate to the directory where the build.xml file is and run the following commands in the specified order: 'ant clean, ant compile, ant jar, ant run'. You should see descriptive output of design patterns and interactions among them.

To run the tests, checkout the 'DesignPatterns' branch, navigate to the main directory, and run the commands 'gradle build' and 'gradle test'. Once the buikld is succesful, the report for the test can be found ubder build/report/tests/test/index.html.


### Tanner Coker
The Background, Stars, and Planets classes have all been added and are working together. Stars and Planets both 
implement interface "SpaceBodies". The background is a Black screen that has white stars and green planets 
moving from the top of the screen to the bottom. Stars and planets change their x/y-cood., size, and speed each
time it is moved back to it's respective y-coord. Additional classes were made as well that include TestRunner
which I used to test run the code and "UpdateThread" which is just an extension of Thread and that is used to 
update the stars and planets on the background. Background will be used to as the main panel that all of the other
objects such as enemies, players, main menu, etc.. will be displayed on. 

![Background_Demo](./images/background.png)

The java files are currently located in the Development branch since I have merged the background branch into it. 

* Source code: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/branch/Development


### Erik Cortez
I've created a few sprites in the development branch which represent the player and enemies or a boss. The sprites will be used in the ship
class which will control how the player and enemy ships move. The ship class is partially complete with some methods but doesn't completely function yet.


### Eric Figueroa
The player and enemy classes have been added but are still having issues. My classes should create the player and enemy but keeps crashing. Should permit movement from left to right of the screen for players and flying abilities at top of screen for enemies. The players and enemy movement/tactics differ from one another also depending on level. Code does not run yet. Still new to developing in java, especially a game with graphics and images.



## Status

* Brice Ashburn: completed.

* Lucas Anesti: completed.

* Tanner Coker: completed.

* Erik Cortez: completed.

* Eric Figueroa: completed.





## Next Steps (Assignment 11)

* Brice Ashburn:The next step for me is to keep working out the bugs on the hitbox and starting to think about a main menu.
		As a team our next step should to continue learning SouceTree and Bitbuck/Jira as well to continue working on parts of the project/game.

* Lucas Anesti: The next steps for me would be to incorporate the design patterns into the running code. This will require combingin and removing code, updating or replacing stubs with code created by teammates, rewriting the javadoc documentation, and redesigning unit and integration testing for the patterns using concrete objects. 

* Tanner Coker: My next step will likely be to add all of the separate moving parts such as enemies and the player to the background.

* Erik Cortez: I plan to work on adding design patterns to the ship class to get it working well, and to add ship sprites as needed. I will also learn how to better understand Sourcetree and Bitbucket.


* Eric Figueroa: The next steps for me would be to get the errors to stop occurring and start combining into other sections of Space Adventures code. This will require further communication with team about how to incorporate each other???s code and possible rewriting and redesigning if needed with testing to ensure that it works smoothly after combining.




## Retrospective (Assignment 11)

### What went well (or not)

* Team: We were able to reach an agreement on game design decisions early on. We have produced artifacts for our project, including design documents and functional game components.

* Team: We developed our own game assets instead of using online assets. As a result, we do not have to worry about copyright issues when we make our game available.

* Team: Games have many components, so it was easy to partition the work among our team members with minimal dependency.

* Team: (Not so well) We do not understand git very well and the git workflow very clearly. We had a few commit and merge conflicts. 

* Brice Ashburn: I was able to find multiple examples online and tutorial videos that really taught me a lot. Our group haas done a great job of communicating almost every day about progress and bugs and meeting times.

* Lucas Anesti: I was able to find some design patterns that are applicable and useful to our game. We believe that the patterns will help us write more flexible, extensible, and thread safe code. However, limited knowledge of design patterns required me to do extensive research on the justification and the implementation of each pattern. As a result, the time spent on completing the tasks exceeds the projected numbers by a large margin. Also issued an incorrect merge on git, so had to hunt down scattered code in multiple commits to recreate certain branches.

* Tanner Coker: I was able to find some sample code that showed a background with moving pieces. I modified my stars and planets class so that I can incorporate some of the ideas that I got by viewing the other project. Originally the classes were extending JPanels and after viewing the other project I had seen that they extended their moving objects from the Rectangles class and so I did that as well with success. However, I did not have a lot of free time to work on the project due to work and other classes so I was very rushed towards the end. Additionally, the java graphics proved more difficult in the beggining than what I thought it would be.

* Erik Cortez: I learned to understand how design patterns work so that I can incorporate them better into my class. I also learned how Bitbucket and Sourcetree help to better organize work. I also learned a bit about designing sprites.

* Eric Figueroa: Things that went well were helping and guiding one another when we would encounter problems on source tree. We are currently still adjusting to new environments.

* Erik Cortez: I learned to understand how design patterns work so that I can incorporate them better into my class. I also learned how Bitbucket and Sourcetree help to better organize work. I also learned a bit about designing sprites

* Eric Figueroa: As a team, things that went well were helping and guiding one another when we would encounter problems on source tree. We are currently still adjusting to new environments.




### What might be Impeding us

* Our schedule conflict is possibly impeding us from performing better. Many of us work on the weekends, so our meetings are held late during some weekdays. In addition,we do not have much experience with game design and implementation. Finally, we are not entirely comfortable with Java, but we feel that it is the best language for the task.




### What can we do to improve

* Team: We will have to find a better way to communicate as expecting to get things done during real-time online meetings is not feasible due to schedule conflicts. While we have not measured it, we only had very few meeting where every teem member was present. This metric indicates that zoom meetings are not the best form of communication and not ideal to achieve our target productivity. We are currently considering improving our communication through slack. A possible metric for success can be counting the number of responses that a message on slack receives. If too few people,say 2 out of 5, are responding on a regular basis, then we can suspect that the communication is not working. In addition we can look at the response time for possibly improving the timing of the communication in the event that responses are posted by everyone but sporadically.

* Team: In the last sprint, we did not update our code regularly on bitbucket, so many of us were unaware on the progress made by the other team members. In this sprint, we can aim for regular updates. One way to ensure this is to ask each member to commit something every time period, say 3 days. The metric will be to count the number of missing commits, which will tell us if we need to reassign team member for load balancing. Some tasks may be harder than others, so the absence of a commit can indicate that our time estimates for completing tasks were off.

* Team: We did not observe the dependencies between our objectives. Though integrating our parts was not the goal, had we originally designed our sprint with the dependencies in mind, we could have assigned team members more dynamically to complete tasks. This approach may possibly help us accomplish more in future sprints as integrating our parts is one of our future goals. For the next sprint, we intend to use the Gantt chart feature available in Jira, and measure the succes of our sprint design both by trying to minimize our task dependencies, and trying to commit to the deadlines of each task as to not delay future tasks. Our metric will be based on actual completion time compared to the deadline set in the Gantt chart.

* Brice Ashburn: To impove what we can do is find more time to meet although many of us have busy schdules. Personally I need to find more to time to reshearch the design and implimenting within Java and in general.

* Lucas Anesti: I spent too much time on this sprint researching and learning design patterns, which did not leave much time for coding. I spent my entire time overcoming a block, so I did not feel as productive for the project as I could have been. In future sprints, I intend to partition my time more evenly. If i find myself facing a block I will see if anyone in my team has expertise to help me resolve the issue. In addition,during the last sprint, I set my tasks in such a way that it was hard to show progress. For example, I had three tasks that were running simultaneously, "implement stubs", "write documentation", and "run tests" for all the design patterns. If I had instead grouped the tasks by individual design pattern and not by task group, it would have been easier to both show progress and observe udpates in the project. As a metric, I will observe the burndown charts and see how evenly my task completions follow the ideal line. In the last sprint, if i had drawn a personal burndown chart, most of my tasks would remain under the line until the last day in the project, where they actually meet the the goal. In this sprint, I will divide the work among the tasks so that the line can be approximated upon task completion.

* Tanner Coker: I need to find more time in my days to work on the code so that I can finish my tasks sooner so that I can provide assistance to other team members when needed as some are not very familiar with Java.

* Erik Cortez: I felt like I spent more time than I should have learning how to solve my code problems in the wrong places, and didn't spend enough time learning how Sourcetree and Bitbucket work. I could have also spent more time understanding concepts before trying to use them. It would also help to ask more questions so that I can get the help that I need. As a team, I believe we could organize group time ahead of time to make deadlines less hectic.

* Eric Figueroa: As a team, for improvement I suggest we could schedule more zoom meetings to discuss project rather than over message. We can also work on updating tasks on Jira to have our burnout reports to be more accurate.  As an individual, for improvement I recommend doing more research on java and look up YouTube videos to learn more about developing games.








# Sprint 2 Review (Assignment 16)

To run the code on command line and launch the main menu of the game:

* Checkout the Development branch.

* Navigate to the /src directory.

* Compile the code using the command: javac *.java

* Run the code using the command: java GameRunner


### Lucas Anesti
The Scoreboard class that keeps track of the current player's score has been created and tested. In addition, the top ten scores maintained by the Scoreboard class are saved into a file and can be displayed in the Main Menu under the Scores button. Unit testing on the class is also complete. 

![Scores in Menu](./images/MenuScoreboard.png)

![Test Results](./images/testResultScoreboard.png)

Currently, the code and the documentation is stored under the Development branch. The following links can be used to find:

* Source Code for the class: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/Scoreboard.java

* Source Code for the tests: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/test/java/SpaceAdventure3398/testScoreboard.java

* Source Code for integration into Main Menu: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/ScoreBoardDisplay.java


For the last source code reference, changes were made to source code made by Tanner Coker's menu interface to display the scores and other menu options. 

### Eric Figueroa
The Player/Enemy class are the main characters in the game and are updated to function properly to window screen now. The enemy is at the top of the screen hovering throughout the game and the player is at the bottom of the screen moving from left to right with key input arrow commands. The .png images are what we created to use for identifying the enemy and player in game.
![Player/Enemy](./images/PlayerEnemyScreen.png)

To run the player/enemy code on command line and launch player/enemy to screen:

* Checkout the Development branch.

* Navigate to the /src directory.

* cd to SpaceAdv3398 folder

* Navigate to the /src directory.

* Compile the code using the command: javac maingame/Game.java

* Run the code using the command: java maingame.Game


Here are links under Development branch to the Game.java and .png images in bitbucket used to create player and enemy class:

* https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/SpaceAdv3398/src/maingame/Game.java

* https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/master/images/ship0(100).png

* https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/master/images/ship1(100).png

### Brice Ashburn
The Bullet class is uploaded under my own branch, along with many other classes needed for the game, the project does run on my machine, as of now only the background shows up as I have been stuck on a error for a while trying to get the player to show up in the JFrame. Which is line 22 in the Player.java class.

Can be found here: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Brice's_Branch/space%20adventure/src/

### Erik Cortez
There are two classes which will be used to detect collision, the ShipProjHitbox and ShipToShipCol (names pending). The classes will give the sprites a rectangle hitbox, which will react to the rectangle hitbox of another ship or a projectile. After a ship is hit, it will either take damage or be eliminated. The laser will disappear after collision.

Code for classes: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/master/src/

### Tanner Coker
The GameRunner has been added and that is what is initially ran to start the game. It will show the main menu on startup which will have buttons to go to the play, scoreboard, settings, or about panels. There is also an exit button which will quit the game. Each of the non-menu display panels will feature a back button that will return you to the main menu. Once the play panel is left it will stop the game from running. The game panel right now only shows our moving background that was completed in sprint 1.

![MainMenu](./images/MainMenu_image.jpg)

* The files are currently under the Development branch in the src/ directory
* compile the code and run GameRunner to see interact with the Main Menu and the various panels.

The code for each class is found under the Development branch and can be found under it's respective name. Here are links to 3 of them:

* Code for the GameRunenr: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/GameRunner.java

* Code for the MainMenu class: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/MainMenu.java

* Code for the PlayRunner: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/Development/src/PlayRunner.java

## Status (Assignment 16)

* Lucas Anesti: completed.
* Brice Ashburn: in-progress.
* Erik Cortez: in-progress.
* Eric Figueroa: completed.
* Tanner Coker: completed.

## Next Steps (Assignment 16)

* Lucas Anesti: Some of the menu features implemented are Component objects in Java but their listeners are currently non-functional. For example, under Settings, the difficulty slides does not affect the game in any way, as gameplay has not yet been implemented. The next step will be to complete these features and integrate them with gameplay. In addition, the Scoreboard class is complete but needs to interface with the Background class once gameplay is implemented. Work on improving CircleCi integration.
* Brice Ashburn: The next is to figure out what other classes the Bullet class will depend on and start to work on those classes to get runnable code to show.
* Erik Cortez: The next step is to make sure that collisions work on ships and projectiles in game during a running session. Most importantly, we need to show that the game itself runs.
* Eric Figueroa: The next step will be to decrease the size of player/enemy on window screen. Also to incorporate the player and enemy to the background class of the game along with along with adding bullets to both classes. Create more aliens for gameplay. Create test cases.
* Tanner Coker: My next step isn't decided yet but I may be working on making the level design so that way there will be stages that the player progresses through. 

### What went well (Assignment 16)

* Lucas Anesti: The implementation of the menu interface by Tanner Coker made it very easy to interface with the code and add the necessary options. The development of the Scoreboard class was relatively straightforward. CircleCi is currently throwing errors on assertions that are accepted locally by gradle.
* Brice Ashburn: Wht went well is that I was able to learn about game mechanics, JFrames in Java,and the game engine, I also was able to get some running code but not exactly what I need.
* Erik Cortez: Being able to connect the ships and projectiles to rectangles makes it easy to detect collision since the intersect code is already supplied and can detect the object intersection.
* Eric Figueroa: Being able to have a stable player and enemy to print to a window screen was much improvement as I???m learning more coding in Java. Sprites for player/enemy created along with key movement of the player to move from left to right.
* Tanner Coker: Once I figured out how to easily switch between two of the JPanels, switching between the other 3 became very easy as it was the same process. Also, I discovered that I could place a .png file on/in a JButton but make the rest of the button invisible which allowed me to get the functionality of the button but also allowed me to decorate the menu and panels.

### What might be Impeding us (Assignment 16)

* For this sprint, midterms and earlier deadlines for projects in other classes prevented many team members from focusing on code development early on. As a result, many of the features were implemented late in the sprint. 

### What can we do to improve

* Lucas Anesti: Currently, my limited knowledge of CircleCi and its environments are preventing me from resolving the continuous integration errors generated every time a member commits. A more thorough look into gradle and CircleCi
* Brice Ashburn: To improve we need to figure how to have code run on all of our systems as we all have diffrent types. Personally I need to learn more Java and more on testing.
* Erik Cortez: I definitely need to learn more Java which will help connect the classes together. It's also important to have the game running soon so that the rest of the work comes more easily.
* Eric Figueroa: Currently, still learning how to use CircleCi for test cases as it is preventing me to create good test cases. Need to look more into that. Researching more in Java would help me improve.
* Tanner Coker: I need to spend more time in the beginning of the sprint when it comes to researching methods for accomplishing my tasks for the sprint. Since I am generally busy I may start research a few days after the sprint starts which may push me back some. In sprint 3 I am going to try and start working on my tasks immediately so that I can assit in other areas of the project.
* Team: To avoid the same time management issues in the next sprint that may be caused by school workload, we need to discuss our schedules and mark any deadlines for each member that may impede progress and delay dependencies.












