package com.example.rickandmortyapp.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.api.model.Character
import com.example.rickandmortyapp.databinding.ItemListBinding
import com.squareup.picasso.Picasso

class CharacterAdapter: RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private var listCharacters = emptyList<Character>()

    class CharacterViewHolder(private val binding:ItemListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(character: Character){
            binding.txtIdCharacter.text = character.id.toShort()
            binding.txtNameCharacter.text = character.name
            Picasso.get().load(character.image).into(binding.imgCharacter)
            binding.txtStatusCharacter.text = character.Status

            itemView.setOnClickListener {view ->
                val action = ListFragmentDirections.actionListFragmentToFilterFragment(character)
                view.findNavController().navigate(action)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(layoutInflater, parent, false)
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(listCharacters[position])

    }

    override fun getItemCount(): Int {
        return listCharacters.size
    }

    fun setCharacters(characters: List<Character>){

        listCharacters = characters
        notifyDataSetChanged()

    }

}