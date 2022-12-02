My seventh project was to create an Office Manager application 

This project allowed me to develop my own specification analysis skills, as well as making informed design choices. It also brought together all the Java I had learnt the past few months in to creating a well rounded software application.

I was tasked with modelling a network of typical office equipment (a printer, photocopier, scanner, coffee machine and vending machine) along with a monitoring/management tool, which would be able to notify users of the status of the connected pieces of equipment e.g., online, offline or in error state.  

All my machines have a unique alphanumeric code and can all process jobs, with only one job being processed at a time. 

Each job also has a unique and alphanumeric code, an owner who ordered the job, and a description e.g., print document XYZ. The job and machine codes always start with the three letters that describe the type of job/machine, followed by a combination of digits. An example job code would be ‘SCN’ for the scanner. 

All of my machines go online and offline in the same way but setting/resetting the online field. All machines can also reset, to exit from their error state. 

All the machines accept jobs in the same way – if there is no other current job and if the machine isn’t in an error state, the machine is online and the first three letters of the job code match those in the machine code. 

If one of the above first three conditions is not met, the machine remains unchanged. If the fourth condition is broken, the machine will go into an error state and needs to be reset. 

Each machine processes a job in a different way, as below:

Printer: Displays description of the job in the console, then sets job field to null

Copiers: Accepts job with extra data indicating the number of copies to make for that job. Each copy it produces is prefixed counting to the total requested, e.g., for 2 copies. The first output is 1 of 2, the second output is 2 of 2. The copier will set the job field to null once complete 

Scanner: Scanners modify their job to get it ready to be passed on to a printer. Scanners swap the job’s owner with their machine code, replace the first three letters in the job code with PRT and do not set the job to null afterwards. They also have a method to allow clearing the job explicitly.

Coffee and vending machines: These machines check the job’s owner. If it starts with 1, the owner is senior management and gets coffee/food for free. Otherwise, the owner is notified via a message displayed in the console that a standard amount (10p) has been taken out of his/her account as payment for the job. The job is set to null afterwards.

The manager is a digital system running a server that monitors all machines in the office and has the task of supervising the job assignment process. The manager stores a list of all jobs currently active and not yet processed, as well as a record of all available machines. 

The manager also assigns jobs to the first machine found that can perform the job. It also asks the machine to process the job. At the end of the process, all jobs are deleted from the manager's memory. 

I have also included a listener, which is notified whenever the machines goes online, offline or in an error state, it prompts the internal listener to show its description including the new status. The manager is the machine that acts as a listener, and once it receives a notification from a machine in the system, it displays the full description of that machine. 
![image](https://user-images.githubusercontent.com/79163858/205318874-86dac0ba-400e-4255-958f-ebdd7cb1e9a5.png)
