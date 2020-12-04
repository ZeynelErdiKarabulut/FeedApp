/*
 * Copyright (c) 2020 Zeynel Erdi
 */

package com.feedapp.app.data.interfaces


interface ViewPagerPageListenerCallback {
    fun updateDayAndDate(position: Int)
    var scrollState: Int
    var isResettingDateOrSwiping: Boolean
}
