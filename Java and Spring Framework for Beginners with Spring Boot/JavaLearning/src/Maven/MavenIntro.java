package Maven;

public class MavenIntro {
	// maven is project management tool
	// when you build a project, you need to compile it, run it, test it, packaging
	// it and deploy it -> this all can be done using IDE.

	// sometimes you need external libraries(JAR files) while performing above
	// steps. e.g., to connect your code to database, you need connector.

	// some requirements(connect to hibernate) need more than one jar files while
	// some needs only one. to add jar files/libraries in your project you can
	// manually download
	// required jar files and add to your project. sometimes one library depends on
	// other library and jar files for other library will also be needed. Though
	// this is one time downloading and setting up thing, it is hectic and what if
	// you want to upgrade it in future? you will need to do this downloading again.

	// when you give your project to others to work on, they will also need to make
	// sure about all the dependencies and their versions.

	// what if above all the process can be done using some tool. -> Maven, gradle
	// etc

	// how to get maven?
	// 1) you can install maven locally, set path and access it from CommandLine.
	// 2) use maven using your IDE

	// Archtypes? -> existing templates. you can use existing one or can also create
	// one.

	// to add dependency -> add in pom.xml
	// you can get you dependency from mvnrepository.com

	// In pom.xml file, groupId, artifactId and version is mentioned. So, when you
	// create package of your project, your jar file can be downloaded using these
	// groupId, artifactId and version

	// Plugins are tools that provide additional functionality to Maven during the
	// build process.
	// They are also declared in the pom.xml file, but in a different section called
	// <build> and <plugins>.
	// Plugins are responsible for tasks such as compiling code, running tests,
	// packaging artifacts, deploying, etc.
	// Plugins are executed at specific phases of the Maven build lifecycle.

	// though you don't mention any plugins in pom.xml, you can do all the things,
	// i.e., there are other settings in maven which are not visible to us in
	// pom.xml. In other words, There is some super POM/ effective POM.xml(other
	// configuration + your configuration).
	// Whatever you change in POM.xml, it will also affect super POM/effective POM.

	// how to get effective POM ? -> different ways for different IDEs.

	// how maven works(dependency perspective)? -> When you ask maven to download
	// dependencies, it first searches for that in local machine in m2/repository
	// folder. if it is not there, then only it will go to maven central to download
	// them from remote.
	// everytime maven download dependency from remote, it puts copy of that inside
	// m2/repository folder to avoid future downloading.
	// also you should ensure that you are using safe version for your
	// dependency. you cannot rely on remote all the time. so, big companies
	// maintain
	// their own repository and put safer version of dependencies there, which can
	// be used in other all projects and update them regularly with new safer version

}
