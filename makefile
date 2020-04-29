all: $(wildcard *.java)
	javac -Xlint *.java

clean: 
	rm -f *.class *~ *#
