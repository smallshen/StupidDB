package club.eridani.stupiddb

abstract class Database<K, V> : MutableMap<K, V> by hashMapOf<K, V>()