package hr.foi.air.core.entities

import java.util.*

data class Discount (
    var id: Int? = null,
    var storeId: Int? = null,
    var name: String = "",
    var description: String = "",
    var discountValue: Int = 0,
    var startDate: Date = Date(),
    var endDate: Date = Date()
)