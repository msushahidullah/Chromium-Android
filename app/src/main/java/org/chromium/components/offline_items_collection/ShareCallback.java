// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.offline_items_collection;

import android.support.annotation.Nullable;

/**
 * This interface is a Java counterpart to the C++ base::Callback meant to be used in response
 * to {@link OfflineItemShareInfo} requests.
 */
public interface ShareCallback {
    /**
     * @param id        The {@link ContentId} that {@code shareInfo} is associated with.
     * @param shareInfo The {@link OfflineItemShareInfo}, if any, associated with {@code id}.
     */
    void onShareInfoAvailable(ContentId id, @Nullable OfflineItemShareInfo shareInfo);
}