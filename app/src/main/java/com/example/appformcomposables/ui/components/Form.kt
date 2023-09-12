package com.example.appformcomposables.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appformcomposables.ui.model.originslist

@Composable
fun Form() {
    val name = remember { mutableStateOf("") }
    val phone = remember { mutableStateOf("") }
    val comments = remember { mutableStateOf("") }

    Column(
        Modifier.padding(15.dp, 18.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        //Nome
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Nome") }
        )

        //Telefone
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = phone.value,
            onValueChange = { phone.value = it },
            label = { Text("Telefone") }
        )

        //Origem
        SpinnerSample(
            originslist,
            preselected = originslist.first(),
            onSelectionChanged = { },
            modifier = Modifier.fillMaxWidth()
        )

        //Data de Contato (Date)
        DatePickerSample()

        //Observação
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            maxLines = 4,
            value = comments.value,
            onValueChange = { comments.value = it },
            label = { Text("Comments") }
        )

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            ExtendedFloatingActionButton(onClick = {/*TODO*/},
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Register", fontSize = 16.sp, modifier = Modifier.padding(10.dp, 4.dp))
            }

            ExtendedFloatingActionButton(onClick = {/*TODO*/},
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Cancel", fontSize = 16.sp, modifier = Modifier.padding(10.dp, 4.dp))
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun FormPreview() {
    Form()
}