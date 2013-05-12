#### Objective
This project is an attempt to solve all the scala99 problems at [scala99][id] and provide scala test for each of them. The project uses sbt to build and test using ScalaTest.
[id]: http://aperiodic.net/phil/scala/s-99/ "scala-99"

#### Install SBT
To __install__ sbt on your machine visit.

http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html

#### Add eclipse plugin to import project in eclipse
1. Add __sbteclipse__ to your plugin definition file. You can use either the global one at ~/.sbt/plugins/plugins.sbt or the project-specific one at PROJECT_DIR/project/plugins.sbt:

   <code>addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")</code>

2. In sbt use the command _eclipse_ to create Eclipse project files:  
    ` $ sbt `  
    ` $ eclipse `   

3. In Eclipse use the Import Wizard to import Existing Projects into Workspace.

#### Test
In sbt use the command _test_ to run the test cases for the problems.  
   ` $ test `  
Individual test cases can also be run using Scala IDE. Visit http://scala-ide.org/
to install latest Scala IDE.
