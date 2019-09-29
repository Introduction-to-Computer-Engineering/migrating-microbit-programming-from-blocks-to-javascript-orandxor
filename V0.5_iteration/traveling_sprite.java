let sprite = game.createSprite(0, 0)
basic.forever(function () {
    for (let i = 0; i < 4; i++) {
        for (let i = 0; i < 4; i++) {
            sprite.move(1)
            basic.pause(500)
        }
        sprite.turn(Direction.Right, 90)
    }
})
