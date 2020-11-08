package com.example.a20201111.bean;

import com.example.a20201111.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "HUWEI P40 Pro", "iphone", "小米10", "Redmi 10X", "荣耀30S", "OPPO Reno4", "realme X7Pro", "魅族17"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "HUWEI P40 Pro 8G+512GB 零度白 SA|NSA双模(5G)",
            "iphone 12 256G 黑色 全网通5G手机",
            "小米10 至尊纪念版  16GB+512GB 亮白色 SA|NSA双模(5G)",
            "Redmi 10X 8+256GB 星露白 SA|NSA双模(5G)",
            "荣耀 30S 8+256GB 蝶羽红 SA|NSA双模(5G)",
            "OPPO Reno4 8+128GB 星砖蓝  65w快充",
            "realme X7Pro 8+256GB 幻梦白 65w快充",
            "魅族17 8+256GB 松深入墨 4500mA"


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {7388, 7599, 6999, 2399,2699, 3188,3199,3999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.huawei_s, R.drawable.iphone_s, R.drawable.xiaomi_s,R.drawable.hongmi_s,
            R.drawable.ronyao_s, R.drawable.oppo_s, R.drawable.realme_s,R.drawable.meizu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.huawei, R.drawable.iphone, R.drawable.xiaomi,R.drawable.hongmi,
            R.drawable.ronyao, R.drawable.oppo, R.drawable.realme,R.drawable.meizu

        };

    // 获取默认的手机信息列表
public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
        GoodsInfo info = new GoodsInfo();
        info.name = mNameArray[i];
        info.desc = mDescArray[i];
        info.price = mPriceArray[i];
        info.thumb = mThumbArray[i];
        info.pic = mPicArray[i];
        goodsList.add(info);
        }
        return goodsList;
        }
        }

