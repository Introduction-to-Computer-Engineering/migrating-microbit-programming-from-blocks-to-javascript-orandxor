input.onButtonPressed(Button.A, function ()
{
    basic.showNumber(input.temperature() * 9 / 5 + 32)
}
)
input.onButtonPressed(Button.AB, function ()
 {
    input.calibrateCompass()
    basic.showNumber(input.compassHeading())
}
)
input.onButtonPressed(Button.B, function () 
{
    basic.showNumber(input.temperature())
}
)
input.onGesture(Gesture.Shake, function () 
{
    basic.showNumber(input.acceleration(Dimension.Strength))
}
)
