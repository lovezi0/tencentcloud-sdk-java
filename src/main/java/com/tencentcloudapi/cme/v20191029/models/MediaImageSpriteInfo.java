/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteInfo extends AbstractModel{

    /**
    * 雪碧图小图的高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 雪碧图小图的宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 雪碧图小图的总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 截取雪碧图输出的地址。
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get 雪碧图小图的高度。 
     * @return Height 雪碧图小图的高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 雪碧图小图的高度。
     * @param Height 雪碧图小图的高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 雪碧图小图的宽度。 
     * @return Width 雪碧图小图的宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 雪碧图小图的宽度。
     * @param Width 雪碧图小图的宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 雪碧图小图的总数量。 
     * @return TotalCount 雪碧图小图的总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 雪碧图小图的总数量。
     * @param TotalCount 雪碧图小图的总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 截取雪碧图输出的地址。 
     * @return ImageUrlSet 截取雪碧图输出的地址。
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set 截取雪碧图输出的地址。
     * @param ImageUrlSet 截取雪碧图输出的地址。
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。 
     * @return WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     * @param WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImageUrlSet.", this.ImageUrlSet);
        this.setParamSimple(map, prefix + "WebVttUrl", this.WebVttUrl);

    }
}

