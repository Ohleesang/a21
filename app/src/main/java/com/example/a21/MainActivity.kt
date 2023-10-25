package com.example.a21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(x: Int): Boolean {
                var answer = true
                var xToString = x.toString()
                var sum = 0
                //각 자릿수 합구하기
                for(index in 0..xToString.length-1){
                    sum += xToString.get(index).toString().toInt()
                }
                //자릿수 합이 나누어 떨어지는가 판별
                if(x%sum==0) answer = true
                else answer = false

                return answer
            }
        }
        val a = Solution()
        a.solution(10)
        a.solution(12)
        a.solution(11)
        a.solution(13)
    }

}