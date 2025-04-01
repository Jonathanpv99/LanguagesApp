package com.achojkisoft.languagesapp.languages

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

data class LanguageStore(private val contex: Context){

    companion object{

        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("indexLang")
        val INDEX_LANG = intPreferencesKey("index_lang")
    }

    val getIndexLang: Flow<Int> = contex.dataStore.data
        .map { preferences ->
            preferences[INDEX_LANG] ?: 0
        }

    suspend fun saveIndexLang(index: Int){
        contex.dataStore.edit { preferences ->
            preferences[INDEX_LANG] = index
        }
    }
}
