/**
 * Created by qingfeilee on 2015/4/28.
 */

'use strict';
/**
 * Created by qingfeilee on 2015/4/17.
 */

angular.module('commonServices', [])
    .factory('Common', function () {
        var services = {};
        /**
         * 时间格式化
         * **/
         function formatTen(num) {
             return num > 9 ? (num + "") : ("0" + num);
         }

         services.dateFormat = function (date) {
            if(date instanceof Date){
                var year = date.getFullYear();
                var month = date.getMonth() + 1;
                var day = date.getDate();
                var hour = date.getHours();
                var minute = date.getMinutes();
                var second = date.getSeconds();
                return year + "-" + formatTen(month) + "-" + formatTen(day);
            }else if(date==null){
                return null;
            }else{
                date = new Date(date);
               return date.getFullYear()+"-"+formatTen(date.getMonth()+1)+"-"+formatTen(date.getDate());
            }
        }

        return services;
    })
