var myApp = angular.module("myApp");

myApp.controller("DodavanjeCtrl", function ($scope, $http, $location) {
  var url = "/api/dokumenti";

  $scope.novi = {};

  var dodaj = function () {
    $http.post(url, $scope.novi).then(
      function sucess(res) {
        $location.path("/prikaz");
      },
      function error() {
        alert("Greska");
      }
    );
  };
  $scope.dodaj = function () {
    dodaj();
  };
});
