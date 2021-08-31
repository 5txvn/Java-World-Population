# **Java World Population** #
[![run on repl.it](https://repl.it/badge/github/exoticchild/Java-World-Population)](https://repl.it/github/exoticchild/Java-World-Population)
<br>

![GitHub Release](https://img.shields.io/github/release/exoticchild/Java-World-Population?style=flat) ![Github All Releases](https://img.shields.io/github/downloads/exoticchild/Java-World-Population/total.svg?style=flat) [![Issues](https://img.shields.io/github/issues-raw/tterb/PlayMusic.svg?maxAge=25000)](https://github.com/tterb/Hyde/issues) 

## *About* ##
Java World Population is a simple Java package that uses the Rapidapi world population api to retrieve data and feed it to the user. *Quick note though, the return type is a string, so if you want to use the world population as an integer, you have to manually convert the value to an integer*
## *Usage* ##
If you want to just try out the package, you can just open the github code editor or click the try on repl.it badge. The basic useage for the package is set up in the Main.java file, but if you want to use this package for personal use, you can just clone this repository, or use the population.java file in the lib folder, then compile it to use it as a package in your own folder. first, import the package by doing this `import world.population;`, then, you can create the population object in your main class like this. `population population = new population();`, and then you can do whatever you want with the object, for example, we can print it by doing this. `System.out.println(population.get());`. Enjoy the package!
<br><br>
*v1.0.0*