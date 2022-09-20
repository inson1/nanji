package com.kazufukurou.nanji.model

import java.util.Calendar

interface Time {
  fun getPercentText(value: Int): String
  fun getDateText(cal: Calendar): String
  fun getTimeText(cal: Calendar): String
}
