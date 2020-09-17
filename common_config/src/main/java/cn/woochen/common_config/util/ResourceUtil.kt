package cn.woochen.common_config.util

import cn.woochen.common_config.base.BaseApplication


/**
 * 资源文件工具类
 * @author woochen123
 * @time 2017/8/31 11:25
 * @desc
 */
object ResourceUtil {

    /**
     * 通过资源文件找到对应文字
     * @param resId
     * @return
     */
    fun getString(resId: Int): String {
        return UiUtils.getContext().resources.getString(resId)
    }


    /**
     * 通过资源文件找到对应文字
     * @param resId
     * @return
     */
    fun getColor(resId: Int): Int {
        return UiUtils.getContext().resources.getColor(resId)
    }
}
