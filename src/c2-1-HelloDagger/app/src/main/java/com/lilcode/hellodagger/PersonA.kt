package com.lilcode.hellodagger

import javax.inject.Inject

class PersonA @Inject constructor(val name: String, val age: Int)