/**
 * Created by felix on 8/27/17.
 */

$(function(){
    $.getJSON("getTotalCount", function(data){
        var totalVIPs = data.obj.totalVIPs;
        var totalResumes = data.obj.totalResumes;
        var totalCompanies = data.obj.totalCompanies;

        $("#totalVIPs").attr("data-to", totalVIPs);
        $("#totalResumes").attr("data-to", totalResumes);
        $("#totalCompanies").attr("data-to", totalCompanies);

    });
});