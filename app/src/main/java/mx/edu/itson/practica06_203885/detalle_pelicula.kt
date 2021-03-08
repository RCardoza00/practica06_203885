package mx.edu.itson.practica06_203885
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var bundle= intent.extras
        if(bundle!=null){

        }
    }
}