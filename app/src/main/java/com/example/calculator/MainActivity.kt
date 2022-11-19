package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val PLUS = "+"
        const val MINUS = "-"
        const val MULTIPLY = "*"
        const val DIVIDE = "/"
    }

    private lateinit var firstValueEditText: EditText
    private lateinit var secondValueEditText: EditText

    private lateinit var plusSign: TextView
    private lateinit var minusSign: TextView
    private lateinit var multipleSign: TextView
    private lateinit var divideSign: TextView
    private lateinit var equalSign: TextView
    private lateinit var dotSign: TextView

    private lateinit var zeroDigit: TextView
    private lateinit var oneDigit: TextView
    private lateinit var twoDigit: TextView
    private lateinit var threeDigit: TextView
    private lateinit var fourDigit: TextView
    private lateinit var fiveDigit: TextView
    private lateinit var sixDigit: TextView
    private lateinit var sevenDigit: TextView
    private lateinit var eightDigit: TextView
    private lateinit var nineDigit: TextView

    private lateinit var signTextView: TextView

    private lateinit var clearTextView: TextView

    private lateinit var resultTextView: TextView

    private var firstValue = ""
    private var secondValue = ""

    private var selectedOperation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setDigitsOnClickListener()
        setSignOnClickListener()
    }

    /**
     *  Пока будем стандартную инициализацию вьюшек
     *  Позже отрефакторим этот код, и будем использовать viewBinding.
     *  ViewBinding облегчает инициализацию, пока необходимо знать и практиковать основные
     *  релизации по андройду
     */
    private fun setupView() {
        firstValueEditText = findViewById(R.id.firstVarEdittext)
        secondValueEditText = findViewById(R.id.secondVarEdittext)

        /**
         *  EditText при фокусе автоматом показывает клавиатуру, так как мы реализовали свои цифры
         *  пока скрываем клавиатуру.
         *  Замени в значение false на true, и увидишь системную клавиатуру
         */
        firstValueEditText.showSoftInputOnFocus = false
        secondValueEditText.showSoftInputOnFocus = false

        /**
         *  Запрашиваем что бы editText был фокусирован
         */
        firstValueEditText.requestFocus()

        /**
         *  Тут мы убрали курсор EditText.
         *  Закоменть эти строки, и посмотри что изменится
         */
        firstValueEditText.inputType = InputType.TYPE_NULL
        secondValueEditText.inputType = InputType.TYPE_NULL

        plusSign = findViewById(R.id.plusSign)
        minusSign = findViewById(R.id.minus)
        multipleSign = findViewById(R.id.multiply)
        divideSign = findViewById(R.id.divideTextView)
        equalSign = findViewById(R.id.equalSign)
        dotSign = findViewById(R.id.dotSign)

        oneDigit = findViewById(R.id.oneTextView)
        twoDigit = findViewById(R.id.twoTextView)
        threeDigit = findViewById(R.id.threeTextView)
        fourDigit = findViewById(R.id.fourTextView)
        fiveDigit = findViewById(R.id.fiveTextView)
        sixDigit = findViewById(R.id.sixTextView)
        sevenDigit = findViewById(R.id.sevenTextView)
        eightDigit = findViewById(R.id.eightTextView)
        nineDigit = findViewById(R.id.nineTextView)
        zeroDigit = findViewById(R.id.zeroTextView)

        clearTextView = findViewById(R.id.claerTextView)

        resultTextView = findViewById(R.id.resultTextView)

        signTextView = findViewById(R.id.signTextView)
    }

    /**
     *  setOnClickListener - листенер который обратбатывает нажатие на вью
     */
    private fun setDigitsOnClickListener() {
        oneDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += oneDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += oneDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        twoDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += twoDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += twoDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        threeDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += threeDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += threeDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        fourDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += fourDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += fourDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        fiveDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += fiveDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += fiveDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        sixDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += sixDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += sixDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        sevenDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += sevenDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += sevenDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        eightDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += eightDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += eightDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        nineDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += nineDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += nineDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
        zeroDigit.setOnClickListener {
            if (firstValueEditText.isFocused) {
                firstValue += zeroDigit.text.toString()
                firstValueEditText.setText(firstValue)
            } else if (secondValueEditText.isFocused) {
                secondValue += zeroDigit.text.toString()
                secondValueEditText.setText(secondValue)
            }
        }
    }

    private fun setSignOnClickListener() {
        plusSign.setOnClickListener {
            selectedOperation = plusSign.text.toString()
            signTextView.text = selectedOperation

            changeFocus()
        }
        minusSign.setOnClickListener {
            selectedOperation = minusSign.text.toString()
            signTextView.text = selectedOperation

            changeFocus()
        }
        multipleSign.setOnClickListener {
            selectedOperation = multipleSign.text.toString()
            signTextView.text = selectedOperation

            changeFocus()
        }
        divideSign.setOnClickListener {
            selectedOperation = divideSign.text.toString()
            signTextView.text = selectedOperation

            changeFocus()
        }
        equalSign.setOnClickListener {
            calculate()
        }
        dotSign.setOnClickListener {
            //потом будем реализовать
        }
        clearTextView.setOnClickListener {
            clearAll()
        }
    }

    /**
     *  Меняем фокус полей для ввода цифр
     */
    private fun changeFocus(){
        if(firstValue.isNotEmpty()){
            secondValueEditText.requestFocus()
        } else if(secondValue.isNotEmpty()){
            firstValueEditText.requestFocus()
        }
    }

    private fun calculate() {
        when (selectedOperation) {
            PLUS -> {
                makePlus()
            }
            MINUS -> {
                makeMinus()
            }
            MULTIPLY -> {
                makeMultiply()
            }
            DIVIDE -> {
                makeDivide()
            }
        }
    }

    private fun makePlus() {
        if (checkValuesAvailable()) {
            val firstValue = firstValue.toDouble()
            val secondValue = secondValue.toDouble()

            val result = firstValue + secondValue
            resultTextView.text = result.toString()
        }
    }

    private fun makeMinus() {
        if (checkValuesAvailable()) {
            val firstValue = firstValue.toDouble()
            val secondValue = secondValue.toDouble()

            val result = firstValue - secondValue
            resultTextView.text = result.toString()
        }
    }

    private fun makeMultiply() {
        if (checkValuesAvailable()) {
            val firstValue = firstValue.toDouble()
            val secondValue = secondValue.toDouble()

            val result = firstValue * secondValue
            resultTextView.text = result.toString()
        }
    }

    private fun makeDivide() {
        if (checkValuesAvailable()) {
            val firstValue = firstValue.toDouble()
            val secondValue = secondValue.toDouble()

            val result = firstValue / secondValue
            resultTextView.text = result.toString()
        }
    }

    private fun checkValuesAvailable(): Boolean {
        return firstValue.isNotEmpty() && secondValue.isNotEmpty()
    }

    private fun clearAll() {
        firstValue = ""
        secondValue = ""
        selectedOperation = ""
        resultTextView.text = ""
        firstValueEditText.setText("")
        secondValueEditText.setText("")
        signTextView.text = ""
        firstValueEditText.requestFocus()
    }
}