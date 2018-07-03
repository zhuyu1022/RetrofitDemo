package com.zhuyu.retrofitdemo.entity;

import java.util.List;

/**
 * Name: GetBean
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-03 17:33
 */
public class GetBean {
    /**
     * error : false
     * results : [{"_id":"5b39d2b4421aa906dfdf9f95","createdAt":"2018-07-02T15:22:28.882Z","desc":"陀螺仪滑动图片,实现VR看房","images":["http://img.gank.io/97cab7b8-5ab1-4eb7-ba8c-0dc1471eb656","http://img.gank.io/560da8fa-6225-4e6e-8d2f-1833da08326b"],"publishedAt":"2018-07-03T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/JY39/GyroscopeImageDemo","used":true,"who":"艾米"},{"_id":"5b39e3d5421aa906e5b3c6dc","createdAt":"2018-07-02T16:35:33.141Z","desc":"基于RxJava2+Retrofit2实现简单易用的网络请求框架","images":["http://img.gank.io/4c206ad4-cfad-40c7-8bc7-adf16f4d0d16","http://img.gank.io/cb843e40-d931-44ed-a211-7fe791b76491","http://img.gank.io/9d1c6154-51dc-4c52-a6f2-21365f6a22bc"],"publishedAt":"2018-07-03T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/zhou-you/RxEasyHttp","used":true,"who":"周游"},{"_id":"5b3a28be421aa906e5b3c6e2","createdAt":"2018-07-02T21:29:34.686Z","desc":"一行代码完成Android 8 FileProvider适配","publishedAt":"2018-07-03T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/steven2947/FitAndroid8","used":true,"who":"艾米"},{"_id":"5b399243421aa95570db5492","createdAt":"2018-07-02T10:47:31.359Z","desc":"Android下载库，支持断点续传，保存下载进度，UI回调与生命周期绑定等。","publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/yuwenque/JarvisDownloader","used":true,"who":"lijinshanmx"},{"_id":"5b3992a4421aa9556d2cc4c7","createdAt":"2018-07-02T10:49:08.993Z","desc":"Flutter实现的二维码扫描。","images":["http://img.gank.io/ed137e7f-8c85-46d4-984a-74c427f89950","http://img.gank.io/dbc2346b-7695-42d7-b786-1af5f794663f","http://img.gank.io/20dfdff2-15fe-4e5b-8fe1-784625978984","http://img.gank.io/d3ce29e6-6326-46a1-ae77-cdeaabfdb740"],"publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/edufolly/flutter_mobile_vision","used":true,"who":"lijinshanmx"},{"_id":"5b399427421aa955684c3e27","createdAt":"2018-07-02T10:55:35.214Z","desc":"绘制Ascii艺术。","images":["http://img.gank.io/11c0db65-9951-4e97-95ea-1af62501bf74"],"publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/chuross/asciiartview","used":true,"who":"lijinshanmx"},{"_id":"5b39949c421aa9556b44c697","createdAt":"2018-07-02T10:57:32.986Z","desc":"andriod加文字水印 支持配置文字大小，倾斜角度，多行水印。","images":["http://img.gank.io/f0101654-3987-405b-af77-73ede8af99d5"],"publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/fulushan/watermark-android","used":true,"who":"lijinshanmx"},{"_id":"5b3994bf421aa9556d2cc4cb","createdAt":"2018-07-02T10:58:07.295Z","desc":"快速使用的RecyclerView Adapter。","publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/aizuzi/FastAdapter","used":true,"who":"lijinshanmx"},{"_id":"5b33a8fc421aa955684c3e13","createdAt":"2018-06-27T23:10:52.916Z","desc":"Android 仿钉钉、微信 群聊组合头像","images":["http://img.gank.io/ffe343bb-e75d-4b94-835c-8b60dda53f9c","http://img.gank.io/9f42ba8b-4502-4f04-b38a-f8bc8205d1b3","http://img.gank.io/509d9dc1-8e0c-406e-bd93-613e3fd7419e","http://img.gank.io/2e9b6695-9466-4e0a-abf8-fd3b2cc34ce2"],"publishedAt":"2018-06-28T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/Othershe/CombineBitmap","used":true,"who":"艾米"},{"_id":"5b33badd421aa9556b44c683","createdAt":"2018-06-28T00:27:09.182Z","desc":"Android新福利：调试利器Pandora了解下哇","images":["http://img.gank.io/1155eac4-2f23-46a3-b39d-628da214a499"],"publishedAt":"2018-06-28T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/whataa/pandora/blob/master/README_CN.md","used":true,"who":"whataa"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5b39d2b4421aa906dfdf9f95
         * createdAt : 2018-07-02T15:22:28.882Z
         * desc : 陀螺仪滑动图片,实现VR看房
         * images : ["http://img.gank.io/97cab7b8-5ab1-4eb7-ba8c-0dc1471eb656","http://img.gank.io/560da8fa-6225-4e6e-8d2f-1833da08326b"]
         * publishedAt : 2018-07-03T00:00:00.0Z
         * source : chrome
         * type : Android
         * url : https://github.com/JY39/GyroscopeImageDemo
         * used : true
         * who : 艾米
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "_id='" + _id + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", source='" + source + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", used=" + used +
                    ", who='" + who + '\'' +
                    ", images=" + images +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetBean{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }
}
