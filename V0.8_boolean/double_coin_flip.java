let coin1 = false
let coin2 = false
input.onGesture(Gesture.Shake, function () {
    if (coin1 && coin2) {
        basic.showLeds(`
            . # # # .
            . . . # .
            . # # # .
            . # . # .
            . # # # #
            `)
    } else if (coin1 || coin2) {
        basic.showLeds(`
            . . # . .
            . . # . .
            . . # . .
            . . # . .
            . . # . .
            `)
    } else {
        basic.showLeds(`
            . . # . .
            . # . # .
            . # . # .
            . # . # .
            . . # . .
            `)
    }
})
input.onButtonPressed(Button.A, function () {
    coin1 = Math.randomBoolean()
    coin2 = Math.randomBoolean()
})