package com.example.favio.numeromayor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    private var boton_izquierdo: Button? = null
    private var boton_derecho: Button? = null
    private var tv1:TextView? = null
    private var num1: Int = 0
    private var num2: Int = 0
    private var contador: Int = 0
    private var aleatorio = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton_izquierdo = findViewById(R.id.btnIzquierdo) as Button
        boton_derecho  = findViewById(R.id.btnDerecho) as Button
        tv1 =  findViewById(R.id.txt1) as TextView



         num1 = aleatorio.nextInt(10);
         num2 = aleatorio.nextInt(10);

        boton_izquierdo!!.text = num1.toString()
        boton_derecho!!.text = num2.toString()
        while(num1 == num2){
            num1 = aleatorio.nextInt(10);
            num2 = aleatorio.nextInt(10);

            boton_izquierdo!!.text = num1.toString()
            boton_derecho!!.text = num2.toString()
        }
    }


       fun clickIzquierdo(view: View) {

              if(num1 > num2){
                  contador = contador + 1
                  tv1!!.setText(contador.toString())
              }
              else if(num1 == num2){
                  contador = contador
                  tv1!!.setText(contador.toString())
                  num1 = aleatorio.nextInt(10);
                  num2 = aleatorio.nextInt(10);
                  boton_izquierdo!!.text = num1.toString()
                  boton_derecho!!.text = num2.toString()
              }
              else{
                  contador = contador - 3
                  tv1!!.setText(contador.toString())
              }
           num1 = aleatorio.nextInt(10);
           num2 = aleatorio.nextInt(10);
           boton_izquierdo!!.text = num1.toString()
           boton_derecho!!.text = num2.toString()
           while (num1 == num2){
               num1 = aleatorio.nextInt(10);
               num2 = aleatorio.nextInt(10);

               boton_izquierdo!!.text = num1.toString()
               boton_derecho!!.text = num2.toString()
           }

       }
    fun clickDerecho(view: View) {

               if(num2 > num1){
                   contador = contador + 1
                   tv1!!.setText(contador.toString())
               }
               else if(num2 == num1) {
                   contador = contador
                   tv1!!.setText(contador.toString())
                   num1 = aleatorio.nextInt(10);
                   num2 = aleatorio.nextInt(10);
                   boton_izquierdo!!.text = num1.toString()
                   boton_derecho!!.text = num2.toString()
                }
               else{
                   contador = contador -3
                   tv1!!.setText(contador.toString())
               }

            num1 = aleatorio.nextInt(10);
            num2 = aleatorio.nextInt(10);
            boton_izquierdo!!.text = num1.toString()
            boton_derecho!!.text = num2.toString()
        while (num1 == num2){
            num1 = aleatorio.nextInt(10);
            num2 = aleatorio.nextInt(10);

            boton_izquierdo!!.text = num1.toString()
            boton_derecho!!.text = num2.toString()
        }
    }

}
