package com.moez.QKSMS.dagger

import android.app.Application
import android.content.Context
import com.moez.QKSMS.data.repository.ContactRepository
import com.moez.QKSMS.data.sync.SyncManager
import com.moez.QKSMS.util.DateFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(var application: Application) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideDateFormatter(context: Context): DateFormatter {
        return DateFormatter(context)
    }

    @Provides
    @Singleton
    fun provideSyncManager(context: Context, contacts: ContactRepository): SyncManager {
        return SyncManager(context, contacts)
    }

}