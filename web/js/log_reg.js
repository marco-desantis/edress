
$(document).ready(function() {
  $('#account').on('click', function() {
    $('#login').addClass('hide');
    $('#login').removeClass('show');
    $('#register').addClass('show');
    $('#register').removeClass('hide');
    $('.content').addClass('high');
  });
  
  $('#back').on('click', function() {
    $('#login').addClass('show');
    $('#login').removeClass('hide');
    $('#register').addClass('hide');
    $('#register').removeClass('show');
    $('.content').removeClass('high');
  });
});