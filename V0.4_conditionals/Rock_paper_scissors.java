input.onGesture(Gesture.Shake, function () {
    armment = Math.randomRange(0, 2)
    if (armment == 0) {
        basic.showLeds(`
            . . . . .
            . # # # .
            . # # # .
            . # # # .
            . . . . .
            `)
        basic.pause(1000)
    } else if (armment == 1) {
        basic.showLeds(`
            # # # # #
            # # # # #
            # # # # #
            # # # # #
            # # # # #
            `)
        basic.pause(1000)
    } else {
        basic.showLeds(`
            # # . . #
            # # . # .
            . . # . .
            # # . # .
            # # . . #
            `)
        basic.pause(1000)
    }
})
input.onButtonPressed(Button.A, function () {
    score += 1
    basic.showString("wins")
    basic.showNumber(score)
    basic.pause(1000)
})
let armment = 0
let score = 0
score = 0