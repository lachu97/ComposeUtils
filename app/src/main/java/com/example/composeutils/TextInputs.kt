package com.example.composeutils

import androidx.compose.foundation.focusable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CustomInput() {
    val bringIntoViewRequester = remember { FocusRequester() }
    var text by remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    TextField(
        value = text,
        onValueChange = {
            text = it
        },

        modifier = Modifier
            .focusRequester(bringIntoViewRequester)
            .onFocusChanged {
                if (it.isFocused) {
                    bringIntoViewRequester.requestFocus()

                }
            }
            .focusable(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Phone,
            imeAction = ImeAction.Done
        ), keyboardActions = KeyboardActions(onDone = {
            keyboardController?.hide()
        })

    )
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Outlinetexty() {
    val bringIntoViewRequester = remember { FocusRequester() }
    var text by remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },

        modifier = Modifier
            .focusRequester(bringIntoViewRequester)
            .onFocusChanged {
                if (it.isFocused) {
                    bringIntoViewRequester.requestFocus()

                }
            }
            .focusable(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Phone,
            imeAction = ImeAction.Done
        ), keyboardActions = KeyboardActions(onDone = {
            keyboardController?.hide()
        })

    )

}

@Composable
fun Mycard() {
    Card() {

    }
}