/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById model.
 */
public class InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById() throws Throwable {
    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModel = new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    String json = TestUtilities.serialize(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModel);

    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModelNew = TestUtilities.deserialize(json, InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.class);
    assertTrue(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModelNew instanceof InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById);
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModelNew.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModelNew.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdModelNew.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByIdError() throws Throwable {
    new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.Builder().build();
  }

}