'use strict';

/**
 * @ngdoc function
 * @name yascClientApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the yascClientApp
 */
angular.module('yascClientApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
