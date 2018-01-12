package kotlin.belatrix.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Admin on 12/01/2018.
 */
fun ViewGroup.inflate(layoutRestId: Int, attachToRoot: Boolean = false): View {
    var inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutRestId, this, attachToRoot)
}