package mx.edu.itson.practica06_203885
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var bundle=intent.extras
        if(bundle!=null){
            iv_pelicula_img.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_description.setText(bundle.getString("sinopsis"))
        }
    }
}