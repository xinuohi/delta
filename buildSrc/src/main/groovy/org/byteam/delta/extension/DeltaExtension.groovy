package org.byteam.delta.extension

/**
 * @Author: chenenyu
 * @Created: 16/8/18 18:06.
 */
class DeltaExtension {
    /**
     * 是否开启patch
     */
    boolean enable

    /**
     * 对应的版本号
     */
    int versionCode

    /**
     * 指定插件使用的delta版本,默认忽略
     */
    String deltaVersion

    /**
     * 每个dex包含的方法数上限.
     */
    int maxNumberOfIdxPerDex = ExtConsts.DEFAULT_MAX_NUMBER_OF_IDX_PER_DEX

    /**
     * 用户指定mapping文件的路径
     */
    String mapping

    /**
     * 生成patch后自动拷贝到手机rom:/data/local/tmp/delta/
     */
    boolean autoPushPatchToDevice
}