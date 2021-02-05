var myApp = angular.module("myApp");

myApp.controller(
  "IzmenaCtrl",
  function ($scope, $http, $routeParams, $location) {
    $scope.dokument = {};

    var url = "/api/dokumenti/" + $routeParams.id;

    var getStari = function () {
      $http.get(url).then(
        function success(res) {
          $scope.dokument = res.data;
          console.log(res.data);
        },
        function error() {
          alert("Couldn't fetch");
        }
      );
    };

    $scope.uradiIzmenu = function () {
      console.log($scope.dokument);
      $http.put(url, $scope.dokument).then(
        function success() {
          $location.path("/prikaz");
        },
        function error() {
          alert("Something went wrong!!!!!");
        }
      );
    };

    getStari();
  }
);
