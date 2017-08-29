'use strict';

// Declare app level module which depends on views, and components
var app = angular.module('carshopApp', [
    'ui.router',
    'ui.bootstrap',
    'tree',
    'ng.ueditor',
    'ui.tree',
    'fileupload',
    'fancybox',
    'angular-loading-bar',
    'angularUtils.directives.dirPagination',
    'commonServices',
    'restangular',
    'jlareau.pnotify',
    'carshopApp.constants',
    'indexController',
    'resumeController',
    'contrast'
]);
app.factory('session', function() {
    return {
        currentPage: 1
    }
});

/*app.config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.when("", "/dashboard");
   });*/
app.config(function(RestangularProvider, ctx) {
    RestangularProvider.setBaseUrl(ctx);
    //RestangularProvider.setResponseExtractor(function(response, operation) {
    //    return response;
    //});
    //RestangularProvider.setDefaultHttpFields({cache: true});
    // todo:Use Request interceptor
});
app.config(function(paginationTemplateProvider) {
    paginationTemplateProvider.setPath('views/pagination.tpl.html');
});
app.config(['notificationServiceProvider', function(notificationServiceProvider) {
    notificationServiceProvider.setDefaults({
        history: false,
        closer: false,
        closer_hover: false
    });

}])
app.filter('to_trusted', ['$sce', function ($sce) {
    return function (text) {
        return $sce.trustAsHtml(text);
    }
}]);
