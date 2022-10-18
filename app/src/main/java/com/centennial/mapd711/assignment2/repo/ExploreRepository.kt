package com.centennial.mapd711.assignment2.repo

import com.centennial.mapd711.assignment2.model.ProductModel

class ExploreRepository {

    fun getIphoneList(): ArrayList<ProductModel> {
        val list = ArrayList<ProductModel>()
        list.add(
            ProductModel(
                "iPhone 14",
                "14",
                "https://www.bell.ca/Styles/wireless/iPhone14Details/iPhone_14_Blue_5G_plus_lrg1.png"
            )
        )
        list.add(
            ProductModel(
                "iPhone 14 Max ",
                "14",
                "https://www.bell.ca/Styles/wireless/iPhone14Details/iPhone_14_Blue_5G_plus_lrg1.png"
            )
        )
        list.add(
            ProductModel(
                "iPhone 14 Pro",
                "14",
                "https://www.bell.ca/Styles/wireless/iPhone14Details/iPhone_14_Blue_5G_plus_lrg1.png"
            )
        )


        return list
    }


    fun getSamsungList(): ArrayList<ProductModel> {
        val list = ArrayList<ProductModel>()
        list.add(
            ProductModel(
                "Galaxy S22",
                "650",
                "https://images.samsung.com/levant/smartphones/galaxy-s22-ultra/buy/S22_Ultra_ProductKV_Burgundy_MO.jpg"
            )
        )
        list.add(
            ProductModel(
                "Galaxy S22 Ultra ",
                "800",
                "https://images.samsung.com/levant/smartphones/galaxy-s22-ultra/buy/S22_Ultra_ProductKV_Burgundy_MO.jpg"
            )
        )
        list.add(
            ProductModel(
                "Galaxy Z",
                "230",
                "https://images.samsung.com/levant/smartphones/galaxy-s22-ultra/buy/S22_Ultra_ProductKV_Burgundy_MO.jpg"
            )
        )


        return list
    }

    fun getGoogle(): ArrayList<ProductModel> {
        val list = ArrayList<ProductModel>()
        list.add(
            ProductModel(
                "Google Pixel 6",
                "359",
                "https://images.ctfassets.net/8utyj17y1gom/vEbnEHP4rJHAQMWkqsjYp/056e431abbd449ee6da0e04050072a75/google-pixel-7-Pro-front-en.png"
            )
        )
        list.add(
            ProductModel(
                "Google Pixel Pro ",
                "400",
                "https://images.ctfassets.net/8utyj17y1gom/vEbnEHP4rJHAQMWkqsjYp/056e431abbd449ee6da0e04050072a75/google-pixel-7-Pro-front-en.png"
            )
        )
        list.add(
            ProductModel(
                "Google Pixel 6a",
                "210",
                "https://images.ctfassets.net/8utyj17y1gom/vEbnEHP4rJHAQMWkqsjYp/056e431abbd449ee6da0e04050072a75/google-pixel-7-Pro-front-en.png"
            )
        )


        return list
    }

    fun getOppo(): ArrayList<ProductModel> {
        val list = ArrayList<ProductModel>()
        list.add(
            ProductModel(
                "Oppo Find X5",
                "210",
                "https://images.ctfassets.net/t00ajdlq0g9p/xNeHx8zbqFcqzIHnGFL5l/a9608ab96c100a80087fe8367071c780/alcatel-1B-front.png"
            )
        )
        list.add(
            ProductModel(
                "Oppo Find X5 Pro ",
                "220",
                "https://images.ctfassets.net/t00ajdlq0g9p/xNeHx8zbqFcqzIHnGFL5l/a9608ab96c100a80087fe8367071c780/alcatel-1B-front.png"
            )
        )
        list.add(
            ProductModel(
                "Oppo Find X3",
                "119",
                "https://images.ctfassets.net/t00ajdlq0g9p/xNeHx8zbqFcqzIHnGFL5l/a9608ab96c100a80087fe8367071c780/alcatel-1B-front.png"
            )
        )


        return list
    }
}