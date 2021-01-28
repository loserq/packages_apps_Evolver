/*
 * Copyright (C) 2018 The PixelExperience Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolution.settings.buttons;

import android.content.Context;
import com.android.settings.core.BasePreferenceController;

public class ButtonSettingsPreferenceController extends BasePreferenceController {

    public ButtonSettingsPreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public int getAvailabilityStatus() {
        return ButtonSettingsUtils.isAvailable(mContext) ? AVAILABLE : UNSUPPORTED_ON_DEVICE;
    }

}
