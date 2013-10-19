'use strict';

module.exports = function(grunt) {
    require('load-grunt-tasks')(grunt);

    grunt.initConfig({
        bower : {
            target : {
                rjsConfig : 'src/main/webapp/js/main.js'
            }
        }
    });

    grunt.loadNpmTasks('grunt-bower-requirejs');
};
