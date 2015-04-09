package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule$$ProvideSomeClassXFactory implements Factory<SomeClassX> {
  private final ApplicationModule module;

  public ApplicationModule$$ProvideSomeClassXFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public SomeClassX get() {  
    SomeClassX provided = module.provideSomeClassX();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<SomeClassX> create(ApplicationModule module) {  
    return new ApplicationModule$$ProvideSomeClassXFactory(module);
  }
}

