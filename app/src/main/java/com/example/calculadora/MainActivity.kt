package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    // Mostra o resultado apertando " = "

    private fun makeCalc(str: String) :String{
        var result: String
        var str  = str.replace(",",".").replace("X","*")
        val hasError:Boolean

        try {
            val calc = ExpressionBuilder(str).build()
            result = calc.evaluate().toString()

        } catch (e: Exception) {
            hasError = true
            result = "Operação inválida:"+ e.message.toString()
        }

        return result.replace(".0","").replace(".",",")
    }

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvBotao0    = findViewById(R.id.tv15) as TextView
        val tvBotao1    = findViewById(R.id.tv9) as TextView
        val tvBotao2    = findViewById(R.id.tv8) as TextView
        val tvBotao3    = findViewById(R.id.tv7) as TextView
        val tvBotao4    = findViewById(R.id.tv6) as TextView
        val tvBotao5    = findViewById(R.id.tv5) as TextView
        val tvBotao6    = findViewById(R.id.tv4) as TextView
        val tvBotao7    = findViewById(R.id.tv) as TextView
        val tvBotao8    = findViewById(R.id.tv2) as TextView
        val tvBotao9    = findViewById(R.id.tv3) as TextView
        val tvVirgula   = findViewById(R.id.tv14) as TextView
        val tvVisor     = findViewById(R.id.tv36) as TextView
        val tvHistory   = findViewById(R.id.tvHistory) as TextView
        val tvClear     = findViewById(R.id.tv20) as TextView
        tvHistory.setMovementMethod( ScrollingMovementMethod());



        //Operadores
        val tvAdicao         = findViewById(R.id.tv12) as TextView
        val tvMultiplicacao = findViewById(R.id.tv10) as TextView
        val tvSubtracao     = findViewById(R.id.tv11) as TextView
        val tvDivisao       = findViewById(R.id.tv17) as TextView

        val tvEqual = findViewById(R.id.tv13) as TextView
        val fifo = ArrayDeque<String>()


        tvEqual.setOnClickListener {


            val visorAtual = tvVisor.text
            var history = tvHistory.text
            val resultado = makeCalc(visorAtual.toString())
            tvVisor.setText(resultado)

            //history = history.toString() + " \n " + visorAtual.toString()
            fifo.add(visorAtual.toString())

            if (fifo.size == 10){
                fifo.removeFirst()
            }
            var texto = ""
            fifo.map{
                texto = it+"\n"+texto
            }
            tvHistory.setText(texto)

        }

        tvAdicao.setOnClickListener {

            val valorAtual = tvVisor.text
            val valorBotao = tvAdicao.text
            val resultado = valorAtual.toString()+" "+valorBotao.toString()+" "
            tvVisor.setText(resultado)
        }
        tvMultiplicacao.setOnClickListener {

            val valorAtual = tvVisor.text
            val valorBotao = tvMultiplicacao.text
            val resultado = valorAtual.toString()+" "+valorBotao.toString()+" "
            tvVisor.setText(resultado)
        }
        tvSubtracao.setOnClickListener {

            val valorAtual = tvVisor.text
            val valorBotao = tvSubtracao.text
            val resultado = valorAtual.toString()+" "+valorBotao.toString()+" "
            tvVisor.setText(resultado)
        }
        tvDivisao.setOnClickListener {

            val valorAtual = tvVisor.text
            val valorBotao = tvDivisao.text
            val resultado = valorAtual.toString()+" "+valorBotao.toString()+" "
            tvVisor.setText(resultado)
        }
        //------------------------------------------------------------------------------------
        tvClear.setOnClickListener {
            tvVisor.setText("")
        }
        tvBotao0.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao0.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao1.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao1.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao2.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao2.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao3.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao3.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao4.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao4.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao5.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao5.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao6.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao6.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao7.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao7.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao8.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao8.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvBotao9.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvBotao9.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }
        tvVirgula.setOnClickListener {
            //Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
            val valorAtual = tvVisor.text
            val valorBotao = tvVirgula.text
            val resultado = valorAtual.toString()+""+valorBotao.toString()
            tvVisor.setText(resultado)
        }



    }
}