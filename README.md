# Dijkstra-Algorithm

CS400 Project Three Proposal
GROUP: KD 
RED TEAM (Role: Name - Email):
Data Wrangler: 
Backend Developer
Frontend Developer: 
Integration Manager: 

BLUE TEAM (Role:  Name - Email):
Data Wrangler: 
Backend Developer: Zhi Zheng - 4. zzheng94@wisc.edu
Frontend Developer: 
Integration Manager: 
________________________________________

Project Title: CS Flights

Brief Project Description:

Prompt the user for departure and destination information. And return quickest, cheapest, and shortest(in miles) flight paths.


List of Tasks that this App will Help Users Perform:
1.	Airports users will pass by with such a path.
2.	Take into account miles discounts(in dollars). 
3.	Getting the cheapest flight price based on departure location and destination.
4.	Getting the quickest flight time based on departure location and destination.
5.	Getting the shortest flight distance based on departure location and destination.

________________________________________

Data Wranglers: Muhammad Ismail Ryan Stevenson 
<brief description of the Data Wrangler’s role and responsibilities in this project>
The data wrangler acquires data representing flight paths considering mileage, distance and cost across different airports internationally or domestically. The data wrangler then passes that data in the form of lists to the backend for processing.

Application Data: 
<brief description of what the data being loaded by this program represents>
Nodes represent airports. Need weighted edges for cost, travel time, and distance for flights that connect airports.

Data Format:
<describe the Java Interfaces that expose this data to the code written by other roles>
Use csv files to store information about the airports and their connecting flights. Use a reader to put this information into lists so it is useable for the backend developer.

Data Wrangler Deliverables and Deadline:
<describe how and when your code will be shared with other team roles, note this should be before the group project deadline>
Have a clear idea of how the program will work and how the data will be accessible by the backend by 04/05. Have useable code for the backend ready by 04/09. Have final code ready for a group meeting on 04/11.
________________________________________

Back End Developer: Almann Brague Zhi Zheng 
<brief description of the Back End Developer’s role and responsibilities in this project>
The backend’s responsibilities for this will be to implement the shortest path algorithm to create the paths that fit with the users inputs. It will create shortests paths based on prices, mileage, and flight time. It will do this by getting the data from the data wrangler to be put into nodes into the graph that then will have the algorithm run on it.

Data Processing:
<brief description of the processing that your program will perform on this data, and how it will make use of the shortest path algorithm>
It will take in the data from the data wrangler and create nodes with the data which will be the price, mileage, and time from airport to airport. Then with these nodes in the graph it will create the shortest path between airports based on the users inputs. 

Front End Interface:
<describe the Java Interfaces that expose this functionality to the front end of your application>

The front end interface will include functions to allow users to find the cheapest, shortest, or quickest. Some functions would include getCheapestPath(departure, destination), getShortestPath(departure, destination), getQuickestPath(departure, destination), getAirport( country).

Back End Developer Deliverables and Deadline:
<describe how and when this code be shared with other team roles, note this should be before the group project deadline>

Give dummy class to the front end by Apr. 9. The code will be made available to all other roles by Apr.11. This will give the other team members enough time to test our actual implementation, rather than just dummy test objects. Plus this deadline in mind gives us a time cushion just in case it takes longer than expected. If either of us have issues we can’t solve ourselves, we can communicate via text, or contact our TA.

________________________________________

Front End Developer: Brenna Buck Alan Jordao Cortez 
<brief description of the Front End Developer’s role and responsibilities in this project>
Main role will be in user interaction and display. Ask the user for their departure location and desired destination(s). 
Display cheapest path(with list of airports in the path)
Display shortest(in miles) path(with list of airports in the path)
Display quickest(time) path(with list of airports in the path)

Integration with Back End:
We will get the 3 shortest paths(one based in price, one in miles, and one in quickest) from departure city to destination(city). 

User Commands:
User will use make command to start the project. Program will then prompt the user with questions acceptable answers. 
Q: Where are you travelling from?
Q: Where are you going to?
Q: Do you have any discounts? 


Front End Developer Deliverables and Deadline:
Code written and running by Apr 11. Our code will be made available to all other roles by the 11th. This will give the Integration Managers a couple days before the hard deadline to combine team member’s code and check that the entire program compiles and functions.


________________________________________

