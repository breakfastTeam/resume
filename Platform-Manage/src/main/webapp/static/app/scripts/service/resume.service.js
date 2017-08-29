/**
 * Created by qingfeilee on 2015/4/18.
 */
angular.module('resumeServices', [])
    .factory('Resume', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};
        services.findAll = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/resume/findAll',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }
        return services;
    }])
