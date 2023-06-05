# DiskSim: A Disk Scheduling Algorithm Simulator

This program is a Disk Scheduling Algorithm Simulator developed by 3 third-year Computer Science students (FMS STUDIOS) as a group project for CMSC 125. It is also built using Java language and the GUI is constructed using Netbeans IDE.

## Acknowledgements

 - [The Plan - Upbeat Loop](https://freesound.org/s/384947/) by [ispeakwaves](https://freesound.org/people/ispeakwaves/)


## Deployment

1. (Preferably) Install the latest version of Java SDK and Java JRE. 
2. In your console of choice, change directory to the folder where the `.jar` file or `.exe` file named Folio is located. 
3. Run the the program using the commands listed below depending if you use the `.jar` file or the `.exe` file (Windows).

### Jar File Execution
1. For other OS with Java installed, type the following: `java -jar DiskSim.jar`

### Exe File (Windows users only)
1. Simply type the following: `start DiskSim.exe`

###
You can also run the jar and/or exe files by simply opening either of the files.


## Test Case File Format

For the import file format, two parameters are needed: Queue and Head. Queue
is the list of space separated numbers from 0 to 199, inclusive. Head is the 
location of the disk head which can be located from 0 to 199, inclusive. It 
is never required to have one of the queue numbers as the location of the head.
Example of the format is found at DiskSim-Testcase.txt.

Sample example :

Queue: 10 20 30 40 50
Head: 3

## Export File Directory Format

Based on the given template in the input bar, the format is given as
an example: C:/Folder1/Folder2

There are two optons: PDF to PNG format. The saved file has a default
filename of this format: mmddyyyy-hhmmss_DS.(pdf or png)

Examples:
12072020-120730_DS.pdf
06072023-120745_DS.png

## Authors

- [@FrancisEspina](https://github.com/FrancisEspina)
- [@shannaurelle](https://github.com/shannaurelle)
- [@KianventeR](https://github.com/KianventeR)


## Dependencies

The program requires:

- Atleast [JDK 16.0.1](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)
- [iTextPDF](https://github.com/itext/itextpdf/releases?after=5.5.13.2)
