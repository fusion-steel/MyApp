package example.myapp

class Shark(fishColor: FishColor = GrayColor):
    FishAction by PrintingFishAction("hunt and eat fish"),
    FishColor by fishColor {
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor {
}

object GoldColor: FishColor {
    override val color = "gold"
}

object GrayColor: FishColor {
    override val color = "gray"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}