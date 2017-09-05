To produce simple graphical output for Project 2
(a picture of the solution found by the application),
simply put the desired color-setting and
rectangle-drawing commands in the step() method
of Demo.java (you can of course rename this class).

You have to include Basic.java and Camera.java
in the folder with all your other code.

This setup is intended for simple games and animation,
so it is overkill for our purposes, since all you want
to do is draw the solution once your program has
found it, but that's okay---put your code to do
all the (perhaps very!) time-consuming work in
main before you even bring up the ShowIt application
window, then ShowIt will repeatedly draw the
picture you want to show.

The comments embedded in ShowIt.java should help
you understand easily how to use this setup,
but you can look at Camera.java for full information.

RGB color is used repeatedly here, where any color
desired can be created by using

new Color( redness, greenness, blueness )

with each of the arguments between 0 and 255.
