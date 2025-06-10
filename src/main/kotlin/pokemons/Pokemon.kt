package pokemons

abstract class Pokemon (var hp:Int, name: String){

    abstract val sound: String
    abstract fun makeSound()

    fun attack(enemy: Pokemon){
        enemy.hp -= 10
    }

    fun eat(){
        this.hp++
    }
}