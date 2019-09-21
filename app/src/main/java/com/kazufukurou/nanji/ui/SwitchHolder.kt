/*
 * Copyright 2019 Artyom Mironov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kazufukurou.nanji.ui

import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.kazufukurou.anyadapter.AnyHolder
import com.kazufukurou.nanji.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item.*

class SwitchHolder(parent: ViewGroup) : AnyHolder<SwitchItem>(parent, R.layout.item), LayoutContainer {
  override val containerView: View = itemView

  init {
    containerView.setOnClickListener {
      currentItem.property.set(!currentItem.property.get())
      onBind(currentItem)
    }
    textSubTitle.isVisible = false
    switchValue.isClickable = false
  }

  override fun onBind(item: SwitchItem) {
    textTitle.setText(item.title)
    switchValue.isChecked = item.property.get()
  }
}