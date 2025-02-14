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

/**
 * VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.
 */
public class VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot extends VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext {


  /**
   * Builder.
   */
  public static class Builder {
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;
    private Long capacity;
    private EncryptionKeyIdentity encryptionKey;
    private SnapshotIdentity sourceSnapshot;

    public Builder(VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot) {
      this.iops = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.iops;
      this.name = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.name;
      this.profile = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.profile;
      this.capacity = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.capacity;
      this.encryptionKey = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.encryptionKey;
      this.sourceSnapshot = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.sourceSnapshot;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profile the profile
     * @param sourceSnapshot the sourceSnapshot
     */
    public Builder(VolumeProfileIdentity profile, SnapshotIdentity sourceSnapshot) {
      this.profile = profile;
      this.sourceSnapshot = sourceSnapshot;
    }

    /**
     * Builds a VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.
     *
     * @return the new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot instance
     */
    public VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot build() {
      return new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot(this);
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
     */
    public Builder sourceSnapshot(SnapshotIdentity sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }
  }

  protected VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceSnapshot,
      "sourceSnapshot cannot be null");
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    capacity = builder.capacity;
    encryptionKey = builder.encryptionKey;
    sourceSnapshot = builder.sourceSnapshot;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

