input.onButtonPressed(Button.A, function () {
    playerAwins += 1
    basic.showLeds(`
        . . # . .
        . # . # .
        . # # # .
        . # . # .
        . # . # .
        `)
    basic.clearScreen()
})
input.onButtonPressed(Button.B, function () {
    playerBwins += 1
    basic.showLeds(`
        . # # . .
        . # . # .
        . # # . .
        . # . # .
        . # # . .
        `)
    basic.clearScreen()
})
input.onButtonPressed(Button.AB, function () {
    Tie += 1
    basic.showLeds(`
        . # # # .
        . . # . .
        . . # . .
        . . # . .
        . . # . .
        `)
    basic.clearScreen()
})
input.onGesture(Gesture.Shake, function () {
    basic.showString("Wins:")
    basic.showLeds(`
        . . # . .
        . # . # .
        . # # # .
        . # . # .
        . # . # .
        `)
    basic.showString("" + playerAwins)
    basic.pause(2000)
    basic.showString("Wins:")
    basic.showLeds(`
        . # # . .
        . # . # .
        . # # . .
        . # . # .
        . # # . .
        `)
    basic.showString("" + playerBwins)
    basic.pause(2000)
    basic.showString("" + Tie)
    basic.pause(2000)
    basic.clearScreen()
})
let Tie = 0
let playerBwins = 0
let playerAwins = 0
playerAwins = 0
playerAwins = 0
playerAwins = 0