Integration Manager: Minyi Li Jack Gundrum 
<brief description of the Integration Manager’s role and responsibilities in this project>
Tasks: 
1.	The integration manager is available for his teammates to ask any early questions about integration and development of the dummy classes.
2.	Combine all of the classes together in a makefile
3.	Video demonstration
4.	Manages other team members to make sure we are staying on task
5.	Provide additional help to any other roles if needed

Integration Milestones (team blue):

Due date: 04/05 emails, snapchat, meeting(if needed)
Milestone 1
Tasks: 
1.	Data Wranglers/Backend/Frontend will have dummy classes set up
2.	Data Wranglers/Backend/Frontend will have test outlines for them to test their final product
3.	Frontend will be available for help/for any questions
4.	Frontend will start to familiarize themselves with their teammates classes
5.	Clear any question that developers have after a few days of working on their implementations.
6.	Explain how each part of the system works and talk about how to integrate each part
Due date: 04/08 Data Wrangler send files to everyone
Milestone 1.5
Tasks: 
1.	Data Wrangler will have their code finished and tested so the backend can use their data to understand their methods better

Due date: 04/11 Files and shared & Meeting on zoom to show functionality
Milestone 2
Tasks: 
1.	Backend/Frontend code will have passed all of their tests and it will be ready to integrate via integration manager
2.	Developers and Data Wranglers try to run each part individually in the meeting.
3.	The Integration Manager begins to integrate.
4.	The remaining integration questions will be discussed.
Final due date: 04/13 Integration manager confirms everything is working 
Milestone 3 
Tasks:
1.	Test project to make sure all bugs are fixed
2.	The Makefile will be working with all the files properly implemented together
3.	The integration manager shows the team the process to run the whole system.
4.	README.txt files will be completed
5.	Integration manager creates & finishes the demonstration video


Integration Milestones (team red):
<list brief summaries for the team’s internal deadlines through the final week of this project’s development>

Data wrangler collects data of airlines, airports, and countries. Then write code for building up all information that can be used by the back end and front end.
Back end and front end tried to write some code that does not depend on the data wrangler’s code. Then use dummy code to implement data wrangler’s code if there is more time.
Due date: 04/08 (or 04/09 if extra time is required)

Data wrangler will finish the code and send it to both backend and frontend. Then backend and frontend will complete the part that needs to implement data wrangler’s code and clear all bugs.
Due date: 04/11 (or 04/12 if extra time is required)

Integration manager will combine all classes to do the final check. All other group members should send their classes and README file to the integration manager, and the integration manager records the demonstration video.
Due date: 04/13 (or earlier if everyone finish their work early)


Demonstration Video:
<describe how you plan to demonstrate the capabilities of your application in the final demo video for this project>
For the final demo video we will have the integration manager run through how the final application works. We will do this through screen sharing and a live camera of the integration manager who will be explaining each step of the process. To start we will introduce the initial home screen of the application and run through the options the user has. Then from there we will navigate through the program showing off the different functions of the application. These functions will show how users can interact with the application to select the airpots, airplanes, and countries, and this application will give a list of airlines that fit the condition. Once this recording is complete we will upload the final viddeo to FlipGrid.

________________________________________

Additional Responsibilities and Notes:
<list by role, any additional responsibilities that are expected of team members to help balance the workload for this project… if you are concerned about your project being too simple or too involved, this is also a good place to suggest plans for expanding or contracting your main idea>

-	Generally for all roles try to meet their given deadlines. If you are having difficulties ask the person who has the same role as you, or ask our TA, Keren, to see if he can help.
-	Data wrangler obtains data from online sources to find flight mileage, price, and flight time
-	Backend obtains data from data wrangler and finds the quickest route to the destination which is based on either mileage, price, and flight time
-	Front end writes the code which will prompt the user for interaction. In order to find the shortest mileage, shortest time, or lower cost they will utilize the backend’s shortest path algorithm
-	Every role should stick to what it says on their giving canvas page on what to do. Doing so will allow the workflow to be evened out. The instructors assign these roles for a purpose, and we know that we will be given different roles each project. Therefore, if we each do what it says on our role’s page, for each project, it is likely that all will have done roughly the same amount of work(specifically in the different projects where it seems like role A did way less work than role B, switching roles evens it out). Help from other team members is always appreciated though. For example, If someone is the Integration Manager role they can suggest their own helpful tactics to other roles should they need it. 
 
________________________________________

Team Signatures:

Each team member must type their own name and current date in place of one of the blanks below, to confirm their contributions and agreement to the proposal described above.

Zhi Zheng 03/29/21
________________________________________
End of Proposal


