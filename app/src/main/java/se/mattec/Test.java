package se.mattec;

import android.content.Context;

import se.mattec.truechat.TrueChatApplication;
import timber.log.Timber;

/**
 * Used for testing conversion from Java -> Kotlin. Has no actual functionality.
 */
public class Test
{

    TrueChatApplication application;

    public Test(TrueChatApplication application)
    {
        this.application = application;
    }

    public TrueChatApplication doSomething(Context context)
    {
        Timber.d("something");
        TrueChatApplication trueChatApplication = (TrueChatApplication) context;
        String testingSingleLineIf = 1 > 2 ? "1" : "2";
        return application;
    }

}
