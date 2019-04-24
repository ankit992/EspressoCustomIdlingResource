package `in`.co.ankitarora.customidlingresource

import android.app.IntentService
import android.content.Intent
import java.lang.Thread.sleep

class NumberIntentService : IntentService("NumberIntentService") {
    override fun onHandleIntent(p0: Intent?) {
        val input = p0?.getIntExtra("Hello", 0)
        sleep(10000)
        val outputValue = input?.plus(1)
        val outputIntent = Intent("output")
        outputIntent.putExtra("output", outputValue)
        sendBroadcast(outputIntent)
    }

}