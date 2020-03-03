package com.example.android.latihan


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.latihan.databinding.FragmentHitungBinding
import kotlinx.android.synthetic.main.fragment_hitung.*

/**
 * A simple [Fragment] subclass.
 */
class HitungFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding : FragmentHitungBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_hitung, container, false)
        var hasil = 0
        binding.bHitung.setOnClickListener {
            if (binding.etBilangan1.text.isEmpty() || binding.etBilangan2.text.isEmpty()){
                Toast.makeText(context, "DATA TIDAK BOLEH KOSONG!", Toast.LENGTH_SHORT)

            }else{
                val bilangan1 = binding.etBilangan1.text.toString().toInt()
                val bilangan2 = binding.etBilangan2.text.toString().toInt()

                if (binding.rbKali.isChecked){

                    hasil = bilangan1 * bilangan2
                }
                if (binding.rbBagi.isChecked){
                    hasil = bilangan1 / bilangan2
                }
                binding.tvHasil.text = hasil.toString()
            }
        }
        return binding.root
    }


}
