package io.github.fplus

import android.app.Application
import de.robv.android.xposed.callbacks.XC_LoadPackage
import io.github.fplus.core.hook.DouYinMain
import io.github.xpler.HookEntrance
import io.github.xpler.core.wrapper.ApplicationHookStart

class HookInit : HookEntrance<HookInit>(), ApplicationHookStart {
    override val modulePackage: String
        get() = Constant.modulePackage

    override val scopes: Array<ApplicationHookStart.Scope>
        get() = Constant.scopes

    override fun onCreateBefore(lp: XC_LoadPackage.LoadPackageParam, hostApp: Application) {
        //
    }

    override fun onCreateAfter(lp: XC_LoadPackage.LoadPackageParam, hostApp: Application) {
        DouYinMain(hostApp)
    }
}