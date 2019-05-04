angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/survey?userId=888').
        then(function(response) {
            $scope.survey = response.data;
        });
});
