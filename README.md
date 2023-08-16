# Learnings
This Repository contains my learning of new technology. 

1) Declarative and Imperative Programming? <br>
    Declarative -> what program does? <br>
    Imperative -> what program does? + How it does? (step by step instructions)

2) JSX?<br>
   JSX allows to write HTML elements in Javascript. <br>
   It converts HTML tags into react elements. Vue JSX transform is different from React's JSX trasform. <br>
   [check basic difference of react JSX and vue template](https://www.freecodecamp.org/news/reacts-jsx-vs-vue-s-templates-a-showdown-on-the-front-end-b00a70470409/#:~:text=Vue%20takes%20a%20different%20approach,file%2C%20while%20Vue%20templates%20are.)

3) Composable code?<br>
    Instead of writing all the code in one single file, write it in different reusable components.This design pattern allows one     to build applications more quickly and easily

4) IDE- integrated development environment<br>
    It allows you to write code, compile it, run it or debug it 

5) [JDK/JVM/JRE?](https://www.geeksforgeeks.org/difference-between-jdk-and-jre-in-java/)

6) [jshell?](https://www.geeksforgeeks.org/jshell-java-9-new-feature/)

7) Java is  platform-independent(WORA-> write once, run anywhere) language, but JVM is platform-dependent. So, we need to convert Java code to byte code(.class file when you compile your .java file) as JVM understands byte code. Java compiler converts Java code to byte code and gives it to JVM. JVM runs the project based on file dependencies but will start running code from the file having main method of specific signature(public static void main(string args[])). \
    To run Java code written on your machine to others, you will only need JVM+libraries i.e., JRE(this we install on top of OS).. you don't need JDK compulsory.

8) Rendering types in Astro::

Static Site Generation (SSG) 

    Static Site Generation (SSG) within the Astro framework involves the pre-generation of web pages as static HTML during the build process. This results in rapid page loading times and improved search engine optimization (SEO). By generating content ahead of time, server processing during user visits is minimized, enhancing overall performance. The SSG approach emphasizes efficiency and optimized caching mechanisms.

    Server-Side Rendering (SSR)
    
    Server-Side Rendering (SSR) in Astro dynamically generates HTML for each individual user request. This capability enables the delivery of personalized content and real-time updates. With SSR, the server processes data and provides users with up-to-date web pages, making it particularly useful for scenarios where content requires frequent changes or customization. The SSR strategy ensures that content remains current and tailored to user needs.
    
    Client-Side Rendering (CSR)  

     Astro can also generate pages with minimal initial content and then fetch additional data and render additional components on the client-side using JavaScript. This approach provides dynamic interactivity while potentially sacrificing initial load time.
       
   
