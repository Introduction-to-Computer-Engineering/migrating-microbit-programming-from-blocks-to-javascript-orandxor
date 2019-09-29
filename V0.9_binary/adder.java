input.onButtonPressed(Button.B, function () {
    decimal = "" + binary + "0"
    basic.showString("binary")
    binary = binary * 2 + 1
})
input.onButtonPressed(Button.A, function () {
    decimal = "" + binary + "1"
    basic.showString("binary")
    binary = binary * 2 + 1
})
let decimal = ""
let binary = 0
binary = 0
decimal = 0
