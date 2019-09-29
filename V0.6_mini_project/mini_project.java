/* button masher

at times there is a need
to see how fast a person
can mash buttons in games.


the basic code has no semicolines???
*/
let Acount = 0 
let Bcount = 0 
input.onButtonPressed(ButtonA,fuction()
{
Acount++
}
)



input.onButtonPressed(ButtonB,fuction()
{
Bcount++
}
)

inputonGesture(gesture.Shake,function()
{
basic.showString("a count")
basic.showString("" + Acount)
basic.pause(500)

basic.showString("b count")
basic.showString("" + Bcount)
basic.pause(500)

}
)