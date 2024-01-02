package com.example.loginkotlintest_watereel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginkotlintest_watereel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginBtn.setOnClickListener {
            val inputId = binding.idEdt.text.toString()
            val inputPw = binding.passwordEdt.text.toString()

            // 아이디입력값, 비번 입력값 을 각각의 변수에 저장
            // 두개의 변수에 들어있는 값 검사. (맞는 아이디/비번)
            // 맞을때 => 틀릴때 분기처리
            val name = "watereel"
            if (inputId == "admin@test.com" && inputPw == "qwer"){
                Toast.makeText(this,"${name} 관리자입니다.",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }
    }
}