'use strict';
var index = angular.module('resumeController', ['resumeServices']);
index.controller('resumeCtrl',['$scope','$state','Resume',
    function ($scope,$state, Resume) {

        $scope.search = function () {
            getResultsPage($scope.currentPage);
        }
        //分页
        $scope.pagination = {
            current: 1527
        };
        getResultsPage(1527);
        $scope.pageChanged = function (pageNo) {
            getResultsPage(pageNo);
        };
        function getResultsPage(pageNo) {
            $scope.currentPage = pageNo;
            if (!$scope.resume) {
                $scope.resume = {};
            }


            var reqData = {
                pageNo: $scope.currentPage,
                resume: $scope.resume
            };
            var promise = Resume.findAll(reqData);
            promise.then(function (data) {
                //$scope.pageSize = data.obj.size;
                //$scope.resumes = data.obj.content;
                //$scope.total = data.obj.totalElements;
                //$scope.totalPages = data.obj.totalPages;
                var tempPageNo = pageNo+1;
                console.log(tempPageNo);
                getResultsPage(tempPageNo);
            })

        }
  }]);