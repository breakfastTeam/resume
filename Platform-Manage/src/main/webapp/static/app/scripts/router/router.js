/**
 * Created by qingfeilee on 2015/4/21.
 */
app.config(function ($stateProvider) {
    $stateProvider
    /**
     * 菜单编辑或添加页面
     * **/
        .state('resume', {
            url: '/resume',
            templateUrl: 'views/resume/resume.html',
            controller: 'resumeCtrl'
        })

})