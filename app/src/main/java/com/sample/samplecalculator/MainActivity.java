package com.sample.samplecalculator;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.sample.samplecalculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private double firstNum = Double.NaN;
    private double secondNum;
    private boolean equalClicked = false;
    private String operator = "";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.editText.setText("");

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText("");
            }
        });
        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("0");
            }
        });
        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("1");
            }
        });
        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("2");
            }
        });
        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("3");
            }
        });
        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("4");
            }
        });
        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("5");
            }
        });
        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("6");
            }
        });
        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("7");
            }
        });
        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("8");
            }
        });
        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput("9");
            }
        });
        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleInput(".");
            }
        });
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleOperation("+");
            }
        });
        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleOperation("-");
            }
        });
        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleOperation("/");

            }
        });
        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleOperation("*");
            }
        });
        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNum = Double.parseDouble(binding.editText.getText().toString());
                double result = Double.NaN;
                if (!Double.isNaN(firstNum)) {
                    switch (operator) {
                        case "+":
                            result = firstNum + secondNum;
                            break;
                        case "-":
                            result = firstNum - secondNum;
                            break;
                        case "/":
                            result = firstNum / secondNum;
                            break;
                        case "*":
                            result = firstNum * secondNum;
                            break;
                    }
                }
                operator = "";
                equalClicked = true;
                firstNum = Double.NaN;
                DecimalFormat df = new DecimalFormat("#.####");
                if (Double.isNaN(result)) {
                    binding.editText.setText("");
                } else {
                    binding.editText.setText(df.format(result));
                }
            }
        });
    }

    private void handleOperation(String inputOperation) {
        if (operator == "") {
            firstNum = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText("");
        }
        operator = inputOperation;
        equalClicked = false;
    }

    private void handleInput(String s) {
        if (equalClicked) {
            binding.editText.setText("");
        }
        binding.editText.setText(String.format("%s%s", binding.editText.getText(), s));
        equalClicked = false;
    }
}
