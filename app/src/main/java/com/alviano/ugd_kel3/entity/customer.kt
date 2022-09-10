package com.alviano.ugd_kel3.entity

class customer (var nama: String, var password: String, var tanggalLahir: String, var noTelp: String, var email: String){
    companion object{
        @JvmField
        var listOfcustomer = arrayOf(
            customer("Yesi", "yesi", "9 mei 2002", "082285657596", "YesiSugandi900@gmail.com"),
            customer("Willy", "willy", "25 mei 2009", "085385657596", "WillySugandi00@gmail.com"),
            customer("Vino", "vino", "1 agustus 2002", "082277889955", "Vino02@gmail.com"),
            customer("Lala", "lala", "3 april 2002", "082243567844", "Lala22@gmail.com"),
            customer("Yoyo", "yoyo", "4 juni 2000", "082285665424", "Yoyo52@gmail.com"),
            customer("Giovani", "giovani", "13 september 2003", "081883657566", "Giovani11@gmail.com"),
            customer("Jessica", "jessica", "5 mei 2005", "085285757596", "Jessica05@gmail.com"),
            customer("Ricky", "ricky", "10 desember 2002", "082385657506", "Ricky88@gmail.com"),
            customer("Nina", "nina", "11 oktober 2001", "082284637526", "Nina00@gmail.com"),
            customer("Tian", "tian", "28 maret 2004", "082285654586", "Tian23@gmail.com")

        )
    }
}