package com.example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

	@Provides
	@Singleton
	SomeClassX provideSomeClassX() {
		return new SomeClassX();
	}
}
