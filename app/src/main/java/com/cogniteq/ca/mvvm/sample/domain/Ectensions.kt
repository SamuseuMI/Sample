package com.cogniteq.ca.mvvm.sample.domain

import java.util.*

fun UUID.getId() : String = this.toString().toLowerCase(Locale.getDefault())