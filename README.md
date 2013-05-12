
This project is an attempt to solve all the scala99 problems at
http://aperiodic.net/phil/scala/s-99/

and provide scala test for each of them. The project uses sbt to build and test.

To install sbt on your machine visit

http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html

Add sbteclipse to your plugin definition file. You can use either the global one at ~/.sbt/plugins/plugins.sbt or the project-specific one at PROJECT_DIR/project/plugins.sbt:

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")
In sbt use the command eclipse to create Eclipse project files:

> sbt
> eclipse

In Eclipse use the Import Wizard to import Existing Projects into Workspace

In sbt use the command test to run the test cases for the problems

> test

Individual test cases can also be run using Scala IDE. Visit http://scala-ide.org/
to install latest Scala IDE.