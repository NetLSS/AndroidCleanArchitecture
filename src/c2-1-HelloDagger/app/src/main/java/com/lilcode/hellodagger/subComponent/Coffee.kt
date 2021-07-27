package com.lilcode.hellodagger.subComponent

import javax.inject.Inject

class Coffee @Inject constructor(coffeeBean: CoffeeBean, water: Water) {
}