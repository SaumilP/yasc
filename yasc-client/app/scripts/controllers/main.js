'use strict';

/**
 * @ngdoc function
 * @name yascClientApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the yascClientApp
 */
angular.module('yascClientApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
