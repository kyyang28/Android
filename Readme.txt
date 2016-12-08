
/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
/* +----------------------------------------------------------------------------- Begin of Procedures to upload programs from Github ------------------------------------------------------------------------------------ */
/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

/* Initialise a git repository, ONLY EXECUTED ONCE */
git init

/* Add all files to a temporary storage */
git add -A

/* Label */
git commit -m "Android LED APP, v1"

/* Check log info */
git log --pretty=oneline

/* Tag to a commit id */
git tag v1

/* Check tags */
git tag

/* EXECULTED FIRST TIME, ONLY ONCE */
git remote add origin git@github.com:kyyang28/Android.git

/* Submit to Github */
git push -u origin master

/* Submit tag to Github */
git push origin --tags

/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
/* +------------------------------------------------------------------------------- End of Procedures to upload programs from Github ------------------------------------------------------------------------------------ */
/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
/* +------------------------------------------------------------------------- Begin of Procedures to download programs from Github ------------------------------------------------------------------------------------ */
/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

To download programs from Github, run the following command in Git Bash

/* First time to download the Android programs, run the following ONLY ONCE */
git clone https://github.com/kyyang28/Android.git

/* The folder which downloaded above is called Android, we need to go inside this folder in order to execute the rest of the commands otherwise fatal error will be generated */
cd Android

/* If the programs are modified later on, run the following command to update the contents of the programs */
git pull origin

/* [OPTIONAL] if we want to check the log info, run the following command */
git log --pretty=oneline

/* [OPTIONAL] if we want to check the tag labels, run the following command */
git tag

/* Check out a specific tag label (in this case, v1), run the following command */
git checkout v1

/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
/* +------------------------------------------------------------------------------ End of Procedures to download programs from Github --------------------------------------------------------------------------------- */
/* +---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */



/*
 *	@description  Android LED App program
 *	@version 	v1 - android studio generated program
 *					v2 - added button and checkboxes 
 */
1. 	APP_0001_LEDDemo
	
	