package xyz.shop.plan.data

import org.junit.Assert.*
import org.junit.Test
import xyz.shop.plan.SampleCreator

class ListedProductTest {

    @Test
    fun `Should create from product`() {
        val catalogProduct = SampleCreator.createCatalogProduct()
        val listedProduct = ListedProduct.from(catalogProduct)
        catalogProduct assertEquals listedProduct
    }

    @Test
    fun `Should create from product with quality`() {
        val catalogProduct = SampleCreator.createCatalogProduct()
        val listedProduct = ListedProduct.from(catalogProduct, sampleQuantity)
        catalogProduct assertEquals listedProduct
    }

    @Test
    fun `Should change quantity`() {
        val expected = 5.0
        val listedProduct = SampleCreator.createListedProduct()
        listedProduct.changeQuantity(expected)
        assertEquals(expected, listedProduct.quantity, 0.0)
    }

    private infix fun Product.assertEquals(other: Product) {
        assertEquals(id, other.id)
        assertEquals(nameResId, other.nameResId)
        assertEquals(imageUrl, other.imageUrl)
        assertEquals(measureUnit, other.measureUnit)
    }

    private companion object {
        const val sampleQuantity = 5.5
    }
}
