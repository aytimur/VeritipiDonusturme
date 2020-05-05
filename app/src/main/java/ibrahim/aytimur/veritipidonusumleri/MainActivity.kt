package ibrahim.aytimur.veritipidonusumleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Veri Tipi Dönüşümleri
        /*
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
         */
        var sayi1 = 2.4
        var sayi2 = 2
        var yenisayi = sayi1.toInt()
        /*textView.text = yenisayi.toString()*/

        var sayi3 = "5"
        var sayi4 = 2
        var topla = sayi3.toInt() + sayi4
        textView.text = topla.toString()
    }
}
