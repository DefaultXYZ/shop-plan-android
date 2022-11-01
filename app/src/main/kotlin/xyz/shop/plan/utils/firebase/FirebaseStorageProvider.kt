package xyz.shop.plan.utils.firebase

import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

private const val PRODUCTS_FOLDER = "products"

@Singleton
class FirebaseStorageProvider @Inject constructor(
    private val storage: FirebaseStorage
) {

    suspend fun loadImageDownloadUrl(path: String): String =
        withContext(Dispatchers.IO) {
            storage.reference.child(PRODUCTS_FOLDER).child(path).downloadUrl.await().toString()
        }
}
