package com.droidit.mvvmProject.dependencyInjection;

import android.content.Context;

import com.droidit.domain.login_mvvm.datastore.UserDataStore;
import com.droidit.domain.threading.MainThread;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JohannesC on 30-May-16.
 * Main component exposing graphs to rest of app
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context context();

    UserDataStore userDataStore();

    MainThread mainThread();

}
