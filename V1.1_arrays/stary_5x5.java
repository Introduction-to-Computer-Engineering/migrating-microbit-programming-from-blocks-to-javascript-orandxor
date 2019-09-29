let list: number[] = []
input.onButtonPressed(Button.A, function () {
    for (let index = 0; index <= list.length - 1; index++) {
        for (let count = 0; count <= list[index] - 1; count++) {
            led.plot(Math.randomRange(0, 5), Math.randomRange(0, 5))
        }
        basic.pause(500)
        basic.clearScreen()
    }
})
basic.forever(function () {
    list = [5, 2, 1, 3, 4]
})
