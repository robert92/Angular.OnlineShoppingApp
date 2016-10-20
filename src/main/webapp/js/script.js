/**
 * Created by Robert_Georgescu on 14-Oct-16.
 */

var appModule = angular.module("shoppingApp", []);

appModule.controller("shoppingController", function($scope) {

    /*$scope.products = [
        {
            name: "abc",
            desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.",
            price: 3
        },
        {
            name: "uiq",
            desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.",
            price: 6
        },
        {
            name: "www",
            desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.",
            price: 4
        }
    ];*/

    $scope.products = [];
    $scope.cartProducts = [];

    $scope.addToCart = function (product) {
        var cartProduct = getIfAddedToCart(product);
        if (cartProduct != null) {
            cartProduct.quantity++;
        } else {
            $scope.cartProducts.push({
                id: product.name,
                quantity: 1,
                prod: product
            });
        }
    }
    
    function getIfAddedToCart(product) {
        for(var i=0; i<$scope.cartProducts.length; i++) {
            if ($scope.cartProducts[i].id == product.name) {
                return $scope.cartProducts[i];
            }
        }
    }
});