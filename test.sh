#!/bin/bash


cd   /Users/juan/Documents/code/java/leetcode-solutions/  
ORG=/Users/juan/Documents/code/java/leetcode-dusre/leetcode/java/

#for i in `ls -l /Users/juan/Documents/code/java/leetcode-dusre/leetcode/java`
for FILE in  ${ORG}*.java
do
	f="$(basename -- $FILE)"
	echo "$f"
	NEWFILE=/Users/juan/Documents/code/java/leetcode-solutions/$f
	cp $FILE $NEWFILE
	NAME=`cut -d _ -f 1 "$f"`
	low=10
   	hgh=365
   	rand=$((low + RANDOM%(1+hgh-low)))
	git add .
	#echo git commit -m "$(basename -- $f)" --date="$rand day ago"
	git commit -m `echo $f | cut -d '.' -f 1 ` --date="$rand day ago"
	git push 
	
done

