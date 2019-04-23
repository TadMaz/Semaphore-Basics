# Make file for Assignment 3
# Tadiwanashe Mazara
# 16 09 2018

LIB = ../lib
SRCDIR = src
BINDIR = bin
TESTDIR = test
DOCDIR = doc

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR):$(JUNIT)

vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java	.class

.java.class:
	$(JAVAC)	$(JFLAGS) $<

all: Barrier.class\
		BThread.class\
		BarrierTest.class\
		
doc: all
	javadoc -d $(DOCDIR) $(SRCDIR)/*.java

run:
	java ~bin/BarrierS/BarrierTest
	
clean:
	@rm -f $(BINDIR)/*.class
	@rm -f doc/*

tar:
	tar -zcvf MZRTAD001.tar.gz makefile README.txt *.java .git