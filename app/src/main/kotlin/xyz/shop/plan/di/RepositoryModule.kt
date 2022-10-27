package xyz.shop.plan.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import xyz.shop.plan.data.CatalogProductRepository
import xyz.shop.plan.data.CatalogProductRepositoryImpl

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsCatalogProductRepository(catalogProductRepository: CatalogProductRepositoryImpl): CatalogProductRepository
}
