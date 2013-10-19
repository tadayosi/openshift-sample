'use strict';

requirejs.config({
    paths : {
        bootstrap : '../bower_components/bootstrap/dist/js/bootstrap',
        jquery : '../bower_components/jquery/jquery'
    }
});

require([ 'jquery' ], function($) {
    $(document).ready(function() {
        $('#sayHello').click(function(event) {
            event.preventDefault();

            var result = $('#result');
            var name = $.trim($('#name').val());

            result.removeClass('alert-success').removeClass('alert-danger');

            if (!name || !name.length) {
                result.addClass('alert-danger').text('A name is required!');
                return;
            }
            console.log("clicked: " + name);
            $.ajax('rest/hello/json/' + name, {
                dataType : 'json',
                data : {},
                type : 'GET',
                success : function(data) {
                    console.log("success: " + data.result);
                    result.addClass('alert-success').text(data.result);
                }
            }).error(function() {
                console.log("error");
            });
        });
    });
});
