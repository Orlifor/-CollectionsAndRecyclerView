package at.fh.swengb.kotlinandclasses

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))

        for (item in list) {
            Log.i("MainActivity", "${item.calculateArea()}")
        }

        val lion = Lion("Lannister", 200, 50, true)
        val dragon = Dragon("Targaryen", 250, 40, true)
        val player = Player(10, 2, "WinOrDie", 300, 80, true)

        lion.attack(dragon)
        lion.attack(player)
        dragon.attack(lion)
        dragon.attack(player)
        player.attack(dragon)
        player.attack(lion)
        player.attack(lion)
    }
}
